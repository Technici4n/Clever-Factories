package com.technici4n.cleverfactories.entity.living;

import net.minecraft.world.World;

public class EntityRobot extends EntityRobotBase
{
    public EntityRobot( World w )
    {
        super( w );
        this.isImmuneToFire = true;
    }

    @Override
    public void onUpdate()
    {
        // TODO
    }
}
