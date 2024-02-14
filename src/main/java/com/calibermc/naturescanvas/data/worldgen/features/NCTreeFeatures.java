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

    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_TREE = NCFeatureUtils.registerKey("cedar_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_TREE_MEDIUM = NCFeatureUtils.registerKey("cedar_tree_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_TREE_LARGE = NCFeatureUtils.registerKey("cedar_tree_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIR_TREE = NCFeatureUtils.registerKey("fir_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIR_TREE_MEDIUM = NCFeatureUtils.registerKey("fir_tree_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FIR_TREE_LARGE = NCFeatureUtils.registerKey("fir_tree_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE = NCFeatureUtils.registerKey("pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE_MEDIUM = NCFeatureUtils.registerKey("pine_tree_medium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_TREE_LARGE = NCFeatureUtils.registerKey("pine_tree_large");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> pContext) {
        register(pContext, NCTreeFeatures.CEDAR_TREE, NCFeatures.CEDAR_TREE, createCedar(NCBlocks.CEDAR_LOG.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.CEDAR_TREE_MEDIUM, NCFeatures.CEDAR_TREE, createCedar(NCBlocks.CEDAR_WOOD.get()).minHeight(20).maxHeight(40).trunkWidth(2).build());
        register(pContext, NCTreeFeatures.CEDAR_TREE_LARGE, NCFeatures.CEDAR_TREE, createCedar(NCBlocks.CEDAR_WOOD.get()).minHeight(35).maxHeight(55).trunkWidth(3).build());
        register(pContext, NCTreeFeatures.FIR_TREE, NCFeatures.FIR_TREE, createFir(NCBlocks.FIR_LOG.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.FIR_TREE_MEDIUM, NCFeatures.FIR_TREE, createFir(NCBlocks.FIR_WOOD.get()).minHeight(20).maxHeight(40).trunkWidth(2).build());
        register(pContext, NCTreeFeatures.FIR_TREE_LARGE, NCFeatures.FIR_TREE, createFir(NCBlocks.FIR_WOOD.get()).minHeight(35).maxHeight(55).trunkWidth(3).build());
        register(pContext, NCTreeFeatures.PINE_TREE, NCFeatures.PINE_TREE, createPine(NCBlocks.PINE_LOG.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
        register(pContext, NCTreeFeatures.PINE_TREE_MEDIUM, NCFeatures.PINE_TREE, createPine(NCBlocks.PINE_WOOD.get()).minHeight(25).maxHeight(40).trunkWidth(2).build());
        register(pContext, NCTreeFeatures.PINE_TREE_LARGE, NCFeatures.PINE_TREE, createPine(NCBlocks.PINE_WOOD.get()).minHeight(35).maxHeight(50).trunkWidth(2).build());
//        register(pContext, NCTreeFeatures.PINE_TREE, NCFeatures.PINE_TREE, createPine(NCBlocks.PINE_LOG.get(), NCBlocks.PINE_WOOD.get()).minHeight(10).maxHeight(30).trunkWidth(1).build());
//        register(pContext, NCTreeFeatures.PINE_TREE_MEDIUM, NCFeatures.PINE_TREE, createPine(NCBlocks.PINE_LOG.get(), NCBlocks.PINE_WOOD.get()).minHeight(25).maxHeight(40).trunkWidth(2).build());
//        register(pContext, NCTreeFeatures.PINE_TREE_LARGE, NCFeatures.PINE_TREE, createPine(NCBlocks.PINE_LOG.get(), NCBlocks.PINE_WOOD.get()).minHeight(35).maxHeight(50).trunkWidth(2).build());
    }

    private static EvergreenTreeConfiguration.Builder createCedar(Block log){
        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).foliage(BlockStateProvider.simple(NCBlocks.CEDAR_LEAVES.get()));
    }

    private static EvergreenTreeConfiguration.Builder createFir(Block log) {
        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).foliage(BlockStateProvider.simple(NCBlocks.FIR_LEAVES.get()));
    }

    private static EvergreenTreeConfiguration.Builder createPine(Block log) {
        return new EvergreenTreeConfiguration.Builder().trunk(BlockStateProvider.simple(log)).foliage(BlockStateProvider.simple(NCBlocks.FIR_LEAVES.get()));
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

