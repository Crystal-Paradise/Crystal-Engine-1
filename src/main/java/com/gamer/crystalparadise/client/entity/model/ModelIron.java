package com.gamer.crystalparadise.client.entity.model;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;

import javax.swing.text.html.parser.Entity;

public class ModelIron<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "modelcypiron"), "main");
	private final ModelPart Head;
	private final ModelPart rightarm;
	private final ModelPart leftleg;
	private final ModelPart Body;
	private final ModelPart leftarm;
	private final ModelPart rightleg;
	private final ModelPart Hips;

	public ModelIron(ModelPart root) {
		this.Head = root.getChild("Head");
		this.rightarm = root.getChild("rightarm");
		this.leftleg = root.getChild("leftleg");
		this.Body = root.getChild("Body");
		this.leftarm = root.getChild("leftarm");
		this.rightleg = root.getChild("rightleg");
		this.Hips = root.getChild("Hips");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(1, 45).addBox(-7.0F, -10.5F, -5.0F, 14.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(87, 49).addBox(-5.0F, -9.2F, -6.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(-0.7F))
		.texOffs(6, 75).addBox(-4.0F, -8.2F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(85, 83).addBox(-1.5F, -3.0F, -3.0F, 4.0F, 20.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(8.0F, -0.5F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 102).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 9.0F, 6.0F, new CubeDeformation(-0.5F)), PartPose.offset(-3.5F, 17.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(6, 14).addBox(-6.0F, 0.0F, -5.5F, 12.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(107, 84).addBox(-2.5F, -3.0F, -3.0F, 4.0F, 20.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(-8.0F, -0.5F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(26, 102).addBox(-3.0F, -2.0F, -3.0F, 5.0F, 9.0F, 6.0F, new CubeDeformation(-0.5F)), PartPose.offset(3.5F, 17.0F, 0.0F));

		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(89, 30).addBox(-5.0F, -15.0F, -4.0F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(94, 8).addBox(0.0F, -15.0F, -4.0F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getArm(HumanoidArm p_102852_) {
		return p_102852_ == HumanoidArm.LEFT ? this.leftarm : this.rightarm;
	}
}