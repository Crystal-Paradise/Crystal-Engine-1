package com.gamer.crystalparadise.entity.gem.entities;

<<<<<<< HEAD
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityGem;
=======
import com.gamer.crystalparadise.CrystalParadise;
import com.gamer.crystalparadise.item.ModItems;
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.bases.EntityVaryingGem;
>>>>>>> origin/master
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityCrawler;
import com.gempire.entities.other.EntityShambler;
import com.gempire.util.Abilities;
import com.gempire.util.GemPlacements;
<<<<<<< HEAD
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;

public class EntityKyanite extends EntityGem {
=======
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class EntityKyanite extends EntityVaryingGem {
>>>>>>> origin/master
    public EntityKyanite(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
<<<<<<< HEAD
                .add(Attributes.MAX_HEALTH, 40.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D);
    }

    @Override
    public Float baseXScale() {
        return .9F;
    }

    @Override
    public Float baseYScale() {
        return 1.0F;
    }

    @Override
    public Float baseZScale() {
        return .9F;
    }

=======
                .add(Attributes.MAX_HEALTH, 50.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.35D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D);
    }

>>>>>>> origin/master
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(7, new FloatGoal(this));
        this.goalSelector.addGoal(6, new PanicGoal(this, 1.1D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 4.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
<<<<<<< HEAD
        this.goalSelector.addGoal(7, new EntityAIWander(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
=======
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIWander(this, 1.0D));
>>>>>>> origin/master
        this.goalSelector.addGoal(7, new EntityAIFollowOwner(this, 1.0D));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityAbomination.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityShambler.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityCrawler.class, 1, false, false, this::checkNotSludged));
<<<<<<< HEAD
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Mob.class, 1, false, false, (p_234199_0_) -> p_234199_0_.getClassification(true) == MobCategory.MONSTER));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.1D, false));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkRebel));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGemGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGemGoal(this));
        this.goalSelector.addGoal(1, new EntityAISludged(this, 0.6));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkBothSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, 1, false, false, this::checkSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityGem.class, 6.0F, 1.0D, 1.2D, this::checkElseSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityCrawler.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityShambler.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityAbomination.class, 6.0F, 1.0D, 1.2D));
    }
    @Override
    public SoundEvent getInstrument()
    {
        return SoundEvents.NOTE_BLOCK_BASS;
    }

    @Override
    public int generateSkinVariant() {
        return this.getGemPlacement() == 11 ? 11 : 0;
=======
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Mob.class, 1, false, false, (p_234199_0_) -> p_234199_0_.getClassification(true) == MobCategory.MONSTER));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkRebel));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.1D, false));
        this.targetSelector.addGoal(2, new OwnerHurtByTargetGemGoal(this));
        this.targetSelector.addGoal(3, new OwnerHurtTargetGemGoal(this));
        this.goalSelector.addGoal(1, new EntityAISludged(this, 0.6));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityGem.class, 1, false, false, this::checkSludged));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, 1, false, false, this::checkSludged));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EntityGem.class, 6.0F, 1.0D, 1.2D, this::checkElseSludged));
    }

    /*@Override
    public String getModID() {
        return CrystalParadise.MODID;
    }*/

    @Override
    public Class getItemRegister() {
        return ModItems.class;
    }

    @Override
    public int[] NeglectedColors() {
        return new int[] {
                2, 3, 5, 8, 9, 10, 12, 14, 16, 17
        };
    }

    @Override
    public boolean UsesUniqueNames() {
        return false;
    }

    @Override
    public String NameFromColor(byte b) {
        return null;
    }

    @Override
    public Float baseXScale() {
        return 1F;
    }

    @Override
    public Float baseYScale() {
        return 1F;
    }

    @Override
    public Float baseZScale() {
        return 1F;
    }

    @Override
    public int generateHardness() {
        return 5;
>>>>>>> origin/master
    }

    @Override
    public GemPlacements[] getPlacements() {
        return new GemPlacements[] {
<<<<<<< HEAD
                GemPlacements.FOREHEAD, GemPlacements.LEFT_EYE, GemPlacements.RIGHT_EYE, GemPlacements.NOSE, GemPlacements.MOUTH, GemPlacements.LEFT_CHEEK, GemPlacements.RIGHT_CHEEK, GemPlacements.CHEST, GemPlacements.BACK, GemPlacements.BELLY,
                GemPlacements.LEFT_SHOULDER, GemPlacements.RIGHT_SHOULDER, GemPlacements.LEFT_ARM, GemPlacements.RIGHT_ARM, GemPlacements.LEFT_HAND, GemPlacements.RIGHT_HAND, GemPlacements.LEFT_PALM, GemPlacements.RIGHT_PALM, GemPlacements.LEFT_THIGH, GemPlacements.RIGHT_THIGH,
                GemPlacements.LEFT_KNEE, GemPlacements.RIGHT_KNEE, GemPlacements.LEFT_ANKLE, GemPlacements.RIGHT_ANKLE };
    }

    @Override
    public int generateHairVariant() {
        return this.random.nextInt(3);
    }

    @Override
    public int generateInsigniaColor() {
        return this.random.nextInt(16);
    }

    @Override
    public int generateOutfitColor() {
        return this.random.nextInt(16);
    }

    @Override
    public boolean hasOutfitPlacementVariant() {
        return true;
    }

    @Override
    public int[] outfitPlacementVariants() {
        return new int[] { 17 };
    }

    public Abilities[] possibleAbilities(){
        return new Abilities[]{
                Abilities.NO_ABILITY, Abilities.TANK, Abilities.BEEFCAKE, Abilities.POWERHOUSE, Abilities.UNHINGED
        };
    }
    public Abilities[] definiteAbilities(){
        return new Abilities[]{
                Abilities.REFINERY, Abilities.TINKERER
        };
    }

    public int generateSkinColorVariant() {
        return 0;
    }

    @Override
    public boolean generateIsEmotional() {
        return true;
    }

    @Override
    public byte EmotionThreshold() {
        return 10;
    }

    public boolean canChangeUniformColorByDefault() {
        return true;
    }

    public boolean canChangeInsigniaColorByDefault(){
        return true;
    }

    @Override
    public boolean fireImmune(){
        return true;
    }

    public boolean hasSkinColorVariant(){
        return false;
    }

    public int generateOutfitVariant() {
        if (getGemPlacement() == 17)
            return 17;
        return this.random.nextInt(4);
    }

    public int generateInsigniaVariant(){
        return this.getOutfitVariant();
    }

    public int generateRebelInsigniaVariant() {
        return this.getRebelOutfitVariant();
    }

    @Override
    public int generateVisorVariant() {
        return this.random.nextInt(4);
    }

    @Override
    public int baseFocus() {
        return 7;
    }

    public int generateHardness() {
        return 2;
    }

    @Override
    public int getColor() {
        return 2;
    }
