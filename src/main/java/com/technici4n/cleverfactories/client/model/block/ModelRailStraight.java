package com.technici4n.cleverfactories.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRailStraight extends ModelBase
{
  //fields
    ModelRenderer SupportRR;
    ModelRenderer SmallSupportRR;
    ModelRenderer SupportRL;
    ModelRenderer SmallSupportRL;
    ModelRenderer SupportLR;
    ModelRenderer SmallSupportLR;
    ModelRenderer SupportLL;
    ModelRenderer SmallSupportLL;
    ModelRenderer Support;
    ModelRenderer Cable;
  
  public ModelRailStraight()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      SupportRR = new ModelRenderer(this, 0, 24);
      SupportRR.addBox(0F, 0F, 0F, 1, 2, 16);
      SupportRR.setRotationPoint(7F, 9F, -8F);
      SupportRR.setTextureSize(64, 64);
      SupportRR.mirror = true;
      setRotation(SupportRR, 0F, 0F, 0F);
      SmallSupportRR = new ModelRenderer(this, 0, 47);
      SmallSupportRR.addBox(0F, 0F, 0F, 1, 1, 16);
      SmallSupportRR.setRotationPoint(6F, 10F, -8F);
      SmallSupportRR.setTextureSize(64, 64);
      SmallSupportRR.mirror = true;
      setRotation(SmallSupportRR, 0F, 0F, 0F);
      SupportRL = new ModelRenderer(this, 0, 24);
      SupportRL.addBox(0F, 0F, 0F, 1, 2, 16);
      SupportRL.setRotationPoint(2F, 9F, -8F);
      SupportRL.setTextureSize(64, 64);
      SupportRL.mirror = true;
      setRotation(SupportRL, 0F, 0F, 0F);
      SmallSupportRL = new ModelRenderer(this, 0, 47);
      SmallSupportRL.addBox(0F, 0F, 0F, 1, 1, 16);
      SmallSupportRL.setRotationPoint(3F, 10F, -8F);
      SmallSupportRL.setTextureSize(64, 64);
      SmallSupportRL.mirror = true;
      setRotation(SmallSupportRL, 0F, 0F, 0F);
      SupportLR = new ModelRenderer(this, 0, 24);
      SupportLR.addBox(0F, 0F, 0F, 1, 2, 16);
      SupportLR.setRotationPoint(-3F, 9F, -8F);
      SupportLR.setTextureSize(64, 64);
      SupportLR.mirror = true;
      setRotation(SupportLR, 0F, 0F, 0F);
      SmallSupportLR = new ModelRenderer(this, 0, 47);
      SmallSupportLR.addBox(0F, 0F, 0F, 1, 1, 16);
      SmallSupportLR.setRotationPoint(-4F, 10F, -8F);
      SmallSupportLR.setTextureSize(64, 64);
      SmallSupportLR.mirror = true;
      setRotation(SmallSupportLR, 0F, 0F, 0F);
      SupportLL = new ModelRenderer(this, 0, 24);
      SupportLL.addBox(0F, 0F, 0F, 1, 2, 16);
      SupportLL.setRotationPoint(-8F, 9F, -8F);
      SupportLL.setTextureSize(64, 64);
      SupportLL.mirror = true;
      setRotation(SupportLL, 0F, 0F, 0F);
      SmallSupportLL = new ModelRenderer(this, 0, 47);
      SmallSupportLL.addBox(0F, 0F, 0F, 1, 1, 16);
      SmallSupportLL.setRotationPoint(-7F, 10F, -8F);
      SmallSupportLL.setTextureSize(64, 64);
      SmallSupportLL.mirror = true;
      setRotation(SmallSupportLL, 0F, 0F, 0F);
      Support = new ModelRenderer(this, 0, 0);
      Support.addBox(0F, 0F, 0F, 16, 1, 16);
      Support.setRotationPoint(-8F, 8F, -8F);
      Support.setTextureSize(64, 64);
      Support.mirror = true;
      setRotation(Support, 0F, 0F, 0F);
      Cable = new ModelRenderer(this, 19, 21);
      Cable.addBox(0F, 0F, 0F, 2, 1, 16);
      Cable.setRotationPoint(-1F, 9F, -8F);
      Cable.setTextureSize(64, 64);
      Cable.mirror = true;
      setRotation(Cable, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    SupportRR.render(f5);
    SmallSupportRR.render(f5);
    SupportRL.render(f5);
    SmallSupportRL.render(f5);
    SupportLR.render(f5);
    SmallSupportLR.render(f5);
    SupportLL.render(f5);
    SmallSupportLL.render(f5);
    Support.render(f5);
    Cable.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
