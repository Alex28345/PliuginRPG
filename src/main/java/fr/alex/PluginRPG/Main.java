package fr.alex.PluginRPG;

import fr.alex.PluginRPG.Commands.*;
import fr.alex.PluginRPG.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
//        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJump(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerClick(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new ThrowSnowBall(), this);
        getCommand("start").setExecutor(new StartGame(this));

        Bukkit.getLogger().info("plugin demarré");

    }
    public void onDisable(){
        Bukkit.getLogger().info("plugin off");
    }
}

