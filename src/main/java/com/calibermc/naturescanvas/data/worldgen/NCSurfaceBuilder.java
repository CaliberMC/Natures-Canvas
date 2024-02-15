package com.calibermc.naturescanvas.data.worldgen;

import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraftforge.registries.RegistryObject;

public class NCSurfaceBuilder {
    private static final SurfaceRules.RuleSource AIR = makeStateRule(Blocks.CAVE_AIR);
    private static final SurfaceRules.RuleSource WATER = makeStateRule(Blocks.WATER);
    private static final SurfaceRules.RuleSource LAVA = makeStateRule(Blocks.LAVA);
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);

    private static final SurfaceRules.RuleSource CLAY = makeStateRule(Blocks.CLAY);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRAVEL = makeStateRule(Blocks.GRAVEL);

    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource PODZOL = makeStateRule(Blocks.PODZOL);
    private static final SurfaceRules.RuleSource SNOW_BLOCK = makeStateRule(Blocks.SNOW_BLOCK);
    private static final SurfaceRules.RuleSource POWDER_SNOW = makeStateRule(Blocks.POWDER_SNOW);

    private static final SurfaceRules.RuleSource SANDSTONE = makeStateRule(Blocks.SANDSTONE);
    private static final SurfaceRules.RuleSource RED_SANDSTONE = makeStateRule(Blocks.RED_SANDSTONE);

    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource TAN_LIMESTONE = makeStateRule(NCBlocks.TAN_LIMESTONE.baseBlock());
//    private static final SurfaceRules.RuleSource MOSSY_TAN_LIMESTONE = makeStateRule(NCBlocks.MOSSY_TAN_LIMESTONE.baseBlock());
    private static final SurfaceRules.RuleSource COBBLED_TAN_LIMESTONE = makeStateRule(NCBlocks.COBBLED_TAN_LIMESTONE.baseBlock());
    private static final SurfaceRules.RuleSource MOSSY_COBBLED_TAN_LIMESTONE = makeStateRule(NCBlocks.MOSSY_COBBLED_TAN_LIMESTONE.baseBlock());

    private static final SurfaceRules.RuleSource PINK_LIMESTONE = makeStateRule(NCBlocks.PINK_LIMESTONE.baseBlock());
    private static final SurfaceRules.RuleSource COBBLED_PINK_LIMESTONE = makeStateRule(NCBlocks.COBBLED_PINK_LIMESTONE.baseBlock());

    private static final SurfaceRules.RuleSource OBSIDIAN = makeStateRule(Blocks.OBSIDIAN);
    private static final SurfaceRules.RuleSource TUFF = makeStateRule(Blocks.TUFF);

    private static final SurfaceRules.RuleSource SAND = makeStateRule(Blocks.SAND);
    private static final SurfaceRules.RuleSource BLACK_SAND = makeStateRule(NCBlocks.BLACK_SAND.get());
    private static final SurfaceRules.RuleSource BROWN_SAND = makeStateRule(NCBlocks.BROWN_SAND.get());
    private static final SurfaceRules.RuleSource ORANGE_SAND = makeStateRule(NCBlocks.ORANGE_SAND.get());
    private static final SurfaceRules.RuleSource RED_SAND = makeStateRule(Blocks.RED_SAND);
    private static final SurfaceRules.RuleSource WHITE_SAND = makeStateRule(NCBlocks.WHITE_SAND.get());

    //LAYERS?



    public static SurfaceRules.RuleSource overworldRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource isSeaLevel = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(62), 0);
        SurfaceRules.ConditionSource isAboveSeaLevel = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63), 0);
        SurfaceRules.ConditionSource isBelowSeaLevel = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(61), 0);

        SurfaceRules.RuleSource powderedSnowSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, POWDER_SNOW),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, POWDER_SNOW)
        );

        SurfaceRules.RuleSource snowSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SNOW_BLOCK),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SNOW_BLOCK)
        );

        SurfaceRules.RuleSource gravelSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, GRAVEL),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, STONE)
        );

        SurfaceRules.RuleSource gravelBeachSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(SurfaceRules.ifTrue(isSeaLevel, AIR), SurfaceRules.sequence(SurfaceRules.ifTrue(isSeaLevel, WATER), GRAVEL))),
                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, GRAVEL)
        );

        return SurfaceRules.sequence(

                SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR, 
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        isAtOrAboveWaterLevel,
                                        SurfaceRules.ifTrue(
                                                SurfaceRules.isBiome(NCBiomes.DOUGLAS_FIR_FOREST, NCBiomes.LODGEPOLE_PINE_FOREST, NCBiomes.PONDEROSA_PINE_FOREST, NCBiomes.RED_CEDAR_FOREST,  NCBiomes.SUBALPINE_FIR_FOREST, NCBiomes.CONIFEROUS_FOREST),
                                                SurfaceRules.sequence(
                                                        SurfaceRules.ifTrue(SurfaceRules.steep(), MOSSY_COBBLED_TAN_LIMESTONE),
                                                        SurfaceRules.ifTrue(SurfaceRules.hole(), WATER),
                                                        SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D),
                                                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0), MOSSY_COBBLED_TAN_LIMESTONE)),
                                                        PODZOL
                                                )
                                        )
                                )
                        )
                ),

                SurfaceRules.ifTrue(
                        SurfaceRules.UNDER_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(NCBiomes.DOUGLAS_FIR_FOREST, NCBiomes.LODGEPOLE_PINE_FOREST, NCBiomes.PONDEROSA_PINE_FOREST, NCBiomes.RED_CEDAR_FOREST, NCBiomes.SUBALPINE_FIR_FOREST, NCBiomes.CONIFEROUS_FOREST),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(SurfaceRules.steep(), COBBLED_TAN_LIMESTONE),
                                                SurfaceRules.ifTrue(SurfaceRules.hole(), WATER),
                                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D),
                                                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0), COBBLED_TAN_LIMESTONE)),
                                                SurfaceRules.ifTrue(surfaceNoiseAbove(-0.95D), DIRT),
                                                TAN_LIMESTONE
                                        )
                                )
                        )
                ),

                SurfaceRules.ifTrue(
                        SurfaceRules.DEEP_UNDER_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(NCBiomes.DOUGLAS_FIR_FOREST, NCBiomes.LODGEPOLE_PINE_FOREST, NCBiomes.PONDEROSA_PINE_FOREST, NCBiomes.RED_CEDAR_FOREST, NCBiomes.SUBALPINE_FIR_FOREST, NCBiomes.CONIFEROUS_FOREST),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(surfaceNoiseAbove(1.75D),
                                                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0), COBBLED_TAN_LIMESTONE)),
                                                TAN_LIMESTONE
                                        )
                                )
                        )
                ),

                SurfaceRules.ifTrue(
                        SurfaceRules.VERY_DEEP_UNDER_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(NCBiomes.DOUGLAS_FIR_FOREST, NCBiomes.LODGEPOLE_PINE_FOREST, NCBiomes.PONDEROSA_PINE_FOREST, NCBiomes.RED_CEDAR_FOREST, NCBiomes.SUBALPINE_FIR_FOREST, NCBiomes.CONIFEROUS_FOREST),
                                        TAN_LIMESTONE
                                )
                        )
                )

        );




    }

//    public static SurfaceRules.RuleSource netherRules() {
//
//    }

//    public static SurfaceRules.RuleSource endRules() {
//
//    }


    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double noise) {
        return SurfaceRules.noiseCondition(Noises.SURFACE, noise / 8.25D, Double.MAX_VALUE);
    }

}

