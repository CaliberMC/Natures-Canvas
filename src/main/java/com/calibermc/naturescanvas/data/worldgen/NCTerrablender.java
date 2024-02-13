package com.calibermc.naturescanvas.data.worldgen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.world.region.NCOverworldRegionCommon;
import com.calibermc.naturescanvas.world.region.NCOverworldRegionRare;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class NCTerrablender {

    public static void setup() {
        registerRegions();
        registerSurfaceRules();
    }

    public static void registerRegions() {
        Regions.register(new NCOverworldRegionCommon(new ResourceLocation(NaturesCanvas.MOD_ID, "overworld"), 10));
        Regions.register(new NCOverworldRegionRare(new ResourceLocation(NaturesCanvas.MOD_ID, "overworld_rare"), 1));
    }

    public static void registerSurfaceRules() {
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, NaturesCanvas.MOD_ID, NCSurfaceBuilder.overworldRules());
    }
}

