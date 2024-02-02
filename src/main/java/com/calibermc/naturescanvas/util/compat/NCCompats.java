package com.calibermc.naturescanvas.util.compat;

import net.minecraftforge.fml.ModList;

public class NCCompats {

    public static final boolean BOP;
    public static final boolean CALIBER;
    public static final boolean ICE_AND_FIRE;

    static {
        BOP = ModList.get().isLoaded("biomesoplenty");
        CALIBER = ModList.get().isLoaded("caliber");
        ICE_AND_FIRE = ModList.get().isLoaded("iceandfire");
    }
}

