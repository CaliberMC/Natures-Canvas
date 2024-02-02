package com.calibermc.naturescanvas.worldgen.feature;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.util.worldgen.NCFeatureUtils;
import com.calibermc.naturescanvas.worldgen.placement.NCOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

// Change in future to this https://github.com/MinecraftForge/MinecraftForge/blob/45b00b000411d9c7b2e090359b051dc60a73628a/src/test_old/java/net/minecraftforge/debug/world/BiomeModifierTest.java#L92
public class NCOreFeatures {

    //Metal Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE = NCFeatureUtils.registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE = NCFeatureUtils.registerKey("silver_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_GRANITE = NCFeatureUtils.registerKey("black_granite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_GRANITE = NCFeatureUtils.registerKey("brown_granite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_GRANITE = NCFeatureUtils.registerKey("gray_granite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_GRANITE = NCFeatureUtils.registerKey("pink_granite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_GRANITE = NCFeatureUtils.registerKey("white_granite_ore");
    
    public static final ResourceKey<ConfiguredFeature<?, ?>> DARK_LIMESTONE = NCFeatureUtils.registerKey("dark_limestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_LIMESTONE = NCFeatureUtils.registerKey("light_limestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_LIMESTONE = NCFeatureUtils.registerKey("pink_limestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TAN_LIMESTONE = NCFeatureUtils.registerKey("tan_limestone_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_MARBLE = NCFeatureUtils.registerKey("black_marble_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_MARBLE = NCFeatureUtils.registerKey("gray_marble_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MARBLE = NCFeatureUtils.registerKey("pink_marble_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MARBLE = NCFeatureUtils.registerKey("red_marble_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MARBLE = NCFeatureUtils.registerKey("white_marble_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> pContext) {
        RuleTest stoneOverworld = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // Precious Metals
        register(pContext, TIN_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, NCBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NCBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())), 9));

        register(pContext, SILVER_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, NCBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NCBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())), 9));

        //Stone
        register(pContext, BLACK_GRANITE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.BLACK_GRANITE.baseBlock().defaultBlockState())), 64));
        register(pContext, BROWN_GRANITE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.BROWN_GRANITE.baseBlock().defaultBlockState())), 64));
        register(pContext, GRAY_GRANITE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.GRAY_GRANITE.baseBlock().defaultBlockState())), 64));
        register(pContext, PINK_GRANITE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.PINK_GRANITE.baseBlock().defaultBlockState())), 64));
        register(pContext, WHITE_GRANITE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.WHITE_GRANITE.baseBlock().defaultBlockState())), 64));
        
        register(pContext, DARK_LIMESTONE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.DARK_LIMESTONE.baseBlock().defaultBlockState())), 64));
        register(pContext, LIGHT_LIMESTONE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.LIGHT_LIMESTONE.baseBlock().defaultBlockState())), 64));
        register(pContext, PINK_LIMESTONE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.PINK_LIMESTONE.baseBlock().defaultBlockState())), 64));
        register(pContext, TAN_LIMESTONE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.TAN_LIMESTONE.baseBlock().defaultBlockState())), 64));
        
        register(pContext, BLACK_MARBLE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.BLACK_MARBLE.baseBlock().defaultBlockState())), 32));
        register(pContext, GRAY_MARBLE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.GRAY_MARBLE.baseBlock().defaultBlockState())), 32));
        register(pContext, PINK_MARBLE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.PINK_MARBLE.baseBlock().defaultBlockState())), 32));
        register(pContext, RED_MARBLE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.RED_MARBLE.baseBlock().defaultBlockState())), 32));
        register(pContext, WHITE_MARBLE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneOverworld, NCBlocks.WHITE_MARBLE.baseBlock().defaultBlockState())), 32));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}