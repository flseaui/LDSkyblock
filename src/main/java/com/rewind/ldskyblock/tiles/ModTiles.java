package com.rewind.ldskyblock.tiles;

import com.rewind.ldskyblock.LDSkyblock;
import com.rewind.ldskyblock.blocks.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = LDSkyblock.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LDSkyblock.MOD_ID)
public class ModTiles {

    @ObjectHolder("ldskyblock:wood_oven")
    public static TileEntityType<WoodOvenTile> wood_oven_tile;

    @SubscribeEvent
    public static void registerTileEntities(RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().registerAll(
                TileEntityType.Builder.create(WoodOvenTile::new, ModBlocks.wood_oven).build(null).setRegistryName(ModBlocks.wood_oven.getRegistryName())
        );
    }

}
