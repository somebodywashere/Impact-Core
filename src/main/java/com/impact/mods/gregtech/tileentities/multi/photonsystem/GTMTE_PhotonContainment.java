package com.impact.mods.gregtech.tileentities.multi.photonsystem;

import com.github.technus.tectech.mechanics.alignment.enumerable.ExtendedFacing;
import com.github.technus.tectech.mechanics.constructable.IMultiblockInfoContainer;
import com.github.technus.tectech.mechanics.structure.IStructureDefinition;
import com.github.technus.tectech.mechanics.structure.StructureDefinition;
import com.impact.impact;
import com.impact.loader.ItemRegistery;
import com.impact.mods.gregtech.blocks.Casing_Helper;
import com.impact.mods.gregtech.tileentities.multi.implement.GT_MetaTileEntity_MultiParallelBlockBase;
import com.impact.util.Utilits;
import com.impact.util.string.MultiBlockTooltipBuilder;
import com.impact.util.vector.Vector3i;
import com.impact.util.vector.Vector3ic;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Recipe;
import net.minecraft.block.Block;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.input.Keyboard;

import java.util.HashSet;

import static com.github.technus.tectech.mechanics.constructable.IMultiblockInfoContainer.registerMetaClass;
import static com.github.technus.tectech.mechanics.structure.StructureUtility.ofBlock;
import static com.github.technus.tectech.mechanics.structure.StructureUtility.ofBlockHint;
import static gregtech.api.enums.GT_Values.E;
import static gregtech.api.enums.GT_Values.RES_PATH_GUI;
import static net.minecraft.util.EnumChatFormatting.*;

public class GTMTE_PhotonContainment extends GT_MetaTileEntity_MultiParallelBlockBase {

    public static final GT_Recipe.GT_Recipe_Map sPhotonContainer = new GT_Recipe.GT_Recipe_Map(
            new HashSet<>(1000),
            "impact.recipe.photoncontainer",
            "Photon Containment",
            null,
            RES_PATH_GUI + "basic/PhotonContainment",
            1, 1, 1, 0,
            1, E, 1, E, false, false
    );

    public static Block CASING = Casing_Helper.sCaseCore2;
    public static byte CASING_META = 15;
    ITexture INDEX_CASE = Textures.BlockIcons.casingTexturePages[3][CASING_META + 16];
    int CASING_TEXTURE_ID = CASING_META + 16 + 128 * 3;

    public int mPhotonsStable = 0;

    //region Register
    public GTMTE_PhotonContainment(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
        run();
    }

    public GTMTE_PhotonContainment(String aName) {
        super(aName);
        run();
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        run();
        return new GTMTE_PhotonContainment(this.mName);
    }
    //endregion

    @Override
    public ITexture[] getTexture(final IGregTechTileEntity aBaseMetaTileEntity, final byte aSide,
                                 final byte aFacing, final byte aColorIndex, final boolean aActive, final boolean aRedstone) {
        return aSide == aFacing ? new ITexture[]{INDEX_CASE,
                new GT_RenderedTexture(aActive ? Textures.BlockIcons.MP1a : Textures.BlockIcons.MP1)}
                : new ITexture[]{INDEX_CASE};
    }

    @Override
    public Object getClientGUI(int aID, InventoryPlayer aPlayerInventory, IGregTechTileEntity aBaseMetaTileEntity) {
//        return new GUI_SuperParallelComputer(aPlayerInventory, aBaseMetaTileEntity, getLocalName());
        return false;
    }

    @Override
    public Object getServerGUI(int aID, InventoryPlayer aPlayerInventory, IGregTechTileEntity aBaseMetaTileEntity) {
//        return new Container_SuperParallelComputer(aPlayerInventory, aBaseMetaTileEntity, this);
        return false;
    }

