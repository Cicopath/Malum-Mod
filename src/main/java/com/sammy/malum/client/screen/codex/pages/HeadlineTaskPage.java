package com.sammy.malum.client.screen.codex.pages;

import com.mojang.blaze3d.vertex.PoseStack;
import com.sammy.malum.MalumMod;
import com.sammy.malum.client.screen.codex.ProgressionBookScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

public class HeadlineTaskPage extends BookPage
{
    private final String headlineTranslationKey;
    private final String translationKey;

    public HeadlineTaskPage(String headlineTranslationKey, String translationKey)
    {
        super(MalumMod.prefix("textures/gui/book/pages/headline_task_page.png"));
        this.headlineTranslationKey = headlineTranslationKey;
        this.translationKey = translationKey;
    }
    public HeadlineTaskPage(String key)
    {
        this(key,key);
    }

    public String headlineTranslationKey()
    {
        return "malum.gui.book.entry.page.headline." + headlineTranslationKey;
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
        Component component = new TranslatableComponent(headlineTranslationKey());
        ProgressionBookScreen.renderText(poseStack, component, guiLeft+75 - minecraft.font.width(component.getString())/2,guiTop+10);
        ProgressionBookScreen.renderWrappingText(poseStack, translationKey(), guiLeft+16,guiTop+31,120);
    }

    @Override
    public void renderRight(Minecraft minecraft, PoseStack poseStack, float xOffset, float yOffset, int mouseX, int mouseY, float partialTicks)
    {
        int guiLeft = guiLeft();
        int guiTop = guiTop();
        Component component = new TranslatableComponent(headlineTranslationKey());
        ProgressionBookScreen.renderText(poseStack, component, guiLeft+218 - minecraft.font.width(component.getString())/2,guiTop+10);
        ProgressionBookScreen.renderWrappingText(poseStack, translationKey(), guiLeft+158,guiTop+31,120);
    }
}
