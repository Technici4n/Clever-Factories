package com.technici4n.cleverfactories.util;

import com.technici4n.cleverfactories.CleverFactories;
import com.technici4n.cleverfactories.reference.Reference;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;

public class RegistryUtils
{
    public static void registerEntity( Class<? extends Entity> entityClass, String name )
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        //int primaryColor = rand.nextInt() * 16777215;
        //int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID( entityClass, name, entityID );
        EntityRegistry.registerModEntity( entityClass, name, entityID, CleverFactories.INSTANCE, 64, 1, false );
        //EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

    public static String formatBlockUnlocalizedName(String unlocName)
    {
        return String.format("tile.%s:%s", Reference.MOD_ID.toLowerCase(), unlocName.substring(unlocName.indexOf(".") + 1));
    }
}
