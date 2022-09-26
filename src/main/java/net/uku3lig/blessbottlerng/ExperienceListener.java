package net.uku3lig.blessbottlerng;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class ExperienceListener implements Listener {
    @EventHandler
    public void onExpBottle(ExpBottleEvent event) {
        event.setExperience(10);
    }
}
