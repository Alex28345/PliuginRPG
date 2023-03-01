package fr.alex.PluginRPG.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class LapisEnchant implements Listener {

    @EventHandler
    public void LapisEnchant(InventoryOpenEvent event) {
        ItemStack lapis = new ItemStack(Material.LAPIS_BLOCK, 64);
        Inventory inv = event.getInventory();
        final Player player = (Player) event.getPlayer();
        if (inv.getType().equals(InventoryType.ENCHANTING)) {
            inv.setItem(1,lapis);

        }
    }
    @EventHandler
    public void LapisEnchant(InventoryCloseEvent event) {
        ItemStack lapis = new ItemStack(Material.LAPIS_BLOCK, 64);
        Inventory inv = event.getInventory();
        final Player player = (Player) event.getPlayer();

        if (inv.getType().equals(InventoryType.ENCHANTING)) {
            inv.clear();

        }
    }




}
