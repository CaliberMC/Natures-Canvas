package com.calibermc.naturescanvas.world.region;

import com.calibermc.naturescanvas.data.worldgen.NCBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class NCOverworldRegionCommon extends Region {
    public NCOverworldRegionCommon(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.OLD_GROWTH_CONIFEROUS_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.OLD_GROWTH_RED_CEDAR_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.RED_CEDAR_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.DOUGLAS_FIR_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.SUBALPINE_FIR_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.PONDEROSA_PINE_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.LODGEPOLE_PINE_FOREST);
//            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, NCBiomes.CONIFEROUS_FOREST); //NOT WORKING
        });
    }
}
