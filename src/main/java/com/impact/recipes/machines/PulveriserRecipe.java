package com.impact.recipes.machines;

import com.impact.item.Core_Items;
import com.impact.item.Core_Items2;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;

import static com.impact.item.Core_List_Items.CokeOvenBrick;

public class PulveriserRecipe implements Runnable {
    final Core_Items CoreItems = Core_Items.getInstance();
    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    @Override
    public void run() {

/** ================================= start SPARTAK CORE =================================*/

        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "phobosblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1)}, new int[]{10000, 5000}, 400, 64);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "phobosblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1)}, new int[]{10000, 5000}, 400, 64);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "phobosblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPhobos", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BandedIron, 1)}, new int[]{10000, 5000}, 400, 64);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "deimosblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustDeimos", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Magnesite, 1)}, new int[]{10000, 5000}, 400, 64);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "deimosblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustDeimos", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Magnesite, 1)}, new int[]{10000, 5000}, 400, 64);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ceresblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCeres", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1)}, new int[]{10000, 5000, 2500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ceresblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCeres", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1)}, new int[]{10000, 5000, 2500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europagrunt", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceEuropa", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1)}, new int[]{10000, 5000, 2500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europaunderwatergeyser", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceEuropa", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 2), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 2)}, new int[]{10000, 5000, 2500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europagrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 1)}, new int[]{10000, 5000, 2000}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europageyser", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 2), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 2)}, new int[]{10000, 5000, 3500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ganymedeblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustGanymed", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chromite, 1)}, new int[]{10000, 3500, 1000}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ganymedeblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustGanymed", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chromite, 1)}, new int[]{10000, 3500, 1000}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "callistoblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceCallisto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1)}, new int[]{10000, 5000, 2500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "callistoblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCallisto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1)}, new int[]{10000, 5000, 2500}, 400, 120);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1)}, new int[]{10000, 5000, 2500, 1500}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ash, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1)}, new int[]{10000, 5000, 3000, 2000}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1)}, new int[]{10000, 5000, 2500, 1500}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "venusblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVenus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Scheelite, 1)}, new int[]{10000, 4500, 2500, 1500}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "venusblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVenus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Scheelite, 1)}, new int[]{10000, 4500, 2500, 1500}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ilmenite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1)}, new int[]{10000, 3000, 2000, 1200}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ilmenite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1)}, new int[]{10000, 3000, 2000, 1200}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ilmenite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1)}, new int[]{10000, 3000, 2000, 1200}, 400, 256);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceEnceladus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MysteriousCrystal, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)}, new int[]{10000, 1500, 2000, 1000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEnceladus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)}, new int[]{10000, 3000, 2000, 1000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTitan", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)}, new int[]{10000, 4500, 3000, 2000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTitan", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)}, new int[]{10000, 4500, 3000, 2000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTitan", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)}, new int[]{10000, 4500, 3000, 2000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "oberonblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustOberon", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1)}, new int[]{10000, 2000, 1000, 850}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "oberonblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustOberon", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1)}, new int[]{10000, 2000, 1000, 850}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "oberonblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustOberon", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1)}, new int[]{10000, 2000, 1000, 850}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)}, new int[]{10000, 2500, 1500, 1000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)}, new int[]{10000, 2500, 1500, 1000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)}, new int[]{10000, 2500, 1500, 1000}, 400, 480);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "proteusblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustProteus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)}, new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "proteusblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustProteus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)}, new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "proteusblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustProteus", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Copper, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uraninite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)}, new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)}, new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)}, new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)}, new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)}, new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)}, new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)}, new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 3), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)}, new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 4), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)}, new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 5), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPluto", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)}, new int[]{10000, 5000, 2500, 850}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "makemakegrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMakeMake", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetRed, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetYellow, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)}, new int[]{10000, 2500, 2500, 1000}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "makemakegrunt", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMakeMake", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetRed, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.GarnetYellow, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)}, new int[]{10000, 2500, 2500, 1000}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "haumeablocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustHaumea", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)}, new int[]{10000, 5000, 2500, 850}, 400, 1920);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "acentauribbgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustSurfaceCentauriA", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)}, new int[]{10000, 5000, 3000, 1000}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "acentauribbsubgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCentauriA", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neutronium, 1)}, new int[]{10000, 5000, 3000, 500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "vegabsubgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVegaB", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium235, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium241, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Europium, 1)}, new int[]{10000, 5000, 3000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "vegabgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVegaB", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium235, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium241, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Europium, 1)}, new int[]{10000, 5000, 3000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaEgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaE", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaEsubgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaE", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaFgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaF", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaFsubgrunt", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaF", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, 0), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, 1), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, 2), new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)}, new int[]{10000, 2500, 2000, 1500}, 400, 4096);

        /* ================================= end SPARTAK CORE =================================*/
/** ================================= start CUSTOM RECIPES =================================*/
        GT_Values.RA.addPulveriserRecipe(GregTech_API.getStackofAmountFromOreDict("ingotCokeOvenBrick", 1),   new ItemStack[]{CoreItems.getRecipe(31, 1)}, new int[]{10000}, 300, 2);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("TConstruct", "materials", 1L, 2),   new ItemStack[]{CoreItems.getRecipe(32, 1)}, new int[]{10000}, 300, 2);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("TConstruct", "GlassBlock", 1L, 0),   new ItemStack[]{CoreItems.getRecipe(33, 1)}, new int[]{10000}, 300, 2);

        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 1L),   new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 6L), CoreItems2.getRecipe(151, 1)}, new int[]{10000, 3300}, 600, 2000000);
        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCleaves", 8L),   new ItemStack[]{CoreItems2.getRecipe(152, 1), GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelion3", 1L)}, new int[]{10000, 5000}, 200, 2000000);
        GT_Values.RA.addPulveriserRecipe(CoreItems2.getRecipe(152, 1),   new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "barnardaCdirt", 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 1L)}, new int[]{10000, 2000}, 100, 2000000);

        GT_Values.RA.addPulveriserRecipe(GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 1),   new ItemStack[]{CoreItems.getRecipe(38, 1)}, new int[]{10000}, 300, 2);

        /* ================================= end CUSTOM RECIPES =================================*/
    }
}