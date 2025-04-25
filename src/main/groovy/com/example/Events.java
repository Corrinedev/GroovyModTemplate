package com.example;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

/**
 *  It's recommended to use Java classes to register events as you don't need to deal with closures (you only need a method qualifier)
 */

public class Events {
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        System.out.println("Groovy Setup");
    }
    static {
        GMod.modEventBus.addListener(Events::onCommonSetup);
    }
    public static void init(){}
}
