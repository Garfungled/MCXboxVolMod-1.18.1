package net.fishdrowned.xvol.block;

import net.fishdrowned.xvol.XboxVolMod;
import net.fishdrowned.xvol.block.custom.ShrodingerBoxBlock;
import net.fishdrowned.xvol.items.ModCreativeModeTab;
import net.fishdrowned.xvol.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, XboxVolMod.MOD_ID);



    // Gooby Lore
    public static final RegistryObject<Block> GOOBY_BLOCK = registerBlock("gooby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> GOOBY_STAIRS = registerBlock("gooby_stairs",
            () -> new StairBlock(()-> ModBlocks.GOOBY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> GOOBY_SLAB = registerBlock("gooby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> GOOBY_FENCE = registerBlock("gooby_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> GOOBY_FENCE_GATE = registerBlock("gooby_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> GOOBY_WALL = registerBlock("gooby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);

    public static final RegistryObject<Block> GOOBY_ORE = registerBlock("gooby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> DEEPSLATE_GOOBY_ORE = registerBlock("deepslate_gooby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> ENDSTONE_GOOBY_ORE = registerBlock("endstone_gooby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);
    public static final RegistryObject<Block> NETHERRACK_GOOBY_ORE = registerBlock("netherrack_gooby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_GOOBY);

    // Shrodinger Lore
    public static final RegistryObject<Block> SHRODINGER_BOX_BLOCK = registerBlock("shrodinger_box_block",
            () -> new ShrodingerBoxBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_SHRODINGER);

    // Ore Lore
    public static final RegistryObject<Block> RAW_TORBERNITE_BLOCK = registerBlock("raw_torbernite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_ORE);
    public static final RegistryObject<Block> TORBERNITE_BLOCK = registerBlock("torbernite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_ORE);
    public static final RegistryObject<Block> TORBERNITE_ORE = registerBlock("torbernite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.XBOXVOL_TAB_ORE);


    // Registries
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
