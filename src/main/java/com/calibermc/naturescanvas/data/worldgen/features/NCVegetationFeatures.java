package com.calibermc.naturescanvas.data.worldgen.features;

import com.calibermc.naturescanvas.util.worldgen.NCFeatureUtils;
import com.calibermc.naturescanvas.data.worldgen.placement.NCTreePlacement;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

// Change in future to this https://github.com/MinecraftForge/MinecraftForge/blob/45b00b000411d9c7b2e090359b051dc60a73628a/src/test_old/java/net/minecraftforge/debug/world/BiomeModifierTest.java#L92
public class NCVegetationFeatures {


    // Vegetation
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FERN = NCFeatureUtils.registerKey("patch_fern");

    // Old Growth Forests
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_DOUGLAS_FIR_FOREST = NCFeatureUtils.registerKey("trees_old_growth_douglas_fir_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_PONDEROSA_PINE_FOREST = NCFeatureUtils.registerKey("trees_old_growth_ponderosa_pine_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_RED_CEDAR_FOREST = NCFeatureUtils.registerKey("trees_old_growth_red_cedar_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_NORTHERN_CONIFEROUS_FOREST = NCFeatureUtils.registerKey("trees_old_growth_northern_coniferous_forest");
    //    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_SOUTHERN_CONIFEROUS_FOREST = NCFeatureUtils.registerKey("trees_old_growth_southern_coniferous_forest");

    // Forests
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_DOUGLAS_FIR_FOREST = NCFeatureUtils.registerKey("trees_douglas_fir_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_LODGEPOLE_PINE_FOREST = NCFeatureUtils.registerKey("trees_lodgepole_pine_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_PONDEROSA_PINE_FOREST = NCFeatureUtils.registerKey("trees_ponderosa_pine_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_RED_CEDAR_FOREST = NCFeatureUtils.registerKey("trees_red_cedar_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_SUBALPINE_FIR_FOREST = NCFeatureUtils.registerKey("trees_subalpine_fir_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_NORTHERN_CONIFEROUS_FOREST = NCFeatureUtils.registerKey("trees_northern_coniferous_forest");
//    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_SOUTHERN_CONIFEROUS_FOREST = NCFeatureUtils.registerKey("trees_southern_coniferous_forest");

//    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_TAIGA_FOREST = NCFeatureUtils.registerKey("trees_taiga_forest");
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> pContext) {
        HolderGetter<PlacedFeature> placedFeatureGetter = pContext.lookup(Registries.PLACED_FEATURE);

        final Holder<PlacedFeature> DOUGLAS_FIR_TREE = placedFeatureGetter.getOrThrow(NCTreePlacement.DOUGLAS_FIR_TREE);
        final Holder<PlacedFeature> DOUGLAS_FIR_TREE_MEDIUM = placedFeatureGetter.getOrThrow(NCTreePlacement.DOUGLAS_FIR_TREE_MEDIUM);
        final Holder<PlacedFeature> DOUGLAS_FIR_TREE_LARGE = placedFeatureGetter.getOrThrow(NCTreePlacement.DOUGLAS_FIR_TREE_LARGE);

        final Holder<PlacedFeature> LODGEPOLE_PINE_TREE = placedFeatureGetter.getOrThrow(NCTreePlacement.LODGEPOLE_PINE_TREE);
        final Holder<PlacedFeature> LODGEPOLE_PINE_TREE_MEDIUM = placedFeatureGetter.getOrThrow(NCTreePlacement.LODGEPOLE_PINE_TREE_MEDIUM);

        final Holder<PlacedFeature> PONDEROSA_PINE_TREE = placedFeatureGetter.getOrThrow(NCTreePlacement.PONDEROSA_PINE_TREE);
        final Holder<PlacedFeature> PONDEROSA_PINE_TREE_MEDIUM = placedFeatureGetter.getOrThrow(NCTreePlacement.PONDEROSA_PINE_TREE_MEDIUM);
        final Holder<PlacedFeature> PONDEROSA_PINE_TREE_LARGE = placedFeatureGetter.getOrThrow(NCTreePlacement.PONDEROSA_PINE_TREE_LARGE);

        final Holder<PlacedFeature> RED_CEDAR_TREE = placedFeatureGetter.getOrThrow(NCTreePlacement.RED_CEDAR_TREE);
        final Holder<PlacedFeature> RED_CEDAR_TREE_MEDIUM = placedFeatureGetter.getOrThrow(NCTreePlacement.RED_CEDAR_TREE_MEDIUM);
        final Holder<PlacedFeature> RED_CEDAR_TREE_LARGE = placedFeatureGetter.getOrThrow(NCTreePlacement.RED_CEDAR_TREE_LARGE);

        final Holder<PlacedFeature> SUBALPINE_FIR_TREE = placedFeatureGetter.getOrThrow(NCTreePlacement.SUBALPINE_FIR_TREE);
        final Holder<PlacedFeature> SUBALPINE_FIR_TREE_MEDIUM = placedFeatureGetter.getOrThrow(NCTreePlacement.SUBALPINE_FIR_TREE_MEDIUM);

        // Vegetation
        register(pContext, NCVegetationFeatures.PATCH_FERN, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.FERN))));

        // Old Growth Forests
        register(pContext, NCVegetationFeatures.TREES_OLD_GROWTH_DOUGLAS_FIR_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(DOUGLAS_FIR_TREE_MEDIUM, 0.3f),
                new WeightedPlacedFeature(DOUGLAS_FIR_TREE_LARGE, 0.1f)),
                DOUGLAS_FIR_TREE));

