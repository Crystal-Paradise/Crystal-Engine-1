package com.gamer.crystalparadise.entity;

import com.gamer.crystalparadise.CrystalParadise;
import com.gamer.crystalparadise.entity.gem.entities.EntityKyanite;
import com.gamer.crystalparadise.entity.gem.entities.EntityPorcelain;
import com.gempire.Gempire;
import com.gempire.entities.bases.EntityGem;
import com.gempire.init.AddonHandler;
import com.gamer.crystalparadise.entity.gem.other.ModCruxes;
import com.gempire.systems.injection.GemConditions;
import com.gempire.systems.injection.GemFormation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Gempire.MODID);
    public static HashMap<String, GemConditions> CRUXTOGEM = new HashMap<>();

    public static final RegistryObject<EntityType<EntityKyanite>> KYANITE = ENTITIES.register("kyanite",
            () -> EntityType.Builder.of(EntityKyanite::new, MobCategory.CREATURE)
                    .sized(.75f, 3f) // Hitbox Size
                    //Name of the gem (same as above) and where it will exist
                    .build(new ResourceLocation(CrystalParadise.MODID, "kyanite").toString()));


    public static final RegistryObject<EntityType<EntityPorcelain>> PORCELAIN = ENTITIES.register("porcelain",
            () -> EntityType.Builder.of(EntityPorcelain::new, MobCategory.CREATURE)
                    .sized(.75f, 3f) // Hitbox Size
                    //Name of the gem (same as above) and where it will exist
                    .build(new ResourceLocation(CrystalParadise.MODID, "porcelain").toString()));
    public static void registerCruxes() {
        //register cruxes
        ModEntities.CRUXTOGEM.put("kyanite", ModCruxes.KYANITE_CONDITIONS());
        //possible to be injected with tier one (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_1.add("kyanite");
        //possible to be injected with tier two (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_2.add("kyanite");

        //register cruxes
        ModEntities.CRUXTOGEM.put("porcelain", ModCruxes.PORCELAIN_CONDITIONS());
        //possible to be injected with tier one (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_1.add("porcelain");
        //possible to be injected with tier two (can be both)
        GemFormation.POSSIBLE_GEMS_TIER_2.add("porcelain");
    }

    public static void setAddonGems(){
        //registers entity as a gem
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("kyanite", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("porcelain", ModEntities.class);

        AddonHandler.ADDON_ENTITY_REGISTRIES.put("crystalparadise", ModEntities.class);
    }
}
