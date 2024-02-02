package com.calibermc.naturescanvas.util.worldgen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.worldgen.placement.NCOrePlacement;
import com.calibermc.naturescanvas.worldgen.placement.NCTreePlacement;
import com.calibermc.naturescanvas.worldgen.placement.NCVegetationPlacement;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class NCPlacementUtils {
    public static void bootstrap(BootstapContext<PlacedFeature> context)
    {
        NCOrePlacement.bootstrap(context);
        NCTreePlacement.bootstrap(context);
        NCVegetationPlacement.bootstrap(context);
    }

    public static ResourceKey<PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(NaturesCanvas.MOD_ID, name));
    }
}


