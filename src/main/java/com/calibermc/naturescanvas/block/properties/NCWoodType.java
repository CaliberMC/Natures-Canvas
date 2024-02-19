package com.calibermc.naturescanvas.block.properties;

import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NCWoodType {

    public static final WoodType CEDAR = WoodType.register(new WoodType(NaturesCanvas.MOD_ID + ":cedar", NCBlockSetType.CEDAR));
    public static final WoodType FIR = WoodType.register(new WoodType(NaturesCanvas.MOD_ID + ":fir", NCBlockSetType.FIR));
    public static final WoodType MAPLE = WoodType.register(new WoodType(NaturesCanvas.MOD_ID + ":maple", NCBlockSetType.MAPLE));
    public static final WoodType PINE = WoodType.register(new WoodType(NaturesCanvas.MOD_ID + ":pine", NCBlockSetType.PINE));

}

