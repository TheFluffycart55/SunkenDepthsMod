package net.thefluffycart.depthsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thefluffycart.depthsmod.SunkenDepthsMod;

public class ModBlocks {

    public static final Block GLOWSHROOM_PLANKS = registerBlock("glowshroom_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group)
    {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SunkenDepthsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group)
    {
        return Registry.register(Registry.ITEM, new Identifier(SunkenDepthsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        SunkenDepthsMod.LOGGER.info("Registering ModBlocks for " + SunkenDepthsMod.MOD_ID);
    }
}
