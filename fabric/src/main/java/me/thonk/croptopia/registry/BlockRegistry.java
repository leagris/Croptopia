package me.thonk.croptopia.registry;

import me.thonk.common.BlockNames;
import me.thonk.croptopia.blocks.CroptopiaCropBlock;
import me.thonk.croptopia.blocks.CroptopiaSaplingBlock;
import me.thonk.croptopia.blocks.TallCropBlock;
import me.thonk.croptopia.generator.CroptopiaSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.AxeItem;
import net.minecraft.sound.BlockSoundGroup;

import static me.thonk.croptopia.Croptopia.*;

public class BlockRegistry {
    public static Block artichokeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block asparagusCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block barleyCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block basilCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block bellPepperCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block blackBeanCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block blackberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block blueberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block broccoliCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cabbageCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cantaloupeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cauliflowerCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block celeryCropBlock = new CroptopiaCropBlock(createCropSettings());
    //public static Block chivesCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block coffeeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cornCropBlock = new TallCropBlock(createCropSettings());
    public static Block cranberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block cucumberCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block currantCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block eggplantCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block elderberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block garlicCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block gingerCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block grapeCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block greenBeanCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block greenOnionCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block honeydewCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block hopsCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block kaleCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block kiwiCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block leekCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block lettuceCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block mustardCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block oatCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block oliveCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block onionCropBlock = new CroptopiaCropBlock(createCropSettings());
    //public static Block paprikaCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block peanutCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block chilePepperCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block pineappleCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block radishCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block raspberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block rhubarbCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block riceCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block rutabagaCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block saguaroCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block soybeanCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block spinachCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block squashCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block strawberryCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block sweetPotatoCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block tomatilloCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block tomatoCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block turmericCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block turnipCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block yamCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block zucchiniCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block vanillaCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block pepperCropBlock = new CroptopiaCropBlock(createCropSettings());
    public static Block teaCropBlock = new CroptopiaCropBlock(createCropSettings());


