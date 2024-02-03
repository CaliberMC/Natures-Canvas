package com.calibermc.naturescanvas.crafting;


import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NCRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, NaturesCanvas.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KilnRecipe>> ALLOYING = RECIPE_SERIALIZERS.register("alloying", () -> new KilnRecipe.Serializer<>(KilnRecipe::new));

    private static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, NaturesCanvas.MOD_ID);

    public static final RegistryObject<RecipeType<KilnRecipe>> ALLOYING_TYPE = RECIPE_TYPES.register("alloying", () -> registerRecipeType("alloying"));

    public static <T extends Recipe<?>> RecipeType<T> registerRecipeType(final String identifier) {
        return new RecipeType<>()
        {
            public String toString() {
                return NaturesCanvas.MOD_ID + ":" + identifier;
            }
        };
    }

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
}
