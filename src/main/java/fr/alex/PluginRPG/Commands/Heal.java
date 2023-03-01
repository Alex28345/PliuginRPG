package fr.alex.PluginRPG.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Heal implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("heal")) {
            Player player = (Player) sender;
            World world = player.getWorld();

            List<Player> playerList = world.getPlayers();
            for (Player players : playerList) {
                if (player.isOp()) {
                    if (args.length == 0) {
                        players.setHealth(20);
                    } return true;
                }
            }
        }return false;
    }
}