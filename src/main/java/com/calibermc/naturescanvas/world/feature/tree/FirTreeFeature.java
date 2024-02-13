package com.calibermc.naturescanvas.world.feature.tree;

import com.calibermc.naturescanvas.util.biome.GeneratorUtil;
import com.calibermc.naturescanvas.world.feature.configs.EvergreenTreeConfiguration;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.function.BiConsumer;

public class FirTreeFeature extends NCTreeFeature<EvergreenTreeConfiguration> {
    public FirTreeFeature(Codec<EvergreenTreeConfiguration> codec) {
        super(codec);
    }

    @Override
    protected boolean doPlace(@NotNull WorldGenLevel world, RandomSource random, @NotNull BlockPos startPos, BiConsumer<BlockPos, BlockState> roots, BiConsumer<BlockPos, BlockState> logs, FoliagePlacer.FoliageSetter leaves, TreeConfiguration configBase) {
        EvergreenTreeConfiguration config = (EvergreenTreeConfiguration) configBase;

        while (startPos.getY() >= world.getMinBuildHeight()+1 && world.isEmptyBlock(startPos) || world.getBlockState(startPos).is(BlockTags.LEAVES)) {
            startPos = startPos.below();
        }

        // Choose heights
        int height = GeneratorUtil.nextIntBetween(random, config.minHeight, config.maxHeight);
        int baseHeight = GeneratorUtil.nextIntBetween(random, (int) (height * 0.15F), (int) (height * 0.25F));
        int leavesHeight = height - baseHeight;

        if (leavesHeight < 4) {
            return false;
        }
        if (!this.checkSpace(world, startPos.above(), baseHeight, height, config)) {
            // Abandon if there isn't enough room
            return false;
        }
        // Start at the top of the tree
        BlockPos pos = startPos.above(height);
        this.placeLeaves(world, pos, leaves, config);
        pos.below();

        // Add layers of leaves
        for (int i = 0; i < leavesHeight; i++) {
            int trunkWidth = (config.trunkWidth * i / height) + 1;
            int trunkStart = Mth.ceil(0.25D - trunkWidth / 2.0D);
            int trunkEnd = Mth.floor(0.25D + trunkWidth / 2.0D);
            double leavesTaper;
            double multiplier;
            int radius;

            Random rand = new Random();
            double scaleValue = height / 10.0;

            // Add or subtract 1 to scaleValue
            scaleValue += rand.nextBoolean() ? 1 : -1;

            // limit the scaleValue to 5 to ensure max leavesTaper does not exceed 5
            scaleValue = Math.min(scaleValue, 5.0);

            if (i < scaleValue) {
                leavesTaper = (double) i / scaleValue;
            } else {
                leavesTaper = 1 + ((i - scaleValue) / (leavesHeight - scaleValue)) * scaleValue;
            }

            // BETTER SCALING TAPER
//            Random rand = new Random();
//            double scaleValue = height / 10.0;
//
//            // Leaves radius taper
//            // Add or subtract 1 to scaleValue
//            scaleValue += rand.nextBoolean() ? 1 : -1;
//
//            if (i < scaleValue) {
//                leavesTaper = (double) i / scaleValue;
//            } else {
//                leavesTaper = 1 + ((i - scaleValue) / (leavesHeight - scaleValue)) * scaleValue;
//            }

            // MANUAL TAPER
//            if (height < 15) {
//                // For trees with height less than 15
//                multiplier = 1;
//            } else if (height < 25) {
//                // For trees with height in range 15 to 24 inclusive
//                multiplier = 2;
//            } else {
//                // For trees with height equal to or greater than 25
//                multiplier = 4;
//            }
//
//            if (i < 2) {
//                leavesTaper = (double) i / 2;
//            } else {
//                leavesTaper = 1 + ((double)(i - 2) / (leavesHeight - 2)) * multiplier;
//            }

            // ORIGINAL
//            if (i < 2) {
//                leavesTaper = (double) i / 2;
//            } else {
//                leavesTaper = 1 + ((double)(i - 2) / (leavesHeight - 2)) * 4;
//            }

            radius = (int) Math.round(leavesTaper);

            if (radius == 0) {
                this.placeLeaves(world, pos, leaves, config);
            } else if (radius < 2) {
                this.generateLeafLayer(world, random, pos, radius, trunkStart, trunkEnd, leaves, config);
            } else {
                int adjustedRadius = (i % 3 == 0) ? radius / 2 : radius;

                this.generateBranch(world, random, pos, Direction.NORTH, adjustedRadius, logs, leaves, config);
                this.generateBranch(world, random, pos, Direction.EAST, adjustedRadius, logs, leaves, config);
                this.generateBranch(world, random, pos, Direction.SOUTH, adjustedRadius, logs, leaves, config);
                this.generateBranch(world, random, pos, Direction.WEST, adjustedRadius, logs, leaves, config);
            }
            pos = pos.below();
        }

        // Generate the trunk
        for (int x = -config.trunkWidth; x <= config.trunkWidth; x++) {
            for (int z = -config.trunkWidth; z <= config.trunkWidth; z++) {
                int dist = Math.abs(x) + Math.abs(z);

                int heightHere = height - 2;

                // If we're not the center of the trunk on a single trunk width, give up
                if (config.trunkWidth == 1 && dist > 0) {
                    continue;
                }

                // Trunk width scaling
                double[] trunkScaling = new double[]{
                        (0.35 + random.nextDouble() * 0.1),
                        (0.07 + random.nextDouble() * 0.05),
                        (random.nextDouble() * 0.01)
                };

                if (dist >= 1 && dist <= 3) {
                    heightHere = (int) (height * trunkScaling[dist - 1]);
                } else if (dist > 3) {
                    continue;
                }

                heightHere += random.nextInt(2);

                boolean didPlace = false;
                for (int y = 0; y < heightHere; y++) {
                    BlockPos local = startPos.offset(x, y, z);
                    didPlace |= this.placeLog(world, local, logs, config);
                }

                if (didPlace) {
                    // Place dirt 3 blocks below the trunk if no solid block is found
                    for (int y = 1; y < 4; y++) {
                        BlockPos local = startPos.offset(x, -y, z);
                        BlockState state = world.getBlockState(local);
                        if (!state.isSolid() || isDirt(state)) {
                            world.setBlock(local, Blocks.DIRT.defaultBlockState(), 3);
                        }
                    }
                }
            }
        }

        return true;
    }

