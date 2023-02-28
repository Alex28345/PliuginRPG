package fr.Alex.pluginrpg.utils;

import org.bukkit.Bukkit;

public class Managers {
    public static void load() {
        Bukkit.getConsoleSender().sendMessage("§a[PluginRpg] §fLe serveur se lance");
    }

    public static void unload() {
        Bukkit.getConsoleSender().sendMessage("§a[PluginRpg] §fLe serveur s'eteint");
    }
}
