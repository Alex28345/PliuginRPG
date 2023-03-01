package fr.alex.PluginRPG.listeners;

import fr.alex.PluginRPG.Commands.StartGame;
import fr.alex.PluginRPG.Items;
import fr.alex.PluginRPG.Main;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class MenuKits implements Listener {

    private Main main;
    public MenuKits(Main main){
        this.main = main;
    }

    @EventHandler
    public void OpenKitMenu(PlayerInteractEvent event) {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        ItemStack item = event.getItem();
        World world = player.getWorld();
        Location teamb = new Location(world, -24, 120, 299);
        Location teamr = new Location(world, -24, 120, 281);
            if(item == null) {
                return;
            }
            if(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "MINI-JEUX")) {
                Inventory inv = Bukkit.createInventory(null, 45, "§8MINI-JEUX");

                for (int i = 0; i < inv.getSize(); i++) {
                    inv.setItem(i, Items.getItem(Material.GRAY_STAINED_GLASS_PANE, ""));
                }
                inv.setItem(10, (Items.getItem(Material.SUNFLOWER, "1.2.3 soleil")));
                inv.setItem(12, (Items.getItem(Material.SNOWBALL, "PRISONNIER")));
                inv.setItem(14, (Items.getItem(Material.SLIME_BALL, "TRADE")));
                inv.setItem(16, (Items.getItem(Material.OAK_LEAVES, "BUILD")));
                inv.setItem(28, (Items.getItem(Material.WATER_BUCKET, "DROPPER")));
                inv.setItem(30, (Items.getItem(Material.SAND, "PUISSANCE4")));
                inv.setItem(32, (Items.getItem(Material.HOPPER, "Hopper")));
                inv.setItem(21, (Items.getItem(Material.IRON_DOOR, "PORTE")));
                inv.setItem(23, (Items.getItem(Material.DIAMOND_PICKAXE, "MINAGE")));
                inv.setItem(25, (Items.getItem(Material.COOKED_BEEF, "MACDO")));
                inv.setItem(34, (Items.getItem(Material.OAK_BOAT, "KART")));

                player.openInventory(inv);
            }



            if ((item.getItemMeta().getDisplayName().equals(ChatColor.RED + "KILLER")) ){
                int var = 0;
                player.getWorld().getPlayers();
                List<Player> playerList = world.getPlayers();
                Inventory inv_kill = Bukkit.createInventory(null, 18, "§7KILLER");
                for (Player players : playerList) {
                    if(Death.mort.contains(players)==false) {
                        ItemStack skull = new ItemStack(Material.SKELETON_SKULL, 1);
                        ItemMeta skullmeta = skull.getItemMeta();
                        skullmeta.setDisplayName((ChatColor.RED + players.getName()));
                        skullmeta.removeItemFlags();
                        skull.setItemMeta(skullmeta);
                        inv_kill.setItem(var, skull);
                        var += 1;
                    }
                }
                player.openInventory(inv_kill);
            }



            if ((item.getItemMeta().getDisplayName().equals(ChatColor.RED + "Player selection")) ){
                int var = 0;
                player.getWorld().getPlayers();
                List<Player> playerList = world.getPlayers();
                Inventory inv_select = Bukkit.createInventory(null, 27, "selection");
                inv_select.setItem(26, (Items.getItem(Material.RED_DYE, "VIDER")));
                for (Player players : playerList) {
                    inv_select.setItem(var, (Items.getItem(Material.WHITE_CONCRETE_POWDER, (ChatColor.RED+players.getName()))));
                    var+=1;
                }
                player.openInventory(inv_select);
            }

            if(item.getItemMeta().getDisplayName().equals(ChatColor.RED+ "Team rouge")) {
                player.sendMessage("Team rouge choisie");
                StartGame.RedTeam.add(player);
                player.teleport(teamr);
                player.getInventory().setChestplate(Items.chestplater());

                player.getInventory().clear(3);
                player.getInventory().clear(4);
                player.getInventory().clear(5);
                player.getInventory().setItem(8, (Items.getItem(Material.BARRIER, "Quitter")));
            }




            if(item.getItemMeta().getDisplayName().equals(ChatColor.BLUE+ "Team bleue")) {
                player.sendMessage("Team bleue choisie");
                StartGame.BlueTeam.add(player);
                player.getInventory().setChestplate(Items.chestplateb());
                player.teleport(teamb);
                player.getInventory().clear(3);
                player.getInventory().clear(4);
                player.getInventory().clear(5);
                player.getInventory().setItem(8, (Items.getItem(Material.BARRIER, "Quitter")));

            }



            if(item.getItemMeta().getDisplayName().equals(ChatColor.RED+"Quitter")) {
                StartGame.BlueTeam.remove(player);
                StartGame.RedTeam.remove(player);
                Location ballon = new Location(world, 3, 122, 290);
                player.getInventory().setChestplate(null);
                player.getInventory().clear(3);
                player.getInventory().clear(4);
                player.getInventory().clear(5);
                player.getInventory().clear(8);
                player.teleport(ballon);
                if(player.isOp()!=true) {
                    player.getInventory().clear(8);
                    player.setOp(true);
                    ItemStack teamblue = new ItemStack(Material.BLUE_DYE, 1);
                    ItemMeta mteamblue = teamblue.getItemMeta();
                    mteamblue.setDisplayName((ChatColor.BLUE+ "Team bleue"));
                    teamblue.setItemMeta(mteamblue);
                    ItemStack teamred = new ItemStack(Material.RED_DYE, 1);
                    ItemMeta mteamred = teamred.getItemMeta();
                    mteamred.setDisplayName((ChatColor.RED+ "Team rouge"));
                    teamred.setItemMeta(mteamred);
                    player.getInventory().setItem(3,teamblue);
                    player.getInventory().setItem(5,teamred);
                    player.setOp(false);
                }else {
                    player.getInventory().clear(8);
                    ItemStack teamblue = new ItemStack(Material.BLUE_DYE, 1);
                    ItemMeta mteamblue = teamblue.getItemMeta();
                    mteamblue.setDisplayName((ChatColor.BLUE+ "Team bleue"));
                    teamblue.setItemMeta(mteamblue);
                    ItemStack teamred = new ItemStack(Material.RED_DYE, 1);
                    ItemMeta mteamred = teamred.getItemMeta();
                    mteamred.setDisplayName((ChatColor.RED+ "Team rouge"));
                    teamred.setItemMeta(mteamred);
                    player.getInventory().setItem(3,teamblue);
                    player.getInventory().setItem(5,teamred);
                }
            }
        }
    }


