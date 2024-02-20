package com.calibermc.naturescanvas.data.datagen.recipes;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.crafting.CaliberRecipeBuilder;
import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.crafting.NCRecipeBuilder;
import com.calibermc.naturescanvas.item.NCItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        tinRecipes(pFinishedRecipeConsumer);
        silverRecipes(pFinishedRecipeConsumer);
        bronzeRecipes(pFinishedRecipeConsumer);
        craftingTableRecipes(pFinishedRecipeConsumer);
        graniteRecipes(pFinishedRecipeConsumer);
        limestoneRecipes(pFinishedRecipeConsumer);
        sandstoneRecipes(pFinishedRecipeConsumer);
        plasterRecipes(pFinishedRecipeConsumer);
        planksRecipes(pFinishedRecipeConsumer);
        boardsRecipes(pFinishedRecipeConsumer);
        stainedStrippedWoodRecipes(pFinishedRecipeConsumer);
        thatchRecipes(pFinishedRecipeConsumer);
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

    private void bronzeRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, NCBlocks.BRONZE_BLOCK.get(), 1).define('C', Items.COPPER_INGOT).define('T', NCItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_block_from_shaped_ingots");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NCItems.BRONZE_INGOT.get(), 9).define('C', Items.COPPER_INGOT).define('T', NCItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_shaped_copper_ingots_tin_ingots");
        NCRecipeBuilder.alloying(Ingredient.of(Items.COPPER_INGOT), Ingredient.of(NCItems.TIN_INGOT.get()), NCItems.BRONZE_INGOT.get(), 0.35F, 200).unlockedBy("has_tin_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_alloying_ingots");
    }

    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.KILN.get(), 1).define('I', Items.IRON_INGOT).define('X', Blocks.BLAST_FURNACE).define('#', Blocks.SMOOTH_STONE).pattern("III").pattern("IXI").pattern("###").unlockedBy("has_blast_furnace",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLAST_FURNACE).build())).save(pFinishedRecipeConsumer, "kiln_from_shaped_iron_ingots_blast_furnace_smooth_stone_variant");
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

    private void plasterRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Plaster Powder from Clay and Dye*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, NCBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.WHITE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_brown_dye_white_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.BROWN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "brown_plaster_powder_from_clay_sand_brown_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.OCHRE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.ORANGE_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "ochre_plaster_powder_from_clay_sand_brown_dye_orange_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.TAN_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.BROWN_DYE).requires(Items.YELLOW_DYE).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "tan_plaster_powder_from_clay_sand_brown_dye_yellow_dye");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.BEIGE_PLASTER_POWDER.get(), 9).requires(Items.SAND, 3).requires(Items.CLAY_BALL, 4).requires(Items.WHITE_DYE, 2).unlockedBy("has_clay",
                inventoryTrigger(ItemPredicate.Builder.item().of(Items.CLAY_BALL).build())).save(pFinishedRecipeConsumer, "beige_plaster_powder_from_clay_sand_white_dye");

        /* Plaster from Plaster Powder and Water Bucket Shapeless*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.BEIGE_PLASTER.baseBlock(), 1).requires(NCBlocks.BEIGE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_begie_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BEIGE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "beige_plaster_from_beige_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.BROWN_PLASTER.baseBlock(), 1).requires(NCBlocks.BROWN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_brown_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BROWN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "brown_plaster_from_brown_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.OCHRE_PLASTER.baseBlock(), 1).requires(NCBlocks.OCHRE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_ochre_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.OCHRE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "ochre_plaster_from_ochre_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.TAN_PLASTER.baseBlock(), 1).requires(NCBlocks.TAN_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_tan_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.TAN_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "tan_plaster_from_tan_plaster_powder_water_bucket");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.WHITE_PLASTER.baseBlock(), 1).requires(NCBlocks.WHITE_PLASTER_POWDER.get(), 1).requires(Items.WATER_BUCKET).unlockedBy("has_white_plaster_powder",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.WHITE_PLASTER_POWDER.get()).build())).save(pFinishedRecipeConsumer, "white_plaster_from_white_plaster_powder_water_bucket");

    }

    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Planks from Boards Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.ACACIA_BOARDS.baseBlock()), Blocks.ACACIA_PLANKS).unlockedBy("has_acacia_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_planks_from_acacia_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.BIRCH_BOARDS.baseBlock()), Blocks.BIRCH_PLANKS).unlockedBy("has_birch_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_planks_from_birch_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.DARK_OAK_BOARDS.baseBlock()), Blocks.DARK_OAK_PLANKS).unlockedBy("has_dark_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_planks_from_dark_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.JUNGLE_BOARDS.baseBlock()), Blocks.JUNGLE_PLANKS).unlockedBy("has_jungle_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_planks_from_jungle_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.OAK_BOARDS.baseBlock()), Blocks.OAK_PLANKS).unlockedBy("has_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_planks_from_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.SPRUCE_BOARDS.baseBlock()), Blocks.SPRUCE_PLANKS).unlockedBy("has_spruce_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_planks_from_spruce_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.CRIMSON_BOARDS.baseBlock()), Blocks.CRIMSON_PLANKS).unlockedBy("has_crimson_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.CRIMSON_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_planks_from_crimson_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.WARPED_BOARDS.baseBlock()), Blocks.WARPED_PLANKS).unlockedBy("has_warped_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.WARPED_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_planks_from_warped_boards_woodcutting");

        /* Stained Planks from Stained Boards Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_ACACIA_BOARDS.baseBlock()), NCBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_ACACIA_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_planks_from_stained_acacia_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_BIRCH_BOARDS.baseBlock()), NCBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_BIRCH_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_planks_from_stained_birch_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()), NCBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_planks_from_stained_dark_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_JUNGLE_BOARDS.baseBlock()), NCBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_planks_from_stained_jungle_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_OAK_BOARDS.baseBlock()), NCBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_OAK_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_planks_from_stained_oak_boards_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_SPRUCE_BOARDS.baseBlock()), NCBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce_boards",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_planks_from_stained_spruce_boards_woodcutting");

        /* Stained Planks Buttons */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_ACACIA_BUTTON.get()).requires(NCBlocks.STAINED_ACACIA.baseBlock()).unlockedBy("has_stained_acacia", inventoryTrigger(ItemPredicate.Builder.item()
                .of(NCBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_BIRCH_BUTTON.get()).requires(NCBlocks.STAINED_BIRCH.baseBlock()).unlockedBy("has_stained_birch", inventoryTrigger(ItemPredicate.Builder.item()
                .of(NCBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_DARK_OAK_BUTTON.get()).requires(NCBlocks.STAINED_DARK_OAK.baseBlock()).unlockedBy("has_stained_dark_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(NCBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_JUNGLE_BUTTON.get()).requires(NCBlocks.STAINED_JUNGLE.baseBlock()).unlockedBy("has_stained_jungle", inventoryTrigger(ItemPredicate.Builder.item()
                .of(NCBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_OAK_BUTTON.get()).requires(NCBlocks.STAINED_OAK.baseBlock()).unlockedBy("has_stained_oak", inventoryTrigger(ItemPredicate.Builder.item()
                .of(NCBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_shapeless");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_SPRUCE_BUTTON.get()).requires(NCBlocks.STAINED_SPRUCE.baseBlock()).unlockedBy("has_stained_spruce", inventoryTrigger(ItemPredicate.Builder.item()
                .of(NCBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_ACACIA_BUTTON.get(), 1).requires(Blocks.ACACIA_BUTTON).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_button_from_acacia_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_BIRCH_BUTTON.get(), 1).requires(Blocks.BIRCH_BUTTON).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_button_from_birch_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_DARK_OAK_BUTTON.get(), 1).requires(Blocks.DARK_OAK_BUTTON).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_button_from_dark_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_JUNGLE_BUTTON.get(), 1).requires(Blocks.JUNGLE_BUTTON).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_button_from_jungle_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_OAK_BUTTON.get(), 1).requires(Blocks.OAK_BUTTON).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_button_from_oak_button_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_SPRUCE_BUTTON.get(), 1).requires(Blocks.SPRUCE_BUTTON).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_button_from_spruce_button_and_resin");

        /* Stained Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_ACACIA_DOOR.get(), 3).define('#', NCBlocks.STAINED_ACACIA.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_BIRCH_DOOR.get(), 3).define('#', NCBlocks.STAINED_BIRCH.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_DARK_OAK_DOOR.get(), 3).define('#', NCBlocks.STAINED_DARK_OAK.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_JUNGLE_DOOR.get(), 3).define('#', NCBlocks.STAINED_JUNGLE.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_OAK_DOOR.get(), 3).define('#', NCBlocks.STAINED_OAK.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_SPRUCE_DOOR.get(), 3).define('#', NCBlocks.STAINED_SPRUCE.baseBlock()).pattern("##").pattern("##").pattern("##").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_shaped_stained_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_ACACIA_DOOR.get(), 1).requires(Blocks.ACACIA_DOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_door_from_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_BIRCH_DOOR.get(), 1).requires(Blocks.BIRCH_DOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_door_from_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_DARK_OAK_DOOR.get(), 1).requires(Blocks.DARK_OAK_DOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_door_from_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_JUNGLE_DOOR.get(), 1).requires(Blocks.JUNGLE_DOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_door_from_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_OAK_DOOR.get(), 1).requires(Blocks.OAK_DOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_door_from_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_SPRUCE_DOOR.get(), 1).requires(Blocks.SPRUCE_DOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_door_from_spruce_door_and_resin");

        /* Stained Planks Signs */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.STAINED_ACACIA_SIGN.get(), 3).define('#', NCBlocks.STAINED_ACACIA.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_shaped_stained_acacia_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.STAINED_BIRCH_SIGN.get(), 3).define('#', NCBlocks.STAINED_BIRCH.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_shaped_stained_birch_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.STAINED_DARK_OAK_SIGN.get(), 3).define('#', NCBlocks.STAINED_DARK_OAK.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_shaped_stained_dark_oak_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.STAINED_JUNGLE_SIGN.get(), 3).define('#', NCBlocks.STAINED_JUNGLE.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_shaped_stained_jungle_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.STAINED_OAK_SIGN.get(), 3).define('#', NCBlocks.STAINED_OAK.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_shaped_stained_oak_and_sticks");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.STAINED_SPRUCE_SIGN.get(), 3).define('#', NCBlocks.STAINED_SPRUCE.baseBlock()).define('X', Items.STICK).pattern("###").pattern("###").pattern(" X ").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_shaped_stained_spruce_and_sticks");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, NCBlocks.STAINED_ACACIA_SIGN.get(), 1).requires(Blocks.ACACIA_SIGN).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_sign_from_acacia_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, NCBlocks.STAINED_BIRCH_SIGN.get(), 1).requires(Blocks.BIRCH_SIGN).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_sign_from_birch_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, NCBlocks.STAINED_DARK_OAK_SIGN.get(), 1).requires(Blocks.DARK_OAK_SIGN).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_sign_from_dark_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, NCBlocks.STAINED_JUNGLE_SIGN.get(), 1).requires(Blocks.JUNGLE_SIGN).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_sign_from_jungle_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, NCBlocks.STAINED_OAK_SIGN.get(), 1).requires(Blocks.OAK_SIGN).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_sign_from_oak_sign_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, NCBlocks.STAINED_SPRUCE_SIGN.get(), 1).requires(Blocks.SPRUCE_SIGN).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_sign_from_spruce_sign_and_resin");

        /* Tall Stained Planks Doors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_ACACIA_TALL_DOOR.get(), 1).define('X', NCBlocks.STAINED_ACACIA_DOOR.get()).define('#', NCBlocks.STAINED_ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_tall_door_from_stained_acacia_door_and_stained_acacia_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_BIRCH_TALL_DOOR.get(), 1).define('X', NCBlocks.STAINED_BIRCH_DOOR.get()).define('#', NCBlocks.STAINED_BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_tall_door_from_stained_birch_door_and_stained_birch_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_DARK_OAK_TALL_DOOR.get(), 1).define('X', NCBlocks.STAINED_DARK_OAK_DOOR.get()).define('#', NCBlocks.STAINED_DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_tall_door_from_stained_dark_oak_door_and_stained_dark_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_JUNGLE_TALL_DOOR.get(), 1).define('X', NCBlocks.STAINED_JUNGLE_DOOR.get()).define('#', NCBlocks.STAINED_JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_tall_door_from_stained_jungle_door_and_stained_jungle_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_OAK_TALL_DOOR.get(), 1).define('X', NCBlocks.STAINED_OAK_DOOR.get()).define('#', NCBlocks.STAINED_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_tall_door_from_stained_oak_door_and_stained_oak_shaped");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, NCBlocks.STAINED_SPRUCE_TALL_DOOR.get(), 1).define('X', NCBlocks.STAINED_SPRUCE_DOOR.get()).define('#', NCBlocks.STAINED_SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_tall_door_from_stained_spruce_door_and_stained_spruce_shaped");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_ACACIA_TALL_DOOR.get(), 1).requires(CaliberBlocks.ACACIA_TALL_DOOR.get()).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_tall_door_from_tall_acacia_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_BIRCH_TALL_DOOR.get(), 1).requires(CaliberBlocks.BIRCH_TALL_DOOR.get()).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_tall_door_from_tall_birch_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_DARK_OAK_TALL_DOOR.get(), 1).requires(CaliberBlocks.DARK_OAK_TALL_DOOR.get()).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_tall_door_from_tall_dark_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_JUNGLE_TALL_DOOR.get(), 1).requires(CaliberBlocks.JUNGLE_TALL_DOOR.get()).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_tall_door_from_tall_jungle_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_OAK_TALL_DOOR.get(), 1).requires(CaliberBlocks.OAK_TALL_DOOR.get()).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_tall_door_from_tall_oak_door_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, NCBlocks.STAINED_SPRUCE_TALL_DOOR.get(), 1).requires(CaliberBlocks.SPRUCE_TALL_DOOR.get()).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_tall_door_from_tall_spruce_door_and_resin");

        /* Stained Planks Trapdoors */
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  NCBlocks.STAINED_ACACIA_TRAPDOOR.get(), 2).define('#', NCBlocks.STAINED_ACACIA.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_acacia",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_shaped_stained_acacia");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  NCBlocks.STAINED_BIRCH_TRAPDOOR.get(), 2).define('#', NCBlocks.STAINED_BIRCH.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_birch",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_shaped_stained_birch");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  NCBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 2).define('#', NCBlocks.STAINED_DARK_OAK.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_dark_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_shaped_stained_dark_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  NCBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 2).define('#', NCBlocks.STAINED_JUNGLE.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_jungle",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_shaped_stained_jungle");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  NCBlocks.STAINED_OAK_TRAPDOOR.get(), 2).define('#', NCBlocks.STAINED_OAK.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_oak",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_shaped_stained_oak");
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  NCBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 2).define('#', NCBlocks.STAINED_SPRUCE.baseBlock()).pattern("###").pattern("###").unlockedBy("has_stained_spruce",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_shaped_stained_spruce");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  NCBlocks.STAINED_ACACIA_TRAPDOOR.get(), 1).requires(Blocks.ACACIA_TRAPDOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_acacia_trapdoor_from_acacia_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  NCBlocks.STAINED_BIRCH_TRAPDOOR.get(), 1).requires(Blocks.BIRCH_TRAPDOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_birch_trapdoor_from_birch_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  NCBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), 1).requires(Blocks.DARK_OAK_TRAPDOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_trapdoor_from_dark_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  NCBlocks.STAINED_JUNGLE_TRAPDOOR.get(), 1).requires(Blocks.JUNGLE_TRAPDOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_jungle_trapdoor_from_jungle_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  NCBlocks.STAINED_OAK_TRAPDOOR.get(), 1).requires(Blocks.OAK_TRAPDOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_oak_trapdoor_from_oak_trapdoor_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE,  NCBlocks.STAINED_SPRUCE_TRAPDOOR.get(), 1).requires(Blocks.SPRUCE_TRAPDOOR).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_spruce_trapdoor_from_spruce_trapdoor_and_resin");
    }

    private void boardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Boards from Planks Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.ACACIA_PLANKS), NCBlocks.ACACIA_BOARDS.baseBlock()).unlockedBy("has_acacia_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.ACACIA_PLANKS).build())).save(pFinishedRecipeConsumer, "acacia_boards_from_acacia_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.BIRCH_PLANKS), NCBlocks.BIRCH_BOARDS.baseBlock()).unlockedBy("has_birch_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BIRCH_PLANKS).build())).save(pFinishedRecipeConsumer, "birch_boards_from_birch_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.DARK_OAK_PLANKS), NCBlocks.DARK_OAK_BOARDS.baseBlock()).unlockedBy("has_dark_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "dark_oak_boards_from_dark_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.JUNGLE_PLANKS), NCBlocks.JUNGLE_BOARDS.baseBlock()).unlockedBy("has_jungle_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.JUNGLE_PLANKS).build())).save(pFinishedRecipeConsumer, "jungle_boards_from_jungle_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.OAK_PLANKS), NCBlocks.OAK_BOARDS.baseBlock()).unlockedBy("has_oak_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.OAK_PLANKS).build())).save(pFinishedRecipeConsumer, "oak_boards_from_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.SPRUCE_PLANKS), NCBlocks.SPRUCE_BOARDS.baseBlock()).unlockedBy("has_spruce_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SPRUCE_PLANKS).build())).save(pFinishedRecipeConsumer, "spruce_boards_from_spruce_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.CRIMSON_PLANKS), NCBlocks.CRIMSON_BOARDS.baseBlock()).unlockedBy("has_crimson_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.CRIMSON_PLANKS).build())).save(pFinishedRecipeConsumer, "crimson_boards_from_crimson_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(Blocks.WARPED_PLANKS), NCBlocks.WARPED_BOARDS.baseBlock()).unlockedBy("has_warped_planks",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.WARPED_PLANKS).build())).save(pFinishedRecipeConsumer, "warped_boards_from_warped_planks_woodcutting");

        /* Stained Boards from Stained Planks Woodcutting*/
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_ACACIA.baseBlock()), NCBlocks.STAINED_ACACIA_BOARDS.baseBlock()).unlockedBy("has_stained_acacia_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_acacia_boards_from_stained_acacia_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_BIRCH.baseBlock()), NCBlocks.STAINED_BIRCH_BOARDS.baseBlock()).unlockedBy("has_stained_birch_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_birch_boards_from_stained_birch_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_DARK_OAK.baseBlock()), NCBlocks.STAINED_DARK_OAK_BOARDS.baseBlock()).unlockedBy("has_stained_dark_oak_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_dark_oak_boards_from_stained_dark_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_JUNGLE.baseBlock()), NCBlocks.STAINED_JUNGLE_BOARDS.baseBlock()).unlockedBy("has_stained_jungle_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_jungle_boards_from_stained_jungle_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_OAK.baseBlock()), NCBlocks.STAINED_OAK_BOARDS.baseBlock()).unlockedBy("has_stained_oak_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_oak_boards_from_stained_oak_planks_woodcutting");
        CaliberRecipeBuilder.woodcutting(Ingredient.of(NCBlocks.STAINED_SPRUCE.baseBlock()), NCBlocks.STAINED_SPRUCE_BOARDS.baseBlock()).unlockedBy("has_stained_spruce_planks_",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCBlocks.STAINED_SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "stained_spruce_boards_from_stained_spruce_planks_woodcutting");
    }

    private void stainedStrippedWoodRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Stained Stripped Wood Shapeless*/
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.STAINED_STRIPPED_ACACIA.baseBlock(), 1).requires(Blocks.STRIPPED_ACACIA_WOOD).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_acacia_wood_from_stripped_acacia_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.STAINED_STRIPPED_BIRCH.baseBlock(), 1).requires(Blocks.STRIPPED_BIRCH_WOOD).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_birch_wood_from_stripped_birch_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.STAINED_STRIPPED_DARK_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_DARK_OAK_WOOD).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_dark_oak_wood_from_stripped_dark_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.STAINED_STRIPPED_JUNGLE.baseBlock(), 1).requires(Blocks.STRIPPED_JUNGLE_WOOD).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_jungle_wood_from_stripped_jungle_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.STAINED_STRIPPED_OAK.baseBlock(), 1).requires(Blocks.STRIPPED_OAK_WOOD).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_oak_wood_from_stripped_oak_wood_and_resin");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.STAINED_STRIPPED_SPRUCE.baseBlock(), 1).requires(Blocks.STRIPPED_SPRUCE_WOOD).requires(NCItems.RESIN.get()).unlockedBy("has_resin",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.RESIN.get()).build())).save(pFinishedRecipeConsumer, "stained_stripped_spruce_wood_from_stripped_spruce_wood_and_resin");

    }

    private void thatchRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Thatch from Grass Stems and Sticks Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.THATCH.baseBlock(), 9).define('#', NCItems.GRASS_STEMS.get()).define('X', Items.STICK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_grass_stems",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.GRASS_STEMS.get()).build())).save(pFinishedRecipeConsumer, "thatch_from_grass_stems_and_sticks_shaped");

        /* Thatch from Wheat and Sticks Shaped */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,  NCBlocks.THATCH.baseBlock(), 9).define('#', Items.WHEAT).define('X', Items.STICK).pattern("###").pattern("XXX").pattern("###").unlockedBy("has_grass_stems",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.GRASS_STEMS.get()).build())).save(pFinishedRecipeConsumer, "thatch_from_wheat_and_sticks_shaped");
    }

}
