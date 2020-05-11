package com.impact.mods.modChest.BASE;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

@SideOnly(Side.CLIENT)
public class ItemRenderBase implements IItemRenderer {
    private static TE_BaseChest TE;

    public ItemRenderBase() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (type == ItemRenderType.ENTITY)
            Renderer_BaseChest.instance.renderTileEntityAt(TE, -0.5F, -0.5F, -0.5F, 0);
        else
            Renderer_BaseChest.instance.renderTileEntityAt(TE, 0, 0, 0, 0);
    }
}
