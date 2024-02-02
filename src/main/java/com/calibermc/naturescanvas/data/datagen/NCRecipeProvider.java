package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.item.NCItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class NCRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public NCRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        tinRecipes(pFinishedRecipeConsumer);
        silverRecipes(pFinishedRecipeConsumer);
        graniteRecipes(pFinishedRecipeConsumer);
        limestoneRecipes(pFinishedRecipeConsumer);
        sandstoneRecipes(pFinishedRecipeConsumer);
    }

    private void tinRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, NCBlocks.TIN_BLOCK.get(), 1).define('T', NCItems.TIN_INGOT.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "tin_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 9).requires(NCBlocks.TIN_ORE.get()).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_tin_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1).define('T', NCItems.TIN_NUGGET.get()).pattern("TTT").pattern("TTT").pattern("TTT").unlockedBy("has_tin_nugget",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_NUGGET.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.TIN_ORE.get()), RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_tin_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_smelting_deeplate_tin_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCItems.RAW_TIN.get()), RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1.0F, 200).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_smelting_raw_tin");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NCBlocks.TIN_ORE.get()), RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_tin_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NCBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_ingot_from_blasting_deeplate_tin_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NCItems.RAW_TIN.get()), RecipeCategory.MISC, NCItems.TIN_INGOT.get(), 1.0F, 100).unlockedBy("has_tin_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TIN_ORE.get()).build())).save(pFinishedRecipeConsumer, "tin_nugget_from_blasting_raw_tin");
    }

    private void silverRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, NCBlocks.SILVER_BLOCK.get(), 1).define('S', NCItems.SILVER_INGOT.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_block_from_shaped_ingots");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 9).requires(NCBlocks.SILVER_BLOCK.get()).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_silver_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1).define('S', NCItems.SILVER_NUGGET.get()).pattern("SSS").pattern("SSS").pattern("SSS").unlockedBy("has_silver_nugget",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_shaped_nuggets");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.SILVER_ORE.get()), RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_smelting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCItems.RAW_SILVER.get()), RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1.0F, 200).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_smelting_raw_silver");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NCBlocks.SILVER_ORE.get()), RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NCBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_ingot_from_blasting_deeplate_silver_ore");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NCItems.RAW_SILVER.get()), RecipeCategory.MISC, NCItems.SILVER_INGOT.get(), 1.0F, 100).unlockedBy("has_silver_ore",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SILVER_ORE.get()).build())).save(pFinishedRecipeConsumer, "silver_nugget_from_blasting_raw_silver");
    }

    private void graniteRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Polished Granite from Granite Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.POLISHED_BLACK_GRANITE.baseBlock(), 4).define('#', NCBlocks.BLACK_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_black_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BLACK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_black_granite_from_black_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.POLISHED_BROWN_GRANITE.baseBlock(), 4).define('#', NCBlocks.BROWN_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_brown_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_brown_granite_from_brown_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.POLISHED_GRAY_GRANITE.baseBlock(), 4).define('#', NCBlocks.GRAY_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_gray_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.GRAY_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_gray_granite_from_gray_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.POLISHED_PINK_GRANITE.baseBlock(), 4).define('#', NCBlocks.PINK_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_pink_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.PINK_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_pink_granite_from_pink_granite_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.POLISHED_WHITE_GRANITE.baseBlock(), 4).define('#', NCBlocks.WHITE_GRANITE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_white_granite",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.WHITE_GRANITE.baseBlock()).build())).save(pFinishedRecipeConsumer, "polished_white_granite_from_white_granite_shaped");
        
    }

    private void limestoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Limestone from Cobblestone Smelting */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.COBBLED_DARK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.DARK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.COBBLED_DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_from_cobbled_dark_limestone_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.LIGHT_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.COBBLED_LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_from_cobbled_light_limestone_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.COBBLED_PINK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.PINK_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.COBBLED_PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_from_cobbled_pink_limestone_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.COBBLED_TAN_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.TAN_LIMESTONE.baseBlock(), 0.1F, 200).unlockedBy("has_cobbled_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.COBBLED_TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_from_cobbled_tan_limestone_smelting");

        /* Limestone Bricks from Limestone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.DARK_LIMESTONE_BRICK.baseBlock(), 4).define('#', NCBlocks.DARK_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_limestone_bricks_from_dark_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.LIGHT_LIMESTONE_BRICK.baseBlock(), 4).define('#', NCBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "light_limestone_bricks_from_light_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.PINK_LIMESTONE_BRICK.baseBlock(), 4).define('#', NCBlocks.PINK_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "pink_limestone_bricks_from_pink_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.TAN_LIMESTONE_BRICK.baseBlock(), 4).define('#', NCBlocks.TAN_LIMESTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "tan_limestone_bricks_from_tan_limestone_shaped");

        /* Chiseled Limestone Bricks from Limestone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock(), 1).define('#', NCBlocks.DARK_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_from_dark_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 1).define('#', NCBlocks.LIGHT_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_from_light_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock(), 1).define('#', NCBlocks.PINK_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_from_pink_limestone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock(), 1).define('#', NCBlocks.TAN_LIMESTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_from_tan_limestone_shaped");

        /* Chiseled Limestone Bricks from Limestone Stonecutting */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(NCBlocks.DARK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CHISELED_DARK_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_dark_limestone_bricks_from_dark_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(NCBlocks.LIGHT_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CHISELED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.LIGHT_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_light_limestone_bricks_from_light_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(NCBlocks.PINK_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CHISELED_PINK_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.PINK_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_pink_limestone_bricks_from_pink_limestone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(NCBlocks.TAN_LIMESTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CHISELED_TAN_LIMESTONE_BRICKS.baseBlock(), 1).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TAN_LIMESTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_tan_limestone_bricks_from_tan_limestone_stonecutting");

        /* Cracked Limestone Bricks from Limestone Smelting */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.DARK_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CRACKED_DARK_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_dark_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_dark_limestone_bricks_from_dark_limestone_bricks_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.LIGHT_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CRACKED_LIGHT_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_light_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_light_limestone_bricks_from_light_limestone_bricks_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.PINK_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CRACKED_PINK_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_pink_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_pink_limestone_bricks_from_pink_limestone_bricks_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.TAN_LIMESTONE_BRICK.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CRACKED_TAN_LIMESTONE_BRICKS.baseBlock(), 0.1F, 200).unlockedBy("has_tan_limestone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_LIMESTONE_BRICK.baseBlock()).build())).save(pFinishedRecipeConsumer, "cracked_tan_limestone_bricks_from_tan_limestone_bricks_smelting");
    }

    private void sandstoneRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Sandstone from Sand Smelting */
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.BROWN_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.BROWN_SANDSTONE.baseBlock(), 0.1F, 200).unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_brown_sand_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NCBlocks.ORANGE_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.ORANGE_SANDSTONE.baseBlock(), 0.1F, 200).unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_orange_sand_smelting");

        /* Sandstone from Sand Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.BROWN_SANDSTONE.baseBlock(), 4).define('#', Blocks.SAND).pattern("##").pattern("##").unlockedBy("has_brown_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_SAND.get()).build())).save(pFinishedRecipeConsumer, "brown_sandstone_from_brown_sand_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.ORANGE_SANDSTONE.baseBlock(), 4).define('#', Blocks.SAND).pattern("##").pattern("##").unlockedBy("has_orange_sand",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.ORANGE_SAND.get()).build())).save(pFinishedRecipeConsumer, "orange_sandstone_from_orange_sand_shaped");

        /* Chiseled Sandstone from Sandstone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CHISELED_BROWN_SANDSTONE.baseBlock(), 1).define('#', NCBlocks.BROWN_SANDSTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_brown_sandstone_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock(), 1).define('#', NCBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("#").pattern("#").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_orange_sandstone_from_orange_sandstone_shaped");

        /* Cut Sandstone from Sandstone Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CUT_BROWN_SANDSTONE.baseBlock(), 4).define('#', NCBlocks.BROWN_SANDSTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_brown_sandstone_from_brown_sandstone_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.CUT_ORANGE_SANDSTONE.baseBlock(), 4).define('#', NCBlocks.ORANGE_SANDSTONE.baseBlock()).pattern("##").pattern("##").unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "cut_orange_sandstone_from_orange_sandstone_shaped");

        /* Cut Sandstone from Sandstone Stonecutting */
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(NCBlocks.BROWN_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CHISELED_BROWN_SANDSTONE.baseBlock(), 1).unlockedBy("has_brown_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_brown_sandstone_from_brown_sandstone_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(NCBlocks.ORANGE_SANDSTONE.baseBlock()), RecipeCategory.BUILDING_BLOCKS, NCBlocks.CHISELED_ORANGE_SANDSTONE.baseBlock(), 1).unlockedBy("has_orange_sandstone",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.ORANGE_SANDSTONE.baseBlock()).build())).save(pFinishedRecipeConsumer, "chiseled_orange_sandstone_from_orange_sandstone_stonecutting");
    }
}
