package fr.alex.PluginRPG.Commands;

import fr.alex.PluginRPG.Items;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Plume implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("Plume")) {
            Player player = (Player) sender;

            if (player.isOp()) {
                if (args.length == 0) {
                    player.getInventory().setItem(0, Items.plume());
                }return true;
            }
        }return false;
    }
}