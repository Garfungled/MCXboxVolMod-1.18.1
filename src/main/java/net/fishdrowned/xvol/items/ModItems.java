package net.fishdrowned.xvol.items;

import net.fishdrowned.xvol.XboxVolMod;
import net.fishdrowned.xvol.items.custom.ShrodingerCatItem;
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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY)));
    public static final RegistryObject<Item> WHY_THE_LONG_FAC = ITEMS.register("why_the_long_fac",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY)));
    public static final RegistryObject<Item> RAW_GOOBY = ITEMS.register("raw_gooby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY)));
    public static final RegistryObject<Item> GOOBY_PART = ITEMS.register("gooby_part",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY)));
    public static final RegistryObject<Item> GOOBY_PART_H = ITEMS.register("gooby_part_h",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY))); // head
    public static final RegistryObject<Item> GOOBY_LONG_FAC = ITEMS.register("gooby_long_fac",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY))); // long face
    public static final RegistryObject<Item> GOOBY_PART_B = ITEMS.register("gooby_part_b",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY))); // body
    public static final RegistryObject<Item> GOOBY_PART_P = ITEMS.register("gooby_part_p",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY))); // paws
    public static final RegistryObject<Item> GOOBY_FOOD = ITEMS.register("gooby_food",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY).food(ModFoods.GOOBY_FOOD)));

    //Shrodinger Lore
    public static final RegistryObject<Item> SHRODINGER_CAT = ITEMS.register("shrodinger_cat",
            () -> new ShrodingerCatItem(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_SHRODINGER).durability(1))); // Shrodinger cat


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
