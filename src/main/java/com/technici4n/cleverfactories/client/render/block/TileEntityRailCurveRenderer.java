package com.technici4n.cleverfactories.client.render.block;

import com.technici4n.cleverfactories.client.model.block.ModelRailCurve;
import com.technici4n.cleverfactories.reference.Resources;
import com.technici4n.cleverfactories.tileentity.routing.TileEntityRailCurve;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

public class TileEntityRailCurveRenderer extends TileEntitySpecialRenderer
{
    private final ModelRailCurve model;

    public TileEntityRailCurveRenderer()
    {
        this.model = new ModelRailCurve();
    }

    private void rotateByMetaDataAndConnections( int meta, TileEntityRailCurve te )
    {
        ForgeDirection facing = ForgeDirection.getOrientation( meta );
        switch( facing )
        {
            case EAST:
                GL11.glRotated( 90, 0, 1, 0 );
                break;

            case WEST:
                GL11.glRotated( -90, 0, 1, 0 );
                break;

            case NORTH:
                GL11.glRotated( 180, 0, 1, 0 );
                break;
        }
    }

    @Override
    public void renderTileEntityAt( TileEntity te, double x, double y, double z, float scale )
    {
        // Start rendering
        GL11.glPushMatrix();
        // Starting point
        GL11.glTranslatef( (float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F );
        rotateByMetaDataAndConnections( te.getBlockMetadata(), (TileEntityRailCurve) te );
        ResourceLocation textures = ( new ResourceLocation( Resources.LOCATION_TEXTURE_RAIL_CURVE ) );
        // Bind the texture
        Minecraft.getMinecraft().renderEngine.bindTexture( textures );

        GL11.glPushMatrix();
        GL11.glRotatef( 180F, 0.0F, 0.0F, 1.0F );
        // Very important
        this.model.render( (Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F );
        // Stop rendering for both PushMatrix
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
