package me.swipez.opshearing.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;

public class AnvilPrepareItemListener implements Listener {
    @EventHandler
    public void onAnvilMakeItem(PrepareAnvilEvent event){
        int bookslot = 0;
        for (int i=0;i<event.getInventory().getSize();i++){
            if (event.getInventory().getItem(i) != null){
                if (event.getInventory().getItem(i).getType().equals(Material.ENCHANTED_BOOK)){
                    bookslot = i;
                }
            }
        }
        if (bookslot == 1){
            if (event.getInventory().getItem(0) != null){
                ItemStack cloneditem = new ItemStack(event.getInventory().getItem(0).getType());
                ItemMeta originalmeta = event.getInventory().getItem(0).getItemMeta().clone();
                EnchantmentStorageMeta enchantmentStorageMeta = (EnchantmentStorageMeta) event.getInventory().getItem(bookslot).getItemMeta();
                Map<Enchantment, Integer> bookEnchants = enchantmentStorageMeta.getStoredEnchants();
                boolean enchanted = false;
                for (Enchantment enchantment : bookEnchants.keySet()){
                    if (enchantment.canEnchantItem(cloneditem)){
                        originalmeta.addEnchant(enchantment, bookEnchants.get(enchantment), true);
                        enchanted = true;
                    }
                }
                cloneditem.setItemMeta(originalmeta);
                if (enchanted){
                    event.setResult(cloneditem);
                }
                else {
                    event.setResult(null);
                }
            }
        }
    }
}