    public void run() {
        registerMetaClass(GTMTE_PhotonContainment.class,
                new IMultiblockInfoContainer<GTMTE_PhotonContainment>() {
                    //region Structure
                    private final IStructureDefinition<GTMTE_PhotonContainment> definition =
                            StructureDefinition.<GTMTE_PhotonContainment>builder()
                                    .addShape("main", new String[][]{
                                            {"      A","AAAAA~A","A    AA"},
                                            {"AAAAAAA","ABBBB D","AAAAAAA"},
                                            {"ABBBBAA","D   C D","ABBBBAA"},
                                            {"AAAAAAA","ABBBB D","AAAAAAA"},
                                            {"      A","AAAAAFA","A    AA"}
                                    })
                                    .addElement('A', ofBlock(CASING, CASING_META))
                                    .addElement('B', ofBlock(ItemRegistery.photonSystem, 0))
                                    .addElement('C', ofBlock(ItemRegistery.photonTransducer, 0))
                                    .addElement('D', ofBlock(ItemRegistery.IGlassBlock))
                                    .addElement('F', ofBlockHint(ItemRegistery.decorateBlock[2], 1))
                                    .build();
                    private final String[] desc = new String[]{
                            RED + "Impact Details:",
                    };

                    //endregion
                    @Override
                    public void construct(ItemStack stackSize, boolean hintsOnly, GTMTE_PhotonContainment tileEntity, ExtendedFacing aSide) {
                        IGregTechTileEntity base = tileEntity.getBaseMetaTileEntity();
                        definition.buildOrHints(tileEntity, stackSize, "main", base.getWorld(), aSide,
                                base.getXCoord(), base.getYCoord(), base.getZCoord(),
                                5, 1, 0, hintsOnly);
                    }

                    @Override
                    public String[] getDescription(ItemStack stackSize) {
                        return desc;
                    }
                });
    }

