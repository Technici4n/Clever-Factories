package com.technici4n.cleverfactories.block.network;

import com.technici4n.cleverfactories.block.BlockBaseCleverFactories;
import com.technici4n.cleverfactories.reference.Names;
import com.technici4n.cleverfactories.tileentity.network.TileEntityComputerCube;
import com.technici4n.cleverfactories.util.RegistryUtils;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockComputerCube extends BlockBaseCleverFactories implements ITileEntityProvider
{
    public BlockComputerCube()
    {
        super( Material.iron );

    }

    public TileEntity createNewTileEntity( World w, int meta )
    {
        return new TileEntityComputerCube();
    }

    public String getUnlocalizedName()
    {
        return RegistryUtils.formatBlockUnlocalizedName( Names.Blocks.COMPUTER_CUBE );
    }
}
