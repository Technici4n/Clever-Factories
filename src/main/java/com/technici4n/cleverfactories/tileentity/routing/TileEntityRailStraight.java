package com.technici4n.cleverfactories.tileentity.routing;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityRailStraight extends TileEntity
{
    public boolean canConnect( ForgeDirection dir1, ForgeDirection dir2 )
    {
        int meta = worldObj.getBlockMetadata( xCoord, yCoord, zCoord );
        ForgeDirection dirBlock = ForgeDirection.getOrientation( meta );
        if( dirBlock == ForgeDirection.NORTH || dirBlock == ForgeDirection.SOUTH )
        {
            return ( dir1 == ForgeDirection.NORTH && dir2 == ForgeDirection.SOUTH ) || ( dir2 == ForgeDirection.NORTH && dir1 == ForgeDirection.SOUTH );
        }
        else
        {
            return ( dir1 == ForgeDirection.WEST && dir2 == ForgeDirection.EAST ) || ( dir2 == ForgeDirection.WEST && dir1 == ForgeDirection.EAST );
        }
    }
}
