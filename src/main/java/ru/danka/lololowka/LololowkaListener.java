package ru.danka.lololowka;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ThreadLocalRandom;

public class LololowkaListener implements Listener {
    JavaPlugin plugin;

    public LololowkaListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    Enchantment[] enchantment = Enchantment.values();

    @EventHandler
    public void craft(CraftItemEvent e) {
        ItemStack currentItem = e.getCurrentItem();
        if (isWeapon(currentItem)) {
            oneEnchant(currentItem,ThreadLocalRandom.current().nextInt(1, 1000));
            return;
        }
        currentItem.setAmount(64);
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(e.getWhoClicked().getInventory().getSize()); i++) {
            e.getWhoClicked().getInventory().addItem(currentItem);
        }
    }

    public boolean isWeapon(ItemStack itemStack) {
        return (itemStack.getType().name().endsWith("SWORD") || itemStack.getType().name().endsWith("AXE") ||
                itemStack.getType().name().endsWith("BOW"));
    }
    public static void oneEnchant(ItemStack item, int level) {
        for (Enchantment enchantment : Enchantment.values()) {
            if (enchantment.canEnchantItem(item) && (Math.random() > 0.3)) {
                item.addUnsafeEnchantment(enchantment, level);
                break;
            }
        }
    }
}
