package com.calibermc.naturescanvas.util.compat;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.naturescanvas.data.NCBlockFamilies;

import java.util.ArrayList;

public class BuildifyBlockPicker {

    public static void init() {
        for (ModBlockFamily modBlockFamily : NCBlockFamilies.getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }
}

