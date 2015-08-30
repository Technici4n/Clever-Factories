package com.technici4n.cleverfactories.client.render.entity;

import com.technici4n.cleverfactories.client.model.entity.ModelRobotBase;
import com.technici4n.cleverfactories.entity.living.EntityRobotBase;
import com.technici4n.cleverfactories.reference.Resources;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EntityRobotBaseRenderer extends RenderLiving
{
    protected ResourceLocation texture = new ResourceLocation( Resources.Entities.LOCATION_TEXTURE_ROBOT_BASE );

    public EntityRobotBaseRenderer( ModelRobotBase model, float shadowSize )
    {
        super( model, shadowSize );
    }

    @Override
    protected void preRenderCallback( EntityLivingBase entity, float f )
    {
        preRenderCallbackRobotBase( ( EntityRobotBase ) entity, f );
    }

    protected void preRenderCallbackRobotBase( EntityRobotBase entity, float f )
    {
        GL11.glScaled( 0.5D, 0.5D, 0.5D );
    }

    @Override
    protected ResourceLocation getEntityTexture( Entity entity )
    {
        return texture;
    }
}
