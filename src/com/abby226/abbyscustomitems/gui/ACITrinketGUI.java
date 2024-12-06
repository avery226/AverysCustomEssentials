package com.abby226.abbyscustomitems.gui;

import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ACITrinketGUI implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 54, "Functional Items GUI");
            inv.setItem(0, new ItemStack(ItemManager.Bell));
            inv.setItem(1, new ItemStack(ItemManager.ExplodingEmerald));
            inv.setItem(2, new ItemStack(ItemManager.ExplodingStar));
            inv.setItem(3, new ItemStack(ItemManager.Otherside));
            inv.setItem(4, new ItemStack(ItemManager.PigStep));
            inv.setItem(5, new ItemStack(ItemManager.Relic));
            inv.setItem(6, new ItemStack(ItemManager.OldWhistle));



            p.openInventory(inv);
            return true;
        }
        return false;
    }
}