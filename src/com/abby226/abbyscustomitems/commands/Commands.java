package com.abby226.abbyscustomitems.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!( sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command!");


            return true;
        }

        Player player = (Player) sender;















        return true;


    }
}
