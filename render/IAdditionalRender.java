package us.illyohs.chickenfat.api.render;

import javax.annotation.Nonnull;

import net.minecraft.util.EnumFacing;

public interface IAdditionalRender
{
    void addRender(@Nonnull Double x, @Nonnull Double y, @Nonnull Double z, @Nonnull EnumFacing facing, @Nonnull float tick);
}
