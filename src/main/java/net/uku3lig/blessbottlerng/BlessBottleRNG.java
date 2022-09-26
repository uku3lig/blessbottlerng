package net.uku3lig.blessbottlerng;

import org.bukkit.plugin.java.JavaPlugin;

public final class BlessBottleRNG extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new ExperienceListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
