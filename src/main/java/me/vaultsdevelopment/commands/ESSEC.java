package me.vaultsdevelopment.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ESSEC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (sender instanceof Player){
            Player p = (Player) sender;
            p.openInventory(p.getEnderChest());
        } else {
            sender.sendMessage("You are not a player to do this command!");
        }
        return true;
    }
}
