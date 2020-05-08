package com.impact.recipes.machines;

import com.impact.item.Core_Items;
import com.impact.item.Core_Items2;
import com.impact.mods.GregTech.GTregister.GT_ItemList;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.util.GT_ModHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.impact.item.Core_List_Items.*;

public class AlloySmelterRecipe implements Runnable {
    final Core_Items CoreItems = Core_Items.getInstance();
    final Core_Items2 CoreItems2 = Core_Items2.getInstance();

    public void run() {
        GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Items.clay_ball, 3, 0), new ItemStack(Blocks.sand, 5, 0), CoreItems2.getRecipe(65, 3), 390, 3);
        GT_Values.RA.addAlloySmelterRecipe(GT_ModHandler.getModItem("IC2", "itemPartIridium", 2L), ItemList.Shape_Mold_Casing.get(0), CoreItems2.getRecipe(52, 3), 1200, 256);
        GT_Values.RA.addAlloySmelterRecipe(GT_ModHandler.getModItem("TConstruct", "CraftedSoil", 1L, 1), ItemList.Shape_Mold_Ingot.get(0), GT_ModHandler.getModItem("TConstruct", "materials", 1L, 2), 130, 3);
        GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Items.clay_ball, 1, 0), ItemList.Shape_Mold_Ingot.get(0), new ItemStack(Items.brick, 1, 0), 130, 3);
        GT_Values.RA.addAlloySmelterRecipe(CoreItems.getRecipe(33, 1), ItemList.Shape_Mold_Ball.get(0), ItemList.Circuit_Parts_Glass_Tube.get(1), 120, 16);

    }
}
