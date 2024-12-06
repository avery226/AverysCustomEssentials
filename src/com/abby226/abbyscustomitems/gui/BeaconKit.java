package com.abby226.abbyscustomitems.gui;

import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BeaconKit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 27, "Beacon Kit");
            inv.setItem(4, new ItemStack(ItemManager.BeaconKitBeacon));
            inv.setItem(12, new ItemStack(ItemManager.BeaconStack));
            inv.setItem(13, new ItemStack(ItemManager.BeaconStack));
            inv.setItem(14, new ItemStack(ItemManager.PartialBeaconOne));
            inv.setItem(26, new ItemStack(ItemManager.BeaconFuel));




            p.openInventory(inv);
            return true;
        }
        return false;
    }
}