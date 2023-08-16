package net.fishdrowned.xvol.items;

import net.fishdrowned.xvol.XboxVolMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XboxVolMod.MOD_ID);

    // Gooby Lore
    public static final RegistryObject<Item> GOOBY_UNINTERACTABLE = ITEMS.register("gooby_uninteractable",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static final RegistryObject<Item> WHY_THE_LONG_FAC = ITEMS.register("why_the_long_fac",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RAW_GOOBY = ITEMS.register("raw_gooby",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOOBY_PART = ITEMS.register("gooby_part",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOOBY_PART_H = ITEMS.register("gooby_part_h",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // head
    public static final RegistryObject<Item> GOOBY_LONG_FAC = ITEMS.register("gooby_long_fac",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // long face
    public static final RegistryObject<Item> GOOBY_PART_B = ITEMS.register("gooby_part_b",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // body
    public static final RegistryObject<Item> GOOBY_PART_P = ITEMS.register("gooby_part_p",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // paws


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
