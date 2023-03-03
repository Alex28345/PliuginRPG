package fr.alex.PluginRPG.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerConnexion implements Listener {

    @EventHandler
    public void onPlayerConnexion(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Bienvenue sur le serveur, " + player.getName() + " !");
        player.sendMessage("&bA toi de jouer pour ce super rpg !");
        player.teleport(new Location(Bukkit.getWorld("world"), 0.5, 101, 0.5));
    }
}
