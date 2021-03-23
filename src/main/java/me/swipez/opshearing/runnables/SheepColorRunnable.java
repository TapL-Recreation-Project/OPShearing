package me.swipez.opshearing.runnables;

import me.swipez.opshearing.OPShearing;
import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;
import org.bukkit.scheduler.BukkitRunnable;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SheepColorRunnable extends BukkitRunnable {

    OPShearing plugin;

    public SheepColorRunnable(OPShearing plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        for (Sheep sheep : plugin.opSheep){
            List<DyeColor> colors = Arrays.asList(DyeColor.values());
            Random random = new Random();
            int randomcolor = random.nextInt(colors.size());
            sheep.setColor(colors.get(randomcolor));
        }
    }
}
