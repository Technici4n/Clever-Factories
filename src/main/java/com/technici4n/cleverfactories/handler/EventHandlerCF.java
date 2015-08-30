package com.technici4n.cleverfactories.handler;

import com.technici4n.cleverfactories.api.wrench.ICFWrenchable;
import com.technici4n.cleverfactories.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class EventHandlerCF
{
    @SubscribeEvent
    public void onEntityInteractEvent( EntityInteractEvent event )
    {
        if( !event.entityPlayer.worldObj.isRemote )
        {
            System.out.println( "Interact !" );
            Entity entity = event.target;
            EntityPlayer p = event.entityPlayer;
            if( p.isSneaking() && p.getHeldItem().getItem() == ModItems.wrench )
            {
                System.out.println( "Interact 2 !" );
                System.out.println( "Entity: " + entity.getClass().getName() );
                if( entity instanceof ICFWrenchable )
                {
                    System.out.println( "Interact 3 !" );
                    ItemStack[] drops = ( ( ICFWrenchable ) entity ).getDroppedItems();

                    World w = entity.worldObj;
                    w.removeEntity( entity );

                    for( ItemStack stack : drops )
                    {
                        EntityItem drop = new EntityItem( w, entity.posX, entity.posY, entity.posZ, stack );
                        drop.delayBeforeCanPickup = 0;

                        w.spawnEntityInWorld( drop );
                    }
                }
            }
        }
    }
}
