package com.technici4n.cleverfactories.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.util.ForgeDirection;

public class CleverFactoriesUtils
{
    // No UP or DOWN
    public static ForgeDirection getDirectionFacing2D( EntityLivingBase e )
    {
        double yaw = e.rotationYaw;
        while( yaw < 0 )
        {
            yaw += 360;
        }
        yaw = yaw % 360;
        if( yaw < 45 )
        {
            return ForgeDirection.SOUTH;
        }
        else if( yaw < 135 )
        {
            return ForgeDirection.WEST;
        }
        else if( yaw < 225 )
        {
            return ForgeDirection.NORTH;
        }
        else if( yaw < 315 )
        {
            return ForgeDirection.EAST;
        }

        else
        {
            return ForgeDirection.SOUTH;
        }
    }
}
