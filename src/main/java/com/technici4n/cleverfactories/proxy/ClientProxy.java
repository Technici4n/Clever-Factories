package com.technici4n.cleverfactories.proxy;

import com.technici4n.cleverfactories.client.render.block.TileEntityRailCurveRenderer;
import com.technici4n.cleverfactories.client.render.block.TileEntityRailStraightRenderer;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailCurve;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailStraight;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerSpecialRenders()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRailStraight.class, new TileEntityRailStraightRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRailCurve.class, new TileEntityRailCurveRenderer());
    }
}
