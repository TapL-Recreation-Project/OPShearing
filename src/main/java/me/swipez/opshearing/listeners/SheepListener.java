package me.swipez.opshearing.listeners;

import me.swipez.opshearing.OPShearing;
import me.swipez.opshearing.items.ItemManager;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SheepListener implements Listener {

    OPShearing plugin;

    public SheepListener(OPShearing plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerUseDye(PlayerInteractAtEntityEvent event){
        Player player = event.getPlayer();
        ItemStack mainhand = player.getInventory().getItemInMainHand();
        if (equals(mainhand, ItemManager.SUPER_DYE) && event.getRightClicked().getType().equals(EntityType.SHEEP)){
            mainhand.setAmount(mainhand.getAmount()-1);
            Sheep sheep = (Sheep) event.getRightClicked();
            plugin.opSheep.add(sheep);
        }
    }
    @EventHandler
    public void onPlayerShear(PlayerShearEntityEvent event){
        Player player = event.getPlayer();
        ItemStack mainhand = player.getInventory().getItemInMainHand();
        if (event.getEntity().getType().equals(EntityType.SHEEP)){
            Sheep sheep = (Sheep) event.getEntity();
            Location location = sheep.getLocation().add(0,0.4,0);
            World world = sheep.getWorld();
            if (plugin.opSheep.contains(sheep)){
                if (equals(mainhand, new ItemStack(Material.SHEARS))){
                    Random random = new Random();
                    int times = random.nextInt(2)+1;
                    generateOPItem(times, location, world);
                }
                else if (equals(mainhand, ItemManager.SHEARS_2)){
                    generateOPItem(5, location, world);
                    event.getItem().setAmount(0);
                }
                else if (equals(mainhand, ItemManager.SHEARS_3)){
                    generateOPItem(10, location, world);
                    event.getItem().setAmount(0);
                }
                else if (equals(mainhand, ItemManager.SHEARS_4)){
                    generateOPItem(20, location, world);
                    event.getItem().setAmount(0);
                }
                else if (equals(mainhand, ItemManager.SHEARS_5)){
                    generateOPItem(100, location, world);
                    event.getItem().setAmount(0);
                }
            }
        }
    }

    public void generateOPItem(int times, Location location, World world){
        for (int i=0;i<times;i++){
            List<String> mats = plugin.getConfig().getStringList("fallitems");
            List<String> counts = plugin.getConfig().getStringList("fallitemscount");
            List<String> enchants = plugin.getConfig().getStringList("enchantslist");
            List<String> peffects = plugin.getConfig().getStringList("peffects");
            int min = 0;
            int max = mats.size() - 1;
            double random = Math.random() * (max - min + 1) + min;
            int stackcount = Integer.parseInt(counts.get((int) random));
            ItemStack ritem = new ItemStack(Material.valueOf(mats.get((int) random).toUpperCase()), stackcount);
            if (ritem.getType() == Material.ENCHANTED_BOOK) {
                ItemMeta meta = ritem.getItemMeta();
                EnchantmentStorageMeta emeta = (EnchantmentStorageMeta) meta;
                int mine = 0;
                int maxe = enchants.size() - 1;
                double rench = Math.random() * (maxe - mine + 1) + mine;
                emeta.addStoredEnchant(Enchantment.getByKey(NamespacedKey.minecraft(enchants.get((int) rench).toLowerCase())), 10, true);
                ritem.setItemMeta(emeta);
            }
            if (ritem.getType() == Material.POTION) {
                ItemMeta meta = ritem.getItemMeta();
                PotionMeta pmeta = (PotionMeta) meta;
                int mine = 0;
                int maxe = peffects.size() - 1;
                double rench = Math.random() * (maxe - mine + 1) + mine;
                pmeta.addCustomEffect(new PotionEffect((PotionEffectType.getByName(peffects.get((int) rench).toUpperCase())), 1200, 2), true);
                pmeta.setColor(Color.YELLOW);
                pmeta.setDisplayName("OP Potion");
                ritem.setItemMeta(pmeta);
            }
            if (ritem.getType() == Material.NETHERITE_HOE){
                ItemMeta meta = ritem.getItemMeta();
                List<String> lore = new ArrayList<>();
                lore.add(ChatColor.GRAY+"Knockback C");
                meta.setLore(lore);
                meta.addEnchant(Enchantment.KNOCKBACK, 100, true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                ritem.setItemMeta(meta);
            }
            world.dropItem(location, ritem);
        }
    }
    public static boolean equals(ItemStack a, ItemStack b)
    {
        if (a.getType() != b.getType()){
            return false;
        }
        return a.getItemMeta().getDisplayName().equals(b.getItemMeta().getDisplayName());
    }
}
