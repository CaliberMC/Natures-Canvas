package com.calibermc.naturescanvas.worldgen.biome;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.worldgen.placement.NCOrePlacement;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class NCBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("add_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");

//    public static final ResourceKey<BiomeModifier> ADD_BLACK_GRANITE = registerKey("add_black_granite");
//    public static final ResourceKey<BiomeModifier> ADD_BROWN_GRANITE = registerKey("add_brown_granite");
//    public static final ResourceKey<BiomeModifier> ADD_GRAY_GRANITE = registerKey("add_gray_granite");
//    public static final ResourceKey<BiomeModifier> ADD_PINK_GRANITE = registerKey("add_pink_granite");
//    public static final ResourceKey<BiomeModifier> ADD_WHITE_GRANITE = registerKey("add_white_granite");
//
//    public static final ResourceKey<BiomeModifier> ADD_DARK_LIMESTONE = registerKey("add_dark_limestone");
//    public static final ResourceKey<BiomeModifier> ADD_LIGHT_LIMESTONE = registerKey("add_light_limestone");
//    public static final ResourceKey<BiomeModifier> ADD_PINK_LIMESTONE = registerKey("add_pink_limestone");
//    public static final ResourceKey<BiomeModifier> ADD_TAN_LIMESTONE = registerKey("add_tan_limestone");
//
//    public static final ResourceKey<BiomeModifier> ADD_BLACK_MARBLE = registerKey("add_black_marble");
//    public static final ResourceKey<BiomeModifier> ADD_GRAY_MARBLE = registerKey("add_gray_marble");
//    public static final ResourceKey<BiomeModifier> ADD_PINK_MARBLE = registerKey("add_pink_marble");
//    public static final ResourceKey<BiomeModifier> ADD_RED_MARBLE = registerKey("add_red_marble");
//    public static final ResourceKey<BiomeModifier> ADD_WHITE_MARBLE = registerKey("add_white_marble");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.TIN_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.SILVER_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

//        context.register(ADD_BLACK_GRANITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.BLACK_GRANITE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_BROWN_GRANITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.BROWN_GRANITE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_GRAY_GRANITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.GRAY_GRANITE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_PINK_GRANITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.PINK_GRANITE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_WHITE_GRANITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.WHITE_GRANITE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_DARK_LIMESTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.DARK_LIMESTONE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_LIGHT_LIMESTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.LIGHT_LIMESTONE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_PINK_LIMESTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.PINK_LIMESTONE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_TAN_LIMESTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.TAN_LIMESTONE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_BLACK_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.BLACK_MARBLE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_GRAY_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.GRAY_MARBLE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_PINK_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.PINK_MARBLE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_RED_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.RED_MARBLE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));
//
//        context.register(ADD_WHITE_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),//Biomes.BEACH
//                HolderSet.direct(placedFeatures.getOrThrow(NCOrePlacement.WHITE_MARBLE)),
//                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(NaturesCanvas.MOD_ID, name));
    }
}

