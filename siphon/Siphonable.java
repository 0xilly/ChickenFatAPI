package us.illyohs.chickenfat.api.siphon;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.entity.EntityLiving;

import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

import us.illyohs.chickenfat.api.render.IAdditionalRender;

public class Siphonable extends IForgeRegistryEntry.Impl<Siphonable>
{
    float                         maxHunger;
    float                         maxThirst;
    float                         maxStamina;
    float                         maxSpeed;
    Class<? extends EntityLiving> entity;
    IAdditionalRender             overrideRenderer;

    /**
     *
     * @param maxHunger
     * @param maxThirst
     * @param maxStamina real world minutes of work before needing rest
     * @param maxSpeed in mph
     * @param entity
     * @param overrideRenderer
     */
    public Siphonable(@Nonnull float maxHunger, @Nonnull float maxThirst, @Nonnull int maxStamina, @Nonnull int maxSpeed,
                      @Nonnull Class<? extends EntityLiving> entity, @Nullable IAdditionalRender overrideRenderer)
    {
        this.maxHunger        = maxHunger;
        this.maxThirst        = maxThirst;
        this.maxStamina       = maxStamina;
        this.maxSpeed         = maxSpeed;
        this.entity           = entity;
        this.overrideRenderer = overrideRenderer;
    }

    public float getMaxHunger()
    {
        return maxHunger;
    }

    public float getMaxThirst()
    {
        return maxThirst;
    }

    public float getMaxStamina()
    {
        return maxStamina;
    }

    public float getMaxSpeed()
    {
        return maxSpeed;
    }

    public Class<? extends EntityLiving> getEntity()
    {
        return entity;
    }

    public IAdditionalRender getOverrideRenderer()
    {
        return overrideRenderer;
    }
}
