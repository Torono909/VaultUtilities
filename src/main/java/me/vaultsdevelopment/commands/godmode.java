package me.vaultsdevelopment.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class godmode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.isInvulnerable()) {
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "You have disabled god mode.");
            } else {
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "You have enabled god mode.");
            }
        }
        return true;
    }
}
