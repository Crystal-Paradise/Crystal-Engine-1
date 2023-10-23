package com.gamer.crystalparadise.entity;

import com.gamer.crystalparadise.CrystalParadise;
import com.gamer.crystalparadise.entity.gem.entities.EntityChabazite;
import com.gamer.crystalparadise.entity.gem.entities.EntityIron;
import com.gamer.crystalparadise.entity.gem.entities.EntityKyanite;
import com.gamer.crystalparadise.entity.gem.entities.EntityPorcelain;
import com.gamer.crystalparadise.entity.gem.other.ModCruxes;
import com.gamer.crystalparadise.item.ModItems;
import com.gempire.Gempire;
import com.gempire.init.AddonHandler;
import com.gempire.init.ModItemProperties;
import com.gempire.systems.injection.GemFormation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.HashMap;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Gempire.MODID);

    public static final RegistryObject<EntityType<EntityKyanite>> KYANITE = ENTITIES.register("kyanite",
            () -> EntityType.Builder.of(EntityKyanite::new, MobCategory.CREATURE)
                    .sized(.75f, 3f) // Hitbox Size
                    //Name of the gem (same as above) and where it will exist
                    .build(new ResourceLocation(CrystalParadise.MODID, "kyanite").toString()));

    public static final RegistryObject<EntityType<EntityPorcelain>> PORCELAIN = ENTITIES.register("porcelain",
            () -> EntityType.Builder.of(EntityPorcelain::new, MobCategory.CREATURE)
                    .sized(.75f, 1.7f) // Hitbox Size
                    //Name of the gem (same as above) and where it will exist
                    .build(new ResourceLocation(CrystalParadise.MODID, "porcelain").toString()));

    public static final RegistryObject<EntityType<EntityIron>> IRON = ENTITIES.register("iron",
            () -> EntityType.Builder.of(EntityIron::new, MobCategory.CREATURE)
                    .sized(.75f, 2.25f) // Hitbox Size
                    //Name of the gem (same as above) and where it will exist
                    .build(new ResourceLocation(CrystalParadise.MODID, "iron").toString()));

    public static final RegistryObject<EntityType<EntityChabazite>> CHABAZITE = ENTITIES.register("chabazite",
            () -> EntityType.Builder.of(EntityChabazite::new, MobCategory.CREATURE)
                    .sized(.75f, 2.25f) // Hitbox Size
                    //Name of the gem (same as above) and where it will exist
                    .build(new ResourceLocation(CrystalParadise.MODID, "chabazite").toString()));

    public static void registerCruxes() {
        //ALL INJECTION
        /*
        //register cruxes
        com.gempire.init.ModEntities.CRUXTOGEM.put("kyanite", ModCruxes.KYANITE_CONDITIONS());
        com.gempire.init.ModEntities.CRUXTOGEM.put("porcelain", ModCruxes.PORCELAIN_CONDITIONS());
        com.gempire.init.ModEntities.CRUXTOGEM.put("iron", ModCruxes.PORCELAIN_CONDITIONS());
        com.gempire.init.ModEntities.CRUXTOGEM.put("chabazite", ModCruxes.PORCELAIN_CONDITIONS());

        //possible to be injected with tier one (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_1.add("kyanite");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("porcelain");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("iron");
        GemFormation.POSSIBLE_GEMS_TIER_1.add("chabazite");
        //possible to be injected with tier two (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_2.add("kyanite");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("porcelain");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("iron");
        GemFormation.POSSIBLE_GEMS_TIER_2.add("chabazite");
        */

        // ------------

        //INCUBATION

        //you need one of these lists for each gem
        ArrayList<Integer> kyaniteEssence = new ArrayList<Integer>();
        //you add two numbers, one for each essence you want
        //1 = pink, 2 = yellow, 3 = blue, 4 = white
        kyaniteEssence.add(4);
        kyaniteEssence.add(4);
        //because kyanite uses all white, it has 4 and 4, one for each slot

        //you need one of these maps for each gem
        HashMap<Item, Integer> kyaniteMap = new HashMap<Item, Integer>();

        //here you list what blocks/items the gem uses
        //make sure you use the Items not the Blocks
        //the number beside it means how valuable it is to the gem
        //1 is the lowest, 4 is the highest,
        //if you have 4 stacks of the 4 block, you will definitely get a perfect gem
        //you can put in as many blocks as you want
        //however, the value beside should only go up to four
        //you can have multiple with the same value though
        kyaniteMap.put(Items.IRON_ORE, 1);
        kyaniteMap.put(Items.NETHER_QUARTZ_ORE, 2);
        kyaniteMap.put(Items.AMETHYST_BLOCK, 3);
        kyaniteMap.put(Items.QUARTZ_BLOCK, 4);

        //this needs to be written for all gem items
        //not including the one in the createIncubatedAddonGem method
        ModItemProperties.makeGem(ModItems.BLUE_KYANITE_GEM.get());
        ModItemProperties.makeGem(ModItems.WHITE_KYANITE_GEM.get());
        ModItemProperties.makeGem(ModItems.YELLOW_KYANITE_GEM.get());
        ModItemProperties.makeGem(ModItems.PINK_KYANITE_GEM.get());
        ModItemProperties.makeGem(ModItems.ORANGE_KYANITE_GEM.get());
        ModItemProperties.makeGem(ModItems.GREEN_KYANITE_GEM.get());
        ModItemProperties.makeGem(ModItems.GRAY_KYANITE_GEM.get());

        //here you need to put the name, one of the gem items
        //the entity and item registry class, if it comes in different colours
        //the amount of time (in .5 of a second so 50 is 25 seconds) youre gem takes
        //then write the list and map, and if it has a prismatic variant or not
        AddonHandler.createIncubatedAddonGem("kyanite", ModItems.BLACK_KYANITE_GEM.get(), ModEntities.class, ModItems.class, true, 50, kyaniteEssence, kyaniteMap, false);
    }

    public static void setAddonGems(){
        //registers entity as a gem
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("kyanite", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("porcelain", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("iron", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("chabazite", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ITEM_REGISTRIES.put("kyanite", ModItems.class);

        AddonHandler.ENTITY_ADDON_ITEM_REGISTRIES.put("porcelain", ModItems.class);

        AddonHandler.ENTITY_ADDON_ITEM_REGISTRIES.put("iron", ModItems.class);

        AddonHandler.ENTITY_ADDON_ITEM_REGISTRIES.put("chabazite", ModItems.class);
    }
}