    public boolean checkSpace(LevelAccessor world, BlockPos pos, int baseHeight, int height, EvergreenTreeConfiguration config) {
        for (int y = 0; y <= height; y++) {
            int trunkWidth = (config.trunkWidth * (height - y) / height) + 1;
            int offset = Mth.ceil(0.25D - trunkWidth / 2.0D);
            int range = y <= baseHeight ? trunkWidth : trunkWidth + 2;
            BlockPos pos1;
            for (int xz = -range / 2; xz <= range / 2; xz++) {
                for(int coord : new int[] {xz+offset,xz-offset}) {
                    pos1 = pos.offset(coord, y, coord);
                    if (pos1.getY() >= 255 || !this.canReplace(world, pos1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void generateLeafLayer(LevelAccessor world, RandomSource rand, BlockPos pos, int leavesRadius, int trunkStart, int trunkEnd, FoliagePlacer.FoliageSetter leaves, EvergreenTreeConfiguration config) {
        int start = trunkStart - leavesRadius;
        int end = trunkEnd + leavesRadius;

        for (int x = start; x <= end; x++) {
            for (int z = start; z <= end; z++) {
                // skip corners
                if ((leavesRadius > 0 ) && (x == start || x == end) && (z == start || z == end)) {
                    continue;
                }
                int distFromTrunk = (x < 0 ? trunkStart - x : x - trunkEnd) + (z < 0 ? trunkStart - z : z - trunkEnd);

                // randomly skip some leaf blocks
                if (distFromTrunk < leavesRadius || (distFromTrunk == leavesRadius && rand.nextInt(100) < 65)) {
                    this.placeLeaves(world, pos.offset(x, 0, z), leaves, config);
                }
            }
        }
    }

    public void generateBranch(LevelAccessor world, RandomSource rand, BlockPos pos, Direction direction, int length, BiConsumer<BlockPos, BlockState> logs, FoliagePlacer.FoliageSetter leaves, EvergreenTreeConfiguration config) {
        Direction.Axis axis = direction.getAxis();
        Direction sideways = direction.getClockWise();

        for (int i = 1; i <= length; i++) {
            int r = (i == 1 || i == length) ? 1 : 2;

            for (int j = -r; j <= r; j++) {
                if (i < length || rand.nextInt(2) == 0) {
                    this.placeLeaves(world, pos.relative(direction, i).relative(sideways, j), leaves, config);
                }
            }

            if (length - i > 2) {
                for (int k = -1; k <= 1; k++) {
                    this.placeLeaves(world, pos.relative(direction, i).above().relative(sideways, k), leaves, config);
                }
                this.placeLog(world, pos.relative(direction, i), axis, logs, config);
            }
        }
    }
}