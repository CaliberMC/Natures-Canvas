package com.calibermc.naturescanvas.data.worldgen.features;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.world.feature.tree.FirTreeFeature;
import com.calibermc.naturescanvas.world.feature.tree.PineTreeFeature;
import com.calibermc.naturescanvas.world.feature.tree.NCTreeFeature;
import com.calibermc.naturescanvas.world.feature.tree.CedarTreeFeature;
import com.calibermc.naturescanvas.world.feature.configs.EvergreenTreeConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class NCFeatures {
    public static final DeferredRegister<Feature<?>> FEATURE_REGISTER = DeferredRegister.create(Registries.FEATURE, NaturesCanvas.MOD_ID);

    public static final NCTreeFeature<EvergreenTreeConfiguration> CEDAR_TREE = registerFeature("cedar_tree", new CedarTreeFeature(EvergreenTreeConfiguration.CODEC));
    public static final NCTreeFeature<EvergreenTreeConfiguration> FIR_TREE = registerFeature("fir_tree", new FirTreeFeature(EvergreenTreeConfiguration.CODEC));
    public static final NCTreeFeature<EvergreenTreeConfiguration> PINE_TREE = registerFeature("pine_tree", new PineTreeFeature(EvergreenTreeConfiguration.CODEC));
    private static <C extends FeatureConfiguration, F extends Feature<C>> F registerFeature(String key, F value) {
        FEATURE_REGISTER.register(key, () -> value);
        return value;
    }

    public static void register(IEventBus eventBus) {
        FEATURE_REGISTER.register(eventBus);
    }
}

