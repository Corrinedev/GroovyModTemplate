package com.example

import groovy.transform.CompileStatic
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext

import java.util.function.Consumer

@Mod("groovy")
class GMod {
    public static final MODID = "groovy"
    public static IEventBus modEventBus

    GMod() {
        modEventBus = FMLJavaModLoadingContext.get().modEventBus
        Events.init()
        println "init groovy modid = $MODID!"
        MinecraftForge.EVENT_BUS.register(this)
    }

}
