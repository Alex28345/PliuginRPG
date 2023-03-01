package fr.alex.PluginRPG.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

import java.sql.SQLOutput;

public class ThrowSnowBall implements Listener {

    @EventHandler
    public void onThrowSnowBallHit(ProjectileHitEvent event) {

        ProjectileSource shooter = event.getEntity().getShooter();
        Entity snowball = event.getEntity();


        if ((event.getEntity() instanceof Snowball)) {
            Location loc = snowball.getLocation();

            World world = event.getEntity().getWorld();
            world.createExplosion(loc, 50);

            Player player = (Player) shooter;
            player.sendMessage("YOU SHOT THE SNOWBALL!");
            player.getWorld().strikeLightning(snowball.getLocation());
        }

    }

}
