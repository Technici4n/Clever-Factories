package com.technici4n.cleverfactories.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRobotBase extends ModelBase
{
    //fields
    ModelRenderer PartInRailTop;
    ModelRenderer PartInRailBot;
    ModelRenderer ArmSupportRL;
    ModelRenderer ArmSupportFB;
    ModelRenderer Main;
    ModelRenderer ArmLeft;
    ModelRenderer ArmBack;
    ModelRenderer ArmFront;
    ModelRenderer ArmRight;

    public ModelRobotBase()
    {
        textureWidth = 64;
        textureHeight = 32;

        PartInRailTop = new ModelRenderer( this, 0, 0 );
        PartInRailTop.addBox( 0F, 0F, 0F, 8, 2, 8 );
        PartInRailTop.setRotationPoint( -4F, 10F, -4F );
        PartInRailTop.setTextureSize( 64, 32 );
        PartInRailTop.mirror = true;
        setRotation( PartInRailTop, 0F, 0F, 0F );
        PartInRailBot = new ModelRenderer( this, 0, 23 );
        PartInRailBot.addBox( 0F, 0F, 0F, 4, 2, 4 );
        PartInRailBot.setRotationPoint( -2F, 12F, -2F );
        PartInRailBot.setTextureSize( 64, 32 );
        PartInRailBot.mirror = true;
        setRotation( PartInRailBot, 0F, 0F, 0F );
        ArmSupportRL = new ModelRenderer( this, 0, 14 );
        ArmSupportRL.addBox( 0F, 0F, 0F, 6, 1, 1 );
        ArmSupportRL.setRotationPoint( -3F, 19F, -0.5F );
        ArmSupportRL.setTextureSize( 64, 32 );
        ArmSupportRL.mirror = true;
        setRotation( ArmSupportRL, 0F, 0F, 0F );
        ArmSupportFB = new ModelRenderer( this, 0, 16 );
        ArmSupportFB.addBox( -0.5F, 0F, 0F, 1, 1, 6 );
        ArmSupportFB.setRotationPoint( 0F, 19F, -3F );
        ArmSupportFB.setTextureSize( 64, 32 );
        ArmSupportFB.mirror = true;
        setRotation( ArmSupportFB, 0F, 0F, 0F );
        Main = new ModelRenderer( this, 14, 10 );
        Main.addBox( -1F, 0F, -1F, 2, 6, 2 );
        Main.setRotationPoint( 0F, 14F, 0F );
        Main.setTextureSize( 64, 32 );
        Main.mirror = true;
        setRotation( Main, 0F, 0F, 0F );
        ArmLeft = new ModelRenderer( this, 0, 10 );
        ArmLeft.addBox( 0F, 0F, 0F, 1, 3, 1 );
        ArmLeft.setRotationPoint( -3F, 20F, -0.5F );
        ArmLeft.setTextureSize( 64, 32 );
        ArmLeft.mirror = true;
        setRotation( ArmLeft, 0F, 0F, -0.3490659F );
        ArmBack = new ModelRenderer( this, 0, 10 );
        ArmBack.addBox( 0F, 0F, -1F, 1, 3, 1 );
        ArmBack.setRotationPoint( -0.5F, 20F, 3F );
        ArmBack.setTextureSize( 64, 32 );
        ArmBack.mirror = true;
        setRotation( ArmBack, -0.3490659F, 0F, 0F );
        ArmFront = new ModelRenderer( this, 0, 10 );
        ArmFront.addBox( 0F, 0F, 0F, 1, 3, 1 );
        ArmFront.setRotationPoint( -0.5F, 20F, -3F );
        ArmFront.setTextureSize( 64, 32 );
        ArmFront.mirror = true;
        setRotation( ArmFront, 0.3490659F, 0F, 0F );
        ArmRight = new ModelRenderer( this, 0, 10 );
        ArmRight.addBox( -1F, 0F, 0F, 1, 3, 1 );
        ArmRight.setRotationPoint( 3F, 20F, -0.5F );
        ArmRight.setTextureSize( 64, 32 );
        ArmRight.mirror = true;
        setRotation( ArmRight, 0F, 0F, 0.3490659F );
    }

    public void render( Entity entity, float f, float f1, float f2, float f3, float f4, float f5 )
    {
        super.render( entity, f, f1, f2, f3, f4, f5 );
        setRotationAngles( f, f1, f2, f3, f4, f5, entity );
        PartInRailTop.render( f5 );
        PartInRailBot.render( f5 );
        ArmSupportRL.render( f5 );
        ArmSupportFB.render( f5 );
        Main.render( f5 );
        ArmLeft.render( f5 );
        ArmBack.render( f5 );
        ArmFront.render( f5 );
        ArmRight.render( f5 );
    }

    private void setRotation( ModelRenderer model, float x, float y, float z )
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles( float f, float f1, float f2, float f3, float f4, float f5, Entity entity )
    {
        super.setRotationAngles( f, f1, f2, f3, f4, f5, entity );
    }

}
