package com.rewind.ldskyblock.blocks;

import com.rewind.ldskyblock.LDSkyblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = LDSkyblock.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LDSkyblock.MOD_ID)
public class ModBlocks {

    @ObjectHolder("ldskyblock:sprout_block")
    public static SproutBlock sprout_block;

    @ObjectHolder("ldskyblock:wood_oven")
    public static WoodOven wood_oven;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new SproutBlock(),
                new WoodOven()
        );
    }

}
