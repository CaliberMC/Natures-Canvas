package com.calibermc.naturescanvas.worldgen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.worldgen.biome.regions.NCOverworldRegionCommon;
import com.calibermc.naturescanvas.worldgen.biome.regions.NCOverworldRegionRare;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class NCTerrablender {
    public static void registerRegions() {
        Regions.register(new NCOverworldRegionCommon(new ResourceLocation(NaturesCanvas.MOD_ID, "overworld"), 10));
        Regions.register(new NCOverworldRegionRare(new ResourceLocation(NaturesCanvas.MOD_ID, "overworld_rare"), 1));

//        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, NaturesCanvas.MOD_ID, NCSurfaceRules.overworld());
    }
}

