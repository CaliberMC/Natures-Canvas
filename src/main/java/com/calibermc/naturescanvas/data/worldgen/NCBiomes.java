package com.calibermc.naturescanvas.data.worldgen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.data.worldgen.biome.NCOverworldBiomes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;


public class NCBiomes {

    private static List<ResourceKey<Biome>> allBiomes = Lists.newArrayList();
    private static List<ResourceKey<Biome>> overworldBiomes = Lists.newArrayList();

    public static final ResourceKey<Biome> CEDAR_FOREST = registerOverworld("cedar_forest");
    public static final ResourceKey<Biome> FIR_FOREST = registerOverworld("fir_forest");
    public static final ResourceKey<Biome> PINE_FOREST = registerOverworld("pine_forest");

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);

        registerBiome(context, CEDAR_FOREST, NCOverworldBiomes.cedarForest(placedFeatureGetter, carverGetter));
        registerBiome(context, FIR_FOREST, NCOverworldBiomes.firForest(placedFeatureGetter, carverGetter));
        registerBiome(context, PINE_FOREST, NCOverworldBiomes.pineForest(placedFeatureGetter, carverGetter));
    }

    private static void registerVillagerTypes() {
    }

    public static List<ResourceKey<Biome>> getAllBiomes() {
        return ImmutableList.copyOf(allBiomes);
    }

    public static List<ResourceKey<Biome>> getOverworldBiomes() {
        return ImmutableList.copyOf(overworldBiomes);
    }


    private static ResourceKey<Biome> registerOverworld(String name) {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, new ResourceLocation(NaturesCanvas.MOD_ID, name));
        overworldBiomes.add(key);
        allBiomes.add(key);
        return key;
    }

    private static ResourceKey<Biome> register(String name) {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, new ResourceLocation(NaturesCanvas.MOD_ID, name));
        allBiomes.add(key);
        return key;
    }

    private static void registerBiome(BootstapContext<Biome> context, ResourceKey<Biome> key, Biome biome) {
        context.register(key, biome);
    }

    private static void registerVillagers(ResourceKey<Biome> key, VillagerType type) {
        VillagerType.BY_BIOME.put(key, type);
    }

}

