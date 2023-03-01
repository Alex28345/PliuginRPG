package fr.alex.PluginRPG.listeners;

import fr.alex.PluginRPG.Items;
import org.bukkit.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ClickInventory implements Listener {

    @EventHandler
    public void Clickinventory(InventoryClickEvent event) {
        Inventory inv = event.getInventory();
        final Player player = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();
        ConsoleCommandSender consoleCommandSender = Bukkit.getConsoleSender();
        World world = player.getWorld();
        List<Player> playerList = world.getPlayers();
        Location soleil = new Location(world, 18, 64, -39);
        Location ballon = new Location(world, 3, 122, 290);
        Location trade = new Location(world, 38, 68, 9);
        Location build = new Location(world, -6, 66, 82);
        Location dropper = new Location(world, -50, 92, -29);
        Location puissance4 = new Location(world, 85, 64, 0);
        Location hopper = new Location(world, 128, 68, 102);
        Location puissanceGame = new Location(world, 97, 64, 0);
        Location porte = new Location(world, -28, 64, 13);
        Location minage = new Location(world, -101, 86, 43);
        Location mcdo = new Location(world, 50, 120, 106);
        Location kart = new Location(world, 153, 65, -110);


        if (item == null){
            return;
        }
        if (event.getView().getTitle().equals("§8MINI-JEUX")){


            if (item.getType() == Material.GRAY_STAINED_GLASS_PANE) {
                event.setCancelled(true);
            }

            if (item.getType() == Material.SUNFLOWER) {
                player.performCommand("stopsound @a");
                player.sendMessage("Lancement du 1,2,3 Soleil");
                player.performCommand("start soleil");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(soleil);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }

                }
            }

            if (item.getType() == Material.SNOWBALL) {
                player.performCommand("stopsound @a");
                player.sendMessage("Lancement du ballon prisonnier");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(ballon);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }
            }

            if (item.getType() == Material.SLIME_BALL) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du mini jeu trade");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(trade);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }
            }

            if (item.getType() == Material.OAK_LEAVES) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du build");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.SURVIVAL);
                    }
                    players.teleport(build);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }
            }

            if (item.getType() == Material.WATER_BUCKET) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du dé à coudre");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(dropper);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }
            }
            if (item.getType() == Material.SAND) {
                player.performCommand("stopsound @a");
                player.sendMessage("Lancement puissance 4");
                player.performCommand("start puissance");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(puissance4);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }
            }
            if (item.getType() == Material.HOPPER) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du jeu hopper");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(hopper);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }
            }

            if (item.getType() == Material.IRON_DOOR) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du jeu Porte");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(porte);
                    if (!players.isOp()){
                        players.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);
                }

            }
            if (item.getType() == Material.OAK_BOAT) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du jeu Mario Kart");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_BLOCKS;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(kart);
                    if (!players.isOp()){
                        players.getInventory().clear();
                        players.getInventory().setItem(4,Items.getItem(Material.OAK_BOAT,"c'est un bateau"));
                    }
                    players.playSound(playersLocation,sound,SoundCategory.RECORDS,1,1);
                }

            }
            if (item.getType() == Material.DIAMOND_PICKAXE) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du jeu Minage");
                player.closeInventory();

                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_13;
                    Location playersLocation = players.getLocation();

                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.SURVIVAL);
                    }
                    players.teleport(minage);
                    if (!players.isOp()){
                        players.getInventory().clear();
                        players.getInventory().setItem(4,Items.getItem(Material.DIAMOND_PICKAXE,"pioche"));
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);


                }
            }

            if (item.getType() == Material.COOKED_BEEF) {
                player.performCommand("stopsound @a");
                player.sendMessage("lancement du jeu mcdo");
                player.closeInventory();


                for (Player players : playerList) {
                    Sound sound = Sound.MUSIC_DISC_CHIRP;
                    Location playersLocation = players.getLocation();
                    if(!Death.mort.contains(players)){
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(mcdo);
                    if (!players.isOp()){
                        player.getInventory().clear();
                    }
                    players.playSound(playersLocation, sound, SoundCategory.RECORDS, 1, 1);

                }
            }
        }


        if (event.getView().getTitle().equals("§7KILLER")) {
            if (item.getType() == Material.SKELETON_SKULL) {
                String str = item.getItemMeta().getDisplayName();
                for (Player players : playerList) {
                    if (str.equalsIgnoreCase(ChatColor.RED+players.getName())){
                        players.getInventory().clear();
                        players.setGameMode(GameMode.SPECTATOR);
                        Death.mort.add(players);
                    }
                }
                player.closeInventory();
            }
        }


        if (event.getView().getTitle().equals("selection")) {
            if (item.getType() == Material.WHITE_CONCRETE_POWDER) {
                String str = item.getItemMeta().getDisplayName();
                player.closeInventory();
                for (Player players : playerList) {
                    if (str.equalsIgnoreCase(ChatColor.RED + players.getName())) {
                        players.getInventory().clear();
                        players.teleport(puissanceGame);
                        players.getInventory().setItem(0, new ItemStack(Material.YELLOW_CONCRETE_POWDER, 64));
                        players.getInventory().setItem(8, new ItemStack(Material.BLUE_CONCRETE_POWDER, 64));
                        players.setGameMode(GameMode.CREATIVE);
                    }
                }
            }

            if (item.getType() == Material.RED_DYE) {
                player.closeInventory();
                for (Player players : playerList) {
                    for (Player morts : Death.mort) {
                        if(players!=morts){
                            players.getInventory().clear();
                            players.setFoodLevel(20);
                            players.setHealth(20);
                            players.setGameMode(GameMode.ADVENTURE);
                            players.teleport(puissance4);
                        }
                    }
                    player.performCommand("/pos1 84,63,6");
                    player.performCommand("/pos2 98,77,-9");
                    player.performCommand("/replace yellow_concrete_powder air");
                    player.performCommand("/replace blue_concrete_powder air");

                    ItemStack player_selction = new ItemStack(Material.BAMBOO, 1);
                    ItemMeta metakiller = player_selction.getItemMeta();
                    metakiller.setDisplayName((ChatColor.RED + "Player selection"));
                    metakiller.addEnchant(Enchantment.DURABILITY, 1, true);
                    player_selction.setItemMeta(metakiller);

                    player.getInventory().setItem(0, Items.plume());
                    player.getInventory().setItem(4, player_selction);
                    player.setGameMode(GameMode.CREATIVE);
                }
            }
        }

    }
}
