package com.igauntlet.client.gui

import com.igauntlet.Infinity
import lucraft.mods.lucraftcore.infinity.container.ContainerInfinityGauntlet;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class StonesGUI extends GuiContainer {

    public static final ResourceLocation GUI_TEXTURES = new ResourceLocation(Infinity.MODID, "textures/gui/texture.png");

    public GuiInfinityGauntlet(EntityPlayer player, ItemStack stack) {
        super(new ContainerInfinityGauntlet(player, stack));
        this.ySize = 211;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(GUI_TEXTURES);
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
    }
}
