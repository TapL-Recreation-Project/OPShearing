package me.swipez.opshearing;

import me.swipez.opshearing.bstats.Metrics;
import me.swipez.opshearing.items.ItemLoreManager;
import me.swipez.opshearing.items.ItemManager;
import me.swipez.opshearing.listeners.AnvilClick;
import me.swipez.opshearing.listeners.SheepListener;
import me.swipez.opshearing.runnables.SheepColorRunnable;
import org.bukkit.entity.Sheep;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.List;

public final class OPShearing extends JavaPlugin {

    public List<Sheep> opSheep = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemLoreManager.initLore();
        ItemManager.initRecipes(this);
        BukkitTask SheepColor = new SheepColorRunnable(this).runTaskTimer(this, 5, 5);
        getServer().getPluginManager().registerEvents(new AnvilClick(), this);
        getServer().getPluginManager().registerEvents(new SheepListener(this), this);
        saveDefaultConfig();
        getConfig().options().copyDefaults();
        new Metrics(this, 10784);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
