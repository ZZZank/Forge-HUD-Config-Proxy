package com.zzzank.hudconfigproxy;

import net.minecraftforge.common.config.Config;

/**
 * @see net.minecraftforge.client.GuiIngameForge
 */
@Config(modid = HudConfigProxy.MOD_ID, category = "client")
public class ConfigProxy {

    public static boolean renderVignette = true;
    public static boolean renderHelmet = true;
    public static boolean renderPortal = true;
    public static boolean renderHotbar = true;
    public static boolean renderCrosshairs = true;
    public static boolean renderBossHealth = true;
    public static boolean renderHealth = true;
    public static boolean renderArmor = true;
    public static boolean renderFood = true;
    public static boolean renderHealthMount = true;
    public static boolean renderAir = true;
    public static boolean renderExperiance = true;
    public static boolean renderJumpBar = true;
    public static boolean renderObjective = true;
}
