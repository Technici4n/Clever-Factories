package com.technici4n.cleverfactories.init;

import com.technici4n.cleverfactories.tileentity.network.TileEntityComputerCube;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailCurve;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailStraight;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity( TileEntityRailStraight.class, "tileEntityRailStraight" );
        GameRegistry.registerTileEntity( TileEntityRailCurve.class, "tileEntityRailCurve" );

        GameRegistry.registerTileEntity( TileEntityComputerCube.class, "tileEntityComputerCube" );
    }
}
