package fr.alex.PluginRPG;

import fr.alex.PluginRPG.Commands.*;
import fr.alex.PluginRPG.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(new Death(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new LapisEnchant(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new ClickMenuKits(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new MenuKits(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BlockItemInv(), this);
        getCommand("heal").setExecutor(new Heal());
        getCommand("plume").setExecutor(new Plume());
        getCommand("start").setExecutor(new StartGame(this));
        getCommand("revive").setExecutor(new revive());
        getCommand("splatoon").setExecutor(new splatoon());
        Bukkit.getLogger().info("plugin demarré");

    }
    public void onDisable(){

        Bukkit.getLogger().info("plugin off");
    }
}

