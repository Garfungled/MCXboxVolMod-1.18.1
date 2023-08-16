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

    public static final RegistryObject<Item> GOOBY = ITEMS.register("gooby_uninteractable",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
