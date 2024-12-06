package com.abby226.abbyscustomitems.gui;

import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ACIOPArmorGUI implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 54, "OP Armor GUI");
            inv.setItem(13, new ItemStack(ItemManager.MythicalHelmet));
            inv.setItem(22, new ItemStack(ItemManager.MythicalChestplate));
            inv.setItem(31, new ItemStack(ItemManager.MythicalLeggings));
            inv.setItem(40, new ItemStack(ItemManager.MythicalBoots));
            inv.setItem(20, new ItemStack(ItemManager.ChromiumSword));
            inv.setItem(29, new ItemStack(ItemManager.MinerPick));
            inv.setItem(38, new ItemStack(ItemManager.SilkTouchPick));
            inv.setItem(24, new ItemStack(ItemManager.WoodCutterAxe));
            inv.setItem(33, new ItemStack(ItemManager.DiggersShovel));
            inv.setItem(42, new ItemStack(ItemManager.FarmerHoe));
            inv.setItem(53, new ItemStack(ItemManager.MythicalStand));



            p.openInventory(inv);
            return true;
        }
        return false;
    }
}