package com.technici4n.cleverfactories.client.render.block;

import com.technici4n.cleverfactories.client.model.block.ModelRailStraight;
import com.technici4n.cleverfactories.reference.Resources;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

public class TileEntityRailStraightRenderer extends TileEntitySpecialRenderer
{
    private final ModelRailStraight model;

    public TileEntityRailStraightRenderer()
    {
        this.model = new ModelRailStraight();
    }

    private void rotateByMetaData(int meta)
    {
        ForgeDirection facing = ForgeDirection.getOrientation(meta);
        if(facing == ForgeDirection.EAST || facing == ForgeDirection.WEST)
        {
            GL11.glRotated(90, 0, 1, 0);
        }
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale)
    {
        // Start rendering
        GL11.glPushMatrix();
        // Starting point
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        rotateByMetaData(te.getBlockMetadata());
        ResourceLocation textures = (new ResourceLocation(Resources.LOCATION_TEXTURE_RAIL_STRAIGHT));
        // Bind the texture
        Minecraft.getMinecraft().renderEngine.bindTexture(textures);

        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        // Very important
        this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        // Stop rendering for both PushMatrix
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
