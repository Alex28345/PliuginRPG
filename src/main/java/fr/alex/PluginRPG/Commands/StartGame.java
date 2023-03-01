package fr.alex.PluginRPG.Commands;


import fr.alex.PluginRPG.Main;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.*;

public class StartGame implements CommandExecutor {

    public static List<Player> BlueTeam = new ArrayList<Player>();
    public static List<Player> RedTeam = new ArrayList<Player>();
    public static boolean SplaON = false;
    private Main main;
    public StartGame(Main main){
        this.main = main;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("Start")) {
            if (sender instanceof Player) {

                Player player = (Player) sender;
                player.teleport(new Location(Bukkit.getWorld("world"), 0.5, 101, 0.5));
            }
            return true;
        }return false;
}
}
