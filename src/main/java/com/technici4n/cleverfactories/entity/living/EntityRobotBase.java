package com.technici4n.cleverfactories.entity.living;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public abstract class EntityRobotBase extends EntityLiving
{
    public EntityRobotBase(World w)
    {
        super(w);
    }

    @Override
    public boolean canBreatheUnderwater()
    {
        return true;
    }

    // Wont despawn if idle far away
    @Override
    protected boolean canDespawn()
    {
        return false;
    }
}
