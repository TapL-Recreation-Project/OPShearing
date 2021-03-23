package me.swipez.opshearing.items;

import me.swipez.opshearing.OPShearing;
import me.swipez.opshearing.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static final ItemStack SUPER_DYE = ItemBuilder.of(Material.YELLOW_DYE)
            .name(ChatColor.GREEN + "Super Dye")
            .enchantment(Enchantment.CHANNELING, 1)
            .flags(ItemFlag.HIDE_ENCHANTS)
            .build();
    public static final ItemStack SHEARS_2 = ItemBuilder.of(Material.SHEARS)
            .name(ChatColor.GREEN + "Shears 2.0")
            .lore(ItemLoreManager.getShears2lore())
            .enchantment(Enchantment.CHANNELING, 1)
            .flags(ItemFlag.HIDE_ENCHANTS)
            .build();
    public static final ItemStack SHEARS_3 = ItemBuilder.of(Material.SHEARS)
            .name(ChatColor.AQUA + "Shears 3.0")
            .lore(ItemLoreManager.getShears3lore())
            .enchantment(Enchantment.CHANNELING, 1)
            .flags(ItemFlag.HIDE_ENCHANTS)
            .build();
    public static final ItemStack SHEARS_4 = ItemBuilder.of(Material.SHEARS)
            .name(ChatColor.BLUE + "Shears 4.0")
            .lore(ItemLoreManager.getShears4lore())
            .enchantment(Enchantment.CHANNELING, 1)
            .flags(ItemFlag.HIDE_ENCHANTS)
            .build();
    public static final ItemStack SHEARS_5 = ItemBuilder.of(Material.SHEARS)
            .name(ChatColor.RED + "Shears 5.0")
            .lore(ChatColor.GRAY+"You can shear "+ChatColor.LIGHT_PURPLE+"100"+ChatColor.GRAY+" items from sheep!")
            .enchantment(Enchantment.CHANNELING, 1)
            .flags(ItemFlag.HIDE_ENCHANTS)
            .build();

    public static void initRecipes(OPShearing plugin) {
        ItemStack iron_nuggets = new ItemStack(Material.IRON_NUGGET);
        registerShearsRecipe(plugin, "shears_level_2", SHEARS_2, iron_nuggets, Material.DIAMOND);
        registerShearsRecipe(plugin, "shears_level_3", SHEARS_3, SHEARS_2, Material.DIAMOND);
        registerShearsRecipe(plugin, "shears_level_4", SHEARS_4, SHEARS_3, Material.DIAMOND);
        registerShearsRecipe(plugin, "shears_level_5", SHEARS_5, SHEARS_4, Material.DIAMOND);

        registerDyeRecipe(plugin, "super_dye_poppy_coal", Material.POPPY, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_poppy_redstone", Material.POPPY, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_poppy_iron", Material.POPPY, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_poppy_lapis", Material.POPPY, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_poppy_gold", Material.POPPY, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_poppy_diamond", Material.POPPY, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_poppy_netherite", Material.POPPY, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_dandelion_coal", Material.DANDELION, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_dandelion_redstone", Material.DANDELION, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_dandelion_iron", Material.DANDELION, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_dandelion_lapis", Material.DANDELION, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_dandelion_gold", Material.DANDELION, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_dandelion_diamond", Material.DANDELION, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_dandelion_netherite", Material.DANDELION, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_blueorchid_coal", Material.BLUE_ORCHID, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_blueorchid_redstone", Material.BLUE_ORCHID, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_blueorchid_iron", Material.BLUE_ORCHID, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_blueorchid_lapis", Material.BLUE_ORCHID, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_blueorchid_gold", Material.BLUE_ORCHID, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_blueorchid_diamond", Material.BLUE_ORCHID, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_blueorchid_netherite", Material.BLUE_ORCHID, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_allium_coal", Material.ALLIUM, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_allium_redstone", Material.ALLIUM, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_allium_iron", Material.ALLIUM, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_allium_lapis", Material.ALLIUM, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_allium_gold", Material.ALLIUM, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_allium_diamond", Material.ALLIUM, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_allium_netherite", Material.ALLIUM, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_azure_bullet_coal", Material.AZURE_BLUET, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_azure_bullet_redstone", Material.AZURE_BLUET, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_azure_bullet_iron", Material.AZURE_BLUET, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_azure_bullet_lapis", Material.AZURE_BLUET, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_azure_bullet_gold", Material.AZURE_BLUET, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_azure_bullet_diamond", Material.AZURE_BLUET, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_azure_bullet_netherite", Material.AZURE_BLUET, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_red_tulip_coal", Material.RED_TULIP, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_red_tulip_redstone", Material.RED_TULIP, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_red_tulip_iron", Material.RED_TULIP, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_red_tulip_lapis", Material.RED_TULIP, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_red_tulip_gold", Material.RED_TULIP, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_red_tulip_diamond", Material.RED_TULIP, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_red_tulip_netherite", Material.RED_TULIP, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_orange_tulip_coal", Material.ORANGE_TULIP, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_orange_tulip_redstone", Material.ORANGE_TULIP, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_orange_tulip_iron", Material.ORANGE_TULIP, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_orange_tulip_lapis", Material.ORANGE_TULIP, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_orange_tulip_gold", Material.ORANGE_TULIP, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_orange_tulip_diamond", Material.ORANGE_TULIP, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_orange_tulip_netherite", Material.ORANGE_TULIP, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_white_tulip_coal", Material.WHITE_TULIP, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_white_tulip_redstone", Material.WHITE_TULIP, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_white_tulip_iron", Material.WHITE_TULIP, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_white_tulip_lapis", Material.WHITE_TULIP, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_white_tulip_gold", Material.WHITE_TULIP, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_white_tulip_diamond", Material.WHITE_TULIP, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_white_tulip_netherite", Material.WHITE_TULIP, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_pink_tulip_coal", Material.PINK_TULIP, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_pink_tulip_redstone", Material.PINK_TULIP, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_pink_tulip_iron", Material.PINK_TULIP, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_pink_tulip_lapis", Material.PINK_TULIP, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_pink_tulip_gold", Material.PINK_TULIP, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_pink_tulip_diamond", Material.PINK_TULIP, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_pink_tulip_netherite", Material.PINK_TULIP, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_coal", Material.OXEYE_DAISY, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_redstone", Material.OXEYE_DAISY, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_iron", Material.OXEYE_DAISY, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_lapis", Material.OXEYE_DAISY, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_gold", Material.OXEYE_DAISY, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_diamond", Material.OXEYE_DAISY, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_oxeye_daisy_netherite", Material.OXEYE_DAISY, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_lilac_coal", Material.LILAC, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lilac_redstone", Material.LILAC, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lilac_iron", Material.LILAC, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lilac_lapis", Material.LILAC, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lilac_gold", Material.LILAC, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lilac_diamond", Material.LILAC, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lilac_netherite", Material.LILAC, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_rose_bush_coal", Material.ROSE_BUSH, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_rose_bush_redstone", Material.ROSE_BUSH, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_rose_bush_iron", Material.ROSE_BUSH, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_rose_bush_lapis", Material.ROSE_BUSH, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_rose_bush_gold", Material.ROSE_BUSH, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_rose_bush_diamond", Material.ROSE_BUSH, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_rose_bush_netherite", Material.ROSE_BUSH, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_peony_coal", Material.PEONY, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_peony_redstone", Material.PEONY, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_peony_iron", Material.PEONY, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_peony_lapis", Material.PEONY, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_peony_gold", Material.PEONY, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_peony_diamond", Material.PEONY, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_peony_netherite", Material.PEONY, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_cornflower_coal", Material.CORNFLOWER, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_cornflower_redstone", Material.CORNFLOWER, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_cornflower_iron", Material.CORNFLOWER, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_cornflower_lapis", Material.CORNFLOWER, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_cornflower_gold", Material.CORNFLOWER, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_cornflower_diamond", Material.CORNFLOWER, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_cornflower_netherite", Material.CORNFLOWER, Material.NETHERITE_BLOCK);

        registerDyeRecipe(plugin, "super_dye_lily_valley_coal", Material.LILY_OF_THE_VALLEY, Material.COAL_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lily_valley_redstone", Material.LILY_OF_THE_VALLEY, Material.REDSTONE_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lily_valley_iron", Material.LILY_OF_THE_VALLEY, Material.IRON_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lily_valley_lapis", Material.LILY_OF_THE_VALLEY, Material.LAPIS_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lily_valley_gold", Material.LILY_OF_THE_VALLEY, Material.GOLD_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lily_valley_diamond", Material.LILY_OF_THE_VALLEY, Material.DIAMOND_BLOCK);
        registerDyeRecipe(plugin, "super_dye_lily_valley_netherite", Material.LILY_OF_THE_VALLEY, Material.NETHERITE_BLOCK);
    }

    @SuppressWarnings("deprecation")
    private static void registerShearsRecipe(OPShearing plugin, String id, ItemStack shearResult, ItemStack surroundingIngredient, Material centerItem) {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, id), shearResult)
                .shape("SSS", "SPS", "SSS")
                .setIngredient('S', new RecipeChoice.ExactChoice(surroundingIngredient))
                .setIngredient('P', centerItem);
        Bukkit.addRecipe(recipe);
    }
    private static void registerDyeRecipe(OPShearing plugin, String id, Material surroundingIngredient, Material centerItem) {
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, id), ItemManager.SUPER_DYE)
                .shape("SSS", "SPS", "SSS")
                .setIngredient('S', surroundingIngredient)
                .setIngredient('P', centerItem);
        Bukkit.addRecipe(recipe);
    }
}
