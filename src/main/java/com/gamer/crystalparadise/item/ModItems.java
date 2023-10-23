package com.gamer.crystalparadise.item;

import com.gamer.crystalparadise.CrystalParadise;
import com.gempire.items.ItemGem;
import com.gempire.items.ItemGemBase;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalParadise.MODID);

    public static final RegistryObject<Item> WHITE_PORCELAIN_GEM = ITEMS.register("porcelain_gem_0", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

     public static final RegistryObject<Item> YELLOW_PORCELAIN_GEM = ITEMS.register("porcelain_gem_4", () ->
             new ItemGem(new Item.Properties(), CrystalParadise.MODID));
     public static final RegistryObject<Item> PINK_PORCELAIN_GEM = ITEMS.register("porcelain_gem_6", () ->
             new ItemGem(new Item.Properties(), CrystalParadise.MODID));

     public static final RegistryObject<Item> BLUE_PORCELAIN_GEM = ITEMS.register("porcelain_gem_11", () ->
             new ItemGem(new Item.Properties(), CrystalParadise.MODID));


    public static final RegistryObject<Item> WHITE_KYANITE_GEM = ITEMS.register("kyanite_gem_0", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> ORANGE_KYANITE_GEM = ITEMS.register("kyanite_gem_1", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> YELLOW_KYANITE_GEM = ITEMS.register("kyanite_gem_4", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> PINK_KYANITE_GEM = ITEMS.register("kyanite_gem_6", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> GRAY_KYANITE_GEM = ITEMS.register("kyanite_gem_7", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> BLUE_KYANITE_GEM = ITEMS.register("kyanite_gem_11", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> GREEN_KYANITE_GEM = ITEMS.register("kyanite_gem_13", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> BLACK_KYANITE_GEM = ITEMS.register("kyanite_gem_15", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));


    public static final RegistryObject<Item> IRON_GEM = ITEMS.register("iron_gem", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));


    public static final RegistryObject<Item> WHITE_CHABAZITE_GEM = ITEMS.register("chabazite_gem_0", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> ORANGE_CHABAZITE_GEM = ITEMS.register("chabazite_gem_1", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> YELLOW_CHABAZITE_GEM = ITEMS.register("chabazite_gem_4", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> PINK_CHABAZITE_GEM = ITEMS.register("chabazite_gem_6", () ->
            new ItemGem(new Item.Properties(), CrystalParadise.MODID));

    public static final RegistryObject<Item> RED_CHABAZITE_GEM = ITEMS.register("chabazite_gem_14", () ->
            new ItemGemBase(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> INACTIVE_CHABAZITE_BASE = ITEMS.register("inactive_chabazite_base", () ->
            new ItemGemBase(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> INACTIVE_PORCELAIN_BASE = ITEMS.register("inactive_porcelain_base", () ->
            new ItemGemBase(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> INACTIVE_IRON_BASE = ITEMS.register("inactive_iron_base", () ->
            new ItemGemBase(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> INACTIVE_KYANITE_BASE = ITEMS.register("inactive_kyanite_base", () ->
            new ItemGemBase(new Item.Properties().stacksTo(1)));
}



