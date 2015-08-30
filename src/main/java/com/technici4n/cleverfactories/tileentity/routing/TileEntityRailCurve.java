package com.technici4n.cleverfactories.tileentity.routing;

import com.technici4n.cleverfactories.api.network.INodeProvider;
import com.technici4n.cleverfactories.network.NetworkNode;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRailCurve extends TileEntity implements INodeProvider
{
    private NetworkNode node;

    public TileEntityRailCurve()
    {
        this.node = new NetworkNode( null, xCoord, yCoord, zCoord );
    }

    @Override
    public NetworkNode getNetworkNode()
    {
        return null;
    }
}
