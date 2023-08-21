package net.fishdrowned.xvol.items.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class TorberniteSwordItem extends SwordItem {
    public TorberniteSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.POISON, 400), pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 70), pAttacker);
        pAttacker.addEffect(new MobEffectInstance(MobEffects.HUNGER, 30), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
