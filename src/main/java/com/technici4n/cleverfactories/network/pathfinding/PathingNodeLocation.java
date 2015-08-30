package com.technici4n.cleverfactories.network.pathfinding;

public class PathingNodeLocation
{
    public int x;
    public int y;
    public int z;
    private PathingNode node;

    public PathingNodeLocation( int x, int y, int z, PathingNode node )
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.node = node;
    }

    public PathingNode node()
    {
        return node;
    }

    public boolean equals( PathingNodeLocation loc )
    {
        return x == loc.x && y == loc.y && z == loc.z;
    }
}
