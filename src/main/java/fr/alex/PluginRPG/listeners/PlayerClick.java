package fr.alex.PluginRPG.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import java.util.Arrays;
import java.util.List;

public class PlayerClick implements Listener{
    @EventHandler
    public void onPlayerClick(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();


        if (block.getType() == Material.STONE) {
            Player player = event.getPlayer();
            Location playerLocation = player.getLocation();
            playerLocation.setYaw(0);
            playerLocation.setPitch(0);
            playerLocation = playerLocation.add(-0.5, 2, -0.5);
            Location[] allowLoc = {playerLocation , playerLocation.clone().add(-1,0,0),playerLocation.clone().add(1,0,0),playerLocation.clone().add(0,0,1),playerLocation.clone().add(0,0,-1),
                                    playerLocation.clone().add(-1,0,1),playerLocation.clone().add(-1,0,-1),playerLocation.clone().add(1,0,1),playerLocation.clone().add(1,0,-1)};
            Location blockLocation = block.getLocation();
            Block block1up = blockLocation.add(0, 1, 0).getBlock();
            Block block2up = blockLocation.add(0, 2, 0).getBlock();
            if (block1up.getType() == Material.AIR && block2up.getType() == Material.AIR ) {
//                player.sendMessage("player : " + playerLocation.toString());
//                player.sendMessage("block : " + blockLocation.toString());
                if(Arrays.asList(allowLoc).contains(blockLocation)) {
                    Vector look = player.getEyeLocation().getDirection();
                    Location loc = block.getLocation();
                    loc = loc.add(0.5, 1, 0.5);
                    loc.setDirection(look);
                    player.teleport(loc);
                    player.sendMessage("Vous avancez d'une case");
                }else{
                    player.sendMessage("pas a cotéeee");
                }
            }else{
                player.sendMessage("Case inaccessible");
            }
            event.setCancelled(true);
        }
    }
}
