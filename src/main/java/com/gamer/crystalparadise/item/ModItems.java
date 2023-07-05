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

     public static final RegistryObject<Item> YELLOW_PORCELAIN_GEM = ITEMS.register("yellow_porcelain_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));
     public static final RegistryObject<Item> PINK_PORCELAIN_GEM = ITEMS.register("pink_porcelain_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> BLUE_PORCELAIN_GEM = ITEMS.register("blue_porcelain_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> WHITE_PORCELAIN_GEM = ITEMS.register("white_porcelain_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> BLACK_KYANITE_GEM = ITEMS.register("black_kyanite_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> BLUE_KYANITE_GEM = ITEMS.register("blue_kyanite_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> GREEN_KYANITE_GEM = ITEMS.register("green_kyanite_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> GREY_KYANITE_GEM = ITEMS.register("grey_kyanite_gem", () ->
            new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> ORANGE_KYANITE_GEM = ITEMS.register("orange_kyanite_gem", () ->
             new ItemGem(new ItemGem.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

}


