package net.fishdrowned.xvol.items.custom;

import net.fishdrowned.xvol.items.ModCreativeModeTab;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.WorldData;
import net.minecraftforge.event.world.WorldEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class ShrodingerCatItem extends Item {
    public ShrodingerCatItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, Player player) {
        Random randGen = new Random();
        int randNum = randGen.nextInt(3);
        if(randNum == 0){
            // False, the cat is dead
            item.hurtAndBreak(1, player, player1 -> player.sendMessage(new TextComponent("Milton died :("), player.getUUID()));
        }else if(randNum == 1){
            //True, the cat is still alive
            player.sendMessage(new TextComponent("Milton is still alive :)"), player.getUUID());
            player.giveExperienceLevels(10);
        }else{
            // Vortex
            player.sendMessage(new TextComponent("This event of Quantum Superposition produced, only for a fraction of a second, a Primordial Black Hole, killing you"), player.getUUID());
            item.hurtAndBreak(1, player, player1 -> player.kill());
        }

        return super.onDroppedByPlayer(item, player);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()){
            pTooltipComponents.add(new TranslatableComponent("tooltip.xvol.shrodinger_cat.tooltip.shift"));
        }else{
            pTooltipComponents.add(new TranslatableComponent("tooltip.xvol.shrodinger_cat.tooltip"));
        }
    }
}
