package com.technici4n.cleverfactories.network;

import com.technici4n.cleverfactories.network.pathfinding.PathingNode;

public class NetworkNode extends PathingNode
{
    public Network network;
    public int x, y, z;

    public NetworkNode( Network network, int x, int y, int z )
    {
        super( x, y, z );
        this.network = network;

        this.x = x;
        this.y = y;
        this.z = z;
    }
}
