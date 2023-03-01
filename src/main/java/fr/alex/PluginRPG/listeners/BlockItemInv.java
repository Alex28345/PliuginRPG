package fr.alex.PluginRPG.listeners;

import fr.alex.PluginRPG.Items;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BlockItemInv implements Listener {
    @EventHandler
    public void OnPlayerDrop (PlayerDropItemEvent event){
        Player player = event.getPlayer();
        Item it = event.getItemDrop();
        ItemStack item =  it.getItemStack();

        if(item == null){
            return;
        }
        if(item.getType().equals(Material.FEATHER )){
            item.getItemMeta().hasDisplayName();
                it.remove();
                player.getInventory().setItem(0, item);

        }
    }
    @EventHandler
    public void UseBed(BlockPlaceEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();
        Location blockLocation = block.getLocation();
        if(block.getType().equals(Material.BARRIER)){
            if(player.getGameMode().equals(GameMode.SURVIVAL)){
                block.setType(Material.AIR);
                player.getInventory().setItem(8, (Items.getItem(Material.BARRIER, "Quitter")));

            }
        }
    }

    @EventHandler
    public void OnPlayerClick (InventoryClickEvent event){
        Inventory inv = event.getInventory();
        final Player player = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();

        if(item == null){
            return;
        }
        if(item.getType().equals(Material.FEATHER)){
            event.setCancelled(true);
            player.setItemOnCursor(null);
        }
    }

}
