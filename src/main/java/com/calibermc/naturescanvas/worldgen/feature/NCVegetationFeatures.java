package com.calibermc.naturescanvas.worldgen.feature;

import com.calibermc.naturescanvas.util.worldgen.NCFeatureUtils;
import com.calibermc.naturescanvas.worldgen.placement.NCTreePlacement;
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


    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_FERN = NCFeatureUtils.registerKey("patch_fern");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREES_CEDAR_FOREST = NCFeatureUtils.registerKey("trees_cedar_forest");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> pContext) {

        HolderGetter<PlacedFeature> placedFeatureGetter = pContext.lookup(Registries.PLACED_FEATURE);

        final Holder<PlacedFeature> CEDAR_TREE = placedFeatureGetter.getOrThrow(NCTreePlacement.CEDAR_TREE);
        final Holder<PlacedFeature> CEDAR_TREE_LARGE = placedFeatureGetter.getOrThrow(NCTreePlacement.CEDAR_TREE_LARGE);
        final Holder<PlacedFeature> CEDAR_TREE_MEDIUM = placedFeatureGetter.getOrThrow(NCTreePlacement.CEDAR_TREE_MEDIUM);

        register(pContext, NCVegetationFeatures.PATCH_FERN, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.FERN))));
        register(pContext, NCVegetationFeatures.TREES_CEDAR_FOREST, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(ImmutableList.of(new WeightedPlacedFeature(CEDAR_TREE_MEDIUM, 0.3f), new WeightedPlacedFeature(CEDAR_TREE_LARGE, 0.1f)), CEDAR_TREE));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}