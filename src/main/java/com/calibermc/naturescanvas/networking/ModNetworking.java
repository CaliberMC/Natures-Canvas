package com.calibermc.naturescanvas.networking;

import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModNetworking {

    public static SimpleChannel INSTANCE;
    private static int id = 0;

    public static void registerMessages() {
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(NaturesCanvas.MOD_ID, "network"), () -> "1.0", s -> true, s -> true);
    }
}

