package com.calibermc.naturescanvas.worldgen.placement;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.util.worldgen.NCPlacementUtils;
import com.calibermc.naturescanvas.worldgen.feature.NCOreFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class NCOrePlacement {

    public static final ResourceKey<PlacedFeature> TIN_ORE = NCPlacementUtils.registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE =  NCPlacementUtils.registerKey("silver_ore_placed");

    public static final ResourceKey<PlacedFeature> BLACK_GRANITE = NCPlacementUtils.registerKey("black_granite_placed");
    public static final ResourceKey<PlacedFeature> BROWN_GRANITE = NCPlacementUtils.registerKey("brown_granite_placed");
    public static final ResourceKey<PlacedFeature> GRAY_GRANITE = NCPlacementUtils.registerKey("gray_granite_placed");
    public static final ResourceKey<PlacedFeature> PINK_GRANITE = NCPlacementUtils.registerKey("pink_granite_placed");
    public static final ResourceKey<PlacedFeature> WHITE_GRANITE = NCPlacementUtils.registerKey("white_granite_placed");

    public static final ResourceKey<PlacedFeature> DARK_LIMESTONE = NCPlacementUtils.registerKey("dark_limestone_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_LIMESTONE = NCPlacementUtils.registerKey("light_limestone_placed");
    public static final ResourceKey<PlacedFeature> PINK_LIMESTONE = NCPlacementUtils.registerKey("pink_limestone_placed");
    public static final ResourceKey<PlacedFeature> TAN_LIMESTONE = NCPlacementUtils.registerKey("tan_limestone_placed");

    public static final ResourceKey<PlacedFeature> BLACK_MARBLE = NCPlacementUtils.registerKey("black_marble_placed");
    public static final ResourceKey<PlacedFeature> GRAY_MARBLE = NCPlacementUtils.registerKey("gray_marble_placed");
    public static final ResourceKey<PlacedFeature> PINK_MARBLE = NCPlacementUtils.registerKey("pink_marble_placed");
    public static final ResourceKey<PlacedFeature> RED_MARBLE = NCPlacementUtils.registerKey("red_marble_placed");
    public static final ResourceKey<PlacedFeature> WHITE_MARBLE = NCPlacementUtils.registerKey("white_marble_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> pContext) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = pContext.lookup(Registries.CONFIGURED_FEATURE);


        // Precious Metals
        register(pContext, NCOrePlacement.TIN_ORE, configuredFeatures.getOrThrow(NCOreFeatures.TIN_ORE),
                commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(164))));

        register(pContext, NCOrePlacement.SILVER_ORE, configuredFeatures.getOrThrow(NCOreFeatures.SILVER_ORE),
                commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(64))));

        // Stone
        register(pContext, NCOrePlacement.BLACK_GRANITE, configuredFeatures.getOrThrow(NCOreFeatures.BLACK_GRANITE),
                commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        
        register(pContext, NCOrePlacement.BROWN_GRANITE, configuredFeatures.getOrThrow(NCOreFeatures.BROWN_GRANITE),
                commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        
        register(pContext, NCOrePlacement.GRAY_GRANITE, configuredFeatures.getOrThrow(NCOreFeatures.GRAY_GRANITE),
                commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        
        register(pContext, NCOrePlacement.PINK_GRANITE, configuredFeatures.getOrThrow(NCOreFeatures.PINK_GRANITE),
                commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        
        register(pContext, NCOrePlacement.WHITE_GRANITE, configuredFeatures.getOrThrow(NCOreFeatures.WHITE_GRANITE),
                commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        
        register(pContext, NCOrePlacement.DARK_LIMESTONE, configuredFeatures.getOrThrow(NCOreFeatures.DARK_LIMESTONE),
                commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        
        register(pContext, NCOrePlacement.LIGHT_LIMESTONE, configuredFeatures.getOrThrow(NCOreFeatures.LIGHT_LIMESTONE),
                commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        
        register(pContext, NCOrePlacement.PINK_LIMESTONE, configuredFeatures.getOrThrow(NCOreFeatures.PINK_LIMESTONE),
                commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        
        register(pContext, NCOrePlacement.TAN_LIMESTONE, configuredFeatures.getOrThrow(NCOreFeatures.TAN_LIMESTONE),        
                commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        
        register(pContext, NCOrePlacement.BLACK_MARBLE, configuredFeatures.getOrThrow(NCOreFeatures.BLACK_MARBLE),
                commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        
        register(pContext, NCOrePlacement.GRAY_MARBLE, configuredFeatures.getOrThrow(NCOreFeatures.GRAY_MARBLE),
                commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        
        register(pContext, NCOrePlacement.PINK_MARBLE, configuredFeatures.getOrThrow(NCOreFeatures.PINK_MARBLE),
                commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        
        register(pContext, NCOrePlacement.WHITE_MARBLE, configuredFeatures.getOrThrow(NCOreFeatures.WHITE_MARBLE),
                commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

    protected static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> placedFeatureKey, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, placedFeatureKey, configuration, List.of(modifiers));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }




}
