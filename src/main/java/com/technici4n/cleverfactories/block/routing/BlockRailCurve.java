package com.technici4n.cleverfactories.block.routing;

import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailCurve;
import com.technici4n.cleverfactories.util.CleverFactoriesUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockRailCurve extends BlockRailBase implements ITileEntityProvider
{
    public BlockRailCurve()
    {
        super( Material.iron );
    }

    @Override
    public TileEntity createNewTileEntity( World world, int meta )
    {
        return new TileEntityRailCurve();
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public void onBlockPlacedBy( World w, int x, int y, int z, EntityLivingBase entity, ItemStack is )
    {
        ForgeDirection dir = CleverFactoriesUtils.getDirectionFacing2D( entity );
        w.setBlockMetadataWithNotify( x, y, z, dir.ordinal(), 2 );
        /*ForgeDirection newDir;
        Block block1, block2;
        switch( dir )
        {
            case EAST:
                block1 = w.getBlock( x, y, z + 1 );
                block2 = w.getBlock( x, y, z - 1 );

                if( block1 instanceof BlockRailCurve || block1 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.NORTH;
                }
                else if( block2 instanceof BlockRailCurve || block2 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.EAST;
                }
                else
                {
                    newDir = w.rand.nextBoolean() ? ForgeDirection.NORTH : ForgeDirection.EAST;
                }
                break;

            case WEST:
                block1 = w.getBlock( x, y, z + 1 );
                block2 = w.getBlock( x, y, z - 1 );

                if( block1 instanceof BlockRailCurve || block1 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.WEST;
                }
                else if( block2 instanceof BlockRailCurve || block2 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.SOUTH;
                }
                else
                {
                    newDir = w.rand.nextBoolean() ? ForgeDirection.NORTH : ForgeDirection.EAST;
                }
                break;

            case NORTH:
                block1 = w.getBlock( x + 1, y, z );
                block2 = w.getBlock( x - 1, y, z );

                if( block1 instanceof BlockRailCurve || block1 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.WEST;
                }
                else if( block2 instanceof BlockRailCurve || block2 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.NORTH;
                }
                else
                {
                    newDir = w.rand.nextBoolean() ? ForgeDirection.NORTH : ForgeDirection.EAST;
                }

            default:
                block1 = w.getBlock( x + 1, y, z );
                block2 = w.getBlock( x - 1, y, z );

                if( block1 instanceof BlockRailCurve || block1 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.SOUTH;
                }
                else if( block2 instanceof BlockRailCurve || block2 instanceof BlockRailStraight )
                {
                    newDir = ForgeDirection.EAST;
                }
                else
                {
                    newDir = w.rand.nextBoolean() ? ForgeDirection.NORTH : ForgeDirection.EAST;
                }
        }*/
        //w.setBlockMetadataWithNotify( x, y, z, newDir.ordinal(), 2 );
    }

    @Override
    @SideOnly( Side.CLIENT )
    public void registerBlockIcons( IIconRegister icon )
    {
        // this.blockIcon = icon.registerIcon();
    }
}
