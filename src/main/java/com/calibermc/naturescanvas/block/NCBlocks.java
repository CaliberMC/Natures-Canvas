package com.calibermc.naturescanvas.block;

import com.calibermc.caliberlib.block.custom.terrain.*;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.management.CaliberBlockHelper;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.management.NCBlockManager;
import com.calibermc.naturescanvas.block.properties.BlockProps;
import com.calibermc.naturescanvas.item.NCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.CaliberBlockHelper.*;


public class NCBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NaturesCanvas.MOD_ID);

    public static final RegistryObject<Block> CEDAR_SAPLING = registerBlock("cedar_sapling", () -> new Block(BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> CEDAR_WOOD = registerBlock("cedar_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> CEDAR_LEAVES = registerBlock("cedar_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final RegistryObject<Block> PINE_SAPLING = registerBlock("pine_sapling", () -> new Block(BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final RegistryObject<Block> FIR_SAPLING = registerBlock("fir_sapling", () -> new Block(BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> FIR_LOG = registerBlock("fir_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_FIR_LOG = registerBlock("stripped_fir_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> FIR_WOOD = registerBlock("fir_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> FIR_LEAVES = registerBlock("fir_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));


    // METAL BLOCKS
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockProps.TIN_BLOCK.get()));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new DropExperienceBlock(BlockProps.TIN_ORE.get()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockProps.RAW_TIN.get()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(BlockProps.DEEPSLATE_TIN_ORE.get()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new Block(BlockProps.SILVER_BLOCK.get()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new DropExperienceBlock(BlockProps.SILVER_ORE.get()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new Block(BlockProps.RAW_SILVER.get()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", () -> new DropExperienceBlock(BlockProps.DEEPSLATE_SILVER_ORE.get()));


    /* Granite */
    public static final BlockManager BLACK_GRANITE = NCBlockManager.register("black_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_GRANITE = NCBlockManager.register("brown_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_GRANITE = NCBlockManager.register("gray_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_GRANITE = NCBlockManager.register("pink_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_GRANITE = NCBlockManager.register("white_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_GRANITE = NCBlockManager.register("red_granite", BlockProps.GRANITE.get(), () -> Blocks.GRANITE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Polished Granite */
    public static final BlockManager POLISHED_BLACK_GRANITE = NCBlockManager.register("polished_black_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_BROWN_GRANITE = NCBlockManager.register("polished_brown_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_GRANITE = NCBlockManager.register("polished_gray_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_GRANITE = NCBlockManager.register("polished_pink_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_GRANITE = NCBlockManager.register("polished_white_granite", BlockProps.GRANITE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_GRANITE = NCBlockManager.register("polished_red_granite", BlockProps.GRANITE.get(), () -> Blocks.POLISHED_GRANITE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Limestone */
    public static final BlockManager DARK_LIMESTONE = NCBlockManager.registerStoneWithLoot("dark_limestone", () -> NCBlocks.COBBLED_DARK_LIMESTONE.baseBlock());
    public static final BlockManager LIGHT_LIMESTONE = NCBlockManager.registerStoneWithLoot("light_limestone", () -> NCBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock());
    public static final BlockManager PINK_LIMESTONE = NCBlockManager.registerStoneWithLoot("pink_limestone", () -> NCBlocks.COBBLED_PINK_LIMESTONE.baseBlock());
    public static final BlockManager TAN_LIMESTONE = NCBlockManager.registerStoneWithLoot("tan_limestone", () -> NCBlocks.COBBLED_TAN_LIMESTONE.baseBlock());
    public static final BlockManager LIMESTONE = NCBlockManager.register("limestone", BlockProps.LIMESTONE.get(), () -> Blocks.STONE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Cobbled Limestone */
    public static final BlockManager COBBLED_DARK_LIMESTONE = NCBlockManager.register("cobbled_dark_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIGHT_LIMESTONE = NCBlockManager.register("cobbled_light_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_PINK_LIMESTONE = NCBlockManager.register("cobbled_pink_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_TAN_LIMESTONE = NCBlockManager.register("cobbled_tan_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIMESTONE = NCBlockManager.register("cobbled_limestone", BlockProps.COBBLESTONE.get(), () -> Blocks.COBBLESTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Mossy Cobbled Limestone */
    public static final BlockManager MOSSY_COBBLED_DARK_LIMESTONE = NCBlockManager.register("mossy_cobbled_dark_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIGHT_LIMESTONE = NCBlockManager.register("mossy_cobbled_light_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_PINK_LIMESTONE = NCBlockManager.register("mossy_cobbled_pink_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_TAN_LIMESTONE = NCBlockManager.register("mossy_cobbled_tan_limestone", BlockProps.COBBLESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIMESTONE = NCBlockManager.register("mossy_cobbled_limestone", BlockProps.COBBLESTONE.get(), () -> Blocks.MOSSY_COBBLESTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Limestone Bricks */
    public static final BlockManager DARK_LIMESTONE_BRICK = NCBlockManager.register("dark_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIGHT_LIMESTONE_BRICK = NCBlockManager.register("light_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_LIMESTONE_BRICK = NCBlockManager.register("pink_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_LIMESTONE_BRICK = NCBlockManager.register("tan_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIMESTONE_BRICK = NCBlockManager.register("limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.STONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Mossy Limestone Bricks */
    public static final BlockManager MOSSY_DARK_LIMESTONE_BRICK = NCBlockManager.register("mossy_dark_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIGHT_LIMESTONE_BRICK = NCBlockManager.register("mossy_light_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_PINK_LIMESTONE_BRICK = NCBlockManager.register("mossy_pink_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_TAN_LIMESTONE_BRICK = NCBlockManager.register("mossy_tan_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIMESTONE_BRICK = NCBlockManager.register("mossy_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), () -> Blocks.MOSSY_STONE_BRICKS, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Cracked Limestone Bricks*/
    public static final BlockManager CRACKED_DARK_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("cracked_dark_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_LIGHT_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("cracked_light_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_PINK_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("cracked_pink_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CRACKED_TAN_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("cracked_tan_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    /* Chiseled Limestone Bricks*/
    public static final BlockManager CHISELED_DARK_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("chiseled_dark_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_LIGHT_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("chiseled_light_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_PINK_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("chiseled_pink_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final BlockManager CHISELED_TAN_LIMESTONE_BRICKS = NCBlockManager.registerOneBlock("chiseled_tan_limestone_bricks", () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    /* Smooth Limestone */
    public static final BlockManager SMOOTH_DARK_LIMESTONE = NCBlockManager.register("smooth_dark_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIGHT_LIMESTONE = NCBlockManager.register("smooth_light_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_PINK_LIMESTONE = NCBlockManager.register("smooth_pink_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_TAN_LIMESTONE = NCBlockManager.register("smooth_tan_limestone", BlockProps.SMOOTH_LIMESTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIMESTONE = NCBlockManager.register("smooth_limestone", BlockProps.SMOOTH_LIMESTONE.get(), () -> Blocks.SMOOTH_STONE, STONE_VARIANTS);

    /* Marble */
    public static final BlockManager BLACK_MARBLE = NCBlockManager.register("black_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_MARBLE = NCBlockManager.register("gray_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_MARBLE = NCBlockManager.register("pink_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_MARBLE = NCBlockManager.register("red_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_MARBLE = NCBlockManager.register("white_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Polished Marble */
    public static final BlockManager POLISHED_BLACK_MARBLE = NCBlockManager.register("polished_black_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_MARBLE = NCBlockManager.register("polished_gray_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_MARBLE = NCBlockManager.register("polished_pink_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_MARBLE = NCBlockManager.register("polished_red_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_MARBLE = NCBlockManager.register("polished_white_marble", BlockProps.MARBLE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Sandstone */
    public static final BlockManager BROWN_SANDSTONE = NCBlockManager.register("brown_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager ORANGE_SANDSTONE = NCBlockManager.register("orange_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_SANDSTONE = NCBlockManager.register("red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.RED_SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager SANDSTONE = NCBlockManager.register("sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Smooth Sandstone */
    public static final BlockManager SMOOTH_BROWN_SANDSTONE = NCBlockManager.register("smooth_brown_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_ORANGE_SANDSTONE = NCBlockManager.register("smooth_orange_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_RED_SANDSTONE = NCBlockManager.register("smooth_red_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_RED_SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS);
    public static final BlockManager SMOOTH_SANDSTONE = NCBlockManager.register("smooth_sandstone", BlockProps.SMOOTH_SANDSTONE.get(), () -> Blocks.SMOOTH_SANDSTONE, STONE_VARIANTS_WITHOUT_STAIRS);

    /* Chiseled Sandstone */
    public static final BlockManager CHISELED_BROWN_SANDSTONE = NCBlockManager.registerOneBlock("chiseled_brown_sandstone", () -> new Block(BlockProps.SANDSTONE.get()));
    public static final BlockManager CHISELED_ORANGE_SANDSTONE = NCBlockManager.registerOneBlock("chiseled_orange_sandstone", () -> new Block(BlockProps.SANDSTONE.get()));

    /* Cut Sandstone */
    public static final BlockManager CUT_BROWN_SANDSTONE = NCBlockManager.register("cut_brown_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_ORANGE_SANDSTONE = NCBlockManager.register("cut_orange_sandstone", BlockProps.SANDSTONE.get(), CaliberBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_RED_SANDSTONE = NCBlockManager.register("cut_red_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CUT_RED_SANDSTONE, STONE_VARIANTS);
    public static final BlockManager CUT_SANDSTONE = NCBlockManager.register("cut_sandstone", BlockProps.SANDSTONE.get(), () -> Blocks.CUT_SANDSTONE, STONE_VARIANTS);

    /* Sand */  //TODO Add to Block Manager
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND = registerBlock("brown_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND = registerBlock("orange_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand", () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BLACK_SAND_LAYER = registerBlock("black_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND_LAYER = registerBlock("brown_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND_LAYER = registerBlock("orange_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> RED_SAND_LAYER = registerBlock("red_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> SOUL_SAND_LAYER = registerBlock("soul_sand_layer", () -> new SoulSandLayerBlock(BlockProps.SOUL_SAND.get()));
    public static final RegistryObject<Block> SAND_LAYER = registerBlock("sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND_LAYER = registerBlock("white_sand_layer", () -> new FallingLayerBlock(BlockProps.SAND.get()));

    /* Other Terrain */  //TODO Add to Block Manager
    public static final RegistryObject<Block> CLAY_LAYER = registerBlock("clay_layer", () -> new TerrainLayerBlock(BlockProps.CLAY.get()));
    public static final RegistryObject<Block> COARSE_DIRT_LAYER = registerBlock("coarse_dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> DIRT_LAYER = registerBlock("dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    //    public static final RegistryObject<Block> FARMLAND_LAYER = registerBlock("farmland_layer", () -> new TerrainLayerBlock(BlockProps.FARMLAND.get()));
    public static final RegistryObject<Block> GRASS_LAYER = registerBlock("grass_layer", () -> new GrassLayerBlock(BlockProps.GRASS.get()));
    public static final RegistryObject<Block> GRAVEL_LAYER = registerBlock("gravel_layer", () -> new FallingLayerBlock(BlockProps.GRAVEL.get()));
    public static final RegistryObject<Block> MYCELIUM_LAYER = registerBlock("mycelium_layer", () -> new MyceliumLayerBlock(BlockProps.MYCELIUM.get()));
    public static final RegistryObject<Block> PODZOL_LAYER = registerBlock("podzol_layer", () -> new TerrainLayerBlock(BlockProps.PODZOL.get()));
    public static final RegistryObject<Block> ROOTED_DIRT_LAYER = registerBlock("rooted_dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> SOUL_SOIL_LAYER = registerBlock("soul_soil_layer", () -> new TerrainLayerBlock(BlockProps.SOUL_SOIL.get()));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_LAYER = registerBlock("crimson_nylium_layer", () -> new NyliumLayerBlock(BlockProps.CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Block> WARPED_NYLIUM_LAYER = registerBlock("warped_nylium_layer", () -> new NyliumLayerBlock(BlockProps.WARPED_NYLIUM.get()));


    public static void printBlockCounts() {
        System.out.println("NaturesCanvas Blocks Registered: " + blockCount);
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn); //NCCreativeTab.CALIBER_TAB
        blockCount++;
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return NCItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
