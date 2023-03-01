package fr.alex.PluginRPG.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerJump implements Listener {

    @EventHandler
    public void onPlayerJump(PlayerMoveEvent event) {
        if (event.getFrom().getY() < event.getTo().getY() ) {
            event.setCancelled(true);
        }
        if (((event.getTo().getX() != event.getFrom().getX()) || (event.getTo().getZ() != event.getFrom().getZ()))) {
            event.setTo(event.getFrom());
            return;
        }
    }
}
