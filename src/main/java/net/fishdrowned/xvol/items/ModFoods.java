package net.fishdrowned.xvol.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GOOBY_FOOD = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.6F).effect(new MobEffectInstance(MobEffects.CONFUSION, 600), 0.3f).meat().fast().build();
}
