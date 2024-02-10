package com.calibermc.naturescanvas.data;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.naturescanvas.block.NCBlocks;
import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class NCBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();

    public NCBlockFamilies() {
        /* Granite */
        ModBlockFamily BLACK_GRANITE = familyBuilder(NCBlocks.BLACK_GRANITE.baseBlock())
                .fromManager(NCBlocks.BLACK_GRANITE)
                .getFamily();
        ModBlockFamily BROWN_GRANITE = familyBuilder(NCBlocks.BROWN_GRANITE.baseBlock())
                .fromManager(NCBlocks.BROWN_GRANITE)
                .getFamily();
        ModBlockFamily GRAY_GRANITE = familyBuilder(NCBlocks.GRAY_GRANITE.baseBlock())
                .fromManager(NCBlocks.GRAY_GRANITE)
                .getFamily();
        ModBlockFamily PINK_GRANITE = familyBuilder(NCBlocks.PINK_GRANITE.baseBlock())
                .fromManager(NCBlocks.PINK_GRANITE)
                .getFamily();
        ModBlockFamily WHITE_GRANITE = familyBuilder(NCBlocks.WHITE_GRANITE.baseBlock())
                .fromManager(NCBlocks.WHITE_GRANITE)
                .getFamily();

        /* Polished Granite */
        ModBlockFamily POLISHED_BLACK_GRANITE = familyBuilder(NCBlocks.POLISHED_BLACK_GRANITE.baseBlock())
                .fromManager(NCBlocks.POLISHED_BLACK_GRANITE)
                .getFamily();
        ModBlockFamily POLISHED_BROWN_GRANITE = familyBuilder(NCBlocks.POLISHED_BROWN_GRANITE.baseBlock())
                .fromManager(NCBlocks.POLISHED_BROWN_GRANITE)
                .getFamily();
        ModBlockFamily POLISHED_GRAY_GRANITE = familyBuilder(NCBlocks.POLISHED_GRAY_GRANITE.baseBlock())
                .fromManager(NCBlocks.POLISHED_GRAY_GRANITE)
                .getFamily();
        ModBlockFamily POLISHED_PINK_GRANITE = familyBuilder(NCBlocks.POLISHED_PINK_GRANITE.baseBlock())
                .fromManager(NCBlocks.POLISHED_PINK_GRANITE)
                .getFamily();
        ModBlockFamily POLISHED_WHITE_GRANITE = familyBuilder(NCBlocks.POLISHED_WHITE_GRANITE.baseBlock())
                .fromManager(NCBlocks.POLISHED_WHITE_GRANITE)
                .getFamily();

        /* Limestone */
        ModBlockFamily DARK_LIMESTONE = familyBuilder(NCBlocks.DARK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.DARK_LIMESTONE)
                .getFamily();
        ModBlockFamily LIGHT_LIMESTONE = familyBuilder(NCBlocks.LIGHT_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.LIGHT_LIMESTONE)
                .getFamily();
        ModBlockFamily PINK_LIMESTONE = familyBuilder(NCBlocks.PINK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.PINK_LIMESTONE)
                .getFamily();
        ModBlockFamily TAN_LIMESTONE = familyBuilder(NCBlocks.TAN_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.TAN_LIMESTONE)
                .getFamily();

        /* Cobbled Limestone */
        ModBlockFamily COBBLED_DARK_LIMESTONE = familyBuilder(NCBlocks.COBBLED_DARK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.COBBLED_DARK_LIMESTONE)
                .getFamily();
        ModBlockFamily COBBLED_LIGHT_LIMESTONE = familyBuilder(NCBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.COBBLED_LIGHT_LIMESTONE)
                .getFamily();
        ModBlockFamily COBBLED_PINK_LIMESTONE = familyBuilder(NCBlocks.COBBLED_PINK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.COBBLED_PINK_LIMESTONE)
                .getFamily();
        ModBlockFamily COBBLED_TAN_LIMESTONE = familyBuilder(NCBlocks.COBBLED_TAN_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.COBBLED_TAN_LIMESTONE)
                .getFamily();

        /* Mossy Cobbled Limestone */
        ModBlockFamily MOSSY_COBBLED_DARK_LIMESTONE = familyBuilder(NCBlocks.MOSSY_COBBLED_DARK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.MOSSY_COBBLED_DARK_LIMESTONE)
                .getFamily();
        ModBlockFamily MOSSY_COBBLED_LIGHT_LIMESTONE = familyBuilder(NCBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE)
                .getFamily();
        ModBlockFamily MOSSY_COBBLED_LIMESTONE = familyBuilder(Blocks.MOSSY_COBBLESTONE)
                .fromManager(NCBlocks.MOSSY_COBBLESTONE)
                .stairs(Blocks.MOSSY_COBBLESTONE_STAIRS)
                .wall(Blocks.MOSSY_COBBLESTONE_WALL)
                .getFamily();
        ModBlockFamily MOSSY_COBBLED_PINK_LIMESTONE = familyBuilder(NCBlocks.MOSSY_COBBLED_PINK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.MOSSY_COBBLED_PINK_LIMESTONE)
                .getFamily();
        ModBlockFamily MOSSY_COBBLED_TAN_LIMESTONE = familyBuilder(NCBlocks.MOSSY_COBBLED_TAN_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.MOSSY_COBBLED_TAN_LIMESTONE)
                .getFamily();

        /* Limestone Bricks */
        ModBlockFamily DARK_LIMESTONE_BRICK = familyBuilder(NCBlocks.DARK_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.DARK_LIMESTONE_BRICK)
                .getFamily();
        ModBlockFamily LIGHT_LIMESTONE_BRICK = familyBuilder(NCBlocks.LIGHT_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.LIGHT_LIMESTONE_BRICK)
                .getFamily();
        ModBlockFamily PINK_LIMESTONE_BRICK = familyBuilder(NCBlocks.PINK_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.PINK_LIMESTONE_BRICK)
                .getFamily();
        ModBlockFamily TAN_LIMESTONE_BRICK = familyBuilder(NCBlocks.TAN_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.TAN_LIMESTONE_BRICK)
                .getFamily();

        /* Mossy Limestone Bricks */
        ModBlockFamily MOSSY_DARK_LIMESTONE_BRICK = familyBuilder(NCBlocks.MOSSY_DARK_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.MOSSY_DARK_LIMESTONE_BRICK)
                .getFamily();
        ModBlockFamily MOSSY_LIGHT_LIMESTONE_BRICK = familyBuilder(NCBlocks.MOSSY_LIGHT_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.MOSSY_LIGHT_LIMESTONE_BRICK)
                .getFamily();
        ModBlockFamily MOSSY_LIMESTONE_BRICKS = familyBuilder(Blocks.MOSSY_STONE_BRICKS)
                .fromManager(NCBlocks.MOSSY_LIMESTONE_BRICK)
                .stairs(Blocks.MOSSY_STONE_BRICK_STAIRS)
                .wall(Blocks.MOSSY_STONE_BRICK_WALL)
                .getFamily();
        ModBlockFamily MOSSY_PINK_LIMESTONE_BRICK = familyBuilder(NCBlocks.MOSSY_PINK_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.MOSSY_PINK_LIMESTONE_BRICK)
                .getFamily();
        ModBlockFamily MOSSY_TAN_LIMESTONE_BRICK = familyBuilder(NCBlocks.MOSSY_TAN_LIMESTONE_BRICK.baseBlock())
                .fromManager(NCBlocks.MOSSY_TAN_LIMESTONE_BRICK)
                .getFamily();

        /* Cracked Limestone Bricks */
        ModBlockFamily CRACKED_DARK_LIMESTONE_BRICK = familyBuilder(NCBlocks.CRACKED_DARK_LIMESTONE_BRICKS.baseBlock())
                .getFamily();
        ModBlockFamily CRACKED_LIGHT_LIMESTONE_BRICK = familyBuilder(NCBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.baseBlock())
                .getFamily();
        ModBlockFamily CRACKED_LIMESTONE_BRICKS = familyBuilder(Blocks.CRACKED_STONE_BRICKS)
                .getFamily();
        ModBlockFamily CRACKED_PINK_LIMESTONE_BRICK = familyBuilder(NCBlocks.CRACKED_PINK_LIMESTONE_BRICKS.baseBlock())
                .getFamily();
        ModBlockFamily CRACKED_TAN_LIMESTONE_BRICK = familyBuilder(NCBlocks.CRACKED_TAN_LIMESTONE_BRICKS.baseBlock())
                .getFamily();

        /* Chiseled Limestone Bricks */
        ModBlockFamily CHISELED_DARK_LIMESTONE_BRICK = familyBuilder(NCBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock())
                .fromManager(NCBlocks.CHISELED_DARK_LIMESTONE_BRICKS)
                .getFamily();
        ModBlockFamily CHISELED_LIGHT_LIMESTONE_BRICK = familyBuilder(NCBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock())
                .fromManager(NCBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS)
                .getFamily();
        ModBlockFamily CHISELED_LIMESTONE_BRICKS = familyBuilder(Blocks.CHISELED_STONE_BRICKS)
//            .fromManager(NCBlocks.CHISELED_LIMESTONE_BRICKS)
                .getFamily();
        ModBlockFamily CHISELED_PINK_LIMESTONE_BRICK = familyBuilder(NCBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock())
                .fromManager(NCBlocks.CHISELED_PINK_LIMESTONE_BRICKS)
                .getFamily();
        ModBlockFamily CHISELED_TAN_LIMESTONE_BRICK = familyBuilder(NCBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock())
                .fromManager(NCBlocks.CHISELED_TAN_LIMESTONE_BRICKS)
                .getFamily();

        /* Smooth Limestone */
        ModBlockFamily SMOOTH_DARK_LIMESTONE = familyBuilder(NCBlocks.SMOOTH_DARK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_DARK_LIMESTONE)
                .getFamily();
        ModBlockFamily SMOOTH_LIGHT_LIMESTONE = familyBuilder(NCBlocks.SMOOTH_LIGHT_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_LIGHT_LIMESTONE)
                .getFamily();
        ModBlockFamily SMOOTH_LIMESTONE = familyBuilder(Blocks.SMOOTH_STONE)
                .fromManager(NCBlocks.SMOOTH_LIMESTONE)
                .getFamily();
        ModBlockFamily SMOOTH_PINK_LIMESTONE = familyBuilder(NCBlocks.SMOOTH_PINK_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_PINK_LIMESTONE)
                .getFamily();
        ModBlockFamily SMOOTH_TAN_LIMESTONE = familyBuilder(NCBlocks.SMOOTH_TAN_LIMESTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_TAN_LIMESTONE)
                .getFamily();

        /* Marble */
        ModBlockFamily BLACK_MARBLE = familyBuilder(NCBlocks.BLACK_MARBLE.baseBlock())
                .fromManager(NCBlocks.BLACK_MARBLE)
                .getFamily();
        ModBlockFamily GRAY_MARBLE = familyBuilder(NCBlocks.GRAY_MARBLE.baseBlock())
                .fromManager(NCBlocks.GRAY_MARBLE)
                .getFamily();
        ModBlockFamily PINK_MARBLE = familyBuilder(NCBlocks.PINK_MARBLE.baseBlock())
                .fromManager(NCBlocks.PINK_MARBLE)
                .getFamily();
        ModBlockFamily RED_MARBLE = familyBuilder(NCBlocks.RED_MARBLE.baseBlock())
                .fromManager(NCBlocks.RED_MARBLE)
                .getFamily();
        ModBlockFamily WHITE_MARBLE = familyBuilder(NCBlocks.WHITE_MARBLE.baseBlock())
                .fromManager(NCBlocks.WHITE_MARBLE)
                .getFamily();

        /* Polished Marble */
        ModBlockFamily POLISHED_BLACK_MARBLE = familyBuilder(NCBlocks.POLISHED_BLACK_MARBLE.baseBlock())
                .fromManager(NCBlocks.POLISHED_BLACK_MARBLE)
                .getFamily();
        ModBlockFamily POLISHED_GRAY_MARBLE = familyBuilder(NCBlocks.POLISHED_GRAY_MARBLE.baseBlock())
                .fromManager(NCBlocks.POLISHED_GRAY_MARBLE)
                .getFamily();
        ModBlockFamily POLISHED_PINK_MARBLE = familyBuilder(NCBlocks.POLISHED_PINK_MARBLE.baseBlock())
                .fromManager(NCBlocks.POLISHED_PINK_MARBLE)
                .getFamily();
        ModBlockFamily POLISHED_RED_MARBLE = familyBuilder(NCBlocks.POLISHED_RED_MARBLE.baseBlock())
                .fromManager(NCBlocks.POLISHED_RED_MARBLE)
                .getFamily();
        ModBlockFamily POLISHED_WHITE_MARBLE = familyBuilder(NCBlocks.POLISHED_WHITE_MARBLE.baseBlock())
                .fromManager(NCBlocks.POLISHED_WHITE_MARBLE)
                .getFamily();

        /* Sandstone */
        ModBlockFamily BROWN_SANDSTONE = familyBuilder(NCBlocks.BROWN_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.BROWN_SANDSTONE)
                .getFamily();
        ModBlockFamily ORANGE_SANDSTONE = familyBuilder(NCBlocks.ORANGE_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.ORANGE_SANDSTONE)
                .getFamily();

        /* Chiseled Sandstone */
        ModBlockFamily CHISELED_BROWN_SANDSTONE = familyBuilder(NCBlocks.CHISELED_BROWN_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.CHISELED_BROWN_SANDSTONE)
                .getFamily();
        ModBlockFamily CHISELED_ORANGE_SANDSTONE = familyBuilder(NCBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.CHISELED_ORANGE_SANDSTONE)
                .getFamily();

        /* Cut Sandstone */
        ModBlockFamily CUT_BROWN_SANDSTONE = familyBuilder(NCBlocks.CUT_BROWN_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.CUT_BROWN_SANDSTONE)
                .getFamily();
        ModBlockFamily CUT_ORANGE_SANDSTONE = familyBuilder(NCBlocks.CUT_ORANGE_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.CUT_ORANGE_SANDSTONE)
                .getFamily();

        /* Smooth Sandstone */
        ModBlockFamily SMOOTH_BROWN_SANDSTONE = familyBuilder(NCBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_BROWN_SANDSTONE)
                .getFamily();
        ModBlockFamily SMOOTH_ORANGE_SANDSTONE = familyBuilder(NCBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_ORANGE_SANDSTONE)
                .getFamily();

        /* Sand */
        ModBlockFamily BLACK_SAND = familyBuilder(NCBlocks.BLACK_SAND.get())
                .layer(NCBlocks.BLACK_SAND_LAYER.get())
                .getFamily();
        ModBlockFamily BROWN_SAND = familyBuilder(NCBlocks.BROWN_SAND.get())
                .layer(NCBlocks.BROWN_SAND_LAYER.get())
                .getFamily();
        ModBlockFamily ORANGE_SAND = familyBuilder(NCBlocks.ORANGE_SAND.get())
                .layer(NCBlocks.ORANGE_SAND_LAYER.get())
                .getFamily();
        ModBlockFamily RED_SAND = familyBuilder(Blocks.RED_SAND)
                .layer(NCBlocks.RED_SAND_LAYER.get())
                .getFamily();
        ModBlockFamily SAND = familyBuilder(Blocks.SAND)
                .layer(NCBlocks.SAND_LAYER.get())
                .getFamily();
        ModBlockFamily SOUL_SAND = familyBuilder(Blocks.SOUL_SAND)
                .layer(NCBlocks.SOUL_SAND_LAYER.get())
                .getFamily();
        ModBlockFamily WHITE_SAND = familyBuilder(NCBlocks.WHITE_SAND.get())
                .layer(NCBlocks.WHITE_SAND_LAYER.get())
                .getFamily();

        /* Other Terrain */
        ModBlockFamily CLAY = familyBuilder(Blocks.CLAY)
                .layer(NCBlocks.CLAY_LAYER.get())
                .getFamily();
        ModBlockFamily COARSE_DIRT = familyBuilder(Blocks.COARSE_DIRT)
                .layer(NCBlocks.COARSE_DIRT_LAYER.get())
                .getFamily();
        ModBlockFamily DIRT = familyBuilder(Blocks.DIRT)
                .layer(NCBlocks.DIRT_LAYER.get())
                .getFamily();
        ModBlockFamily FARMLAND = familyBuilder(Blocks.FARMLAND)
//            .layer(NCBlocks.FARMLAND_LAYER.get())
                .getFamily();
        ModBlockFamily GRASS_BLOCK = familyBuilder(Blocks.GRASS_BLOCK)
                .layer(NCBlocks.GRASS_LAYER.get())
                .getFamily();
        ModBlockFamily GRAVEL = familyBuilder(Blocks.GRAVEL)
                .layer(NCBlocks.GRAVEL_LAYER.get())
                .getFamily();
        ModBlockFamily MYCELIUM = familyBuilder(Blocks.MYCELIUM)
                .layer(NCBlocks.MYCELIUM_LAYER.get())
                .getFamily();
        ModBlockFamily PODZOL = familyBuilder(Blocks.PODZOL)
                .layer(NCBlocks.PODZOL_LAYER.get())
                .getFamily();
        ModBlockFamily ROOTED_DIRT = familyBuilder(Blocks.ROOTED_DIRT)
                .layer(NCBlocks.ROOTED_DIRT_LAYER.get())
                .getFamily();
        ModBlockFamily SOUL_SOIL = familyBuilder(Blocks.SOUL_SOIL)
                .layer(NCBlocks.SOUL_SOIL_LAYER.get())
                .getFamily();
        ModBlockFamily CRIMSON_NYLIUM = familyBuilder(Blocks.CRIMSON_NYLIUM)
                .layer(NCBlocks.CRIMSON_NYLIUM_LAYER.get())
                .getFamily();
        ModBlockFamily WARPED_NYLIUM = familyBuilder(Blocks.WARPED_NYLIUM)
                .layer(NCBlocks.WARPED_NYLIUM_LAYER.get())
                .getFamily();
    }

    /* Mossy Planks */
    public static final ModBlockFamily MOSSY_ACACIA = familyBuilder(NCBlocks.MOSSY_ACACIA.baseBlock())
            .fromManager(NCBlocks.MOSSY_ACACIA)
            .getFamily();
    public static final ModBlockFamily MOSSY_BIRCH = familyBuilder(NCBlocks.MOSSY_BIRCH.baseBlock())
            .fromManager(NCBlocks.MOSSY_BIRCH)
            .getFamily();
    public static final ModBlockFamily MOSSY_DARK_OAK = familyBuilder(NCBlocks.MOSSY_DARK_OAK.baseBlock())
            .fromManager(NCBlocks.MOSSY_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_JUNGLE = familyBuilder(NCBlocks.MOSSY_JUNGLE.baseBlock())
            .fromManager(NCBlocks.MOSSY_JUNGLE)
            .getFamily();
    public static final ModBlockFamily MOSSY_OAK = familyBuilder(NCBlocks.MOSSY_OAK.baseBlock())
            .fromManager(NCBlocks.MOSSY_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_SPRUCE = familyBuilder(NCBlocks.MOSSY_SPRUCE.baseBlock())
            .fromManager(NCBlocks.MOSSY_SPRUCE)
            .getFamily();
    public static final ModBlockFamily MOSSY_CRIMSON = familyBuilder(NCBlocks.MOSSY_CRIMSON.baseBlock())
            .fromManager(NCBlocks.MOSSY_CRIMSON)
            .getFamily();
    public static final ModBlockFamily MOSSY_WARPED = familyBuilder(NCBlocks.MOSSY_WARPED.baseBlock())
            .fromManager(NCBlocks.MOSSY_WARPED)
            .getFamily();

    /* Stained Wood Planks */
    public static final ModBlockFamily STAINED_ACACIA_PLANKS = familyBuilder(NCBlocks.STAINED_ACACIA.baseBlock())
            .fromManager(NCBlocks.STAINED_ACACIA)
            .button(NCBlocks.STAINED_ACACIA_BUTTON.get())
            .door(NCBlocks.STAINED_ACACIA_DOOR.get())
            .sign(NCBlocks.STAINED_ACACIA_SIGN.get(), NCBlocks.STAINED_ACACIA_WALL_SIGN.get())
            .tallDoor(NCBlocks.TALL_STAINED_ACACIA_DOOR.get())
            .trapdoor(NCBlocks.STAINED_ACACIA_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_BIRCH_PLANKS = familyBuilder(NCBlocks.STAINED_BIRCH.baseBlock())
            .fromManager(NCBlocks.STAINED_BIRCH)
            .button(NCBlocks.STAINED_BIRCH_BUTTON.get())
            .door(NCBlocks.STAINED_BIRCH_DOOR.get())
            .sign(NCBlocks.STAINED_BIRCH_SIGN.get(), NCBlocks.STAINED_BIRCH_WALL_SIGN.get())
            .tallDoor(NCBlocks.TALL_STAINED_BIRCH_DOOR.get())
            .trapdoor(NCBlocks.STAINED_BIRCH_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_DARK_OAK_PLANKS = familyBuilder(NCBlocks.STAINED_DARK_OAK.baseBlock())
            .fromManager(NCBlocks.STAINED_DARK_OAK)
            .button(NCBlocks.STAINED_DARK_OAK_BUTTON.get())
            .door(NCBlocks.STAINED_DARK_OAK_DOOR.get())
            .sign(NCBlocks.STAINED_DARK_OAK_SIGN.get(), NCBlocks.STAINED_DARK_OAK_WALL_SIGN.get())
            .tallDoor(NCBlocks.TALL_STAINED_DARK_OAK_DOOR.get())
            .trapdoor(NCBlocks.STAINED_DARK_OAK_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_JUNGLE_PLANKS = familyBuilder(NCBlocks.STAINED_JUNGLE.baseBlock())
            .fromManager(NCBlocks.STAINED_JUNGLE)
            .button(NCBlocks.STAINED_JUNGLE_BUTTON.get())
            .door(NCBlocks.STAINED_JUNGLE_DOOR.get())
            .sign(NCBlocks.STAINED_JUNGLE_SIGN.get(), NCBlocks.STAINED_JUNGLE_WALL_SIGN.get())
            .tallDoor(NCBlocks.TALL_STAINED_JUNGLE_DOOR.get())
            .trapdoor(NCBlocks.STAINED_JUNGLE_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_OAK_PLANKS = familyBuilder(NCBlocks.STAINED_OAK.baseBlock())
            .fromManager(NCBlocks.STAINED_OAK)
            .button(NCBlocks.STAINED_OAK_BUTTON.get())
            .door(NCBlocks.STAINED_OAK_DOOR.get())
            .sign(NCBlocks.STAINED_OAK_SIGN.get(), NCBlocks.STAINED_OAK_WALL_SIGN.get())
            .tallDoor(NCBlocks.TALL_STAINED_OAK_DOOR.get())
            .trapdoor(NCBlocks.STAINED_OAK_TRAPDOOR.get())
            .getFamily();
    public static final ModBlockFamily STAINED_SPRUCE_PLANKS = familyBuilder(NCBlocks.STAINED_SPRUCE.baseBlock())
            .fromManager(NCBlocks.STAINED_SPRUCE)
            .button(NCBlocks.STAINED_SPRUCE_BUTTON.get())
            .door(NCBlocks.STAINED_SPRUCE_DOOR.get())
            .sign(NCBlocks.STAINED_SPRUCE_SIGN.get(), NCBlocks.STAINED_SPRUCE_WALL_SIGN.get())
            .tallDoor(NCBlocks.TALL_STAINED_SPRUCE_DOOR.get())
            .trapdoor(NCBlocks.STAINED_SPRUCE_TRAPDOOR.get())
            .getFamily();

    /* Mossy Stained Planks */
    public static final ModBlockFamily MOSSY_STAINED_ACACIA = familyBuilder(NCBlocks.MOSSY_STAINED_ACACIA.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_ACACIA)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_BIRCH = familyBuilder(NCBlocks.MOSSY_STAINED_BIRCH.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_BIRCH)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_DARK_OAK = familyBuilder(NCBlocks.MOSSY_STAINED_DARK_OAK.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_JUNGLE = familyBuilder(NCBlocks.MOSSY_STAINED_JUNGLE.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_JUNGLE)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_OAK = familyBuilder(NCBlocks.MOSSY_STAINED_OAK.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_OAK)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_SPRUCE = familyBuilder(NCBlocks.MOSSY_STAINED_SPRUCE.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_SPRUCE)
            .getFamily();

    /* Stained Wood  */
    public static final ModBlockFamily STAINED_STRIPPED_ACACIA_WOOD = familyBuilder(NCBlocks.STAINED_STRIPPED_ACACIA.baseBlock())
            .fromManager(NCBlocks.STAINED_STRIPPED_ACACIA)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_BIRCH_WOOD = familyBuilder(NCBlocks.STAINED_STRIPPED_BIRCH.baseBlock())
            .fromManager(NCBlocks.STAINED_STRIPPED_BIRCH)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_DARK_OAK_WOOD = familyBuilder(NCBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock())
            .fromManager(NCBlocks.STAINED_STRIPPED_DARK_OAK)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_JUNGLE_WOOD = familyBuilder(NCBlocks.STAINED_STRIPPED_JUNGLE.baseBlock())
            .fromManager(NCBlocks.STAINED_STRIPPED_JUNGLE)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_OAK_WOOD = familyBuilder(NCBlocks.STAINED_STRIPPED_OAK.baseBlock())
            .fromManager(NCBlocks.STAINED_STRIPPED_OAK)
            .getFamily();
    public static final ModBlockFamily STAINED_STRIPPED_SPRUCE_WOOD = familyBuilder(NCBlocks.STAINED_STRIPPED_SPRUCE.baseBlock())
            .fromManager(NCBlocks.STAINED_STRIPPED_SPRUCE)
            .getFamily();

    /* Boards and Roofing Blocks */
    public static final ModBlockFamily ACACIA_BOARDS = familyBuilder(NCBlocks.ACACIA_BOARDS.baseBlock())
            .fromManager(NCBlocks.ACACIA_BOARDS)
            .fromManager(NCBlocks.ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily BIRCH_BOARDS = familyBuilder(NCBlocks.BIRCH_BOARDS.baseBlock())
            .fromManager(NCBlocks.BIRCH_BOARDS)
            .fromManager(NCBlocks.BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily DARK_OAK_BOARDS = familyBuilder(NCBlocks.DARK_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.DARK_OAK_BOARDS)
            .fromManager(NCBlocks.DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily JUNGLE_BOARDS = familyBuilder(NCBlocks.JUNGLE_BOARDS.baseBlock())
            .fromManager(NCBlocks.JUNGLE_BOARDS)
            .fromManager(NCBlocks.JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily OAK_BOARDS = familyBuilder(NCBlocks.OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.OAK_BOARDS)
            .fromManager(NCBlocks.OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily SPRUCE_BOARDS = familyBuilder(NCBlocks.SPRUCE_BOARDS.baseBlock())
            .fromManager(NCBlocks.SPRUCE_BOARDS)
            .fromManager(NCBlocks.SPRUCE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily CRIMSON_BOARDS = familyBuilder(NCBlocks.CRIMSON_BOARDS.baseBlock())
            .fromManager(NCBlocks.CRIMSON_BOARDS)
            .fromManager(NCBlocks.CRIMSON_SHINGLES)
            .getFamily();
    public static final ModBlockFamily WARPED_BOARDS = familyBuilder(NCBlocks.WARPED_BOARDS.baseBlock())
            .fromManager(NCBlocks.WARPED_BOARDS)
            .fromManager(NCBlocks.WARPED_SHINGLES)
            .getFamily();

    /* Mossy Boards and Roofing Blocks */
    public static final ModBlockFamily MOSSY_ACACIA_BOARDS = familyBuilder(NCBlocks.MOSSY_ACACIA_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_ACACIA_BOARDS)
            .fromManager(NCBlocks.MOSSY_ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_BIRCH_BOARDS = familyBuilder(NCBlocks.MOSSY_BIRCH_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_BIRCH_BOARDS)
            .fromManager(NCBlocks.MOSSY_BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_DARK_OAK_BOARDS = familyBuilder(NCBlocks.MOSSY_DARK_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_DARK_OAK_BOARDS)
            .fromManager(NCBlocks.MOSSY_DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_JUNGLE_BOARDS = familyBuilder(NCBlocks.MOSSY_JUNGLE_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_JUNGLE_BOARDS)
            .fromManager(NCBlocks.MOSSY_JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_OAK_BOARDS = familyBuilder(NCBlocks.MOSSY_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_OAK_BOARDS)
            .fromManager(NCBlocks.MOSSY_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_SPRUCE_BOARDS = familyBuilder(NCBlocks.MOSSY_SPRUCE_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_SPRUCE_BOARDS)
            .fromManager(NCBlocks.MOSSY_SPRUCE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_CRIMSON_BOARDS = familyBuilder(NCBlocks.MOSSY_CRIMSON_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_CRIMSON_BOARDS)
            .fromManager(NCBlocks.MOSSY_CRIMSON_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_WARPED_BOARDS = familyBuilder(NCBlocks.MOSSY_WARPED_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_WARPED_BOARDS)
            .fromManager(NCBlocks.MOSSY_WARPED_SHINGLES)
            .getFamily();


    /* Stained Boards and Roofing Blocks */
    public static final ModBlockFamily STAINED_ACACIA_BOARDS = familyBuilder(NCBlocks.STAINED_ACACIA_BOARDS.baseBlock())
            .fromManager(NCBlocks.STAINED_ACACIA_BOARDS)
            .fromManager(NCBlocks.STAINED_ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_BIRCH_BOARDS = familyBuilder(NCBlocks.STAINED_BIRCH_BOARDS.baseBlock())
            .fromManager(NCBlocks.STAINED_BIRCH_BOARDS)
            .fromManager(NCBlocks.STAINED_BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_DARK_OAK_BOARDS = familyBuilder(NCBlocks.STAINED_DARK_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.STAINED_DARK_OAK_BOARDS)
            .fromManager(NCBlocks.STAINED_DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_JUNGLE_BOARDS = familyBuilder(NCBlocks.STAINED_JUNGLE_BOARDS.baseBlock())
            .fromManager(NCBlocks.STAINED_JUNGLE_BOARDS)
            .fromManager(NCBlocks.STAINED_JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_OAK_BOARDS = familyBuilder(NCBlocks.STAINED_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.STAINED_OAK_BOARDS)
            .fromManager(NCBlocks.STAINED_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily STAINED_SPRUCE_BOARDS = familyBuilder(NCBlocks.STAINED_SPRUCE_BOARDS.baseBlock())
            .fromManager(NCBlocks.STAINED_SPRUCE_BOARDS)
            .fromManager(NCBlocks.STAINED_SPRUCE_SHINGLES)
            .getFamily();

    /* Mossy Boards and Roofing Blocks */
    public static final ModBlockFamily MOSSY_STAINED_ACACIA_BOARDS = familyBuilder(NCBlocks.MOSSY_STAINED_ACACIA_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_ACACIA_BOARDS)
            .fromManager(NCBlocks.MOSSY_STAINED_ACACIA_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_BIRCH_BOARDS = familyBuilder(NCBlocks.MOSSY_STAINED_BIRCH_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_BIRCH_BOARDS)
            .fromManager(NCBlocks.MOSSY_STAINED_BIRCH_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_DARK_OAK_BOARDS = familyBuilder(NCBlocks.MOSSY_STAINED_DARK_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_DARK_OAK_BOARDS)
            .fromManager(NCBlocks.MOSSY_STAINED_DARK_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_JUNGLE_BOARDS = familyBuilder(NCBlocks.MOSSY_STAINED_JUNGLE_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_JUNGLE_BOARDS)
            .fromManager(NCBlocks.MOSSY_STAINED_JUNGLE_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_OAK_BOARDS = familyBuilder(NCBlocks.MOSSY_STAINED_OAK_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_OAK_BOARDS)
            .fromManager(NCBlocks.MOSSY_STAINED_OAK_SHINGLES)
            .getFamily();
    public static final ModBlockFamily MOSSY_STAINED_SPRUCE_BOARDS = familyBuilder(NCBlocks.MOSSY_STAINED_SPRUCE_BOARDS.baseBlock())
            .fromManager(NCBlocks.MOSSY_STAINED_SPRUCE_BOARDS)
            .fromManager(NCBlocks.MOSSY_STAINED_SPRUCE_SHINGLES)
            .getFamily();

    /* Thatch */
    public static final ModBlockFamily THATCH = familyBuilder(NCBlocks.THATCH.baseBlock())
            .fromManager(NCBlocks.THATCH)
            .getFamily();
    public static final ModBlockFamily MOSSY_THATCH = familyBuilder(NCBlocks.MOSSY_THATCH.baseBlock())
            .fromManager(NCBlocks.MOSSY_THATCH)
            .getFamily();

    /* Plaster */
    public static final ModBlockFamily BEIGE_PLASTER = familyBuilder(NCBlocks.BEIGE_PLASTER.baseBlock())
            .fromManager(NCBlocks.BEIGE_PLASTER)
            .getFamily();
    public static final ModBlockFamily BROWN_PLASTER = familyBuilder(NCBlocks.BROWN_PLASTER.baseBlock())
            .fromManager(NCBlocks.BROWN_PLASTER)
            .getFamily();
    public static final ModBlockFamily OCHRE_PLASTER = familyBuilder(NCBlocks.OCHRE_PLASTER.baseBlock())
            .fromManager(NCBlocks.OCHRE_PLASTER)
            .getFamily();
    public static final ModBlockFamily TAN_PLASTER = familyBuilder(NCBlocks.TAN_PLASTER.baseBlock())
            .fromManager(NCBlocks.TAN_PLASTER)
            .getFamily();
    public static final ModBlockFamily WHITE_PLASTER = familyBuilder(NCBlocks.WHITE_PLASTER.baseBlock())
            .fromManager(NCBlocks.WHITE_PLASTER)
            .getFamily();

    //    /* TUDOR BLOCKS */
    /* Beige Plaster Half-Timbered */
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_BEIGE_PLASTER_V_2)
//            .getFamily();
//
//    //    /* White Plaster Half-Timbered */
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_ACACIA_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_ACACIA_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_BIRCH_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_BIRCH_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_DARK_OAK_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_DARK_OAK_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_JUNGLE_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_JUNGLE_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_OAK_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_OAK_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_OAK_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_SPRUCE_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_SPRUCE_WHITE_PLASTER_V_2)
//            .getFamily();
//
//    //    /* Beige Plaster Half-Timbered */
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_BEIGE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_BEIGE_PLASTER_V_2)
//            .getFamily();
//
//    //    /* White Plaster Half-Timbered */
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_ACACIA_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_BIRCH_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_DARK_OAK_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_JUNGLE_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_OAK_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_OAK_WHITE_PLASTER_V_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_CROSS)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_DOWN)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_UP)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_LEFT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_RIGHT)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_H_2)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_1)
//            .getFamily();
//    public static final ModBlockFamily TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2 = familyBuilder(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2.baseBlock())
//            .fromManager(NCBlocks.TUDOR_STAINED_SPRUCE_WHITE_PLASTER_V_2)
//            .getFamily();

    public static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
        ModBlockFamily.Builder builder = new ModBlockFamily.Builder(pBaseBlock);
        ModBlockFamily modBlockFamily = MAP.put(pBaseBlock, builder.getFamily());
        if (modBlockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + ForgeRegistries.BLOCKS.getKey(pBaseBlock));
        } else {
            return builder;
        }
    }

    public static Stream<ModBlockFamily> getAllFamilies() {
        return MAP.values().stream();
    }

    public void register() {
        for (ModBlockFamily modBlockFamily : getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }
}