    // real block
    public static Block salt = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(0.5F).sounds(BlockSoundGroup.SAND));

    public static Block cinnamonLog = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0F));
    public static Block strippedCinnamonLog = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0F));
    public static Block cinnamonWood = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0F));
    public static Block strippedCinnamonWood = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0F));


    public static Block appleSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.APPLE_TREE), createSaplingSettings());
    public static Block bananaSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.BANANA_TREE), createSaplingSettings());
    public static Block orangeSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.ORANGE_TREE), createSaplingSettings());
    public static Block persimmonSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PERSIMMON_TREE), createSaplingSettings());
    public static Block plumSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PLUM_TREE), createSaplingSettings());
    public static Block cherrySaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.CHERRY_TREE), createSaplingSettings());
    public static Block lemonSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.LEMON_TREE), createSaplingSettings());
    public static Block grapefruitSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.GRAPEFRUIT_TREE), createSaplingSettings());
    public static Block kumquatSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.KUMQUAT_TREE), createSaplingSettings());
    public static Block peachSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PEACH_TREE), createSaplingSettings());
    public static Block coconutSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.COCONUT_TREE), createSaplingSettings());
    public static Block nutmegSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.NUTMEG_TREE), createSaplingSettings());
    public static Block figSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.FIG_TREE), createSaplingSettings());
    public static Block nectarineSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.NECTARINE_TREE), createSaplingSettings());
    public static Block mangoSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.MANGO_TREE), createSaplingSettings());
    public static Block dragonFruitSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.DRAGON_FRUIT_TREE), createSaplingSettings());
    public static Block starFruitSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.STAR_FRUIT_TREE), createSaplingSettings());
    public static Block avocadoSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.AVOCADO_TREE), createSaplingSettings());
    public static Block apricotSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.APRICOT_TREE), createSaplingSettings());
    public static Block pearSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PEAR_TREE), createSaplingSettings());
    public static Block limeSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.LIME_TREE), createSaplingSettings());
    public static Block dateSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.DATE_TREE), createSaplingSettings());
    public static Block almondSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.ALMOND_TREE), createSaplingSettings());
    public static Block cashewSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.CASHEW_TREE), createSaplingSettings());
    public static Block pecanSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.PECAN_TREE), createSaplingSettings());
    public static Block walnutSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.WALNUT_TREE), createSaplingSettings());
    public static Block cinnamonSaplingBlock = new CroptopiaSaplingBlock(new CroptopiaSaplingGenerator(GeneratorRegistry.CINNAMON_TREE), createSaplingSettings());

    public static void init() {
        registerBlock(BlockNames.SALT_ORE, salt);
        registerBlock(BlockNames.CINNAMON_LOG, cinnamonLog);
        registerBlock(BlockNames.STRIPPED_CINNAMON_LOG, strippedCinnamonLog);
        registerBlock(BlockNames.CINNAMON_WOOD, cinnamonWood);
        registerBlock(BlockNames.STRIPPED_CINNAMON_WOOD, strippedCinnamonWood);

        registerBlock(BlockNames.ARTICHOKE_CROP, artichokeCropBlock);
        registerBlock(BlockNames.ASPARAGUS_CROP, asparagusCropBlock);
        registerBlock(BlockNames.BARLEY_CROP, barleyCropBlock);
        registerBlock(BlockNames.BASIL_CROP, basilCropBlock);
        registerBlock(BlockNames.BELLPEPPER_CROP, bellPepperCropBlock);
        registerBlock(BlockNames.BLACKBEAN_CROP, blackBeanCropBlock);
        registerBlock(BlockNames.BLACKBERRY_CROP, blackberryCropBlock);
        registerBlock(BlockNames.BLUEBERRY_CROP, blueberryCropBlock);
        registerBlock(BlockNames.BROCCOLI_CROP, broccoliCropBlock);
        registerBlock(BlockNames.CABBAGE_CROP, cabbageCropBlock);
        registerBlock(BlockNames.CANTALOUPE_CROP,cantaloupeCropBlock);
        registerBlock(BlockNames.CAULIFLOWER_CROP, cauliflowerCropBlock);
        registerBlock(BlockNames.CELERY_CROP, celeryCropBlock);
        //registerBlock("chives_crop", chivesCropBlock);
        registerBlock(BlockNames.COFFEE_CROP, coffeeCropBlock);
        registerBlock(BlockNames.CORN_CROP, cornCropBlock);
        registerBlock(BlockNames.CRANBERRY_CROP, cranberryCropBlock);
        registerBlock(BlockNames.CUCUMBER_CROP, cucumberCropBlock);
        registerBlock(BlockNames.CURRANT_CROP, currantCropBlock);
        registerBlock(BlockNames.EGGPLANT_CROP, eggplantCropBlock);
        registerBlock(BlockNames.ELDERBERRY_CROP, elderberryCropBlock);
        registerBlock(BlockNames.GARLIC_CROP, garlicCropBlock);
        registerBlock(BlockNames.GINGER_CROP, gingerCropBlock);
        registerBlock(BlockNames.GRAPE_CROP, grapeCropBlock);
        registerBlock(BlockNames.GREENBEAN_CROP, greenBeanCropBlock);
        registerBlock(BlockNames.GREENONION_CROP, greenOnionCropBlock);
        registerBlock(BlockNames.HONEYDEW_CROP, honeydewCropBlock);
        registerBlock(BlockNames.HOPS_CROP, hopsCropBlock);
        registerBlock(BlockNames.KALE_CROP, kaleCropBlock);
        registerBlock(BlockNames.KIWI_CROP, kiwiCropBlock);
        registerBlock(BlockNames.LEEK_CROP, leekCropBlock);
        registerBlock(BlockNames.LETTUCE_CROP, lettuceCropBlock);
        registerBlock(BlockNames.MUSTARD_CROP, mustardCropBlock);
        registerBlock(BlockNames.OAT_CROP, oatCropBlock);
        registerBlock(BlockNames.OLIVE_CROP, oliveCropBlock);
        registerBlock(BlockNames.ONION_CROP, onionCropBlock);
        //registerBlock("paprika_crop", paprikaCropBlock);
        registerBlock(BlockNames.PEANUT_CROP, peanutCropBlock);
        registerBlock(BlockNames.CHILE_PEPPER_CROP, chilePepperCropBlock);
        registerBlock(BlockNames.PINEAPPLE_CROP, pineappleCropBlock);
        registerBlock(BlockNames.RADISH_CROP, radishCropBlock);
        registerBlock(BlockNames.RASPBERRY_CROP, raspberryCropBlock);
        registerBlock(BlockNames.RHUBARB_CROP, rhubarbCropBlock);
        registerBlock(BlockNames.RICE_CROP, riceCropBlock);
        registerBlock(BlockNames.RUTABAGA_CROP, rutabagaCropBlock);
        registerBlock(BlockNames.SAGUARO_CROP, saguaroCropBlock);
        registerBlock(BlockNames.SOYBEAN_CROP, soybeanCropBlock);
        registerBlock(BlockNames.SPINACH_CROP, spinachCropBlock);
        registerBlock(BlockNames.SQUASH_CROP, squashCropBlock);
        registerBlock(BlockNames.STRAWBERRY_CROP, strawberryCropBlock);
        registerBlock(BlockNames.SWEETPOTATO_CROP, sweetPotatoCropBlock);
        registerBlock(BlockNames.TOMATILLO_CROP, tomatilloCropBlock);
        registerBlock(BlockNames.TOMATO_CROP, tomatoCropBlock);
        registerBlock(BlockNames.TURMERIC_CROP, turmericCropBlock);
        registerBlock(BlockNames.TURNIP_CROP, turnipCropBlock);
        registerBlock(BlockNames.YAM_CROP, yamCropBlock);
        registerBlock(BlockNames.ZUCCHINI_CROP, zucchiniCropBlock);
        registerBlock(BlockNames.VANILLA_CROP, vanillaCropBlock);
        registerBlock(BlockNames.PEPPER_CROP, pepperCropBlock);
        registerBlock(BlockNames.TEA_CROP, teaCropBlock);

        registerBlock(BlockNames.APPLE_SAPLING, appleSaplingBlock);
        registerBlock(BlockNames.BANANA_SAPLING, bananaSaplingBlock);
        registerBlock(BlockNames.ORANGE_SAPLING, orangeSaplingBlock);
        registerBlock(BlockNames.PERSIMMON_SAPLING, persimmonSaplingBlock );
        registerBlock(BlockNames.PLUM_SAPLING, plumSaplingBlock);
        registerBlock(BlockNames.CHERRY_SAPLING, cherrySaplingBlock);
        registerBlock(BlockNames.LEMON_SAPLING, lemonSaplingBlock);
        registerBlock(BlockNames.GRAPEFRUIT_SAPLING, grapefruitSaplingBlock);
        registerBlock(BlockNames.KUMQUAT_SAPLING, kumquatSaplingBlock);
        registerBlock(BlockNames.PEACH_SAPLING, peachSaplingBlock);
        registerBlock(BlockNames.COCONUT_SAPLING, coconutSaplingBlock);
        registerBlock(BlockNames.NUTMEG_SAPLING, nutmegSaplingBlock);
        registerBlock(BlockNames.FIG_SAPLING, figSaplingBlock);
        registerBlock(BlockNames.NECTARINE_SAPLING, nectarineSaplingBlock);
        registerBlock(BlockNames.MANGO_SAPLING, mangoSaplingBlock);
        registerBlock(BlockNames.DRAGONFRUIT_SAPLING, dragonFruitSaplingBlock);
        registerBlock(BlockNames.STARFRUIT_SAPLING, starFruitSaplingBlock);
        registerBlock(BlockNames.AVOCADO_SAPLING, avocadoSaplingBlock);
        registerBlock(BlockNames.APRICOT_SAPLING, apricotSaplingBlock);
        registerBlock(BlockNames.PEAR_SAPLING, pearSaplingBlock);
        registerBlock(BlockNames.LIME_SAPLING, limeSaplingBlock);
        registerBlock(BlockNames.DATE_SAPLING, dateSaplingBlock);
        registerBlock(BlockNames.ALMOND_SAPLING, almondSaplingBlock);
        registerBlock(BlockNames.CASHEW_SAPLING, cashewSaplingBlock);
        registerBlock(BlockNames.PECAN_SAPLING, pecanSaplingBlock);
        registerBlock(BlockNames.WALNUT_SAPLING, walnutSaplingBlock);
        registerBlock(BlockNames.CINNAMON_SAPLING, cinnamonSaplingBlock);

    }
}
