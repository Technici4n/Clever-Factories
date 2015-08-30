package com.technici4n.cleverfactories.proxy;

import com.technici4n.cleverfactories.entity.living.EntityRobotBase;
import com.technici4n.cleverfactories.reference.Names;
import com.technici4n.cleverfactories.util.RegistryUtils;

public class CommonProxy
{
    public void registerSpecialRenders()
    {

    }

    public void registerEntities()
    {
        RegistryUtils.registerEntity( EntityRobotBase.class, Names.Entities.ROBOT_BASE );
    }

    public void registerEntityRenders()
    {

    }
}
