package net.loonlord32.gaiasphere.items;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties GRAPES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).fast().build();
    public static final FoodProperties OLIVES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).fast().build();

}
