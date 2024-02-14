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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Random;
import java.util.function.BiConsumer;

public class PineTreeFeature extends NCTreeFeature<EvergreenTreeConfiguration> {
    public PineTreeFeature(Codec<EvergreenTreeConfiguration> codec) {
        super(codec);
    }

    @Override
    protected boolean doPlace(@NotNull WorldGenLevel world, RandomSource random, @NotNull BlockPos startPos, BiConsumer<BlockPos, BlockState> roots, BiConsumer<BlockPos, BlockState> logs, FoliagePlacer.FoliageSetter leaves, TreeConfiguration configBase) {
        EvergreenTreeConfiguration config = (EvergreenTreeConfiguration) configBase;
        HashMap<String, BlockPos> branchPositions = new HashMap<>();

        while (startPos.getY() >= world.getMinBuildHeight()+1 && world.isEmptyBlock(startPos) || world.getBlockState(startPos).is(BlockTags.LEAVES)) {
            startPos = startPos.below();
        }

        // Choose heights
        int height = GeneratorUtil.nextIntBetween(random, config.minHeight, config.maxHeight);
        int baseHeight = GeneratorUtil.nextIntBetween(random, (int) (height * 0.40F), (int) (height * 0.70F));
        int leavesHeight = height - baseHeight;

        if (leavesHeight < 1) {
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

            int radius = 0;
            Random rand = new Random();
            int taperHeight = 3;
            int minRadius = 3;
            int maxRadius = 4;

            for (int r = 0; r < height; r++) {
                if (i < taperHeight) {
                    // Gradually grow from 0 to 2 in the first 3 blocks
                    radius = i;
                } else if (height < 25) {
                    // Randomly vary between 3 and 4 for the rest
                    radius = rand.nextInt((3 - 2) + 1) + 2;
                } else {
                    radius = rand.nextInt((maxRadius - minRadius) + 1) + minRadius;
                }

            }


            // CEDAR START
//            Random rand = new Random();
//            double scaleValue = height / 10.0;
//
//            // Add or subtract 1 to scaleValue
//            scaleValue += rand.nextBoolean() ? 1 : -1;
//            // limit the scaleValue to 5 to ensure max leavesTaper does not exceed 5
//            scaleValue = Math.min(scaleValue, 5.0);
//
//            int minRadius = 2;
//            int maxRadius = 4;
//
//            if (i < scaleValue) {
//                leavesTaper = (double) i / scaleValue;
//                // Calculate radius, going from max at top to min at bottom
//                radius = maxRadius - (int)(leavesTaper * (maxRadius - minRadius));
//            } else {
//                leavesTaper = 1 + ((i - scaleValue) / (leavesHeight - scaleValue)) * scaleValue;
//                // In lower part, radius is constant at minimum value
//                radius = minRadius;
//            }

            // FIR
//            // Add or subtract 1 to scaleValue
//            scaleValue += rand.nextBoolean() ? 1 : -1;
//
//            // limit the scaleValue to 5 to ensure max leavesTaper does not exceed 5
//            scaleValue = Math.min(scaleValue, 5.0);
//
//            if (i < scaleValue) {
//                leavesTaper = (double) i / scaleValue;
//            } else {
//                leavesTaper = 1 + ((i - scaleValue) / (leavesHeight - scaleValue)) * scaleValue;
//            }

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
                int branchLength;

                for (int y = 0; y < heightHere; y++) {
                    BlockPos local = startPos.offset(x, y, z);
                    didPlace |= this.placeLog(world, local, logs, config);

//                    if (dist > 0 && y > 6 && y < (baseHeight - 2) && random.nextInt(15) == 0) { //original
//                    if (y > 6 && y < (baseHeight - 2) && random.nextInt(2) == 0) { //more branches !!!
//                        branchLength = (2 - dist) + 1 + random.nextInt(3); //longer branches
//                        if (dist == 0) {
//                            branchLength = 1 + random.nextInt(1); //shorter branches
//                        }
//                        double theta;
//                        if (x == 0 && z == 0) {
//                            // Prevents bushes originating from the center from generating too low
//                            if (y < 10) {
//                                continue;
//                            }
//
//                            theta = Math.PI * random.nextDouble() * 2;
//                        } else {
//                            // Make sure the branches only go in the same direction of the current trunk position from the center
//                            double angleFromCenter = Math.atan2(x, z);
//
//                            theta = angleFromCenter + (Math.PI * (random.nextDouble() * 0.5 - 0.25));
//                        }
//
//
////                        int branchLength = (3 - dist) + 1 + random.nextInt(3); //longer branches
//
//                        BlockPos branchPos = null;
//                        for (int i = 0; i < branchLength; i++) {
//                            branchPos = local.offset(Mth.floor(Math.cos(theta) * i), i / 2, Mth.floor(Math.sin(theta) * i));
//
//                            this.placeLog(world, branchPos, logs, config);
//                        }
//
//                        this.generateBranchLeaves(logs, leaves, world, random, branchPos, config);
//                    }
                    if (y > 6 && y < (baseHeight - 2) && random.nextInt(2) == 0) {
                        branchLength = (2 - dist) + 1 + random.nextInt(3);
                        if (dist == 0) {
                            branchLength = 1 + random.nextInt(1);
                        }

                        double theta;
                        if (x == 0 && z == 0) {
                            if (y < 10) {
                                continue;
                            }
                            theta = Math.PI * random.nextDouble() * 2;
                        } else {
                            double angleFromCenter = Math.atan2(x, z);
                            theta = angleFromCenter + (Math.PI * (random.nextDouble() * 0.5 - 0.25));
                        }

                        BlockPos branchPos = null;
                        boolean isTooClose = false;

                        // Calculate new branch positions without writing
                        for (int i = 0; i < branchLength; i++) {
                            branchPos = local.offset(Mth.floor(Math.cos(theta) * i), i / 2, Mth.floor(Math.sin(theta) * i));

                            // Checking if the new branchPos is within 2 blocks of previous branch positions
                            for (BlockPos previousBranchPos : branchPositions.values()) {
                                int dx = previousBranchPos.getX() - branchPos.getX();
                                int dy = previousBranchPos.getY() - branchPos.getY();
                                int dz = previousBranchPos.getZ() - branchPos.getZ();
                                if ((dx*dx + dy*dy + dz*dz) < 4) { // 4 = 2^2, because we are checking in a radius of 2 blocks
                                    isTooClose = true;
                                    break;
                                }
                            }

                            if (isTooClose) {
                                break;
                            }
                        }

                        // If new generated branch is not too close to existing branches, add the positions, logs and leaves
                        if (!isTooClose) {
                            for (int i = 0; i < branchLength; i++) {
                                branchPos = local.offset(Mth.floor(Math.cos(theta) * i), i / 2, Mth.floor(Math.sin(theta) * i));
                                this.placeLog(world, branchPos, logs, config);

                                // Save every branch position to check later
                                branchPositions.put( branchPos.toString(), branchPos );
                            }
                            this.generateBranchLeaves(logs, leaves, world, random, branchPos, config);
                        }
                    }

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

    protected boolean generateBranchLeaves(BiConsumer<BlockPos, BlockState> logs, FoliagePlacer.FoliageSetter leaves, LevelAccessor world, RandomSource random, BlockPos pos, EvergreenTreeConfiguration config) {
        int height = 2;

        for (int y = 0; y < height; ++y) {
            // log in the center
            if (height - y > 1) {
                this.placeLog(world, pos.offset(0, y, 0), logs, config);
            }

            //Reduces the radius closer to the top of the bush
            int leavesRadius = (height - y > 1 ? 2 : 1);

            for (int x = -leavesRadius; x <= leavesRadius; ++x) {
                for (int z = -leavesRadius; z <= leavesRadius; ++z) {
                    //Randomly prevent the generation of leaves on the corners of each layer
                    if (Math.abs(x) < leavesRadius || Math.abs(z) < leavesRadius) {
                        if (config.altFoliageProvider.getState(random, pos) != Blocks.AIR.defaultBlockState()) {
                            if (random.nextInt(4) == 0) {
                                this.placeAltLeaves(world, pos.offset(x, y, z), leaves, config);
                            } else {
                                this.placeLeaves(world, pos.offset(x, y, z), leaves, config);
                            }
                        } else {
                            this.placeLeaves(world, pos.offset(x, y, z), leaves, config);
                        }
                    }
                }
            }
        }
        return true;
    }
}
