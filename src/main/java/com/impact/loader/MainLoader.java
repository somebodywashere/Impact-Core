package com.impact.loader;

import com.impact.block.blocks.Block_QuantumStuff;
import com.impact.impact;
import com.impact.impact.*;
import com.impact.item.Core_Items;
import com.impact.item.Core_Items2;
import com.impact.item.FakeCircuits;
import com.impact.item.WoodBrickFormTool;
import com.impact.mods.GalacticGreg.SpaceDimRegisterer;
import com.impact.mods.modSolar.ASP;
import com.impact.recipes.AfterGregTechPostLoadRecipes;
import com.impact.util.OreDictRegister;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.network.NetworkRegistry;
import gregtech.api.GregTech_API;
import net.minecraft.item.ItemStack;

import static codechicken.nei.api.API.hideItem;
import static com.impact.System.impactLog.INFO;
import static com.impact.System.impactLog.WARNING;
import static com.impact.item.Core_List_Items.registerOreDictNames;

public class MainLoader {

    private MainLoader() {
    }

    public static void Init() {
        new ItemRegistery();
        ItemRegistery.run();
        INFO("[Init] Item Registery - Loaded");
    }

    public static void preInit() {

        ItemRegistery.GregtechPump();
        INFO("[preInit] Gregtech Pump - Loaded");

        ASP.preInit();
        INFO("[preInit] Solar Panel - Loaded");

        Core_Items.getInstance().registerItem();
        INFO("[preInit] Meta Items 1 - Loaded");

        Core_Items2.getInstance().registerItem();
        INFO("[preInit] Meta Items 2 - Loaded");

        WoodBrickFormTool.getInstance().registerItem();
        INFO("[preInit] Wood Brick Form Tool - Loaded");

        FakeCircuits.getInstance().registerItem();
        INFO("[preInit] Fake Circuits - Loaded");

        registerOreDictNames();
        INFO("[preInit] Meta Items OreDict List - Loaded");

        ItemRegistery.registerBlocks_LSC();
        ItemRegistery.registerBlocks_Sawmill();
        ItemRegistery.registerBlock_IGlass();
        ItemRegistery.registerBlock_Coal();
        ItemRegistery.registerBlock_UtilBlock();
        INFO("[preInit] Meta Blocks - Loaded");

        for (byte i = 0; i <= 7; i++)
            hideItem(new ItemStack(FakeCircuits.getInstance(), 1, i));
        INFO("[preInit] Hide NEI Items - Loaded");
    }

    public static void load() {

        // Register Dimensions in GalacticGregGT5
        if (Loader.isModLoaded("galacticgreg")) {
            SpaceDimRegisterer spaceDimReg = new SpaceDimRegisterer();
            if (spaceDimReg.Init()) {
                spaceDimReg.Register();
                INFO("[load] Space Dimension Register - Loaded");
            }
            WARNING("[load] Space Dimension Register - Not Loaded");
        }

        OreDictRegister.register_all();
        INFO("[load] OreDict Register List - Loaded");

        ASP.load();
        INFO("[load] Solar Panel 2 - Loaded");

        Block_QuantumStuff.run();
        INFO("[load] Quantum Stuff registered");

        impact.proxy.registerRenderInfo();
    }

    public static void onPreLoad() {
    }

    public static void postLoad() {
        addAfterGregTechPostLoadRunner();
        INFO("[postLoad] After GregTech PostLoad Runner - Loaded");
    }

    public static void postInit() {
        NetworkRegistry.INSTANCE.registerGuiHandler(impact.instance, new GUIHandler());
        INFO("[postInit] GUI Handler - Loaded");
    }

//    private static void registerSingleIC2StorageBlocks() {
//        GameRegistry.registerTileEntity(TileEntityGTSU.class, "GTSU_TE");
//        for (int i = 0; i < TierHelper.V.length; i++) {
//            GameRegistry.registerBlock(new GTSUBlock(i), ItemBlockGTSU.class, String.format("GTSU_Tier_%d", i));
//        }
//    }

    public static void addAfterGregTechPostLoadRunner() {
        GregTech_API.sAfterGTPostload.add(() -> new AfterGregTechPostLoadRecipes().run());
    }
}
