package com.example

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@net.minecraftforge.fml.common.Mod("groovy")
class Mod {
    public static final MODID = "groovy"
    public static IEventBus modEventBus

    Mod() {
        modEventBus = FMLJavaModLoadingContext.get().modEventBus
        modEventBus.addListener(this.onCommonSetup.run())
        println "init groovy modid = $MODID!"
        MinecraftForge.EVENT_BUS.register(this)
    }

    def onCommonSetup = {
        FMLCommonSetupEvent event ->
                println "init groovy modid = $MODID!"
            }
}
