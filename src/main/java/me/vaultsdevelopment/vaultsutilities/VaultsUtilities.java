package me.vaultsdevelopment.vaultsutilities;


import me.vaultsdevelopment.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class VaultsUtilities extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("VaultsGUI").setExecutor(new vaultsgui());
        getCommand("Enderchestt").setExecutor(new ESSEC());
        getCommand("heal").setExecutor(new Heal());
        getCommand("godmode").setExecutor(new godmode());
        getCommand("Fly").setExecutor(new Flight());
        System.out.println("Vaults: SYSTEM LOADED, API LOADED");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
