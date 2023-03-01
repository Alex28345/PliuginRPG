package fr.alex.PluginRPG.listeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;

public class Love implements Listener {
    @EventHandler
    public void onLove(EntityEnterLoveModeEvent event) {
        event.getHumanEntity().sendMessage("You are in love mode with "+event.getEntity().getName());
    }
}
