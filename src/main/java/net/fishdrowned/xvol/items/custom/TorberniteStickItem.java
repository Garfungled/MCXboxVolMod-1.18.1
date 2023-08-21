package net.fishdrowned.xvol.items.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;

public class TorberniteStickItem extends Item {
    public TorberniteStickItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return super.isBookEnchantable(stack, book);
    }

    @Override
    public void onCraftedBy(ItemStack pStack, Level pLevel, Player pPlayer) {
        pPlayer.addEffect(new MobEffectInstance(MobEffects.POISON, 100));
        super.onCraftedBy(pStack, pLevel, pPlayer);
    }
}
