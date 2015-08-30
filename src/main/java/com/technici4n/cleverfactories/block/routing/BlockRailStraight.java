package com.technici4n.cleverfactories.block.routing;

import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailStraight;
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

public class BlockRailStraight extends BlockRailBase implements ITileEntityProvider
{
    public BlockRailStraight()
    {
        super( Material.iron );
    }

    @Override
    public TileEntity createNewTileEntity( World world, int meta )
    {
        return new TileEntityRailStraight();
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
    }

    @Override
    @SideOnly( Side.CLIENT )
    public void registerBlockIcons( IIconRegister icon )
    {
        // this.blockIcon = icon.registerIcon();
    }
}