=======
                GemPlacements.BACK
        };
    }
>>>>>>> origin/master

    @Override
    public int exitHoleSize() {
        return 3;
    }

    @Override
<<<<<<< HEAD
    public ModelPart getArm(HumanoidArm p_102852_) {
        return p_102852_ == HumanoidArm.LEFT ? this.arml : this.armr;
    }
}
=======
    public int generateOutfitVariant() {
        return 0;
    }

    @Override
    public int generateInsigniaVariant() {
        return getOutfitVariant();
    }

    @Override
    public int generateRebelInsigniaVariant() {
        return getRebelOutfitVariant();
    }

    @Override
    public int generateVisorVariant() {
        return 0;
    }

    @Override
    public boolean hasSkinColorVariant() {
        return true;
    }

    @Override
    public boolean generateIsEmotional() {
        return false;
    }

    @Override
    public byte EmotionThreshold() {
        return 0;
    }

    @Override
    public boolean canChangeUniformColorByDefault() {
        return true;
    }

    @Override
    public boolean canChangeInsigniaColorByDefault() {
        return true;
    }

    @Override
    public Abilities[] possibleAbilities() {
        return new Abilities[] {

        };
    }

    @Override
    public Abilities[] definiteAbilities() {
        return new Abilities[] {

        };
    }
}
>>>>>>> origin/master
