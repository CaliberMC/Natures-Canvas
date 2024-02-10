package com.calibermc.naturescanvas.event;

import com.calibermc.caliber.block.custom.entity.CaliberBlockEntities;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.block.entity.NCBlockEntities;
import com.calibermc.naturescanvas.block.properties.BlockRenderLayers;
import com.calibermc.naturescanvas.block.properties.NCWoodType;
import com.calibermc.naturescanvas.client.inventory.KilnScreen;
import com.calibermc.naturescanvas.crafting.NCMenuTypes;
import com.calibermc.naturescanvas.crafting.NCRecipeSerializers;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.calibermc.naturescanvas.NaturesCanvas.MOD_ID;


@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NCClientEventBus {

    public static RecipeBookCategories KILN_SEARCH_CATEGORY, KILN_MAIN_CATEGORY;

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

    @SubscribeEvent
    public static void registerRecipeBookCategories(final RegisterRecipeBookCategoriesEvent event) {
        KILN_SEARCH_CATEGORY = RecipeBookCategories.create("kiln_search", Items.COMPASS.getDefaultInstance());
        KILN_MAIN_CATEGORY = RecipeBookCategories.create("kiln_main", NCBlocks.KILN.get().asItem().getDefaultInstance());

        // finder of alloying type recipes for main category
        event.registerRecipeCategoryFinder(NCRecipeSerializers.ALLOYING_TYPE.get(), (r) -> KILN_MAIN_CATEGORY);

        // furnace categories *remove if no need
        ImmutableList<RecipeBookCategories> furnaceCategories = ImmutableList.of(RecipeBookCategories.FURNACE_FOOD, RecipeBookCategories.FURNACE_BLOCKS, RecipeBookCategories.FURNACE_MISC);
        ImmutableList.Builder<RecipeBookCategories> categories = ImmutableList.<RecipeBookCategories>builder().add(KILN_MAIN_CATEGORY).addAll(furnaceCategories);

        // finder all categories that works with kiln
        event.registerAggregateCategory(KILN_SEARCH_CATEGORY, categories.build());

        event.registerBookCategories(NaturesCanvas.KILN_BOOK_TYPE,
                ImmutableList.<RecipeBookCategories>builder().add(KILN_SEARCH_CATEGORY, KILN_MAIN_CATEGORY).addAll(furnaceCategories).build());

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(NCMenuTypes.KILN.get(), KilnScreen::new);

        BlockEntityRenderers.register(NCBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        BlockEntityRenderers.register(NCBlockEntities.HANGING_SIGN_BLOCK_ENTITIES.get(), HangingSignRenderer::new);

        // Set Block Render Types
        BlockRenderLayers.set();

        // Set Wood Types
        Sheets.addWoodType(NCWoodType.CEDAR);
        Sheets.addWoodType(NCWoodType.FIR);
        Sheets.addWoodType(NCWoodType.PINE);

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class Client {

    }
}