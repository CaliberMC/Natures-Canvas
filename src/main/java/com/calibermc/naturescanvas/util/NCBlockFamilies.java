package com.calibermc.naturescanvas.util;

import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import static com.calibermc.caliber.data.ModBlockFamilies.familyBuilder;

@SuppressWarnings("unused")
public class NCBlockFamilies {

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
        ModBlockFamily RED_GRANITE = familyBuilder(Blocks.GRANITE)
                .fromManager(NCBlocks.RED_GRANITE)
                .stairs(Blocks.GRANITE_STAIRS)
                .wall(Blocks.GRANITE_WALL)
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
        ModBlockFamily POLISHED_RED_GRANITE = familyBuilder(Blocks.POLISHED_GRANITE)
                .fromManager(NCBlocks.POLISHED_RED_GRANITE)
                .stairs(Blocks.GRANITE_STAIRS)
                .wall(Blocks.GRANITE_WALL)
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
        ModBlockFamily LIMESTONE = familyBuilder(Blocks.STONE)
                .fromManager(NCBlocks.LIMESTONE)
                .button(Blocks.STONE_BUTTON)
                .pressurePlate(Blocks.STONE_PRESSURE_PLATE)
                .stairs(Blocks.STONE_STAIRS)
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
        ModBlockFamily COBBLED_LIMESTONE = familyBuilder(Blocks.COBBLESTONE)
                .fromManager(NCBlocks.COBBLED_LIMESTONE)
                .stairs(Blocks.COBBLESTONE_STAIRS)
                .wall(Blocks.COBBLESTONE_WALL)
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
                .fromManager(NCBlocks.MOSSY_COBBLED_LIMESTONE)
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
        ModBlockFamily LIMESTONE_BRICKS = familyBuilder(Blocks.STONE_BRICKS)
                .fromManager(NCBlocks.LIMESTONE_BRICK)
                .stairs(Blocks.STONE_BRICK_STAIRS)
                .wall(Blocks.STONE_BRICK_WALL)
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
        ModBlockFamily RED_SANDSTONE = familyBuilder(Blocks.RED_SANDSTONE)
                .fromManager(NCBlocks.RED_SANDSTONE)
                .stairs(Blocks.RED_SANDSTONE_STAIRS)
                .wall(Blocks.RED_SANDSTONE_WALL)
                .getFamily();
        ModBlockFamily SANDSTONE = familyBuilder(Blocks.SANDSTONE)
                .fromManager(NCBlocks.SANDSTONE)
                .stairs(Blocks.SANDSTONE_STAIRS)
                .wall(Blocks.SANDSTONE_WALL)
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
        ModBlockFamily CUT_RED_SANDSTONE = familyBuilder(Blocks.CUT_RED_SANDSTONE)
                .fromManager(NCBlocks.CUT_RED_SANDSTONE)
                .getFamily();
        ModBlockFamily CUT_SANDSTONE = familyBuilder(Blocks.CUT_SANDSTONE)
                .fromManager(NCBlocks.CUT_SANDSTONE)
                .getFamily();

        /* Smooth Sandstone */
        ModBlockFamily SMOOTH_BROWN_SANDSTONE = familyBuilder(NCBlocks.SMOOTH_BROWN_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_BROWN_SANDSTONE)
                .getFamily();
        ModBlockFamily SMOOTH_ORANGE_SANDSTONE = familyBuilder(NCBlocks.SMOOTH_ORANGE_SANDSTONE.baseBlock())
                .fromManager(NCBlocks.SMOOTH_ORANGE_SANDSTONE)
                .getFamily();
        ModBlockFamily SMOOTH_RED_SANDSTONE = familyBuilder(Blocks.SMOOTH_RED_SANDSTONE)
                .fromManager(NCBlocks.SMOOTH_RED_SANDSTONE)
                .stairs(Blocks.SMOOTH_RED_SANDSTONE_STAIRS)
                .getFamily();
        ModBlockFamily SMOOTH_SANDSTONE = familyBuilder(Blocks.SMOOTH_SANDSTONE)
                .fromManager(NCBlocks.SMOOTH_SANDSTONE)
                .stairs(Blocks.SMOOTH_SANDSTONE_STAIRS)
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
}