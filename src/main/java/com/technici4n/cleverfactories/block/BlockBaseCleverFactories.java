package com.technici4n.cleverfactories.block;

import com.technici4n.cleverfactories.client.CreativeTabCleverFactories;
import com.technici4n.cleverfactories.util.RegistryUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public abstract class BlockBaseCleverFactories extends Block
{
    public BlockBaseCleverFactories( Material material )
    {
        super( material );
        setCreativeTab( CreativeTabCleverFactories.TAB_CF );

    }

    // The icon name is based on the unlocalized name
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons( IIconRegister iIR )
    {
        blockIcon = iIR.registerIcon( this.getUnlocalizedName().substring( this.getUnlocalizedName().indexOf( "." ) + 1 ) );
    }

    @Override
    public String getUnlocalizedName()
    {
        return RegistryUtils.formatBlockUnlocalizedName( super.getUnlocalizedName() );
    }
}
