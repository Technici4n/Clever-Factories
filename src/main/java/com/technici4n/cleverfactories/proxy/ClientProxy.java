package com.technici4n.cleverfactories.proxy;

import com.technici4n.cleverfactories.client.model.entity.ModelRobotBase;
import com.technici4n.cleverfactories.client.render.block.TileEntityRailCurveRenderer;
import com.technici4n.cleverfactories.client.render.block.TileEntityRailStraightRenderer;
import com.technici4n.cleverfactories.client.render.entity.EntityRobotBaseRenderer;
import com.technici4n.cleverfactories.entity.living.EntityRobotBase;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailCurve;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailStraight;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerSpecialRenders()
    {
        ClientRegistry.bindTileEntitySpecialRenderer( TileEntityRailStraight.class, new TileEntityRailStraightRenderer() );
        ClientRegistry.bindTileEntitySpecialRenderer( TileEntityRailCurve.class, new TileEntityRailCurveRenderer() );
    }

    @Override
    public void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler( EntityRobotBase.class, new EntityRobotBaseRenderer( new ModelRobotBase(), 0.15F ) );
    }
}
