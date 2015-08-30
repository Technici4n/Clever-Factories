package com.technici4n.cleverfactories.tileentity.network;

import com.technici4n.cleverfactories.network.Network;
import net.minecraft.tileentity.TileEntity;

public class TileEntityComputerCube extends TileEntity
{
    public Network network;

    public TileEntityComputerCube()
    {
        this.network = new Network( xCoord, yCoord, zCoord );
    }
}
