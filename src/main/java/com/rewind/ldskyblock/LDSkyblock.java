package com.rewind.ldskyblock;


import com.rewind.ldskyblock.setup.ClientProxy;
import com.rewind.ldskyblock.setup.IProxy;
import com.rewind.ldskyblock.setup.ModSetup;
import com.rewind.ldskyblock.setup.ServerProxy;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.rewind.ldskyblock.LDSkyblock.MOD_ID;

@Mod(MOD_ID)
public class LDSkyblock {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    public LDSkyblock() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        setup.init();
        proxy.init();
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static final String MOD_ID = "ldskyblock";
}
