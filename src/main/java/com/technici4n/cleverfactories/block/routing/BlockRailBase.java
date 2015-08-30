package com.technici4n.cleverfactories.block.routing;

import com.technici4n.cleverfactories.block.BlockBaseCleverFactories;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class BlockRailBase extends BlockBaseCleverFactories
{
    public BlockRailBase( Material material )
    {
        super( material );
        setBlockBounds( 0F, 0.8125F, 0F, 1F, 1F, 1F );
    }

    public void onNeighborBlockChange( World w, int x, int y, int z, Block block )
    {
        BlockRailBase rail = ( BlockRailBase ) w.getBlock( x, y, z );
        if( !w.getBlock( x, y + 1, z ).isOpaqueCube() && !w.isRemote )
        {
            EntityItem droppedBlock = new EntityItem( w, x, y, z, new ItemStack( rail ) );
            droppedBlock.delayBeforeCanPickup = 0;
            w.setBlockToAir( x, y, z );
            w.spawnEntityInWorld( droppedBlock );
        }
    }
}
