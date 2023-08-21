package net.fishdrowned.xvol.items;

import net.fishdrowned.xvol.XboxVolMod;
import net.fishdrowned.xvol.items.custom.ShrodingerCatItem;
import net.fishdrowned.xvol.items.custom.TorberniteStickItem;
import net.fishdrowned.xvol.items.custom.TorberniteSwordItem;
import net.minecraft.world.item.*;
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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_GOOBY).food(ModFoods.GOOBY_FOOD))); // cat food

    // Shrodinger Lore
    public static final RegistryObject<Item> SHRODINGER_CAT = ITEMS.register("shrodinger_cat",
            () -> new ShrodingerCatItem(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_SHRODINGER).durability(1))); // Shrodinger cat

    // Ore Lore
        //Torbernite
    public static final RegistryObject<Item> TORBERNITE_INGOT = ITEMS.register("torbernite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));
    public static final RegistryObject<Item> RAW_TORBERNITE = ITEMS.register("raw_torbernite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));
    public static final RegistryObject<Item> TORBERNITE_SWORD = ITEMS.register("torbernite_sword",
            () -> new TorberniteSwordItem(ModTiers.TORBERNITE, 3, -2.4f, new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));
    public static final RegistryObject<Item> TORBERNITE_PICKAXE = ITEMS.register("torbernite_pickaxe",
            () -> new PickaxeItem(ModTiers.TORBERNITE, 1, -2.8f, new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));
    public static final RegistryObject<Item> TORBERNITE_AXE = ITEMS.register("torbernite_axe",
            () -> new AxeItem(ModTiers.TORBERNITE, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));
    public static final RegistryObject<Item> TORBERNITE_SHOVEL = ITEMS.register("torbernite_shovel",
            () -> new ShovelItem(ModTiers.TORBERNITE, 1.5f, -3f, new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));
    public static final RegistryObject<Item> TORBERNITE_STICK = ITEMS.register("torbernite_stick",
            () -> new TorberniteStickItem(new Item.Properties().tab(ModCreativeModeTab.XBOXVOL_TAB_ORE)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
