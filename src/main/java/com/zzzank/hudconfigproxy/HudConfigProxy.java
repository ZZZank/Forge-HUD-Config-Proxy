package com.zzzank.hudconfigproxy;

import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * HudConfigProxy
 */
@Mod(modid = HudConfigProxy.MOD_ID, name = HudConfigProxy.MOD_NAME, version = HudConfigProxy.VERSION)
public class HudConfigProxy {
    public static final String MOD_ID = "hudconfigproxy";
    public static final String MOD_NAME = "HUD Config Proxy";
    public static final String VERSION = "1.0.0";

    // public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @Mod.EventHandler
    public void syncWithProxy(ConfigChangedEvent event) {
        if (event.getModID() != MOD_ID) {
            return;
        }
        GuiIngameForge.renderVignette    = ConfigProxy.renderVignette   ;
        GuiIngameForge.renderHelmet      = ConfigProxy.renderHelmet     ;
        GuiIngameForge.renderPortal      = ConfigProxy.renderPortal     ;
        GuiIngameForge.renderHotbar      = ConfigProxy.renderHotbar     ;
        GuiIngameForge.renderCrosshairs  = ConfigProxy.renderCrosshairs ;
        GuiIngameForge.renderBossHealth  = ConfigProxy.renderBossHealth ;
        GuiIngameForge.renderHealth      = ConfigProxy.renderHealth     ;
        GuiIngameForge.renderArmor       = ConfigProxy.renderArmor      ;
        GuiIngameForge.renderFood        = ConfigProxy.renderFood       ;
        GuiIngameForge.renderHealthMount = ConfigProxy.renderHealthMount;
        GuiIngameForge.renderAir         = ConfigProxy.renderAir        ;
        GuiIngameForge.renderExperiance  = ConfigProxy.renderExperiance ;
        GuiIngameForge.renderJumpBar     = ConfigProxy.renderJumpBar    ;
        GuiIngameForge.renderObjective   = ConfigProxy.renderObjective  ;
    }
}