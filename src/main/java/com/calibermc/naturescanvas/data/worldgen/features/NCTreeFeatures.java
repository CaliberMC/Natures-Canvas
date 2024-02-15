package com.calibermc.naturescanvas.data.worldgen.features;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.world.feature.configs.EvergreenTreeConfiguration;
import com.calibermc.naturescanvas.util.worldgen.NCFeatureUtils;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class NCTreeFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUGLAS_FIR_TREE = NCFeatureUtils.registerKey("douglas_fir_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUGLAS_FIR_TREE_MEDIUM = NCFeatureUtils.registerKey("douglas_fir_tree_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUGLAS_FIR_TREE_LARGE = NCFeatureUtils.registerKey("douglas_fir_tree_large");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LODGEPOLE_PINE_TREE = NCFeatureUtils.registerKey("lodgepole_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LODGEPOLE_PINE_TREE_MEDIUM = NCFeatureUtils.registerKey("lodgepole_pine_tree_medium");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PONDEROSA_PINE_TREE = NCFeatureUtils.registerKey("ponderosa_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PONDEROSA_PINE_TREE_MEDIUM = NCFeatureUtils.registerKey("ponderosa_pine_tree_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PONDEROSA_PINE_TREE_LARGE = NCFeatureUtils.registerKey("ponderosa_pine_tree_large");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CEDAR_TREE = NCFeatureUtils.registerKey("red_cedar_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CEDAR_TREE_MEDIUM = NCFeatureUtils.registerKey("red_cedar_tree_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CEDAR_TREE_LARGE = NCFeatureUtils.registerKey("red_cedar_tree_large");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SUBALPINE_FIR_TREE = NCFeatureUtils.registerKey("subalpine_fir_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUBALPINE_FIR_TREE_MEDIUM = NCFeatureUtils.registerKey("subalpine_fir_tree_medium");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> pContext) {

        register(pContext, NCTreeFeatures.DOUGLAS_FIR_TREE, NCFeatures.DOUGLAS_FIR_TREE, createFir(NCBlocks.FIR_LOG.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.DOUGLAS_FIR_TREE_MEDIUM, NCFeatures.DOUGLAS_FIR_TREE, createFir(NCBlocks.FIR_WOOD.get()).minHeight(30).maxHeight(40).trunkWidth(2).build());
        register(pContext, NCTreeFeatures.DOUGLAS_FIR_TREE_LARGE, NCFeatures.DOUGLAS_FIR_TREE, createFir(NCBlocks.FIR_WOOD.get()).minHeight(40).maxHeight(51).trunkWidth(2).build());

        register(pContext, NCTreeFeatures.LODGEPOLE_PINE_TREE, NCFeatures.LODGEPOLE_PINE_TREE, createPine(NCBlocks.PINE_LOG.get()).minHeight(10).maxHeight(25).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.LODGEPOLE_PINE_TREE_MEDIUM, NCFeatures.LODGEPOLE_PINE_TREE, createPine(NCBlocks.PINE_WOOD.get()).minHeight(25).maxHeight(36).trunkWidth(1).build());

        register(pContext, NCTreeFeatures.PONDEROSA_PINE_TREE, NCFeatures.PONDEROSA_PINE_TREE, createPine(NCBlocks.PINE_LOG.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.PONDEROSA_PINE_TREE_MEDIUM, NCFeatures.PONDEROSA_PINE_TREE, createPine(NCBlocks.PINE_WOOD.get()).minHeight(25).maxHeight(40).trunkWidth(2).build());
        register(pContext, NCTreeFeatures.PONDEROSA_PINE_TREE_LARGE, NCFeatures.PONDEROSA_PINE_TREE, createPine(NCBlocks.PINE_WOOD.get()).minHeight(35).maxHeight(56).trunkWidth(2).build());

        register(pContext, NCTreeFeatures.RED_CEDAR_TREE, NCFeatures.RED_CEDAR_TREE, createCedar(NCBlocks.CEDAR_LOG.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.RED_CEDAR_TREE_MEDIUM, NCFeatures.RED_CEDAR_TREE, createCedar(NCBlocks.CEDAR_WOOD.get()).minHeight(20).maxHeight(40).trunkWidth(2).build());
        register(pContext, NCTreeFeatures.RED_CEDAR_TREE_LARGE, NCFeatures.RED_CEDAR_TREE, createCedar(NCBlocks.CEDAR_WOOD.get()).minHeight(35).maxHeight(50).trunkWidth(2).build());

        register(pContext, NCTreeFeatures.SUBALPINE_FIR_TREE, NCFeatures.SUBALPINE_FIR_TREE, createFir(NCBlocks.FIR_LOG.get()).minHeight(10).maxHeight(25).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.SUBALPINE_FIR_TREE_MEDIUM, NCFeatures.SUBALPINE_FIR_TREE, createFir(NCBlocks.FIR_WOOD.get()).minHeight(25).maxHeight(35).trunkWidth(1).build());

    }

    private static EvergreenTreeConfiguration.Builder createCedar(Block log){
        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).foliage(BlockStateProvider.simple(NCBlocks.CEDAR_LEAVES.get()));
    }

    private static EvergreenTreeConfiguration.Builder createFir(Block log) {
        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).foliage(BlockStateProvider.simple(NCBlocks.FIR_LEAVES.get()));
    }

    private static EvergreenTreeConfiguration.Builder createPine(Block log) {
        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).foliage(BlockStateProvider.simple(NCBlocks.PINE_LEAVES.get()));
    }                                                                             // SETUP GENERATION TO USE WOOD WHEN EXPOSED AND LOG WHEN NOT EXPOSED

//    private static EvergreenTreeConfiguration.Builder createPine(Block log, Block wood) {
//        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).exposedTrunk(BlockStateProvider.simple(wood)).foliage(BlockStateProvider.simple(NCBlocks.FIR_LEAVES.get()));
//    }

//    private static EvergreenTreeConfiguration.Builder createMaple() {
//        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(NCBlocks.MAPLE_LOG.get())).foliage(BlockStateProvider.simple(NCBlocks.MAPLE_LEAVES.get()));
//    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey, F feature, FC configuration){
        context.register(configuredFeatureKey, new ConfiguredFeature<>(feature, configuration));
    }
}

