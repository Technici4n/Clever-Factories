package com.technici4n.cleverfactories.client.render.entity;

import com.technici4n.cleverfactories.client.model.entity.ModelRobotBase;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class EntityRobotBaseRenderer extends RendererLivingEntity
{
    protected ResourceLocation texture = new ResourceLocation( "" );

    public EntityRobotBaseRenderer( ModelRobotBase model, float shadowSize )
    {
        super( model, shadowSize );
    }

    protected ResourceLocation getEntityTexture( Entity entity )
    {
        return texture;
    }
}
