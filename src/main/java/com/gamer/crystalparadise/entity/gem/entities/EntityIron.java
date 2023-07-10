package com.gamer.crystalparadise.entity.gem.entities;

import com.gamer.crystalparadise.item.ModItems;
import com.gempire.entities.ai.*;
import com.gempire.entities.bases.EntityGem;
import com.gempire.entities.bases.EntityVaryingGem;
import com.gempire.entities.other.EntityAbomination;
import com.gempire.entities.other.EntityCrawler;
import com.gempire.entities.other.EntityShambler;
import com.gempire.util.Abilities;
import com.gempire.util.GemPlacements;
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

public class EntityIron extends EntityVaryingGem {
    public EntityIron(EntityType<? extends PathfinderMob> type, Level worldIn) {
        super(type, worldIn);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 50.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.35D)
                .add(Attributes.ATTACK_DAMAGE, 5.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(7, new FloatGoal(this));
        this.goalSelector.addGoal(6, new PanicGoal(this, 1.1D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 4.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(7, new EntityAIFollowAssigned(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIWander(this, 1.0D));
        this.goalSelector.addGoal(7, new EntityAIFollowOwner(this, 1.0D));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityAbomination.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityShambler.class, 1, false, false, this::checkNotSludged));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, EntityCrawler.class, 1, false, false, this::checkNotSludged));
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
    }

    @Override
    public GemPlacements[] getPlacements() {
        return new GemPlacements[] {
                GemPlacements.FOREHEAD, GemPlacements.LEFT_EYE,
                GemPlacements.RIGHT_EYE, GemPlacements.LEFT_EAR,
                GemPlacements.RIGHT_EAR, GemPlacements.NOSE,
                GemPlacements.LEFT_CHEEK, GemPlacements.RIGHT_CHEEK,
                GemPlacements.MOUTH, GemPlacements.LEFT_SHOULDER,
                GemPlacements.RIGHT_SHOULDER, GemPlacements.CHEST
        };
    }

    @Override
    public int exitHoleSize() {
        return 3;
    }

    @Override
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
            Abilities.NO_ABILITY
        };
    }

    @Override
    public Abilities[] definiteAbilities() {
        return new Abilities[] {
                Abilities.NO_ABILITY
        };
    }
}
