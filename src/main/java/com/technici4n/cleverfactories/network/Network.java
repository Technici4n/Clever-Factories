package com.technici4n.cleverfactories.network;

import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class Network
{
    public List< NetworkNode > nodes;
    public final int x, y, z;
    public World w;

    public Network( World w, int x, int y, int z )
    {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;

        nodes = new ArrayList< NetworkNode >();
    }

    public void addNode( NetworkNode node )
    {
        node.network = this;
        this.nodes.add( node );
    }

    public void removeNode( NetworkNode node )
    {
        node.network = null;
        this.nodes.remove( node );
    }

    public void refreshAll()
    {
        List< NetworkNode > newNodes = new ArrayList< NetworkNode >();
        /*
         * add adjacent nodes (and bind them)
         * loop
         *   every node -> find adjacent nodes (and bind them)
         *
         * get old nodes and set their network to null
         * addNode( new nodes )
         */
    }
}
