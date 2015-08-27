package com.technici4n.cleverfactories.network.pathfinding;

import java.util.ArrayList;
import java.util.List;

public class PathingNode
{
    public PathingNodeLocation loc;
    public List<PathingNode> connectedNodes = new ArrayList<PathingNode>();

    public PathingNode(int x, int y, int z)
    {
        this.loc = new PathingNodeLocation(x, y ,z, this);
    }

    public PathingNode(int x, int y, int z, ArrayList<PathingNode> connectedNodes)
    {
        this(x, y, z);
        this.connectedNodes = connectedNodes;
    }

    public boolean equals(PathingNode p2)
    {
        return loc.equals(p2.loc);
    }
}
