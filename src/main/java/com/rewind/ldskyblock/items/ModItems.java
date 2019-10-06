package com.rewind.ldskyblock.items;

import com.rewind.ldskyblock.LDSkyblock;
import com.rewind.ldskyblock.blocks.ModBlocks;
import com.rewind.ldskyblock.setup.ModSetup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = LDSkyblock.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LDSkyblock.MOD_ID)
public class ModItems {

    @ObjectHolder("ldskyblock:sprout")
    public static final Item sprout = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties().maxStackSize(64).group(ModSetup.itemGroup)).setRegistryName(LDSkyblock.MOD_ID, "sprout"),

                new BlockItem(ModBlocks.sprout_block, new Item.Properties().group(ModSetup.itemGroup)).setRegistryName(ModBlocks.sprout_block.getRegistryName()),
                new BlockItem(ModBlocks.wood_oven, new Item.Properties().group(ModSetup.itemGroup)).setRegistryName(ModBlocks.wood_oven.getRegistryName())
        );
    }

}
