package me.vaultsdevelopment.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vaultsgui implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("VaultsGUI")) {
            Player Player = (Player) sender;
            if (sender.hasPermission("run.vaultgui")) {
                if (sender instanceof Player){
                    Player.openInventory(Player.getEnderChest());
                } else {
                 p.sendMessage("You aren't a player")
                }
            } else {
                System.out.println("No permission.");
            }
        }

        return true;
    }
}
