package fr.alex.PluginRPG.Commands;

import fr.alex.PluginRPG.Items;
import org.bukkit.Material;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class TaMereGrand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("TaMereGrand")) {
            Player player = (Player) sender;
            player.sendMessage("TaMereGrand t'es serieux ?");
            player.getInventory().addItem(Items.getItem(Material.DIAMOND_SWORD, "TaMereGrand"));
            player.getWorld().createExplosion(player.getLocation(), 10);
            return true;
        }return false;
    }
}