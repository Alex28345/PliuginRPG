package fr.alex.PluginRPG.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
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
        //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "start");
//        player.teleport(new Location(Bukkit.getWorld("world"), 0.5, 101, 0.5));
//        Location playerLocation = player.getLocation();
//        Location[] newallowLoc = {playerLocation.clone().add(-1,0,0),playerLocation.clone().add(1,0,0),playerLocation.clone().add(0,0,1),playerLocation.clone().add(0,0,-1),
//                playerLocation.clone().add(-1,0,1),playerLocation.clone().add(-1,0,-1),playerLocation.clone().add(1,0,1),playerLocation.clone().add(1,0,-1)};
//        for(Location allowblockloc : newallowLoc){
//            player.getWorld().getBlockAt(allowblockloc.add(0,0,0)).setType(Material.GREEN_CONCRETE);
//        }
    }
}
