package com.runic.gchem;

import com.runic.gchem.data.ModStrings;
import com.runic.gchem.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 17:56.
 */

@Mod(modid = ModStrings.MODID, version = ModStrings.VERSION, name = ModStrings.MODNAME)
public class gchem {
    @Mod.Instance
    public static gchem instance;
    @SidedProxy(serverSide = ModStrings.SERVER_PROXY, clientSide = ModStrings.CLIENT_PROXY, modId = ModStrings.MODID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
