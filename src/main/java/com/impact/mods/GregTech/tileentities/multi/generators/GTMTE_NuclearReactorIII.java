package com.impact.mods.GregTech.tileentities.multi.generators;

import static com.github.technus.tectech.mechanics.constructable.IMultiblockInfoContainer.registerMetaClass;
import static com.github.technus.tectech.mechanics.structure.StructureUtility.ofBlock;
import static com.github.technus.tectech.mechanics.structure.StructureUtility.ofBlockHint;
import static com.impact.loader.ItemRegistery.decorateBlock;

import com.github.technus.tectech.mechanics.alignment.enumerable.ExtendedFacing;
import com.github.technus.tectech.mechanics.constructable.IMultiblockInfoContainer;
import com.github.technus.tectech.mechanics.structure.IStructureDefinition;
import com.github.technus.tectech.mechanics.structure.StructureDefinition;
import com.impact.mods.GregTech.tileentities.hatches.GTMTE_Reactor_Rod_Hatch;
import com.impact.util.MultiBlockTooltipBuilder;
import com.impact.util.Vector3i;
import com.impact.util.Vector3ic;
import gregtech.api.GregTech_API;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.input.Keyboard;

public class GTMTE_NuclearReactorIII extends GTMTE_NuclearReactorBase {

  final Block GENERAL_CASING = GregTech_API.sBlockCasings3;
  final int GENERAL_CASING_META = 12;
  final Block SECOND_CASING = GregTech_API.sBlockCasings8;
  final int SECOND_CASING_META = 1;
  final int TEXTURE_HATCH = 44;

  public GTMTE_NuclearReactorIII(int aID, String aName, String aNameRegional) {
    super(aID, aName, aNameRegional);
    build();
  }

  public GTMTE_NuclearReactorIII(String aName) {
    super(aName);
    build();
  }

