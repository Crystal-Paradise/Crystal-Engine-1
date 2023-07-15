package com.gamer.crystalparadise.client.entity.model;// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public final class ModelChabazite <T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "chabazite"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Head;
	private final ModelPart WIngs;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Torso;

	public ModelChabazite(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Head = root.getChild("Head");
		this.WIngs = root.getChild("WIngs");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Torso = root.getChild("Torso");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 8.0F, 0.0F));

		PartDefinition Right_leg_r1 = RightLeg.addOrReplaceChild("Right_leg_r1", CubeListBuilder.create().texOffs(74, 111).addBox(1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 110).addBox(0.0F, -17.0F, -3.0F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 16.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 8.0F, 0.0F));

		PartDefinition Left_Leg_r1 = LeftLeg.addOrReplaceChild("Left_Leg_r1", CubeListBuilder.create().texOffs(86, 111).addBox(-3.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(79, 33).addBox(-4.0F, -17.0F, -3.0F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 16.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(87, 2).addBox(-5.0F, -43.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(37, 1).addBox(-6.0F, -44.0F, -6.0F, 12.0F, 11.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(98, 44).addBox(-8.0F, -36.0F, -6.0F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(99, 61).addBox(6.0F, -36.0F, -6.0F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Horse_Hair_r1 = Head.addOrReplaceChild("Horse_Hair_r1", CubeListBuilder.create().texOffs(57, 82).addBox(-3.0F, -43.0F, -22.0F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 33.0F, 0.0F, 2.9671F, 0.0F, -3.1416F));

		PartDefinition WIngs = partdefinition.addOrReplaceChild("WIngs", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 3.0F));

		PartDefinition Wing_2_r1 = WIngs.addOrReplaceChild("Wing_2_r1", CubeListBuilder.create().texOffs(0, 100).addBox(-25.0F, -35.0F, -4.0F, 24.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.0F, -3.0F, 3.1416F, -0.0873F, 3.0543F));

		PartDefinition Wing_1_r1 = WIngs.addOrReplaceChild("Wing_1_r1", CubeListBuilder.create().texOffs(0, 77).addBox(3.0F, -35.0F, -4.0F, 24.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.0F, -3.0F, -3.1416F, 0.0436F, -3.0543F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, -9.0F, 0.0F));

		PartDefinition Left_Arm_r1 = LeftArm.addOrReplaceChild("Left_Arm_r1", CubeListBuilder.create().texOffs(113, 108).addBox(-6.0F, -33.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 33.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, -9.0F, 0.0F));

		PartDefinition Right_Arm_r1 = RightArm.addOrReplaceChild("Right_Arm_r1", CubeListBuilder.create().texOffs(100, 108).addBox(4.0F, -33.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 33.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition Dress_r1 = Torso.addOrReplaceChild("Dress_r1", CubeListBuilder.create().texOffs(37, 31).addBox(-5.0F, -21.0F, -4.0F, 10.0F, 17.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(98, 81).addBox(-4.0F, -33.0F, -3.0F, 8.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		WIngs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}