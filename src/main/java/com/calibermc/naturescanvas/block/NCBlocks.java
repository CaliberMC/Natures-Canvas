package com.calibermc.naturescanvas.block;

import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.block.custom.terrain.*;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.management.ModBlockHelper;
import com.calibermc.caliberlib.block.properties.BlockProps;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.custom.KilnBlock;
import com.calibermc.naturescanvas.block.custom.signs.NCHangingSignBlock;
import com.calibermc.naturescanvas.block.custom.signs.NCStandingSignBlock;
import com.calibermc.naturescanvas.block.custom.signs.NCWallHangingSignBlock;
import com.calibermc.naturescanvas.block.custom.signs.NCWallSignBlock;
import com.calibermc.naturescanvas.block.grower.*;
import com.calibermc.naturescanvas.block.management.NCBlockManager;
import com.calibermc.naturescanvas.item.NCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;


public class NCBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NaturesCanvas.MOD_ID);

    public static final RegistryObject<Block> KILN = registerBlock("kiln",
            () -> new KilnBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(3.5F).lightLevel((bs) -> bs.getValue(BlockStateProperties.LIT) ? 13 : 0)));

    // METAL BLOCKS
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockProps.TIN_BLOCK.get()));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new DropExperienceBlock(BlockProps.TIN_ORE.get()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockProps.RAW_TIN.get()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(BlockProps.DEEPSLATE_TIN_ORE.get()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new Block(BlockProps.SILVER_BLOCK.get()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new DropExperienceBlock(BlockProps.SILVER_ORE.get()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new Block(BlockProps.RAW_SILVER.get()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", () -> new DropExperienceBlock(BlockProps.DEEPSLATE_SILVER_ORE.get()));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockProps.BRONZE_BLOCK.get()));

    /* Granite */
    public static final BlockManager BLACK_GRANITE = NCBlockManager.register("black_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_GRANITE = NCBlockManager.register("brown_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_GRANITE = NCBlockManager.register("gray_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_GRANITE = NCBlockManager.register("pink_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_GRANITE = NCBlockManager.register("white_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Polished Granite */
    public static final BlockManager POLISHED_BLACK_GRANITE = NCBlockManager.register("polished_black_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_BROWN_GRANITE = NCBlockManager.register("polished_brown_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_GRANITE = NCBlockManager.register("polished_gray_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_GRANITE = NCBlockManager.register("polished_pink_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_GRANITE = NCBlockManager.register("polished_white_granite", BlockProps.GRANITE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Limestone */
    public static final BlockManager DARK_LIMESTONE = NCBlockManager.registerStoneWithLoot("dark_limestone", () -> NCBlocks.COBBLED_DARK_LIMESTONE.baseBlock());
    public static final BlockManager LIGHT_LIMESTONE = NCBlockManager.registerStoneWithLoot("light_limestone", () -> NCBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock());
    public static final BlockManager PINK_LIMESTONE = NCBlockManager.registerStoneWithLoot("pink_limestone", () -> NCBlocks.COBBLED_PINK_LIMESTONE.baseBlock());
    public static final BlockManager TAN_LIMESTONE = NCBlockManager.registerStoneWithLoot("tan_limestone", () -> NCBlocks.COBBLED_TAN_LIMESTONE.baseBlock());

    /* Cobbled Limestone */
    public static final BlockManager COBBLED_DARK_LIMESTONE = NCBlockManager.register("cobbled_dark_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_LIGHT_LIMESTONE = NCBlockManager.register("cobbled_light_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_PINK_LIMESTONE = NCBlockManager.register("cobbled_pink_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager COBBLED_TAN_LIMESTONE = NCBlockManager.register("cobbled_tan_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Mossy Cobbled Limestone */
    public static final BlockManager MOSSY_COBBLED_DARK_LIMESTONE = NCBlockManager.register("mossy_cobbled_dark_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_LIGHT_LIMESTONE = NCBlockManager.register("mossy_cobbled_light_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_PINK_LIMESTONE = NCBlockManager.register("mossy_cobbled_pink_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLED_TAN_LIMESTONE = NCBlockManager.register("mossy_cobbled_tan_limestone", BlockProps.COBBLESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_COBBLESTONE = NCBlockManager.register("mossy_cobblestone", BlockProps.COBBLESTONE.get(), () -> Blocks.MOSSY_COBBLESTONE, STONE_VARIANTS_WITHOUT_STAIRS_WALL);

    /* Limestone Bricks */
    public static final BlockManager DARK_LIMESTONE_BRICK = NCBlockManager.register("dark_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager LIGHT_LIMESTONE_BRICK = NCBlockManager.register("light_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_LIMESTONE_BRICK = NCBlockManager.register("pink_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_LIMESTONE_BRICK = NCBlockManager.register("tan_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Mossy Limestone Bricks */
    public static final BlockManager MOSSY_DARK_LIMESTONE_BRICK = NCBlockManager.register("mossy_dark_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_LIGHT_LIMESTONE_BRICK = NCBlockManager.register("mossy_light_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_PINK_LIMESTONE_BRICK = NCBlockManager.register("mossy_pink_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_TAN_LIMESTONE_BRICK = NCBlockManager.register("mossy_tan_limestone_bricks", BlockProps.LIMESTONE_BRICK.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
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
    public static final BlockManager SMOOTH_DARK_LIMESTONE = NCBlockManager.register("smooth_dark_limestone", BlockProps.SMOOTH_LIMESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIGHT_LIMESTONE = NCBlockManager.register("smooth_light_limestone", BlockProps.SMOOTH_LIMESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_PINK_LIMESTONE = NCBlockManager.register("smooth_pink_limestone", BlockProps.SMOOTH_LIMESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_TAN_LIMESTONE = NCBlockManager.register("smooth_tan_limestone", BlockProps.SMOOTH_LIMESTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_LIMESTONE = NCBlockManager.register("smooth_limestone", BlockProps.SMOOTH_LIMESTONE.get(), () -> Blocks.SMOOTH_STONE, STONE_VARIANTS);

    /* Marble */
    public static final BlockManager BLACK_MARBLE = NCBlockManager.register("black_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager GRAY_MARBLE = NCBlockManager.register("gray_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager PINK_MARBLE = NCBlockManager.register("pink_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager RED_MARBLE = NCBlockManager.register("red_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_MARBLE = NCBlockManager.register("white_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Polished Marble */
    public static final BlockManager POLISHED_BLACK_MARBLE = NCBlockManager.register("polished_black_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_GRAY_MARBLE = NCBlockManager.register("polished_gray_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_PINK_MARBLE = NCBlockManager.register("polished_pink_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_RED_MARBLE = NCBlockManager.register("polished_red_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager POLISHED_WHITE_MARBLE = NCBlockManager.register("polished_white_marble", BlockProps.MARBLE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Sandstone */
    public static final BlockManager BROWN_SANDSTONE = NCBlockManager.register("brown_sandstone", BlockProps.SANDSTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager ORANGE_SANDSTONE = NCBlockManager.register("orange_sandstone", BlockProps.SANDSTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Smooth Sandstone */
    public static final BlockManager SMOOTH_BROWN_SANDSTONE = NCBlockManager.register("smooth_brown_sandstone", BlockProps.SANDSTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SMOOTH_ORANGE_SANDSTONE = NCBlockManager.register("smooth_orange_sandstone", BlockProps.SANDSTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Chiseled Sandstone */
    public static final BlockManager CHISELED_BROWN_SANDSTONE = NCBlockManager.registerOneBlock("chiseled_brown_sandstone", () -> new Block(BlockProps.SANDSTONE.get()));
    public static final BlockManager CHISELED_ORANGE_SANDSTONE = NCBlockManager.registerOneBlock("chiseled_orange_sandstone", () -> new Block(BlockProps.SANDSTONE.get()));

    /* Cut Sandstone */
    public static final BlockManager CUT_BROWN_SANDSTONE = NCBlockManager.register("cut_brown_sandstone", BlockProps.SANDSTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CUT_ORANGE_SANDSTONE = NCBlockManager.register("cut_orange_sandstone", BlockProps.SANDSTONE.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Sand */  //TODO: Add to Block Manager
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

    /* Other Terrain */  //TODO: Add to Block Manager
    public static final RegistryObject<Block> CLAY_LAYER = registerBlock("clay_layer", () -> new TerrainLayerBlock(BlockProps.CLAY.get()));
    public static final RegistryObject<Block> COARSE_DIRT_LAYER = registerBlock("coarse_dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> DIRT_LAYER = registerBlock("dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    //    public static final RegistryObject<Block> FARMLAND_LAYER = registerBlock("farmland_layer", () -> new TerrainLayerBlock(BlockProps.FARMLAND.get())); //TODO: Fix for plantable farmland
    public static final RegistryObject<Block> GRASS_LAYER = registerBlock("grass_layer", () -> new GrassLayerBlock(BlockProps.GRASS.get()));
    public static final RegistryObject<Block> GRAVEL_LAYER = registerBlock("gravel_layer", () -> new FallingLayerBlock(BlockProps.GRAVEL.get()));
    public static final RegistryObject<Block> MYCELIUM_LAYER = registerBlock("mycelium_layer", () -> new MyceliumLayerBlock(BlockProps.MYCELIUM.get()));
    public static final RegistryObject<Block> PODZOL_LAYER = registerBlock("podzol_layer", () -> new TerrainLayerBlock(BlockProps.PODZOL.get()));
    public static final RegistryObject<Block> ROOTED_DIRT_LAYER = registerBlock("rooted_dirt_layer", () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> SOUL_SOIL_LAYER = registerBlock("soul_soil_layer", () -> new TerrainLayerBlock(BlockProps.SOUL_SOIL.get()));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_LAYER = registerBlock("crimson_nylium_layer", () -> new NyliumLayerBlock(BlockProps.CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Block> WARPED_NYLIUM_LAYER = registerBlock("warped_nylium_layer", () -> new NyliumLayerBlock(BlockProps.WARPED_NYLIUM.get()));

    public static final RegistryObject<Block> RED_CEDAR_SAPLING = registerBlock("red_cedar_sapling", () -> new SaplingBlock(new CedarTreeGrower(), BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> CEDAR_WOOD = registerBlock("cedar_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> CEDAR_LEAVES = registerBlock("cedar_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final RegistryObject<Block> DOUGLAS_FIR_SAPLING = registerBlock("douglas_fir_sapling", () -> new SaplingBlock(new DouglasFirTreeGrower(), BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> SUBALPINE_FIR_SAPLING = registerBlock("subalpine_fir_sapling", () -> new SaplingBlock(new SubalpineFirTreeGrower(), BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> FIR_LOG = registerBlock("fir_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_FIR_LOG = registerBlock("stripped_fir_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> FIR_WOOD = registerBlock("fir_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> FIR_LEAVES = registerBlock("fir_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final RegistryObject<Block> LODGEPOLE_PINE_SAPLING = registerBlock("lodgepole_pine_sapling", () -> new SaplingBlock(new LodgepolePineTreeGrower(), BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> PONDEROSA_PINE_SAPLING = registerBlock("ponderosa_pine_sapling", () -> new SaplingBlock(new PonderosaPineTreeGrower(), BlockProps.TREE_SAPLING.get()));
    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));;
//    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));

    public static final BlockManager PINE_LEAVES = NCBlockManager.registerOneBlock("pine_leaves", () -> new LeavesBlock(BlockProps.TREE_LEAVES.get()));


    /* Stripped Wood */
    public static final BlockManager STRIPPED_CEDAR = NCBlockManager.register("stripped_cedar_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STRIPPED_FIR = NCBlockManager.register("stripped_fir_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STRIPPED_MAPLE = NCBlockManager.register("stripped_maple_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STRIPPED_PINE = NCBlockManager.register("stripped_pine_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final RegistryObject<Block> STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
//    public static final RegistryObject<Block> STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
//    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));
//    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", () -> new RotatedPillarBlock(BlockProps.TREE_LOG.get()));


    /* Mossy Planks */
    public static final BlockManager MOSSY_ACACIA = NCBlockManager.register("mossy_acacia_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH = NCBlockManager.register("mossy_birch_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK = NCBlockManager.register("mossy_dark_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE = NCBlockManager.register("mossy_jungle_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK = NCBlockManager.register("mossy_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE = NCBlockManager.register("mossy_spruce_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON = NCBlockManager.register("mossy_crimson_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED = NCBlockManager.register("mossy_warped_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stained Planks */
    public static final BlockManager STAINED_ACACIA = NCBlockManager.register("stained_acacia_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_ACACIA_BUTTON = registerBlock("stained_acacia_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA, 30, true));
    public static final RegistryObject<Block> STAINED_ACACIA_DOOR = registerBlock("stained_acacia_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_HANGING_SIGN = registerBlockWithoutBlockItem("stained_acacia_hanging_sign", () -> new NCHangingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_SIGN = registerBlockWithoutBlockItem("stained_acacia_sign", () -> new NCStandingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_TRAPDOOR = registerBlock("stained_acacia_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_acacia_wall_hanging_sign", () -> new NCWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_WALL_SIGN = registerBlockWithoutBlockItem("stained_acacia_wall_sign", () -> new NCWallSignBlock(BlockProps.PLANK.get(), WoodType.ACACIA));
    public static final RegistryObject<Block> STAINED_ACACIA_TALL_DOOR = registerBlock("stained_acacia_tall_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.ACACIA));

    public static final BlockManager STAINED_BIRCH = NCBlockManager.register("stained_birch_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_BIRCH_BUTTON = registerBlock("stained_birch_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH, 30, true));
    public static final RegistryObject<Block> STAINED_BIRCH_DOOR = registerBlock("stained_birch_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_HANGING_SIGN = registerBlockWithoutBlockItem("stained_birch_hanging_sign", () -> new NCHangingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_SIGN = registerBlockWithoutBlockItem("stained_birch_sign", () -> new NCStandingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_TRAPDOOR = registerBlock("stained_birch_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_birch_wall_hanging_sign", () -> new NCWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_WALL_SIGN = registerBlockWithoutBlockItem("stained_birch_wall_sign", () -> new NCWallSignBlock(BlockProps.PLANK.get(), WoodType.BIRCH));
    public static final RegistryObject<Block> STAINED_BIRCH_TALL_DOOR = registerBlock("stained_birch_tall_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.BIRCH));

    public static final BlockManager STAINED_DARK_OAK = NCBlockManager.register("stained_dark_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_DARK_OAK_BUTTON = registerBlock("stained_dark_oak_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK, 30, true));
    public static final RegistryObject<Block> STAINED_DARK_OAK_DOOR = registerBlock("stained_dark_oak_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_HANGING_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_hanging_sign", () -> new NCHangingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_sign", () -> new NCStandingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_TRAPDOOR = registerBlock("stained_dark_oak_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_wall_hanging_sign", () -> new NCWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_dark_oak_wall_sign", () -> new NCWallSignBlock(BlockProps.PLANK.get(), WoodType.DARK_OAK));
    public static final RegistryObject<Block> STAINED_DARK_OAK_TALL_DOOR = registerBlock("stained_dark_oak_tall_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.DARK_OAK));

    public static final BlockManager STAINED_JUNGLE = NCBlockManager.register("stained_jungle_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_JUNGLE_BUTTON = registerBlock("stained_jungle_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE, 30, true));
    public static final RegistryObject<Block> STAINED_JUNGLE_DOOR = registerBlock("stained_jungle_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_HANGING_SIGN = registerBlockWithoutBlockItem("stained_jungle_hanging_sign", () -> new NCHangingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_SIGN = registerBlockWithoutBlockItem("stained_jungle_sign", () -> new NCStandingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_TRAPDOOR = registerBlock("stained_jungle_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_jungle_wall_hanging_sign", () -> new NCWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_WALL_SIGN = registerBlockWithoutBlockItem("stained_jungle_wall_sign", () -> new NCWallSignBlock(BlockProps.PLANK.get(), WoodType.JUNGLE));
    public static final RegistryObject<Block> STAINED_JUNGLE_TALL_DOOR = registerBlock("stained_jungle_tall_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.JUNGLE));

    public static final BlockManager STAINED_OAK = NCBlockManager.register("stained_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_OAK_BUTTON = registerBlock("stained_oak_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> STAINED_OAK_DOOR = registerBlock("stained_oak_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_HANGING_SIGN = registerBlockWithoutBlockItem("stained_oak_hanging_sign", () -> new NCHangingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_SIGN = registerBlockWithoutBlockItem("stained_oak_sign", () -> new NCStandingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_TRAPDOOR = registerBlock("stained_oak_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_oak_wall_hanging_sign", () -> new NCWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_WALL_SIGN = registerBlockWithoutBlockItem("stained_oak_wall_sign", () -> new NCWallSignBlock(BlockProps.PLANK.get(), WoodType.OAK));
    public static final RegistryObject<Block> STAINED_OAK_TALL_DOOR = registerBlock("stained_oak_tall_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.OAK));

    public static final BlockManager STAINED_SPRUCE = NCBlockManager.register("stained_spruce_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final RegistryObject<Block> STAINED_SPRUCE_BUTTON = registerBlock("stained_spruce_button", () -> new ButtonBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE, 30, true));
    public static final RegistryObject<Block> STAINED_SPRUCE_DOOR = registerBlock("stained_spruce_door", () -> new DoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_HANGING_SIGN = registerBlockWithoutBlockItem("stained_spruce_hanging_sign", () -> new NCHangingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_SIGN = registerBlockWithoutBlockItem("stained_spruce_sign", () -> new NCStandingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_TRAPDOOR = registerBlock("stained_spruce_trapdoor", () -> new TrapDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stained_spruce_wall_hanging_sign", () -> new NCWallHangingSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_WALL_SIGN = registerBlockWithoutBlockItem("stained_spruce_wall_sign", () -> new NCWallSignBlock(BlockProps.PLANK.get(), WoodType.SPRUCE));
    public static final RegistryObject<Block> STAINED_SPRUCE_TALL_DOOR = registerBlock("stained_spruce_tall_door", () -> new TallDoorBlock(BlockProps.PLANK.get(), BlockSetType.SPRUCE));

    /* Mossy Stained Planks */
    public static final BlockManager MOSSY_STAINED_ACACIA = NCBlockManager.register("mossy_stained_acacia_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH = NCBlockManager.register("mossy_stained_birch_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK = NCBlockManager.register("mossy_stained_dark_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE = NCBlockManager.register("mossy_stained_jungle_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK = NCBlockManager.register("mossy_stained_oak_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE = NCBlockManager.register("mossy_stained_spruce_planks", BlockProps.PLANK.get(), ModBlockHelper.modifyList(PLANK_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Stained Stripped Wood */
    public static final BlockManager STAINED_STRIPPED_ACACIA = NCBlockManager.register("stained_stripped_acacia_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_BIRCH = NCBlockManager.register("stained_stripped_birch_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_DARK_OAK = NCBlockManager.register("stained_stripped_dark_oak_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_JUNGLE = NCBlockManager.register("stained_stripped_jungle_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_OAK = NCBlockManager.register("stained_stripped_oak_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_STRIPPED_SPRUCE = NCBlockManager.register("stained_stripped_spruce_wood", BlockProps.PLANK.get(), ModBlockHelper.modifyList(STRIPPED_WOOD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Boards & Shingles */
    public static final BlockManager ACACIA_BOARDS = NCBlockManager.register("acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BIRCH_BOARDS = NCBlockManager.register("birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager DARK_OAK_BOARDS = NCBlockManager.register("dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager JUNGLE_BOARDS = NCBlockManager.register("jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OAK_BOARDS = NCBlockManager.register("oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager SPRUCE_BOARDS = NCBlockManager.register("spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager CRIMSON_BOARDS = NCBlockManager.register("crimson_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WARPED_BOARDS = NCBlockManager.register("warped_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager ACACIA_SHINGLES = NCBlockManager.register("acacia_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager BIRCH_SHINGLES = NCBlockManager.register("birch_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager DARK_OAK_SHINGLES = NCBlockManager.register("dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager JUNGLE_SHINGLES = NCBlockManager.register("jungle_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager OAK_SHINGLES = NCBlockManager.register("oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager SPRUCE_SHINGLES = NCBlockManager.register("spruce_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager CRIMSON_SHINGLES = NCBlockManager.register("crimson_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager WARPED_SHINGLES = NCBlockManager.register("warped_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Boards & Shingles */
    public static final BlockManager MOSSY_ACACIA_BOARDS = NCBlockManager.register("mossy_acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_BIRCH_BOARDS = NCBlockManager.register("mossy_birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_DARK_OAK_BOARDS = NCBlockManager.register("mossy_dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_JUNGLE_BOARDS = NCBlockManager.register("mossy_jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_OAK_BOARDS = NCBlockManager.register("mossy_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_SPRUCE_BOARDS = NCBlockManager.register("mossy_spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_CRIMSON_BOARDS = NCBlockManager.register("mossy_crimson_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_WARPED_BOARDS = NCBlockManager.register("mossy_warped_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_ACACIA_SHINGLES = NCBlockManager.register("mossy_acacia_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_BIRCH_SHINGLES = NCBlockManager.register("mossy_birch_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_DARK_OAK_SHINGLES = NCBlockManager.register("mossy_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_JUNGLE_SHINGLES = NCBlockManager.register("mossy_jungle_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_OAK_SHINGLES = NCBlockManager.register("mossy_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_SPRUCE_SHINGLES = NCBlockManager.register("mossy_spruce_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_CRIMSON_SHINGLES = NCBlockManager.register("mossy_crimson_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_CRIMSON_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_WARPED_SHINGLES = NCBlockManager.register("mossy_warped_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_WARPED_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Stained Boards & Shingles */
    public static final BlockManager STAINED_ACACIA_BOARDS = NCBlockManager.register("stained_acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_BIRCH_BOARDS = NCBlockManager.register("stained_birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_DARK_OAK_BOARDS = NCBlockManager.register("stained_dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_JUNGLE_BOARDS = NCBlockManager.register("stained_jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_OAK_BOARDS = NCBlockManager.register("stained_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager STAINED_SPRUCE_BOARDS = NCBlockManager.register("stained_spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager STAINED_ACACIA_SHINGLES = NCBlockManager.register("stained_acacia_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_BIRCH_SHINGLES = NCBlockManager.register("stained_birch_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_DARK_OAK_SHINGLES = NCBlockManager.register("stained_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_JUNGLE_SHINGLES = NCBlockManager.register("stained_jungle_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_OAK_SHINGLES = NCBlockManager.register("stained_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager STAINED_SPRUCE_SHINGLES = NCBlockManager.register("stained_spruce_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);

    /* Mossy Stained Boards & Shingles */
    public static final BlockManager MOSSY_STAINED_ACACIA_BOARDS = NCBlockManager.register("mossy_stained_acacia_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_BIRCH_BOARDS = NCBlockManager.register("mossy_stained_birch_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_DARK_OAK_BOARDS = NCBlockManager.register("mossy_stained_dark_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_JUNGLE_BOARDS = NCBlockManager.register("mossy_stained_jungle_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_OAK_BOARDS = NCBlockManager.register("mossy_stained_oak_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_STAINED_SPRUCE_BOARDS = NCBlockManager.register("mossy_stained_spruce_boards", BlockProps.PLANK.get(), ModBlockHelper.modifyList(BOARD_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    public static final BlockManager MOSSY_STAINED_ACACIA_SHINGLES = NCBlockManager.register("mossy_stained_acacia_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_STAINED_ACACIA_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_BIRCH_SHINGLES = NCBlockManager.register("mossy_stained_birch_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_STAINED_BIRCH_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_DARK_OAK_SHINGLES = NCBlockManager.register("mossy_stained_dark_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_STAINED_DARK_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_JUNGLE_SHINGLES = NCBlockManager.register("mossy_stained_jungle_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_STAINED_JUNGLE_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_OAK_SHINGLES = NCBlockManager.register("mossy_stained_oak_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_STAINED_OAK_BOARDS::baseBlock, ROOF_VARIANTS);
    public static final BlockManager MOSSY_STAINED_SPRUCE_SHINGLES = NCBlockManager.register("mossy_stained_spruce_shingle", BlockProps.PLANK_NO_OC.get(), NCBlocks.MOSSY_STAINED_SPRUCE_BOARDS::baseBlock, ROOF_VARIANTS);
    
    /* Thatch */
    public static final BlockManager THATCH = NCBlockManager.register("thatch", BlockProps.GRASS.get().noOcclusion(), ModBlockHelper.modifyList(THATCH_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager MOSSY_THATCH = NCBlockManager.register("mossy_thatch", BlockProps.GRASS.get().noOcclusion(), ModBlockHelper.modifyList(THATCH_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    
    /* Plaster */
    public static final BlockManager BEIGE_PLASTER = NCBlockManager.register("beige_plaster", BlockProps.PLASTER.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager BROWN_PLASTER = NCBlockManager.register("brown_plaster", BlockProps.PLASTER.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager OCHRE_PLASTER = NCBlockManager.register("ochre_plaster", BlockProps.PLASTER.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager TAN_PLASTER = NCBlockManager.register("tan_plaster", BlockProps.PLASTER.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
    public static final BlockManager WHITE_PLASTER = NCBlockManager.register("white_plaster", BlockProps.PLASTER.get(), ModBlockHelper.modifyList(STONE_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

    /* Plaster Powder */
    public static final RegistryObject<ConcretePowderBlock> BEIGE_PLASTER_POWDER = registerBlock("beige_plaster_powder", () -> new ConcretePowderBlock(NCBlocks.BEIGE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> BROWN_PLASTER_POWDER = registerBlock("brown_plaster_powder", () -> new ConcretePowderBlock(NCBlocks.BROWN_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> OCHRE_PLASTER_POWDER = registerBlock("ochre_plaster_powder", () -> new ConcretePowderBlock(NCBlocks.OCHRE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> TAN_PLASTER_POWDER = registerBlock("tan_plaster_powder", () -> new ConcretePowderBlock(NCBlocks.TAN_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> WHITE_PLASTER_POWDER = registerBlock("white_plaster_powder", () -> new ConcretePowderBlock(NCBlocks.WHITE_PLASTER.baseBlock(), BlockProps.PLASTER_POWDER.get()));

    /* Beige Plaster Tudor Blocks */
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_acacia_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_acacia_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_acacia_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_acacia_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_acacia_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_acacia_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_acacia_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_acacia_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_acacia_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_birch_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_birch_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_birch_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_birch_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_birch_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_birch_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_birch_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_birch_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_birch_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_dark_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_dark_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_dark_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_dark_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_dark_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_dark_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_dark_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_dark_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_dark_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_jungle_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_jungle_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_jungle_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_jungle_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_jungle_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_jungle_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_jungle_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_jungle_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_jungle_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_spruce_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_spruce_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_spruce_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_spruce_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_spruce_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_spruce_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_spruce_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_spruce_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_spruce_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    /* White Plaster Tudor Blocks */
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_acacia_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_acacia_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_acacia_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_acacia_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_UP = NCBlockManager.register("tudor_acacia_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_acacia_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_acacia_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_acacia_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_ACACIA_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_acacia_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_birch_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_birch_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_birch_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_birch_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_UP = NCBlockManager.register("tudor_birch_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_birch_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_birch_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_birch_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_BIRCH_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_birch_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_dark_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_dark_oak_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_dark_oak_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_dark_oak_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_UP = NCBlockManager.register("tudor_dark_oak_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_dark_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_dark_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_dark_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_DARK_OAK_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_dark_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_jungle_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_jungle_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_jungle_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_jungle_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_UP = NCBlockManager.register("tudor_jungle_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_jungle_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_jungle_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_jungle_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_JUNGLE_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_jungle_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_oak_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_oak_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_oak_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_UP = NCBlockManager.register("tudor_oak_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_OAK_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_spruce_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_spruce_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_spruce_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_spruce_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_UP = NCBlockManager.register("tudor_spruce_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_spruce_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_spruce_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_spruce_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_SPRUCE_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_spruce_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    /* Stained Beige Plaster Tudor Blocks */
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_acacia_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_acacia_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_acacia_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_acacia_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_stained_acacia_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_acacia_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_acacia_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_acacia_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_acacia_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_birch_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_birch_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_birch_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_birch_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_stained_birch_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_birch_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_birch_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_birch_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_birch_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_dark_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_jungle_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_jungle_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_jungle_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_jungle_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_stained_jungle_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_jungle_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_jungle_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_jungle_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_jungle_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_oak_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_oak_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_oak_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_oak_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_stained_oak_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_oak_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_oak_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_oak_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_oak_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_spruce_beige_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_spruce_beige_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_spruce_beige_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_spruce_beige_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP = NCBlockManager.register("tudor_stained_spruce_beige_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_spruce_beige_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_spruce_beige_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_spruce_beige_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_spruce_beige_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    /* Stained White Plaster Tudor Blocks */
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_acacia_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_acacia_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_acacia_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_acacia_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP = NCBlockManager.register("tudor_stained_acacia_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_acacia_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_acacia_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_acacia_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_acacia_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_birch_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_birch_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_birch_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_birch_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP = NCBlockManager.register("tudor_stained_birch_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_birch_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_birch_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_birch_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_birch_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_dark_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_jungle_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_jungle_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_jungle_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_jungle_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP = NCBlockManager.register("tudor_stained_jungle_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_jungle_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_jungle_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_jungle_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_jungle_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_oak_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_oak_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_oak_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_oak_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_UP = NCBlockManager.register("tudor_stained_oak_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_oak_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_oak_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_oak_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_OAK_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_oak_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS = NCBlockManager.register("tudor_stained_spruce_white_plaster_cross", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN = NCBlockManager.register("tudor_stained_spruce_white_plaster_down", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT = NCBlockManager.register("tudor_stained_spruce_white_plaster_left", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT = NCBlockManager.register("tudor_stained_spruce_white_plaster_right", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP = NCBlockManager.register("tudor_stained_spruce_white_plaster_up", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1 = NCBlockManager.register("tudor_stained_spruce_white_plaster_h_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2 = NCBlockManager.register("tudor_stained_spruce_white_plaster_h_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1 = NCBlockManager.register("tudor_stained_spruce_white_plaster_v_1", BlockProps.TUDOR_1.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));
//    public static final BlockManager TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2 = NCBlockManager.register("tudor_stained_spruce_white_plaster_v_2", BlockProps.TUDOR_2.get(), ModBlockHelper.modifyList(ModBlockHelper.TUDOR_VARIANTS, (c) -> c.add(ModBlockFamily.Variant.BASE)));

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
