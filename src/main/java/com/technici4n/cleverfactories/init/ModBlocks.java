package com.technici4n.cleverfactories.init;

import com.technici4n.cleverfactories.block.network.BlockComputerCube;
import com.technici4n.cleverfactories.block.routing.BlockRailCurve;
import com.technici4n.cleverfactories.block.routing.BlockRailStraight;
import com.technici4n.cleverfactories.reference.Names;
import com.technici4n.cleverfactories.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

import java.sql.Ref;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockRailStraight railStraight = new BlockRailStraight();
    public static final BlockRailCurve railCurve = new BlockRailCurve();

    public static final BlockComputerCube computerCube = new BlockComputerCube();

    public static void init()
    {
        GameRegistry.registerBlock(railStraight, Names.Blocks.RAIL_STRAIGHT);
        GameRegistry.registerBlock(railCurve, Names.Blocks.RAIL_CURVE);

        GameRegistry.registerBlock( computerCube, Names.Blocks.COMPUTER_CUBE );
    }
}
