package com.epherical.croptopia.datagen;

import com.epherical.croptopia.register.Content;
import com.epherical.croptopia.register.helpers.Tree;
import com.epherical.croptopia.register.helpers.TreeCrop;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

public class CroptopiaItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public CroptopiaItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        generateSaplings();
        generateBarkLogs();
        // currently, only generates air, but leaves item tag isn't used by vanilla anyway
        // generateLeaves();
        generateMisc();
    }

    protected void generateSaplings() {
        FabricTagBuilder<Item> saplings = getOrCreateTagBuilder(ItemTags.SAPLINGS);
        for (TreeCrop crop : TreeCrop.copy()) {
            saplings.add(crop.getSaplingItem());
        }
        for (Tree crop : Tree.copy()) {
            saplings.add(crop.getSapling());
        }
    }

    protected void generateBarkLogs() {
        FabricTagBuilder<Item> burnableLog = getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN);
        for (Tree crop : Tree.copy()) {
            // add different log types to log tag of this crop
            tag(crop.getLogItemTag())
                    .add(crop.getLog().asItem())
                    .add(crop.getStrippedLog().asItem())
                    .add(crop.getWood().asItem())
                    .add(crop.getStrippedWood().asItem());
            // make this crop log burnable
            burnableLog.addTag(crop.getLogItemTag());
        }
    }

    protected void generateLeaves() {
        FabricTagBuilder<Item> leaves = getOrCreateTagBuilder(ItemTags.LEAVES);
        for (TreeCrop crop : TreeCrop.copy()) {
            leaves.add(crop.getLeaves().asItem());
        }
        for (Tree crop : Tree.copy()) {
            leaves.add(crop.getLeaves().asItem());
        }
    }

    protected void generateMisc() {
        // explicitly used as dolphin food in vanilla
        FabricTagBuilder<Item> fishes = getOrCreateTagBuilder(ItemTags.FISHES);
        fishes.add(Content.ANCHOVY.asItem());
        fishes.add(Content.CALAMARI.asItem());
        fishes.add(Content.CLAM.asItem());
        fishes.add(Content.CRAB.asItem());
        fishes.add(Content.OYSTER.asItem());
        fishes.add(Content.ROE.asItem());
        fishes.add(Content.SHRIMP.asItem());
        fishes.add(Content.TUNA.asItem());
        // fox food: all berries added by croptopia
        FabricTagBuilder<Item> foxFood = getOrCreateTagBuilder(ItemTags.FOX_FOOD);
        foxFood.add(Content.BLACKBERRY.asItem());
        foxFood.add(Content.BLUEBERRY.asItem());
        foxFood.add(Content.CRANBERRY.asItem());
        foxFood.add(Content.ELDERBERRY.asItem());
        foxFood.add(Content.RASPBERRY.asItem());
        foxFood.add(Content.STRAWBERRY.asItem());
        // piglin food: more cannibalism (which already happens in vanilla)
        FabricTagBuilder<Item> piglinFood = getOrCreateTagBuilder(ItemTags.PIGLIN_FOOD);
        piglinFood.add(Content.HAM_SANDWICH);
        piglinFood.add(Content.PEPPERONI);
        piglinFood.add(Content.PORK_AND_BEANS);
        piglinFood.add(Content.PORK_JERKY);
        piglinFood.add(Content.RAW_BACON);
        piglinFood.add(Content.COOKED_BACON.asItem());
    }

}
