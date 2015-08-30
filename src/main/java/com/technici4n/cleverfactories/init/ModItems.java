package com.technici4n.cleverfactories.init;

import com.technici4n.cleverfactories.item.ItemRobotBase;
import com.technici4n.cleverfactories.item.ItemWrench;
import com.technici4n.cleverfactories.reference.Names;
import com.technici4n.cleverfactories.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder( value = Reference.MOD_ID )
public class ModItems
{
    public static final ItemWrench wrench = new ItemWrench( Names.Items.WRENCH );

    public static final ItemRobotBase robotBase = new ItemRobotBase();

    public static void init()
    {
        GameRegistry.registerItem( wrench, Names.Items.WRENCH );
        GameRegistry.registerItem( robotBase, Names.Items.ROBOT_BASE );
    }
}
