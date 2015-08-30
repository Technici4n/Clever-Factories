package com.technici4n.cleverfactories.network;

public class NetworkNode
{
    public Network network;
    public int x, y, z;

    public NetworkNode( Network network, int x, int y, int z )
    {
        this.network = network;

        this.x = x;
        this.y = y;
        this.z = z;
    }
}
