package com.gamer.crystalparadise.client.entity.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;

public class ModelKyanite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("crystalparadise", "kyanite"), "main");
	private final ModelPart Head;
	private final ModelPart Chest;
	private final ModelPart RightArmy;
	private final ModelPart LeftArmy;

	public ModelKyanite(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Chest = root.getChild("Chest");
		this.RightArmy = root.getChild("RightArmy");
		this.LeftArmy = root.getChild("LeftArmy");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(7, 50).addBox(-4.0F, -5.0F, -5.0F, 9.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(84, 75).addBox(-5.0F, -5.5F, -5.6F, 11.0F, 9.5F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition Cone1_r1 = Head.addOrReplaceChild("Cone1_r1", CubeListBuilder.create().texOffs(77, 43).addBox(6.2F, -4.6F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Cone2_r1 = Head.addOrReplaceChild("Cone2_r1", CubeListBuilder.create().texOffs(99, 43).addBox(-10.0F, -5.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition HairThing1_r1 = Head.addOrReplaceChild("HairThing1_r1", CubeListBuilder.create().texOffs(97, 55).addBox(-13.6F, -38.7F, -6.0F, 3.0F, 2.0F, 11.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 42.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition HairThing2_r1 = Head.addOrReplaceChild("HairThing2_r1", CubeListBuilder.create().texOffs(94, 20).addBox(10.1F, -39.2F, -6.0F, 3.0F, 2.0F, 11.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 42.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(44, 18).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(8, 8).addBox(-4.8F, -24.0F, -5.0F, 10.0F, 24.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(46, 95).addBox(-4.3F, -38.0F, -4.0F, 9.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Torso1_r1 = Chest.addOrReplaceChild("Torso1_r1", CubeListBuilder.create().texOffs(91, 0).addBox(-12.0F, -37.0F, -4.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Torso2_r1 = Chest.addOrReplaceChild("Torso2_r1", CubeListBuilder.create().texOffs(7, 74).addBox(4.0F, -37.0F, -4.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition RightArmy = partdefinition.addOrReplaceChild("RightArmy", CubeListBuilder.create().texOffs(11, 99).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -12.0F, 0.0F));

		PartDefinition LeftArmy = partdefinition.addOrReplaceChild("LeftArmy", CubeListBuilder.create().texOffs(25, 99).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.setRotateAngle(Head, headPitch * 0.5f * ((float)Math.PI / 180F), netHeadYaw * .5f * ((float)Math.PI / 180F), 0);
		this.setRotateAngle(LeftArmy, Mth.cos(limbSwing * 0.5F + (float)Math.PI) * limbSwingAmount * 0.8f, 0, 0);
		this.setRotateAngle(RightArmy, Mth.cos(limbSwing * 0.5F)  * limbSwingAmount * 0.8f, 0, 0);
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
		RightArmy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArmy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getArm(HumanoidArm p_102852_) {
		return p_102852_ == HumanoidArm.LEFT ? this.LeftArmy : this.RightArmy;
	}
}