package com.calibermc.naturescanvas.util.biome;

import net.minecraft.util.RandomSource;

public class GeneratorUtil {

    public static int nextIntBetween(RandomSource rand, int a, int b)
    {
        if (a == b) {return a;}
        int min = a < b ? a : b;
        int max = a > b ? a : b;
        return min + rand.nextInt(1 + max - min);
    }
}


