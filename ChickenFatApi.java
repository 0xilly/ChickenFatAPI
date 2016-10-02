package us.illyohs.chickenfat.api;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

import us.illyohs.chickenfat.api.consumable.Consumable;
import us.illyohs.chickenfat.api.siphon.Siphonable;

public class ChickenFatApi
{
    public static IForgeRegistry<Siphonable> SIPHONABEL = GameRegistry.findRegistry(Siphonable.class);
    public static IForgeRegistry<Consumable> CONSUMABLE = GameRegistry.findRegistry(Consumable.class);
}
