package com.supermanitu.advanceddispensers.proxies;

import com.supermanitu.advanceddispensers.main.AdvancedDispensersBlocks;
import com.supermanitu.advanceddispensers.main.AdvancedDispensersGuiHandler;
import com.supermanitu.advanceddispensers.main.AdvancedDispensersMod;
import com.supermanitu.advanceddispensers.main.AdvancedDispensersTileEntities;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy 
{
    public void preInit(FMLPreInitializationEvent e) 
    {
    	Configuration config = new Configuration(e.getSuggestedConfigurationFile());
    	config.load();
    	new AdvancedDispensersBlocks(config);
    	
    	AdvancedDispensersBlocks.instance().createBlocks();
    	AdvancedDispensersTileEntities.registerTileEntities();
    }

    public void init(FMLInitializationEvent e) 
    {
    	AdvancedDispensersBlocks.instance().addRecipes();
    	NetworkRegistry.INSTANCE.registerGuiHandler(AdvancedDispensersMod.instance, new AdvancedDispensersGuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }
}