package com.technici4n.cleverfactories;

import com.sun.javafx.beans.annotations.NonNull;
import com.technici4n.cleverfactories.handler.EventHandlerCF;
import com.technici4n.cleverfactories.init.ModBlocks;
import com.technici4n.cleverfactories.init.ModItems;
import com.technici4n.cleverfactories.init.ModTileEntities;
import com.technici4n.cleverfactories.proxy.CommonProxy;
import com.technici4n.cleverfactories.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION )
public class CleverFactories
{
    // Instance
    @NonNull
    public static CleverFactories INSTANCE;

    // Sided proxy
    @SidedProxy( serverSide = Reference.PATH_PROXY_COMMON, clientSide = Reference.PATH_PROXY_CLIENT )
    public static CommonProxy proxy;

    // Mod entry points
    @Mod.EventHandler
    public void preInit( FMLPreInitializationEvent event )
    {
        INSTANCE = this;

        ModBlocks.init();
        ModItems.init();
        proxy.registerEntities();
    }

    @Mod.EventHandler
    public void init( FMLInitializationEvent event )
    {
        proxy.registerSpecialRenders();
        proxy.registerEntityRenders();
        ModTileEntities.init();

        MinecraftForge.EVENT_BUS.register( new EventHandlerCF() );
    }

    @Mod.EventHandler
    public void postInit( FMLPostInitializationEvent event )
    {

    }
}
