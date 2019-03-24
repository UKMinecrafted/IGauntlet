package com.igauntlet.client.render;

import com.igauntlet.Infinity;
import com.igauntlet.client.models.ModelSquirrelGirl;
import com.igauntlet.common.entity.EntitySquirrelGirl;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderSquirrelGirl extends RenderLiving<EntitySquirrelGirl> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Infinity.MODID + ":textures/entity/squirrelgirl.png");

    public RenderSquirrelGirl(RenderManager renderManager) {
        super(renderManager, new ModelSquirrelGirl(), 0.0F);
    }

    @Override
    protected void applyRotations(EntitySquirrelGirl entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySquirrelGirl entity) {
        return TEXTURES;
    }
}