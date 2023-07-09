package com.gamer.crystalparadise.client.entity.render;

import com.gamer.crystalparadise.CrystalParadise;
import com.gamer.crystalparadise.client.entity.model.ModelKyanite;
import com.gamer.crystalparadise.client.entity.model.ModelPorcelain;
import com.gamer.crystalparadise.entity.gem.entities.EntityKyanite;
import com.gamer.crystalparadise.entity.gem.entities.EntityPorcelain;
import com.gempire.client.entity.render.layers.*;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class RenderPorcelain extends MobRenderer<EntityPorcelain, ModelPorcelain<EntityPorcelain>> {

    public RenderPorcelain(EntityRendererProvider.Context renderManagerIn, ModelPorcelain<EntityPorcelain> baseModel) {
        super(renderManagerIn, baseModel, .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        //this.addLayer(new VisorLayer(this));
        this.addLayer(new GemPlacementLayer(this));
        this.addLayer(new ItemInHandLayer(this, renderManagerIn.getItemInHandRenderer()));
    }

    @Override
    protected void scale(EntityPorcelain entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(entitylivingbaseIn.getXScale(), entitylivingbaseIn.getYScale(), entitylivingbaseIn.getZScale());
        super.scale(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityPorcelain entity) {
        return new ResourceLocation(CrystalParadise.MODID + ":textures/entity/porcelain/blank.png");
    }

    @Override
    protected void renderNameTag(EntityPorcelain entityIn, Component displayNameIn, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        super.renderNameTag(entityIn, Component.literal("<"+entityIn.getFacet()+" "+entityIn.getCut()+">"), matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.translate(0.0D, (double)(9.0F * 1.15F * 0.025F), 0.0D);
        if (entityIn.hasCustomName()) {
            super.renderNameTag(entityIn, entityIn.getCustomName(), matrixStackIn, bufferIn, packedLightIn);
        } else {
            super.renderNameTag(entityIn, Component.literal(entityIn.getNickname().getString()), matrixStackIn, bufferIn, packedLightIn);
        }
        super.shadowRadius = 0;
    }
}
