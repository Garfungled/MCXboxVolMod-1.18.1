package net.fishdrowned.xvol.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab XBOXVOL_TAB_GOOBY = new CreativeModeTab("xboxvol_tab_gooby") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GOOBY_UNINTERACTABLE.get());
        }
    };

    public static final CreativeModeTab XBOXVOL_TAB_SHRODINGER = new CreativeModeTab("xboxvol_tab_shrodinger") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHRODINGER_CAT.get());
        }
    };

    public static final CreativeModeTab XBOXVOL_TAB_ORE = new CreativeModeTab("xboxvol_tab_ore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TORBERNITE_INGOT.get());
        }
    };
}
