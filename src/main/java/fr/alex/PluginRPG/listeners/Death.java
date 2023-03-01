package fr.alex.PluginRPG.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.ArrayList;
import java.util.List;


public class Death implements Listener {
    public static List<Player> mort = new ArrayList<Player>();

    @EventHandler
    public void onDeath(EntityDamageEvent event) {
        Entity player = event.getEntity();
        if (player instanceof Player) {
            Player p = (Player) player;
            Double damage = event.getDamage();
            Double pHealth = p.getHealth();
            if (pHealth - damage <= 0) {
                event.setCancelled(true);
                p.getInventory().clear();
                p.setHealth(20);
                p.setFoodLevel(20);
                p.setGameMode(GameMode.SPECTATOR);
                mort.add(p);

            }

        }
    }

}