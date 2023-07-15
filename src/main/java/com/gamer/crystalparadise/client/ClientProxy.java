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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientProxy {

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

    }
}
