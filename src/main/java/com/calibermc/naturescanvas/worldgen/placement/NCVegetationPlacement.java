package com.calibermc.naturescanvas.worldgen.placement;

import com.calibermc.naturescanvas.util.worldgen.NCPlacementUtils;
import com.calibermc.naturescanvas.worldgen.feature.NCVegetationFeatures;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class NCVegetationPlacement {

    public static final ResourceKey<PlacedFeature> PATCH_FERN_2 = NCPlacementUtils.registerKey("patch_fern_2");
    public static final ResourceKey<PlacedFeature> PATCH_FERN_4 = NCPlacementUtils.registerKey("patch_fern_4");
    public static final ResourceKey<PlacedFeature> PATCH_FERN_8 = NCPlacementUtils.registerKey("patch_fern_8");
    public static final ResourceKey<PlacedFeature> PATCH_FERN_16 = NCPlacementUtils.registerKey("patch_fern_16");
    public static final ResourceKey<PlacedFeature> TREES_CEDAR_FOREST = NCPlacementUtils.registerKey("trees_cedar_forest");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        final Holder<ConfiguredFeature<?, ?>> PATCH_FERN = configuredFeatureGetter.getOrThrow(NCVegetationFeatures.PATCH_FERN);
        final Holder<ConfiguredFeature<?, ?>> TREES_CEDAR_FOREST = configuredFeatureGetter.getOrThrow(NCVegetationFeatures.TREES_CEDAR_FOREST);

        register(context, NCVegetationPlacement.PATCH_FERN_2, PATCH_FERN, VegetationPlacements.worldSurfaceSquaredWithCount(2));
        register(context, NCVegetationPlacement.PATCH_FERN_4, PATCH_FERN, VegetationPlacements.worldSurfaceSquaredWithCount(4));
        register(context, NCVegetationPlacement.PATCH_FERN_8, PATCH_FERN, VegetationPlacements.worldSurfaceSquaredWithCount(8));
        register(context, NCVegetationPlacement.PATCH_FERN_16, PATCH_FERN, VegetationPlacements.worldSurfaceSquaredWithCount(16));
        register(context, NCVegetationPlacement.TREES_CEDAR_FOREST, TREES_CEDAR_FOREST, treePlacement(PlacementUtils.countExtra(12, 0.2F, 1)));

    }
    private static List<PlacementModifier> waterTreePlacement(PlacementModifier modifier)
    {
        return ImmutableList.<PlacementModifier>builder().add(modifier).add(InSquarePlacement.spread()).add(PlacementUtils.HEIGHTMAP_TOP_SOLID).add(BiomeFilter.biome()).build();
    }

    private static List<PlacementModifier> seagrassPlacement(int p_195234_) {
        return List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, CountPlacement.of(p_195234_), BiomeFilter.biome());
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, placedFeatureKey, configuration, List.of(modifiers));
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(placedFeatureKey, new PlacedFeature(configuration, modifiers));
    }
}

