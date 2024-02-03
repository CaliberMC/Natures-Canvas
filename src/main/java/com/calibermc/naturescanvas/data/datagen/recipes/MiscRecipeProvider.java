package com.calibermc.naturescanvas.data.datagen.recipes;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.caliber.crafting.ModRecipeBuilder;
import com.calibermc.naturescanvas.crafting.NCRecipeBuilder;
import com.calibermc.naturescanvas.item.NCItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        bronzeRecipes(pFinishedRecipeConsumer);
        craftingTableRecipes(pFinishedRecipeConsumer);
        plasterRecipes(pFinishedRecipeConsumer);
        planksRecipes(pFinishedRecipeConsumer);
        boardsRecipes(pFinishedRecipeConsumer);
        thatchRecipes(pFinishedRecipeConsumer);
    }

    private void craftingTableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Crafting Tables */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, NCBlocks.KILN.get(), 1).define('I', Items.IRON_INGOT).define('X', Blocks.BLAST_FURNACE).define('#', Blocks.SMOOTH_STONE).pattern("III").pattern("IXI").pattern("###").unlockedBy("has_blast_furnace",
                inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.BLAST_FURNACE).build())).save(pFinishedRecipeConsumer, "kiln_from_shaped_iron_ingots_blast_furnace_smooth_stone_variant");
    }

    private void bronzeRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, NCBlocks.BRONZE_BLOCK.get(), 1).define('C', Items.COPPER_INGOT).define('T', NCItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_block_from_shaped_ingots");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NCItems.BRONZE_INGOT.get(), 9).define('C', Items.COPPER_INGOT).define('T', NCItems.TIN_INGOT.get()).pattern("CTC").pattern("CTC").pattern("CTC").unlockedBy("has_copper_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_shaped_copper_ingots_tin_ingots");
        NCRecipeBuilder.alloying(Ingredient.of(Items.COPPER_INGOT), Ingredient.of(NCItems.TIN_INGOT.get()), NCItems.BRONZE_INGOT.get(), 0.35F, 200).unlockedBy("has_tin_ingot",
                inventoryTrigger(ItemPredicate.Builder.item().of(NCItems.TIN_INGOT.get()).build())).save(pFinishedRecipeConsumer, "bronze_ingot_from_alloying_ingots");
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

    }


    private void boardsRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

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
