package net.fishdrowned.xvol.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TORBERNITE = new ForgeTier(3, 1796, 8f, 3f, 22,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TORBERNITE_INGOT.get()));
}
