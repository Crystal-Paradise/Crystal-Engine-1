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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;

import javax.swing.text.html.parser.Entity;

public class ModelPorcelain<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("crystalparadise", "porcelain"), "main");
	private final ModelPart Chest;
	private final ModelPart Head;
	private final ModelPart ArmLeft;
	private final ModelPart ArmRight;
	private final ModelPart LegRight;
	private final ModelPart LegLeft;
	private final ModelPart Dress;

	public ModelPorcelain(ModelPart root) {
		this.Chest = root.getChild("Chest");
		this.Head = root.getChild("Head");
		this.ArmLeft = root.getChild("ArmLeft");
		this.ArmRight = root.getChild("ArmRight");
		this.LegRight = root.getChild("LegRight");
		this.LegLeft = root.getChild("LegLeft");
		this.Dress = root.getChild("Dress");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(67, 91).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 3.5F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 24).addBox(-5.0F, -8.0F, -3.0F, 10.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(39, 53).addBox(-8.0F, -9.0F, -1.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(58, 53).addBox(5.0F, -9.0F, -1.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(54, 26).addBox(-2.0F, -9.0F, 5.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 108).addBox(-7.0F, -2.0F, -3.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(26, 108).addBox(5.0F, -2.0F, -3.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(35, 91).addBox(-4.0F, -7.5F, -2.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition ArmLeft = partdefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(58, 0).addBox(-2.3F, -1.0F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F))
		.texOffs(14, 60).addBox(0.0F, 1.7F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(-4.5F, 1.0F, 0.0F));

		PartDefinition ArmRight = partdefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(80, 0).addBox(-1.7F, -1.0F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F))
		.texOffs(26, 60).addBox(-1.0F, 1.7F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(4.5F, 1.0F, 0.0F));

		PartDefinition LegRight = partdefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(113, 85).addBox(-2.4F, -1.9F, -2.5F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(0, 24).addBox(-1.5F, 3.0F, -1.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(2.5F, 13.7F, 0.0F));

		PartDefinition LegLeft = partdefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(97, 85).addBox(-0.6F, 0.1F, -2.5F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(0, 0).addBox(-0.5F, 5.0F, -1.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-2.5F, 11.7F, 0.0F));

		PartDefinition Dress = partdefinition.addOrReplaceChild("Dress", CubeListBuilder.create().texOffs(90, 95).addBox(-5.0F, -16.0F, -5.0F, 10.0F, 16.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(84, 25).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(95, 49).addBox(-3.5F, -14.1F, -3.5F, 7.0F, 12.0F, 6.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.setRotateAngle(Head, headPitch * 0.5f * ((float)Math.PI / 180F), netHeadYaw * .5f * ((float)Math.PI / 180F), 0);
		this.setRotateAngle(ArmLeft, Mth.cos(limbSwing * 0.5F + (float)Math.PI) * limbSwingAmount * 0.8f, 0, 0);
		this.setRotateAngle(ArmRight, Mth.cos(limbSwing * 0.5F)  * limbSwingAmount * 0.8f, 0, 0);
	}

	public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Dress.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getArm(HumanoidArm p_102852_) {
		return p_102852_ == HumanoidArm.LEFT ? this.ArmLeft : this.ArmRight;
	}
}