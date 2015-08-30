package com.technici4n.cleverfactories.item;

import com.technici4n.cleverfactories.client.CreativeTabCleverFactories;
import com.technici4n.cleverfactories.util.RegistryUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBaseCleverFactories extends Item
{
    public ItemBaseCleverFactories()
    {
        setMaxStackSize( 64 );
        setCreativeTab( CreativeTabCleverFactories.TAB_CF );
    }

    public ItemBaseCleverFactories( String unlocName )
    {
        this();
        setUnlocalizedName( unlocName );
    }

    @Override
    @SideOnly( Side.CLIENT )
    public void registerIcons( IIconRegister iIR )
    {
        itemIcon = iIR.registerIcon( this.getUnlocalizedName().substring( this.getUnlocalizedName().indexOf( "." ) + 1 ) );
    }

    @Override
    public String getUnlocalizedName()
    {
        return RegistryUtils.formatBlockUnlocalizedName( super.getUnlocalizedName() );
    }
}
