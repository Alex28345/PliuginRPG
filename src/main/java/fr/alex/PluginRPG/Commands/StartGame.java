package fr.alex.PluginRPG.Commands;


import fr.alex.PluginRPG.Main;
import fr.alex.PluginRPG.listeners.Death;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
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
            Player player = (Player) sender;
            World world = player.getWorld();


            if(player.isOp()){
            if (args.length == 0) {

                List<Player> playerList = world.getPlayers();
                Location lobby = new Location(world, 2, 64, 21);
                Death.mort.clear();
                BlueTeam.clear();
                RedTeam.clear();
                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_CAT;
                    Location location = players.getLocation();
                    players.playSound(location,sound,SoundCategory.RECORDS,1,1);
                    players.teleport(lobby);
                    players.getInventory().clear();
                    ItemStack plume = new ItemStack(Material.FEATHER, 1);
                    ItemMeta metaplume = plume.getItemMeta();
                    metaplume.setDisplayName((ChatColor.GREEN + "MINI-JEUX"));
                    metaplume.addEnchant(Enchantment.DURABILITY, 1, true);
                    plume.setItemMeta(metaplume);
                    players.setGameMode(GameMode.ADVENTURE);
                    player.setGameMode(GameMode.CREATIVE);

                    player.getInventory().setItem(0, plume);
                }

                return true;
            }
            if (args.length == 1) {
                if(args[0].equalsIgnoreCase("soleil") ){
                    ItemStack killer = new ItemStack(Material.DIAMOND_SWORD, 1);
                    ItemMeta metakiller = killer.getItemMeta();
                    metakiller.setDisplayName((ChatColor.RED + "KILLER"));
                    metakiller.addEnchant(Enchantment.DURABILITY, 1, true);
                    killer.setItemMeta(metakiller);
                    player.getInventory().setItem(4,killer);
                }


                if(args[0].equalsIgnoreCase("puissance") ){
                    ItemStack player_selction = new ItemStack(Material.BAMBOO, 1);
                    ItemMeta metakiller = player_selction.getItemMeta();
                    metakiller.setDisplayName((ChatColor.RED + "Player selection"));
                    metakiller.addEnchant(Enchantment.DURABILITY, 1, true);
                    player_selction.setItemMeta(metakiller);
                    player.getInventory().setItem(4,player_selction);
                }

                if(args[0].equalsIgnoreCase("kokoa") ){
                    List<Player> playerList= world.getPlayers();
                    for (Player players : playerList) {
                        Sound sound = Sound.MUSIC_DISC_11;
                        Location location = players.getLocation();
                        players.playSound(location,sound,SoundCategory.RECORDS,1,1);
                    }
                }


                if(args[0].equalsIgnoreCase("ballon") ){
                    List<Player> playerList= world.getPlayers();
                    for (Player players : playerList) {
                        ItemStack teamblue = new ItemStack(Material.BLUE_DYE, 1);
                        ItemMeta mteamblue = teamblue.getItemMeta();
                        mteamblue.setDisplayName((ChatColor.BLUE+ "Team bleue"));
                        teamblue.setItemMeta(mteamblue);
                        ItemStack teamred = new ItemStack(Material.RED_DYE, 1);
                        ItemMeta mteamred = teamred.getItemMeta();
                        mteamred.setDisplayName((ChatColor.RED+ "Team rouge"));
                        teamred.setItemMeta(mteamred);
                        players.getInventory().setItem(3,teamblue);
                        players.getInventory().setItem(5,teamred);
                    }


                }if(args[0].equalsIgnoreCase("jeuballon") ){
                    Bukkit.getServer().broadcastMessage("Red Team"+RedTeam.toString());
                    Bukkit.getServer().broadcastMessage("Blue Team"+BlueTeam.toString());
                }


                return true;
            }
        }

    }return false;
}
}
