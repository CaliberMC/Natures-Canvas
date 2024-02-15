package com.calibermc.naturescanvas.data.worldgen.placement;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.util.worldgen.NCPlacementUtils;
import com.calibermc.naturescanvas.data.worldgen.features.NCTreeFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class NCTreePlacement {

    public static final ResourceKey<PlacedFeature> RED_CEDAR_TREE = NCPlacementUtils.registerKey("red_cedar_tree");
    public static final ResourceKey<PlacedFeature> RED_CEDAR_TREE_MEDIUM = NCPlacementUtils.registerKey("red_cedar_tree_medium");
    public static final ResourceKey<PlacedFeature> RED_CEDAR_TREE_LARGE = NCPlacementUtils.registerKey("red_cedar_tree_large");

    public static final ResourceKey<PlacedFeature> DOUGLAS_FIR_TREE = NCPlacementUtils.registerKey("douglas_fir_tree");
    public static final ResourceKey<PlacedFeature> DOUGLAS_FIR_TREE_MEDIUM = NCPlacementUtils.registerKey("douglas_fir_tree_medium");
    public static final ResourceKey<PlacedFeature> DOUGLAS_FIR_TREE_LARGE = NCPlacementUtils.registerKey("douglas_fir_tree_large");

    public static final ResourceKey<PlacedFeature> LODGEPOLE_PINE_TREE = NCPlacementUtils.registerKey("lodgepole_pine_tree");
    public static final ResourceKey<PlacedFeature> LODGEPOLE_PINE_TREE_MEDIUM = NCPlacementUtils.registerKey("lodgepole_pine_tree_medium");


    public static final ResourceKey<PlacedFeature> PONDEROSA_PINE_TREE = NCPlacementUtils.registerKey("pine_tree");
    public static final ResourceKey<PlacedFeature> PONDEROSA_PINE_TREE_MEDIUM = NCPlacementUtils.registerKey("pine_tree_medium");
    public static final ResourceKey<PlacedFeature> PONDEROSA_PINE_TREE_LARGE = NCPlacementUtils.registerKey("pine_tree_large");

    public static final ResourceKey<PlacedFeature> SUBALPINE_FIR_TREE = NCPlacementUtils.registerKey("subalpine_fir_tree");
    public static final ResourceKey<PlacedFeature> SUBALPINE_FIR_TREE_MEDIUM = NCPlacementUtils.registerKey("subalpine_fir_tree_medium");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> RED_CEDAR_TREE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.RED_CEDAR_TREE);
        final Holder<ConfiguredFeature<?, ?>> RED_CEDAR_TREE_MEDIUM = configuredFeatureGetter.getOrThrow(NCTreeFeatures.RED_CEDAR_TREE_MEDIUM);
        final Holder<ConfiguredFeature<?, ?>> RED_CEDAR_TREE_LARGE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.RED_CEDAR_TREE_LARGE);

        final Holder<ConfiguredFeature<?, ?>> DOUGLAS_FIR_TREE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.DOUGLAS_FIR_TREE);
        final Holder<ConfiguredFeature<?, ?>> DOUGLAS_FIR_TREE_MEDIUM = configuredFeatureGetter.getOrThrow(NCTreeFeatures.DOUGLAS_FIR_TREE_MEDIUM);
        final Holder<ConfiguredFeature<?, ?>> DOUGLAS_FIR_TREE_LARGE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.DOUGLAS_FIR_TREE_LARGE);

        final Holder<ConfiguredFeature<?, ?>> LODGEPOLE_PINE_TREE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.LODGEPOLE_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> LODGEPOLE_PINE_TREE_MEDIUM = configuredFeatureGetter.getOrThrow(NCTreeFeatures.LODGEPOLE_PINE_TREE_MEDIUM);

        final Holder<ConfiguredFeature<?, ?>> PONDEROSA_PINE_TREE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.PONDEROSA_PINE_TREE);
        final Holder<ConfiguredFeature<?, ?>> PONDEROSA_PINE_TREE_MEDIUM = configuredFeatureGetter.getOrThrow(NCTreeFeatures.PONDEROSA_PINE_TREE_MEDIUM);
        final Holder<ConfiguredFeature<?, ?>> PONDEROSA_PINE_TREE_LARGE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.PONDEROSA_PINE_TREE_LARGE);

        final Holder<ConfiguredFeature<?, ?>> SUBALPINE_FIR_TREE = configuredFeatureGetter.getOrThrow(NCTreeFeatures.SUBALPINE_FIR_TREE);
        final Holder<ConfiguredFeature<?, ?>> SUBALPINE_FIR_TREE_MEDIUM = configuredFeatureGetter.getOrThrow(NCTreeFeatures.SUBALPINE_FIR_TREE_MEDIUM);
        

        register(context, NCTreePlacement.RED_CEDAR_TREE, RED_CEDAR_TREE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.RED_CEDAR_SAPLING.get())));
        register(context, NCTreePlacement.RED_CEDAR_TREE_MEDIUM, RED_CEDAR_TREE_MEDIUM, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.RED_CEDAR_SAPLING.get())));
        register(context, NCTreePlacement.RED_CEDAR_TREE_LARGE, RED_CEDAR_TREE_LARGE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.RED_CEDAR_SAPLING.get())));

        register(context, NCTreePlacement.DOUGLAS_FIR_TREE, DOUGLAS_FIR_TREE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.DOUGLAS_FIR_SAPLING.get())));
        register(context, NCTreePlacement.DOUGLAS_FIR_TREE_MEDIUM, DOUGLAS_FIR_TREE_MEDIUM, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.DOUGLAS_FIR_SAPLING.get())));
        register(context, NCTreePlacement.DOUGLAS_FIR_TREE_LARGE, DOUGLAS_FIR_TREE_LARGE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.DOUGLAS_FIR_SAPLING.get())));

        register(context, NCTreePlacement.LODGEPOLE_PINE_TREE, LODGEPOLE_PINE_TREE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.LODGEPOLE_PINE_SAPLING.get())));
        register(context, NCTreePlacement.LODGEPOLE_PINE_TREE_MEDIUM, LODGEPOLE_PINE_TREE_MEDIUM, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.LODGEPOLE_PINE_SAPLING.get())));

        register(context, NCTreePlacement.PONDEROSA_PINE_TREE, PONDEROSA_PINE_TREE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.PONDEROSA_PINE_SAPLING.get())));
        register(context, NCTreePlacement.PONDEROSA_PINE_TREE_MEDIUM, PONDEROSA_PINE_TREE_MEDIUM, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.PONDEROSA_PINE_SAPLING.get())));
        register(context, NCTreePlacement.PONDEROSA_PINE_TREE_LARGE, PONDEROSA_PINE_TREE_LARGE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.PONDEROSA_PINE_SAPLING.get())));

        register(context, NCTreePlacement.SUBALPINE_FIR_TREE, SUBALPINE_FIR_TREE, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.SUBALPINE_FIR_SAPLING.get())));
        register(context, NCTreePlacement.SUBALPINE_FIR_TREE_MEDIUM, SUBALPINE_FIR_TREE_MEDIUM, List.of(PlacementUtils.filteredByBlockSurvival(NCBlocks.SUBALPINE_FIR_SAPLING.get())));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, placedFeatureKey, configuration, List.of(modifiers));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(placedFeatureKey, new PlacedFeature(configuration, modifiers));
    }
}

