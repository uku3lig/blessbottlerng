package net.uku3lig.blessbottlerng;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class BlessBottleRNG extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ExperienceListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
