package us.illyohs.chickenfat.api.consumable;

import javax.annotation.Nonnull;

import net.minecraft.entity.EntityLiving;

import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class Consumable extends IForgeRegistryEntry.Impl<Consumable> implements IConsumableType
{

    float                           hunger;
    float                           thirst;
    ConsumableTypes                 type;
    Object                          consumable;
    Class<? extends EntityLiving>[] entities;

    /**
     *
     * @param consumable Must be a block, item or fluids otherwise the mod will crash
     * @param hunger percentage of hunger this fills
     * @param thirst percentage of thrist this fills
     * @param type Is it a food or a drink
     * @param entities the array of entities this consumable will be able to be consumed by
     */
    public Consumable(@Nonnull Object consumable, @Nonnull float hunger, @Nonnull float thirst,
                      @Nonnull ConsumableTypes type, @Nonnull Class<? extends EntityLiving>[] entities)
    {
        this.hunger     = hunger;
        this.thirst     = thirst;
        this.type       = type;
        this.consumable = consumable;
        this.entities  = entities;
    }

    public float getHunger()
    {
        return hunger;
    }

    public float getThirst()
    {
        return thirst;
    }

    public Object getConsumable()
    {
        return consumable;
    }

    public Class<? extends EntityLiving>[] getEntities()
    {
        return entities;
    }

    @Override
    public ConsumableTypes getConsumableTypes()
    {
        return type;
    }
}
