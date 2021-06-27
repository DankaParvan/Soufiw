package ru.danka.lololowka;

import org.bukkit.plugin.java.JavaPlugin;

public final class Lololowka extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new LololowkaListener(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
