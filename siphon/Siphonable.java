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
