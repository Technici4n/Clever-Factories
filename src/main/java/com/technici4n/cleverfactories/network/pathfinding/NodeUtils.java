package com.technici4n.cleverfactories.network.pathfinding;

import java.util.Arrays;
import java.util.List;

public class NodeUtils
{
    public static void bind(PathingNode n1, PathingNode n2)
    {
        // Add n2 to n1 connections
        n1.connectedNodes.add(n2);

        // Add n1 to n2 connections
        n2.connectedNodes.add(n1);
    }
}
