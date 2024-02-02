package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.util.worldgen.NCFeatureUtils;
import com.calibermc.naturescanvas.util.worldgen.NCPlacementUtils;
import com.calibermc.naturescanvas.worldgen.biome.NCBiomeModifiers;
import com.calibermc.naturescanvas.worldgen.biome.NCBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class NCWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
//            .add(Registries.DIMENSION_TYPE, NCDimensions::bootstrapType)
//            .add(Registries.CONFIGURED_CARVER, NCConfiguredCarvers::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, NCFeatureUtils::bootstrap)
            .add(Registries.PLACED_FEATURE, NCPlacementUtils::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, NCBiomeModifiers::bootstrap)
            .add(Registries.BIOME, NCBiomes::bootstrap);
//            .add(Registries.LEVEL_STEM, NCDimensions::bootstrapStem);
//            .add(Registries.DAMAGE_TYPE, NCDamageTypes::bootstrap);

    public NCWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(NaturesCanvas.MOD_ID));
    }

}

