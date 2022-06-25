package com.epherical.croptopia.mixin;

import com.epherical.croptopia.items.SeedItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.brain.task.FarmTask;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import javax.annotation.Nullable;

@Mixin(FarmTask.class)
public class FarmTaskMixin {

    @Shadow @Nullable private BlockPos aboveFarmlandPos;
    @Unique boolean planted = false;

    @Inject(method = "tick(Lnet/minecraft/world/server/ServerWorld;Lnet/minecraft/entity/merchant/villager/VillagerEntity;J)V", at = @At(value = "INVOKE_ASSIGN",
            target = "Lnet/minecraft/item/ItemStack;isEmpty()Z", opcode = 0),
            locals = LocalCapture.CAPTURE_FAILEXCEPTION)
    public void running(ServerWorld serverWorld, VillagerEntity villagerEntity, long l, CallbackInfo ci,
                        BlockState blockState, Block block, Block block2,
                        Inventory inventory, int i, ItemStack itemStack) {
        if (itemStack.getItem() instanceof SeedItem) {
            serverWorld.setBlock(this.aboveFarmlandPos, ((SeedItem) itemStack.getItem()).getBlock().defaultBlockState(), 3);
            planted = true;
        }
    }

    @ModifyVariable(method = "tick(Lnet/minecraft/world/server/ServerWorld;Lnet/minecraft/entity/merchant/villager/VillagerEntity;J)V", at = @At(value = "LOAD", ordinal = 0))
    public boolean planted(boolean bl) {
        if (planted) {
            planted = false;
            return true;
        }

        return bl;
    }
}
