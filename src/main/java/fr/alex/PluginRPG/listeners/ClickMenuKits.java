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

public class ClickMenuKits implements Listener {

    @EventHandler
    public void ClickMenuKits(InventoryClickEvent event) {
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

        ItemStack plume = Items.plume();

        if (item == null){
            return;
        }
        if (event.getView().getTitle().equals("§8MINI-JEUX")) {
            if (item.getType() == Material.GRAY_STAINED_GLASS_PANE) {
                event.setCancelled(true);
            }
            for (Player players : playerList) {
                player.performCommand("stopsound @a");
                Location playersLocation = players.getLocation();

                if (!players.isOp()){
                    players.getInventory().clear();
                }

                if (item.getType() == Material.SUNFLOWER) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(soleil);
                    player.performCommand("start soleil");
                    player.sendMessage("Lancement du 1,2,3 Soleil");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }


                if (item.getType() == Material.SNOWBALL) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(ballon);
                    player.sendMessage("Lancement du ballon prisonnier");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }

                if (item.getType() == Material.SLIME_BALL) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(trade);
                    player.sendMessage("lancement du mini jeu trade");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }

                if (item.getType() == Material.WATER_BUCKET) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(dropper);
                    player.sendMessage("lancement du dé à coudre");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }

                if (item.getType() == Material.SAND) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(puissance4);
                    player.performCommand("start puissance");
                    player.sendMessage("lancement puissance4");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }
                if (item.getType() == Material.HOPPER) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(hopper);
                    player.sendMessage("lancement du jeu mexique");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }
                if (item.getType() == Material.IRON_DOOR) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.ADVENTURE);
                    }
                    players.teleport(porte);
                    player.sendMessage("lancement du jeu portes");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }
                if (item.getType() == Material.DIAMOND_PICKAXE) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.SURVIVAL);
                        players.getInventory().setItem(4,Items.getItem(Material.DIAMOND_PICKAXE,"pioche"));
                    }
                    players.teleport(minage);
                    player.sendMessage("lancement du minage");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_13, SoundCategory.RECORDS, 1, 1);
                }
                if (item.getType() == Material.COOKED_BEEF) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.SURVIVAL);
                    }
                    players.teleport(mcdo);
                    player.sendMessage("lancement du jeu mcdo");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_CHIRP, SoundCategory.RECORDS, 1, 1);
                }
                if (item.getType() == Material.OAK_BOAT) {
                    if (!Death.mort.contains(players)) {
                        players.setGameMode(GameMode.SURVIVAL);
                    }
                    players.teleport(kart);
                    player.sendMessage("lancement du jeu mario kart");
                    players.playSound(playersLocation, Sound.MUSIC_DISC_BLOCKS, SoundCategory.RECORDS, 1, 1);
                }
            }

        }if (event.getView().getTitle().equals("§7KILLER")) {
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

