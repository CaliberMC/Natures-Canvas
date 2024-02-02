package com.calibermc.naturescanvas.worldgen.biome.regions;

import net.minecraft.resources.ResourceLocation;
import terrablender.api.Region;
import terrablender.api.RegionType;

public class NCOverworldRegionRare extends Region {
    public NCOverworldRegionRare(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

//    @Override
//    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
//        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.CEDAR_FOREST_BIOME);
//        });
//    }
}
