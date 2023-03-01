package fr.alex.PluginRPG.Commands;

import fr.alex.PluginRPG.listeners.Death;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class revive implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("revive")) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            World world = player.getWorld();
            List<Player> playerList = world.getPlayers();
            if(player.isOp()){
                if (args.length == 1){
                    for (Player players : playerList) {
                            if(args[0].equalsIgnoreCase(players.getName())){
                                Death.mort.remove(players);
                                players.setHealth(20);
                                players.setFoodLevel(20);
                                players.teleport(location);
                                players.setGameMode(GameMode.ADVENTURE);
                            }
                    }
                }
            }
            return true;
        }
            return false;
    }
}

