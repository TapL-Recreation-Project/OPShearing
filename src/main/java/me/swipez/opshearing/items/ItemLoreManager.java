package me.swipez.opshearing.items;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class ItemLoreManager {

    public static List<String> shears2lore = new ArrayList<>();
    public static List<String> shears3lore = new ArrayList<>();
    public static List<String> shears4lore = new ArrayList<>();

    public static void initLore(){
        shears2lore.add(ChatColor.GRAY+"You can shear "+ChatColor.LIGHT_PURPLE+"5"+ChatColor.GRAY+" items from sheep!");
        shears2lore.add(" ");
        shears2lore.add(ChatColor.GREEN+ChatColor.BOLD.toString()+"NEXT UPGRADE:");
        shears2lore.add(ChatColor.GRAY+"Shears "+ChatColor.GOLD+"3.0"+ChatColor.GRAY+" (Ability to shear "+ChatColor.LIGHT_PURPLE+"10"+ChatColor.GRAY+" items)");

        shears3lore.add(ChatColor.GRAY+"You can shear "+ChatColor.LIGHT_PURPLE+"10"+ChatColor.GRAY+" items from sheep!");
        shears3lore.add(" ");
        shears3lore.add(ChatColor.GREEN+ChatColor.BOLD.toString()+"NEXT UPGRADE:");
        shears3lore.add(ChatColor.GRAY+"Shears "+ChatColor.GOLD+"4.0"+ChatColor.GRAY+" (Ability to shear "+ChatColor.LIGHT_PURPLE+"20"+ChatColor.GRAY+" items)");

        shears4lore.add(ChatColor.GRAY+"You can shear "+ChatColor.LIGHT_PURPLE+"20"+ChatColor.GRAY+" items from sheep!");
        shears4lore.add(" ");
        shears4lore.add(ChatColor.GREEN+ChatColor.BOLD.toString()+"NEXT UPGRADE:");
        shears4lore.add(ChatColor.GRAY+"Shears "+ChatColor.GOLD+"5.0"+ChatColor.GRAY+" (Ability to shear "+ChatColor.LIGHT_PURPLE+"100"+ChatColor.GRAY+" items)");
    }

    public static List<String> getShears2lore() {
        return shears2lore;
    }

    public static List<String> getShears3lore() {
        return shears3lore;
    }

    public static List<String> getShears4lore() {
        return shears4lore;
    }

}
