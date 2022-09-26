package net.uku3lig.blessbottlerng;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ExperienceListener implements Listener {
    @EventHandler
    public void onExpBottle(ExpBottleEvent event) {
        int amount = JavaPlugin.getPlugin(BlessBottleRNG.class).getConfig().getInt("amount", 10);
        event.setExperience(amount);
    }
}