        register(pContext, NCVegetationFeatures.TREES_OLD_GROWTH_PONDEROSA_PINE_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE_MEDIUM, 0.3f),
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE_LARGE, 0.1f)),
                PONDEROSA_PINE_TREE));

        register(pContext, NCVegetationFeatures.TREES_OLD_GROWTH_RED_CEDAR_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(RED_CEDAR_TREE, 0.2f),
                new WeightedPlacedFeature(RED_CEDAR_TREE_LARGE, 0.5f)),
                RED_CEDAR_TREE_MEDIUM));

        register(pContext, NCVegetationFeatures.TREES_OLD_GROWTH_NORTHERN_CONIFEROUS_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(DOUGLAS_FIR_TREE_MEDIUM, 0.3f),
                new WeightedPlacedFeature(DOUGLAS_FIR_TREE_LARGE, 0.1f),
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE, 0.3f),
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE_MEDIUM, 0.2f),
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE_LARGE, 0.1f),
                new WeightedPlacedFeature(RED_CEDAR_TREE, 0.2f),
                new WeightedPlacedFeature(RED_CEDAR_TREE_MEDIUM, 0.1f),
                new WeightedPlacedFeature(RED_CEDAR_TREE_LARGE, 0.1f)),
                DOUGLAS_FIR_TREE));

        // Forests
        register(pContext, NCVegetationFeatures.TREES_DOUGLAS_FIR_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(DOUGLAS_FIR_TREE_MEDIUM, 0.1f)),
                DOUGLAS_FIR_TREE));

        register(pContext, NCVegetationFeatures.TREES_LODGEPOLE_PINE_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(LODGEPOLE_PINE_TREE_MEDIUM, 0.1f)),
                LODGEPOLE_PINE_TREE));

        register(pContext, NCVegetationFeatures.TREES_PONDEROSA_PINE_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE_MEDIUM, 0.1f)),
                PONDEROSA_PINE_TREE));

        register(pContext, NCVegetationFeatures.TREES_RED_CEDAR_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(RED_CEDAR_TREE_MEDIUM, 0.1f)),
                RED_CEDAR_TREE));

        register(pContext, NCVegetationFeatures.TREES_SUBALPINE_FIR_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(SUBALPINE_FIR_TREE_MEDIUM, 0.1f)),
                SUBALPINE_FIR_TREE));

        register(pContext, NCVegetationFeatures.TREES_NORTHERN_CONIFEROUS_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(
                new WeightedPlacedFeature(DOUGLAS_FIR_TREE_MEDIUM, 0.1f),
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE, 0.2f),
                new WeightedPlacedFeature(PONDEROSA_PINE_TREE_MEDIUM, 0.1f),
                new WeightedPlacedFeature(RED_CEDAR_TREE, 0.2f),
                new WeightedPlacedFeature(RED_CEDAR_TREE_MEDIUM, 0.1f)),
                DOUGLAS_FIR_TREE));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}