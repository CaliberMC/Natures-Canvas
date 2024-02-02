package com.calibermc.naturescanvas.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class NCClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Configs for NaturesCanvas Mod");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
