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

    public static final RegistryObject<Item> WHITE_PORCELAIN_GEM = ITEMS.register("porcelain_gem_0", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> YELLOW_PORCELAIN_GEM = ITEMS.register("porcelain_gem_4", () ->
             new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));
     public static final RegistryObject<Item> PINK_PORCELAIN_GEM = ITEMS.register("porcelain_gem_6", () ->
             new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

     public static final RegistryObject<Item> BLUE_PORCELAIN_GEM = ITEMS.register("porcelain_gem_11", () ->
             new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));


    public static final RegistryObject<Item> WHITE_KYANITE_GEM = ITEMS.register("kyanite_gem_0", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> ORANGE_KYANITE_GEM = ITEMS.register("kyanite_gem_1", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> YELLOW_KYANITE_GEM = ITEMS.register("kyanite_gem_4", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> PINK_KYANITE_GEM = ITEMS.register("kyanite_gem_6", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> GRAY_KYANITE_GEM = ITEMS.register("kyanite_gem_7", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> BLUE_KYANITE_GEM = ITEMS.register("kyanite_gem_11", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> GREEN_KYANITE_GEM = ITEMS.register("kyanite_gem_13", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> BLACK_KYANITE_GEM = ITEMS.register("kyanite_gem_15", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));


    public static final RegistryObject<Item> IRON_GEM = ITEMS.register("iron_gem", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));

    public static final RegistryObject<Item> YELLOW_CHABAZITE_GEM = ITEMS.register("chabazite_gem_0", () ->
            new ItemGem(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB), CrystalParadise.MODID));
}



