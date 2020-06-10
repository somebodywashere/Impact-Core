package com.impact;

import com.impact.System.Config;
import com.impact.System.Refstrings;
import com.impact.api.enums.Textures;
import com.impact.loader.MainLoader;
import com.impact.System.CommonProxy;
import com.impact.util.SendUtils;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import com.impact.System.LoginHandler;

import java.io.File;

import static com.impact.System.impactLog.INFO;

@Mod (
		modid = Refstrings.MODID,
        name = Refstrings.NAME,
        version = Refstrings.VERSION,
        dependencies = 
        	"required-after:Forge@[10.13.2.1291,);")

public class impact {
	
	@SidedProxy(clientSide = Refstrings.CLIENTSIDE, serverSide = Refstrings.SERVERSIDE)
    public static CommonProxy proxy;
	
	@Mod.Instance(Refstrings.MODID)
    public static impact instance;
    public static SendUtils SendUtils_instance = new SendUtils();
    public static String ModPackVersion = "1.0 RELEASE";
    public static Config mConfig;


    public impact(){
        Textures.Icons.VOID.name();
    }

    @Mod.EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent) {
        FMLCommonHandler.instance().bus().register(new LoginHandler());
        INFO("LoginHandler Loaded");
    }
	
	@Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        MainLoader.load();
        INFO("MainLoader LOAD Loaded");
    }


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        mConfig = new Config(new File("config/IMPACT/impact.cfg"));
        INFO("Config Loaded");

        MainLoader.preInit();
        INFO("MainLoader PREINIT Loaded ");
        //MainLoader.preInitClient();
    }

	@Mod.EventHandler
    public void PostLoad(FMLPostInitializationEvent PostEvent) {
        MainLoader.postLoad();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postinit) {
        MainLoader.postInit();
    }

    @Mod.EventHandler
    public void Init(FMLPostInitializationEvent init) {
        MainLoader.Init();
    }

    @Mod.EventHandler
    public void onPreLoad(FMLPreInitializationEvent aEvent) {
        MainLoader.onPreLoad();
    }
}
