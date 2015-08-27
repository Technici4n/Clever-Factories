package com.technici4n.cleverfactories.network.pathfinding;

import java.util.*;

public class PathFinder //Using A*
{
    public Map<PathingNodeLocation, PathingNodeLocation> cameFrom;
    public Map<PathingNodeLocation, Integer> costTo;
    public PathingNode endNode;

    public Deque<PathingNode> findPath(final PathingNode startNode, final PathingNode end_node)
    {
        endNode = end_node;
        PriorityQueue<PathingNode> openList = new PriorityQueue<PathingNode>(10, new NodeCostComparator(this));
        PathingNode i = null;

        cameFrom = new HashMap<PathingNodeLocation, PathingNodeLocation>();
        costTo = new HashMap<PathingNodeLocation, Integer>();

        openList.add(startNode);
        costTo.put(startNode.loc, 0);

        // int c = 0;
        while(!openList.isEmpty())
        {
            // c++;
            // System.out.println(c);
            PathingNode current = openList.poll();
            if(current.equals(endNode))
            {
                i = current;
                break;
            }

            for(PathingNode nextNode : current.connectedNodes)
            {
                int costNextNode = costTo.get(current.loc);
                costNextNode += dist(current, nextNode);
                if(!costTo.containsKey(nextNode.loc) || costNextNode < costTo.get(nextNode.loc))
                {
                    costTo.put(nextNode.loc, costNextNode);
                    openList.add(nextNode);
                    cameFrom.put(nextNode.loc, current.loc);
                }
            }
        }
        if(i == null)
        {
            throw new RuntimeException("No path can be found !");
        }

        Deque<PathingNode> path = new ArrayDeque<PathingNode>();
        path.addLast(i);
        while(cameFrom.get(i.loc) != null)
        {
            i = cameFrom.get(i.loc).node();
            path.addLast(i);
        }
        return path;
    }

    public int dist(PathingNode n1, PathingNode n2) //Only works if moving on the axis
    {
        return Math.abs(n1.loc.x - n2.loc.y) + Math.abs(n1.loc.x - n2.loc.y) + Math.abs(n1.loc.x - n2.loc.y);
    }
}
