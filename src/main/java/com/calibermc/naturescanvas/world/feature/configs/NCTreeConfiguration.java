package com.calibermc.naturescanvas.world.feature.configs;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;
import java.util.Optional;

public class NCTreeConfiguration extends TreeConfiguration
{
    public static final Codec<NCTreeConfiguration> CODEC = RecordCodecBuilder.create((builder) -> {
        return builder.group(
                BlockStateProvider.CODEC.fieldOf("trunk_provider").forGetter((instance) -> instance.trunkProvider),
                BlockStateProvider.CODEC.fieldOf("foliage_provider").forGetter((instance) -> instance.foliageProvider),
                BlockStateProvider.CODEC.fieldOf("vine_provider").forGetter((instance) -> instance.vineProvider),
                BlockStateProvider.CODEC.fieldOf("hanging_provider").forGetter((instance) -> instance.hangingProvider),
                BlockStateProvider.CODEC.fieldOf("trunk_fruit_provider").forGetter((instance) -> instance.trunkFruitProvider),
                BlockStateProvider.CODEC.fieldOf("alt_foliage_provider").forGetter((instance) -> instance.altFoliageProvider),
                Codec.INT.fieldOf("min_height").forGetter((instance) -> instance.minHeight),
                Codec.INT.fieldOf("max_height").forGetter((instance) -> instance.maxHeight),
                TreeDecorator.CODEC.listOf().fieldOf("decorators").forGetter(instance -> instance.decorators)
        ).apply(builder, NCTreeConfiguration::new);
    });

    public final BlockStateProvider vineProvider;
    public final BlockStateProvider hangingProvider;
    public final BlockStateProvider trunkFruitProvider;
    public final BlockStateProvider altFoliageProvider;
    public final int minHeight;
    public final int maxHeight;

    protected NCTreeConfiguration(BlockStateProvider trunkProvider, BlockStateProvider foliageProvider, BlockStateProvider vineProvider, BlockStateProvider hangingProvider, BlockStateProvider trunkFruitProvider, BlockStateProvider altFoliageProvider, int minHeight, int maxHeight, List<TreeDecorator> decorators) {

        super(trunkProvider, null, foliageProvider, null, null, null, new TwoLayersFeatureSize(1, 0, 1), decorators, false, false);
//        super(trunkProvider, new StraightTrunkPlacer(
//                        //pBaseHeight, pHeightRandA, pHeightRandB
//                        minHeight, maxHeight, 1), foliageProvider,
//                new BlobFoliagePlacer(ConstantInt.of( //pRadius
//                        2), ConstantInt.of(0), 3), Optional.empty(), BlockStateProvider.simple(Blocks.DIRT), new TwoLayersFeatureSize(1, 0, 1), decorators, true, false);

        this.vineProvider = vineProvider;
        this.hangingProvider = hangingProvider;
        this.trunkFruitProvider = trunkFruitProvider;
        this.altFoliageProvider = altFoliageProvider;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public static class Builder<T extends Builder> {
        protected BlockStateProvider trunkProvider;
        protected BlockStateProvider foliageProvider;
        protected BlockStateProvider vineProvider;
        protected BlockStateProvider hangingProvider;
        protected BlockStateProvider trunkFruitProvider;
        protected BlockStateProvider altFoliageProvider;
        protected List<TreeDecorator> decorators;
        protected int minHeight;
        protected int maxHeight;

        public Builder() {
            this.trunkProvider = BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState());
            this.foliageProvider = BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState());
            this.vineProvider = BlockStateProvider.simple(Blocks.AIR.defaultBlockState());
            this.hangingProvider = BlockStateProvider.simple(Blocks.AIR.defaultBlockState());
            this.trunkFruitProvider = BlockStateProvider.simple(Blocks.AIR.defaultBlockState());
            this.altFoliageProvider = BlockStateProvider.simple(Blocks.AIR.defaultBlockState());
            this.minHeight = 4;
            this.maxHeight = 7;
            this.decorators = Lists.newArrayList();
        }

        public T trunk(BlockStateProvider provider) {
            this.trunkProvider = provider;
            return (T)this;
        }

        public T foliage(BlockStateProvider provider) {
            this.foliageProvider = provider;
            return (T)this;
        }

        public T vine(BlockStateProvider provider) {
            this.vineProvider = provider;
            return (T)this;
        }

        public T hanging(BlockStateProvider provider) {
            this.hangingProvider = provider;
            return (T)this;
        }

        public T trunkFruit(BlockStateProvider provider) {
            this.trunkFruitProvider = provider;
            return (T)this;
        }

        public T altFoliage(BlockStateProvider a) {
            this.altFoliageProvider = a;
            return (T)this;
        }

        public T minHeight(int a) {
            this.minHeight = a;
            return (T)this;
        }

        public T maxHeight(int a) {
            this.maxHeight = a;
            return (T)this;
        }

        public T decorator(TreeDecorator decorator) {
            this.decorators.add(decorator);
            return (T)this;
        }

        public NCTreeConfiguration build() {
            return new NCTreeConfiguration(this.trunkProvider, this.foliageProvider, this.vineProvider, this.hangingProvider, this.trunkFruitProvider, this.altFoliageProvider, this.minHeight, this.maxHeight, this.decorators);
        }
    }
}