  @Override
  public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
    build();
    return new GTMTE_NuclearReactorIII(super.mName);
  }

  @Override
  public String[] getDescription() {
    final MultiBlockTooltipBuilder b = new MultiBlockTooltipBuilder();
    b
        .addInfo("Radiation!")
        .addTypeMachine("Nuclear Reactor")
        .addInfo("A nuclear reactor that consumes water produces steam")
        .addInfo("at temperatures above 50 degrees, it produces superheated steam and")
        .addInfo("emits radiation within a radius of 10 blocks")
        .addInfo("")
        .addSeparator()
        .beginStructureBlock(0, 0, 0)
        .addController()
        .addNuclearRod("Any top middle casing (max x9)")
        .addInputHatch("For Water | Any casing (max x6)")
        .addOutputHatch("For Steam / SH Steam | Any casing (max x24)")
        .addCasingInfo("Radiation Proof Casing")
        .signAndFinalize(": " + EnumChatFormatting.RED + "IMPACT");
    if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
      return b.getInformation();
    } else {
      return b.getStructureInformation();
    }
  }

  public void build() {
    registerMetaClass(
        GTMTE_NuclearReactorIII.class, new IMultiblockInfoContainer<GTMTE_NuclearReactorIII>() {
      //region Structure
      private final IStructureDefinition<GTMTE_NuclearReactorIII> definition =
          StructureDefinition.<GTMTE_NuclearReactorIII>builder()
              .addShape("main", new String[][]{
                  {"         ","    A    ","   AAA   ","   AAA   ","  AAAAA  ","  AA~AA  "},
                  {"  AAAAA  ","  BAAAB  ","  B   B  ","  B   B  "," AB   BA "," AAAAAAA "},
                  {" AEEEEEA "," B     B "," B     B "," B     B ","AB     BA","AAAAAAAAA"},
                  {" AEEEEEA "," A     A ","A       A","A       A","A       A","AAAAAAAAA"},
                  {" AEEEEEA ","AA     AA","A       A","A       A","A       A","AAAAAAAAA"},
                  {" AEEEEEA "," A     A ","A       A","A       A","A       A","AAAAAAAAA"},
                  {" AEEEEEA "," B     B "," B     B "," B     B ","AB     BA","AAAAAAAAA"},
                  {"  AAAAA  ","  BAAAB  ","  B   B  ","  B   B  "," AB   BA "," AAAAAAA "},
                  {"         ","    A    ","   AAA   ","   AAA   ","  AAAAA  ","  AAAAA  "}
              })
              .addElement('A', ofBlock(GENERAL_CASING, GENERAL_CASING_META))
              .addElement('B', ofBlock(SECOND_CASING, SECOND_CASING_META))
              .addElement('E', ofBlockHint(decorateBlock[2], 1))
              .build();
      private final String[] desc = new String[]{
          EnumChatFormatting.RED + "Impact Details:",
          GENERAL_CASING.getLocalizedName(),
          SECOND_CASING.getLocalizedName(),
      };
      //endregion

      @Override
      public void construct(ItemStack stackSize, boolean hintsOnly, GTMTE_NuclearReactorIII tileEntity,
          ExtendedFacing aSide) {
        IGregTechTileEntity base = tileEntity.getBaseMetaTileEntity();
        definition.buildOrHints(tileEntity, stackSize, "main", base.getWorld(), aSide,
            base.getXCoord(), base.getYCoord(), base.getZCoord(),
            4, 5, 0, hintsOnly);
      }

      @Override
      public String[] getDescription(ItemStack stackSize) {
        return desc;
      }
    });
  }



  public boolean checkMachineFunction(IGregTechTileEntity thisController) {
    this.mWrench = true;
    this.mScrewdriver = true;
    this.mSoftHammer = true;
    this.mHardHammer = true;
    this.mSolderingTool = true;
    this.mCrowbar = true;
    boolean checkStructure = true;
    int x, y, z;
    final Vector3ic forgeDirection = new Vector3i(
        ForgeDirection.getOrientation(thisController.getBackFacing()).offsetX,
        ForgeDirection.getOrientation(thisController.getBackFacing()).offsetY,
        ForgeDirection.getOrientation(thisController.getBackFacing()).offsetZ);

    for (x = -4; x <= 4; x++) {
      for (z = 0; z >= -8; z--) {
        if (x == 0 && z == 0) {
          continue;
        }
        if ((x == -4 || x == -3 || x == 3 || x == 4) && (z == 0 || z == -8)) {
          continue;
        }
        if ((x == -4 || x == 4) && (z == -1 || z == -7)) {
          continue;
        }
        final Vector3ic offset = rotateOffsetVector(forgeDirection, x, 0, z);
        IGregTechTileEntity currentTE = thisController
            .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
        if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              == GENERAL_CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
          } else {
            checkStructure = false;
          }
        }
      }
    }

    for (x = -4; x <= 4; x++) {
      for (z = 0; z >= -8; z--) {
        if ((x == -4 || x == -3 || x == 3 || x == 4) && (z == 0 || z == -8)) {
          continue;
        }
        if ((x == -4 || x == 4) && (z == -1 || z == -7)) {
          continue;
        }
        final Vector3ic offset = rotateOffsetVector(forgeDirection, x, 1, z);
        IGregTechTileEntity currentTE = thisController
            .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
        if (((x == -3 || x == 3) && (z == -2 || z == -6)) ||
            ((x == -2 || x == 2) && (z == -1 || z == -7))) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              == SECOND_CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == SECOND_CASING_META)) {
          } else {
            checkStructure = false;
          }
          continue;
        }
        if (x > -4 && x < 4 && z < 0 && z > -8) {
          if ((x == -3 || x == 3) && (z == -1 || z == -7)) {
            if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
              if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
                  == GENERAL_CASING)
                  && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
              } else {
                checkStructure = false;
              }
            }
            continue;
          }
          continue;
        }

        if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              == GENERAL_CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
          } else {
            checkStructure = false;
          }
        }
      }
    }

    for (x = -4; x <= 4; x++) {
      for (z = 0; z >= -8; z--) {
        for (y = 2; y <= 3; y++) {
          if ((x == -4 || x == -3 || x == 3 || x == 4) && (z == 0 || z == -8)) {
            continue;
          }
          if ((x == -4 || x == 4) && (z == -1 || z == -7)) {
            continue;
          }
          if ((x == -2 || x == 2) && (z == 0 || z == -8) ||
              (x == -3 || x == 3) && (z == -1 || z == -7) ||
              (x == -4 || x == 4) && (z == -2 || z == -6)) {
            continue;
          }
          final Vector3ic offset = rotateOffsetVector(forgeDirection, x, y, z);
          IGregTechTileEntity currentTE = thisController
              .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
          if (((x == -3 || x == 3) && (z == -2 || z == -6)) ||
              ((x == -2 || x == 2) && (z == -1 || z == -7))) {
            if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
                == SECOND_CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == SECOND_CASING_META)) {
            } else {
              checkStructure = false;
            }
            continue;
          }
          if (x > -4 && x < 4 && z < 0 && z > -8) {
            if ((x == -3 || x == 3) && (z == -1 || z == -7)) {
              if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
                if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
                    == GENERAL_CASING)
                    && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
                } else {
                  checkStructure = false;
                }
              }
              continue;
            }
            continue;
          }
          if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
            if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
                == GENERAL_CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
            } else {
              checkStructure = false;
            }
          }
        }
      }
    }

    for (x = -4; x <= 4; x++) {
      for (z = 0; z >= -8; z--) {
        if ((x == -4 || x == -3 || x == 3 || x == 4) && (z == 0 || z == -8)) {
          continue;
        }
        if ((x == -4 || x == 4) && (z == -1 || z == -7)) {
          continue;
        }
        if ((x == -2 || x == -1 || x == 1 || x == 2) && (z == 0 || z == -8) ||
            (x == -3 || x == 3) && (z == -1 || z == -7) ||
            (x == -4 || x == 4) && (z == -2 || z == -3 || z == -5 || z == -6)) {
          continue;
        }
        final Vector3ic offset = rotateOffsetVector(forgeDirection, x, 4, z);
        if (((x == -3 || x == 3) && (z == -2 || z == -6)) ||
            ((x == -2 || x == 2) && (z == -1 || z == -7))) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              == SECOND_CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == SECOND_CASING_META)) {
          } else {
            checkStructure = false;
          }
          continue;
        }
        if (x > -3 && x < 3 && z < -1 && z > -7) {
          continue;
        }
        IGregTechTileEntity currentTE = thisController
            .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
        if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              == GENERAL_CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
          } else {
            checkStructure = false;
          }
        }
      }
    }

    for (x = -3; x <= 3; x++) {
      for (z = -1; z >= -7; z--) {
        if ((x == -3 || x == 3) && (z == -1 || z == -7)) {
          continue;
        }
        final Vector3ic offset = rotateOffsetVector(forgeDirection, x, 5, z);
        IGregTechTileEntity currentTE = thisController
            .getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());
        if (x > -3 && x < 3 && z < -1 && z > -7) {
          if (!checkRodHatches(currentTE, TEXTURE_HATCH)) {
            if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
                == GENERAL_CASING)
                && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
            } else {
              checkStructure = false;
            }
          }
          continue;
        }

        if (!addToMachineList(currentTE, TEXTURE_HATCH)) {
          if ((thisController.getBlockOffset(offset.x(), offset.y(), offset.z())
              == GENERAL_CASING)
              && (thisController.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == GENERAL_CASING_META)) {
          } else {
            checkStructure = false;
          }
        }
      }
    }

    return checkStructure;
  }

  @Override
  public String[] getInfoData() {
    float temp = 0;
    for (GTMTE_Reactor_Rod_Hatch rod : mRodHatches) {
      temp += rod.mTemp * 10F;
    }
    return new String[]{
        "Current Temperature: " + EnumChatFormatting.RED + (int) (100F * mCurrentTemp / temp) + " %",
        "Input Water: " + EnumChatFormatting.RED
            + mCurrentOutput + EnumChatFormatting.RESET + " L/t",
        "Output Steam: " + EnumChatFormatting.GREEN + (int)(mCurrentOutput * 160F)
            + EnumChatFormatting.RESET + " L/t"
    };
  }

}