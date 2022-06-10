package net.thefluffycart.depthsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thefluffycart.depthsmod.SunkenDepthsMod;


public class ModItems {

    public static final Item LUCIFERIN_SACK = registerItem("luciferin_sack",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(SunkenDepthsMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        SunkenDepthsMod.LOGGER.info("Registering Mod Items for depthsmod" + SunkenDepthsMod.MOD_ID);
    }
}
