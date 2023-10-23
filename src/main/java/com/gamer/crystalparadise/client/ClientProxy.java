package com.gamer.crystalparadise.client;

import com.gamer.crystalparadise.CrystalParadise;
import com.gamer.crystalparadise.client.entity.model.ModelChabazite;
import com.gamer.crystalparadise.client.entity.model.ModelIron;
import com.gamer.crystalparadise.client.entity.model.ModelKyanite;
import com.gamer.crystalparadise.client.entity.model.ModelPorcelain;
import com.gamer.crystalparadise.client.entity.render.RenderChabazite;
import com.gamer.crystalparadise.client.entity.render.RenderIron;
import com.gamer.crystalparadise.client.entity.render.RenderKyanite;
import com.gamer.crystalparadise.client.entity.render.RenderPorcelain;
import com.gamer.crystalparadise.entity.ModEntities;
import com.gamer.crystalparadise.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientProxy {

    public static CreativeModeTab CRYSTAL_PARADISE_TAB;

    @Mod.EventBusSubscriber(modid = CrystalParadise.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModBusEvents {


        @SubscribeEvent
        public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(ModEntities.KYANITE.get(), m -> new RenderKyanite(m, new ModelKyanite<>(m.bakeLayer(ModelKyanite.LAYER_LOCATION))));
            event.registerEntityRenderer(ModEntities.PORCELAIN.get(), m -> new RenderPorcelain(m, new ModelPorcelain<>(m.bakeLayer(ModelPorcelain.LAYER_LOCATION))));
            event.registerEntityRenderer(ModEntities.IRON.get(), m -> new RenderIron(m, new ModelIron<>(m.bakeLayer(ModelIron.LAYER_LOCATION))));
            event.registerEntityRenderer(ModEntities.CHABAZITE.get(), m -> new RenderChabazite(m, new ModelChabazite<>(m.bakeLayer(ModelChabazite.LAYER_LOCATION))));
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            //register layers here
            event.registerLayerDefinition(ModelKyanite.LAYER_LOCATION, ModelKyanite::createBodyLayer);
            event.registerLayerDefinition(ModelPorcelain.LAYER_LOCATION, ModelPorcelain::createBodyLayer);
            event.registerLayerDefinition(ModelIron.LAYER_LOCATION, ModelIron::createBodyLayer);
            event.registerLayerDefinition(ModelChabazite.LAYER_LOCATION, ModelChabazite::createBodyLayer);
        }

        @SubscribeEvent
        public static void buildContents(CreativeModeTabEvent.Register event) {
            CRYSTAL_PARADISE_TAB = event.registerCreativeModeTab(new ResourceLocation(CrystalParadise.MODID, "gemtab"),
                    builder -> builder.title(Component.translatable("crystal_paradise.itemGroup.gemtab"))
                            // Set icon of creative tab
                            .icon(() -> new ItemStack(ModItems.PINK_PORCELAIN_GEM.get()))
                            .displayItems((params, populator) -> {
                                populator.accept(ModItems.BLACK_KYANITE_GEM.get());
                                populator.accept(ModItems.BLUE_KYANITE_GEM.get());
                                populator.accept(ModItems.GRAY_KYANITE_GEM.get());
                                populator.accept(ModItems.GREEN_KYANITE_GEM.get());
                                populator.accept(ModItems.PINK_KYANITE_GEM.get());
                                populator.accept(ModItems.YELLOW_KYANITE_GEM.get());
                                populator.accept(ModItems.ORANGE_KYANITE_GEM.get());
                                populator.accept(ModItems.WHITE_KYANITE_GEM.get());

                                populator.accept(ModItems.RED_CHABAZITE_GEM.get());
                                populator.accept(ModItems.PINK_CHABAZITE_GEM.get());
                                populator.accept(ModItems.YELLOW_CHABAZITE_GEM.get());
                                populator.accept(ModItems.ORANGE_CHABAZITE_GEM.get());
                                populator.accept(ModItems.WHITE_CHABAZITE_GEM.get());

                                populator.accept(ModItems.PINK_PORCELAIN_GEM.get());
                                populator.accept(ModItems.YELLOW_PORCELAIN_GEM.get());
                                populator.accept(ModItems.BLUE_PORCELAIN_GEM.get());
                                populator.accept(ModItems.WHITE_PORCELAIN_GEM.get());

                                populator.accept(ModItems.IRON_GEM.get());

                                populator.accept(ModItems.INACTIVE_CHABAZITE_BASE.get());
                                populator.accept(ModItems.INACTIVE_PORCELAIN_BASE.get());
                                populator.accept(ModItems.INACTIVE_KYANITE_BASE.get());
                                populator.accept(ModItems.INACTIVE_IRON_BASE.get());
                            })
                            .build());
        }

    }
}
