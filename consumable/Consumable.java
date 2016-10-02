/*
 * Copyright (c) 2016, Anthony Anderson
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

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
