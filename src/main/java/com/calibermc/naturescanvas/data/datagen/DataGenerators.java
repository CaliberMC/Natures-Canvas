package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.caliberlib.data.datagen.ModLootTableProvider;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.data.datagen.loot.NCBlockLootTables;
import com.calibermc.naturescanvas.data.datagen.recipes.ItemRecipeProvider;
import com.calibermc.naturescanvas.data.datagen.recipes.MiscRecipeProvider;
import com.calibermc.naturescanvas.data.datagen.recipes.NCRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = NaturesCanvas.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // BlockStates, Loot and Models
        generator.addProvider(event.includeClient(), new NCBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, NCBlockLootTables::new));
        generator.addProvider(event.includeClient(), new NCItemModelProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new NCRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new MiscRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ItemRecipeProvider(generator));
//        generator.addProvider(event.includeServer(), new NCItemTagProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new NCWorldGenProvider(packOutput, lookupProvider));
    }
}
