package com.gamer.crystalparadise.entity;

import com.gamer.crystalparadise.CrystalParadise;
import com.gamer.crystalparadise.entity.gem.entities.EntityChabazite;
import com.gamer.crystalparadise.entity.gem.entities.EntityIron;
import com.gamer.crystalparadise.entity.gem.entities.EntityKyanite;
import com.gamer.crystalparadise.entity.gem.entities.EntityPorcelain;
import com.gamer.crystalparadise.entity.gem.other.ModCruxes;
import com.gempire.Gempire;
import com.gempire.init.AddonHandler;
import com.gempire.systems.injection.GemFormation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    }

    public static void setAddonGems(){
        //registers entity as a gem
        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("kyanite", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("porcelain", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("iron", ModEntities.class);

        AddonHandler.ENTITY_ADDON_ENTITY_REGISTRIES.put("chabazite", ModEntities.class);

        AddonHandler.ADDON_ENTITY_REGISTRIES.put("crystalparadise", ModEntities.class);
    }
}
