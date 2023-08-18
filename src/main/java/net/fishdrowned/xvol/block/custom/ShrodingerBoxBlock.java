package net.fishdrowned.xvol.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class ShrodingerBoxBlock extends Block {
    public ShrodingerBoxBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()){
            if(pEntity instanceof LivingEntity livingEntity){
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.BLINDNESS, 26)));
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 26)));
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 26)));
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.WEAKNESS, 26)));
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.CONFUSION, 26)));
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.HUNGER, 26)));
                livingEntity.addEffect(new MobEffectInstance(new MobEffectInstance(MobEffects.INVISIBILITY, 26)));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
