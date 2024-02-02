package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.caliberlib.data.datagen.ModLootTableProvider;
import com.calibermc.naturescanvas.NaturesCanvas;
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
        generator.addProvider(event.includeServer(), new NCBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, NCBlockLootTables::new));
        generator.addProvider(event.includeServer(), new NCItemModelProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new NCRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new NCWorldGenProvider(packOutput, lookupProvider));
    }
}
