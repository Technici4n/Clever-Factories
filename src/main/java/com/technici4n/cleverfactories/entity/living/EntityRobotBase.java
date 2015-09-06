package com.technici4n.cleverfactories.entity.living;

import com.technici4n.cleverfactories.api.wrench.ICFWrenchable;
import com.technici4n.cleverfactories.init.ModItems;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityRobotBase extends EntityLiving implements ICFWrenchable
{
    public EntityRobotBase( World w )
    {
        super( w );
        this.isImmuneToFire = true;
        this.setSize( 0.25F, 0.46875F );
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

    @Override
    public boolean isEntityInvulnerable()
    {
        return true;
    }

    @Override
    public ItemStack[] getDroppedItems()
    {
        return new ItemStack[]{ new ItemStack( ModItems.robotBase ) };
    }
}
