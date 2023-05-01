package com.gamer.crystalparadise.item;

import com.gamer.crystalparadise.CrystalParadise;
import com.gempire.items.ItemGem;
import com.gempire.util.ModItemGroup;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalParadise.MODID);

     public static final RegistryObject<Item> TEST = ITEMS.register("test", () ->
             new Item(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB)));

     public static final RegistryObject<Item> PINK_PORCELAIN = ITEMS.register("pink_porcelain", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB)));
     }