    @Override
    public String[] getDescription() {
        final MultiBlockTooltipBuilder b = new MultiBlockTooltipBuilder();
        b
                .addTypeMachine("psc.name") //Parametric Diffuser
                .addSeparator()
                .addController()
                .addEnergyHatch("psc.hatches")
                .addMaintenanceHatch("psc.hatches")
                .addOtherStructurePart("psc.other.0", "psc.other.1")
                .addOtherStructurePart("psc.other.2", "psc.other.3")
                .addOtherStructurePart("psc.other.4", "psc.other.5")
                .addCasingInfo("psc.case")
                .signAndFinalize();
        if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
            return b.getInformation();
        } else {
            return b.getStructureInformation();
        }
    }

    @Override
    public boolean checkRecipe(ItemStack aStack) {
        this.mMaxProgresstime = 20;
        return true;
    }

    @Override
    public void onPostTick(IGregTechTileEntity iAm, long aTick) {
        super.onPostTick(iAm, aTick);

        if (iAm.isServerSide() && aTick % 40 == 0) {
        }
    }

    public void setPhotons(int amount) {
        mPhotonsStable += amount;
    }

    @Override
    public boolean machineStructure(IGregTechTileEntity iAm) {
        mWrench = mScrewdriver = mSoftHammer = mHardHammer = mSolderingTool = mCrowbar = true;
        //region Structure
        final Vector3ic forgeDirection = new Vector3i(
                ForgeDirection.getOrientation(iAm.getBackFacing()).offsetX,
                ForgeDirection.getOrientation(iAm.getBackFacing()).offsetY,
                ForgeDirection.getOrientation(iAm.getBackFacing()).offsetZ);

        boolean formationChecklist = true;

        for (int x = -5; x <= 1; x++) {
            for (int y = 0; y <= 4; y++) {

                final Vector3ic offset = rotateOffsetVector(forgeDirection, x, -1, -y);
                IGregTechTileEntity currentTE = iAm.getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());

                if (x >= -4 && x <= -1 && !(y >= 1 && y <= 3)) continue;

                if (x >= -4 && x <= -1 && y == 2) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == ItemRegistery.photonSystem)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 0)) {
                    } else {
                        formationChecklist = false;
                    }
                    continue;
                }

                if (!super.addMaintenanceToMachineList(currentTE, CASING_TEXTURE_ID)
                        && !super.addEnergyInputToMachineList(currentTE, CASING_TEXTURE_ID)
                        && !super.addCommunicationHatchToMachineList(currentTE, CASING_TEXTURE_ID)) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == CASING_META)) {
                    } else {
                        formationChecklist = false;
                    }
                }
            }
        }

        for (int x = -5; x <= 1; x++) {
            for (int y = 0; y <= 4; y++) {

                final Vector3ic offset = rotateOffsetVector(forgeDirection, x, 0, -y);
                IGregTechTileEntity currentTE = iAm.getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());

                if (x == 0 && y == 0) continue;
                if (x >= -4 && x <= -2 && y == 2) continue;
                if (x == 0 && y <= 3) continue;

                if (x == -1 && y == 2) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == ItemRegistery.photonTransducer)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 0)) {
                    } else {
                        formationChecklist = false;
                    }
                    continue;
                }

                if (x >= -4 && x <= -1 && y >= 1 && y <= 3) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == ItemRegistery.photonSystem)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 0)) {
                    } else {
                        formationChecklist = false;
                    }
                    continue;
                }

                if (x == -5 && y == 2) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == ItemRegistery.IGlassBlock)) {
                    } else {
                        formationChecklist = false;
                    }
                    continue;
                }

                if (x == 1 && y >= 1 && y <= 3) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == ItemRegistery.IGlassBlock)) {
                    } else {
                        formationChecklist = false;
                    }
                    continue;
                }

                if (x == 0) {
                    if (super.addOutputToMachineList(currentTE, CASING_TEXTURE_ID)) {
                    } else {

                        formationChecklist = false;
                    }
                    continue;
                }

                if (!super.addMaintenanceToMachineList(currentTE, CASING_TEXTURE_ID)
                        && !super.addEnergyInputToMachineList(currentTE, CASING_TEXTURE_ID)) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == CASING_META)) {
                    } else {
                        formationChecklist = false;
                    }
                }
            }
        }

        for (int x = -5; x <= 1; x++) {
            for (int y = 0; y <= 4; y++) {

                final Vector3ic offset = rotateOffsetVector(forgeDirection, x, 1, -y);
                IGregTechTileEntity currentTE = iAm.getIGregTechTileEntityOffset(offset.x(), offset.y(), offset.z());

                if (x <= 0 && !(y >= 1 && y <= 3)) continue;

                if (x >= -4 && x <= -1 && y == 2) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == ItemRegistery.photonSystem)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == 0)) {
                    } else {
                        formationChecklist = false;
                    }
                    continue;
                }

                if (!super.addMaintenanceToMachineList(currentTE, CASING_TEXTURE_ID)
                        && !super.addEnergyInputToMachineList(currentTE, CASING_TEXTURE_ID)
                        && !super.addCommunicationHatchToMachineList(currentTE, CASING_TEXTURE_ID)) {
                    if ((iAm.getBlockOffset(offset.x(), offset.y(), offset.z()) == CASING)
                            && (iAm.getMetaIDOffset(offset.x(), offset.y(), offset.z()) == CASING_META)) {
                    } else {
                        formationChecklist = false;
                    }
                }
            }
        }

        return formationChecklist;
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setInteger("mPhotonsSummary", mPhotonsStable);
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        mPhotonsStable = aNBT.getInteger("mPhotonsSummary");
    }

    public String[] getInfoData() {
        return new String[]{
                "Usage Energy: " + RED + -mEUt + RESET + " EU/t",
                "Max Voltage: " + YELLOW + getMaxInputVoltage() + RESET + " EU/t ",
                "Maintenance: " + ((super.getRepairStatus() == super.getIdealStatus()) ? GREEN + "Good "
                        + YELLOW + mEfficiency / 100.0F + " %" + RESET
                        : RED + "Has Problems " + mEfficiency / 100.0F + " %" + RESET),
        };
    }
}