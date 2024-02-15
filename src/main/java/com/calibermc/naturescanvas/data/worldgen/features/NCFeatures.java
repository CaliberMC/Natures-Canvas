package com.calibermc.naturescanvas.data.worldgen.features;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.world.feature.NCTreeFeature;
import com.calibermc.naturescanvas.world.feature.tree.*;
import com.calibermc.naturescanvas.world.feature.configs.EvergreenTreeConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class NCFeatures {
    public static final DeferredRegister<Feature<?>> FEATURE_REGISTER = DeferredRegister.create(Registries.FEATURE, NaturesCanvas.MOD_ID);

    public static final NCTreeFeature<EvergreenTreeConfiguration> RED_CEDAR_TREE = registerFeature("red_cedar_tree", new RedCedarTreeFeature(EvergreenTreeConfiguration.CODEC));
    public static final NCTreeFeature<EvergreenTreeConfiguration> DOUGLAS_FIR_TREE = registerFeature("fir_tree", new DouglasFirTreeFeature(EvergreenTreeConfiguration.CODEC));
    public static final NCTreeFeature<EvergreenTreeConfiguration> LODGEPOLE_PINE_TREE = registerFeature("lodgepole_pine_tree", new LodgepolePineTreeFeature(EvergreenTreeConfiguration.CODEC));
    public static final NCTreeFeature<EvergreenTreeConfiguration> PONDEROSA_PINE_TREE = registerFeature("ponderosa_pine_tree", new PonderosaPineTreeFeature(EvergreenTreeConfiguration.CODEC));
    public static final NCTreeFeature<EvergreenTreeConfiguration> SUBALPINE_FIR_TREE = registerFeature("subalpine_fir_tree", new SubalpineFirTreeFeature(EvergreenTreeConfiguration.CODEC));
    private static <C extends FeatureConfiguration, F extends Feature<C>> F registerFeature(String key, F value) {
        FEATURE_REGISTER.register(key, () -> value);
        return value;
    }

    public static void register(IEventBus eventBus) {
        FEATURE_REGISTER.register(eventBus);
    }
}

