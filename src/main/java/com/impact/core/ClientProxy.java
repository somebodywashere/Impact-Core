package com.impact.core;

import com.impact.client.key.KeyBindings;
import com.impact.client.render.BlockHint;
import com.impact.client.render.PlacedItemRenderer;
import com.impact.client.render.TESR_SETether;
import com.impact.client.render.TESR_SpaceElevatorTether;
import com.impact.common.block.QuantumStuffRender;
import com.impact.common.block.blocks.Block_QuantumStuff;
import com.impact.common.te.TE_NqTether;
import com.impact.common.te.TE_SpaceElevatorTether;
import com.impact.common.te.TilePlacedItem;
import com.impact.events.ClientEvent;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

  public static Minecraft mc = FMLClientHandler.instance().getClient();

  public static void register_event(Object obj) {
    FMLCommonHandler.instance().bus().register(obj);
    MinecraftForge.EVENT_BUS.register(obj);
  }

  @Override
  public void registerRenderInfo() {
    Block_QuantumStuff.renderID = RenderingRegistry.getNextAvailableRenderId();
    RenderingRegistry.registerBlockHandler(Block_QuantumStuff.renderID, new QuantumStuffRender());
    ClientRegistry.bindTileEntitySpecialRenderer(TE_NqTether.class, new TESR_SETether());
    ClientRegistry.bindTileEntitySpecialRenderer(TE_SpaceElevatorTether.class, new TESR_SpaceElevatorTether());
    ClientRegistry.bindTileEntitySpecialRenderer(TilePlacedItem.class, new PlacedItemRenderer());
    register_event(new ClientEvent());
  }
  
  @Override
  public void hint_particle(World w, int x, int y, int z, Block block, int meta) {
    Minecraft.getMinecraft().effectRenderer.addEffect(new BlockHint(w, x, y, z, block, meta));
  }
  
  @Override
  public void hint_particle(World w, int x, int y, int z, Block block, int meta, int age) {
    Minecraft.getMinecraft().effectRenderer.addEffect(new BlockHint(w, x, y, z, age, block, meta));
  }
  
  @Override
  public void hint_particle(World w, int x, int y, int z, double xx, double yy, double zz, Block block, int meta, int age) {
    Minecraft.getMinecraft().effectRenderer.addEffect(new BlockHint(w, x, y, z, xx, yy, zz, age, block, meta));
  }

  @Override
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return null;
  }

  @Override
  public World getClientWorld() {
    return FMLClientHandler.instance().getClient().theWorld;
  }

  public void postInit() {
  }

  public void init() {
  }

  public void preInit() {
    KeyBindings.init();
  }
}
