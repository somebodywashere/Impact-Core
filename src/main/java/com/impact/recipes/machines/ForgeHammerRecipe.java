package com.impact.recipes.machines;

import com.impact.item.Core_Items;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.util.GT_ModHandler;

import static com.impact.item.Core_List_Items.*;

public class ForgeHammerRecipe implements Runnable{
    @Override
    public void run(){

        final Core_Items CoreItems = Core_Items.getInstance();

        GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("TConstruct", "GlassBlock", 1L, 0), CoreItems.getRecipe(33, 1), 40, 16);

    }
}