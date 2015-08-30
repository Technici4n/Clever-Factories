package com.technici4n.cleverfactories.network.pathfinding;

import java.util.Comparator;

public class NodeCostComparator implements Comparator< PathingNode >
{
    private PathFinder pathFinder;

    public NodeCostComparator( PathFinder pathFinder )
    {
        this.pathFinder = pathFinder;
    }

    public int compare( PathingNode n1, PathingNode n2 )
    {
        return -( pathFinder.costTo.get( n1.loc ) + pathFinder.dist( n1, pathFinder.endNode ) ) - ( pathFinder.costTo.get( n2.loc ) + pathFinder.dist( n2, pathFinder.endNode ) );
    }
}
