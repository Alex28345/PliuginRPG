package fr.alex.PluginRPG.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class splatoon implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("splatoon")) {
            Player player = (Player) sender;

            if (player.isOp()) {
                if (args.length == 0) {
                    if  (StartGame.SplaON == true){
                        StartGame.SplaON = false;
                    }
                    if  (StartGame.SplaON == false){
                        StartGame.SplaON = true;
                    }

                }return true;
            }
        }return false;
    }
}