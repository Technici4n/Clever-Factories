package com.technici4n.cleverfactories.client;

import com.technici4n.cleverfactories.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabCleverFactories
{
    public static CreativeTabs TAB_CF = new CreativeTabs( Reference.MOD_ID )
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.iron_ingot; // THIS MUST CHANGE !!!!!!!!!!!
        }
    };
}
