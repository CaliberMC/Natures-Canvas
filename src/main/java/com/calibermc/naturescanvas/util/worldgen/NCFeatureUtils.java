package com.calibermc.naturescanvas.util.worldgen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.worldgen.feature.NCOreFeatures;
import com.calibermc.naturescanvas.worldgen.feature.NCTreeFeatures;
import com.calibermc.naturescanvas.worldgen.feature.NCVegetationFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class NCFeatureUtils {
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        NCOreFeatures.bootstrap(context);
        NCTreeFeatures.bootstrap(context);
        NCVegetationFeatures.bootstrap(context);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NaturesCanvas.MOD_ID, name));
    }
}

