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
}
