package fr.alex.PluginRPG;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Items {

    public static ItemStack getItem(Material material, String Customname){
        ItemStack thor = new ItemStack(material, 1);
        ItemMeta meta = thor.getItemMeta();
        meta.setDisplayName((ChatColor.RED + Customname));
        meta.removeItemFlags();
        thor.setItemMeta(meta);
        return thor;
    }
    public static ItemStack plume(){
        ItemStack plume = new ItemStack(Material.FEATHER, 1);
        ItemMeta metaplume = plume.getItemMeta();
        metaplume.setDisplayName((ChatColor.GREEN + "MINI-JEUX"));
        metaplume.addEnchant(Enchantment.DURABILITY, 1, true);
        plume.setItemMeta(metaplume);
        return plume;
    }
    public static ItemStack chestplateb(){
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta chestmeta = chestplate.getItemMeta();
        LeatherArmorMeta colormeta = (LeatherArmorMeta)chestplate.getItemMeta();
        colormeta.setColor(Color.BLUE);
        chestmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        chestplate.setItemMeta(chestmeta);
        chestplate.setItemMeta(colormeta);
        return chestplate;
    }
    public static ItemStack chestplater(){
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta chestmeta = chestplate.getItemMeta();
        LeatherArmorMeta colormeta = (LeatherArmorMeta)chestplate.getItemMeta();
        colormeta.setColor(Color.RED);
        chestmeta.addEnchant(Enchantment.DURABILITY, 5, true);
        chestplate.setItemMeta(chestmeta);
        chestplate.setItemMeta(colormeta);
        return chestplate;
    }
}
