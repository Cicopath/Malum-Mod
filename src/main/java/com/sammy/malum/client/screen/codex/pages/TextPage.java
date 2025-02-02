package com.sammy.malum.client.screen.codex.pages;

import com.mojang.blaze3d.vertex.PoseStack;
import com.sammy.malum.client.screen.codex.ProgressionBookScreen;
import com.sammy.malum.core.helper.DataHelper;
import net.minecraft.client.Minecraft;

public class TextPage extends BookPage
{
    public final String translationKey;
    public TextPage(String translationKey)
    {
        super(DataHelper.prefix("textures/gui/book/pages/blank_page.png"));
        this.translationKey = translationKey;
    }

    public String translationKey()
    {
        return "malum.gui.book.entry.page.text." + translationKey;
    }
    @Override
    public void renderLeft(Minecraft minecraft, PoseStack poseStack, float xOffset, float yOffset, int mouseX, int mouseY, float partialTicks)
    {
        int guiLeft = guiLeft();
        int guiTop = guiTop();
        ProgressionBookScreen.renderWrappingText(poseStack, translationKey(), guiLeft+16,guiTop+10,120);
    }

    @Override
    public void renderRight(Minecraft minecraft, PoseStack poseStack, float xOffset, float yOffset, int mouseX, int mouseY, float partialTicks)
    {
        int guiLeft = guiLeft();
        int guiTop = guiTop();
        ProgressionBookScreen.renderWrappingText(poseStack, translationKey(), guiLeft+158,guiTop+10,120);
    }
}
