package com.zzzank.hudconfigproxy;

import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = HudConfigProxy.MOD_ID, name = HudConfigProxy.MOD_NAME, version = HudConfigProxy.VERSION)
public final class HudConfigProxy {
    public static final String MOD_ID = "hudconfigproxy";
    public static final String MOD_NAME = "HUD Config Proxy";
    public static final String VERSION = "1.0.0";

    // public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public HudConfigProxy() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void syncWithProxy(OnConfigChangedEvent event) {
        if (!event.getModID().equals(HudConfigProxy.MOD_ID)) {
            return;
        }
        ConfigManager.sync(MOD_ID, Config.Type.INSTANCE);
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