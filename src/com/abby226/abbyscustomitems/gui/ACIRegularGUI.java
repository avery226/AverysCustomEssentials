package com.abby226.abbyscustomitems.gui;

import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ACIRegularGUI implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 54, "Collectibles");
            inv.setItem(0, new ItemStack(ItemManager.ShinyCrystal));
            inv.setItem(1, new ItemStack(ItemManager.VillagerMoney));
            inv.setItem(2, new ItemStack(ItemManager.GoldenDelApple));
            inv.setItem(3, new ItemStack(ItemManager.ODLantern));
            inv.setItem(4, new ItemStack(ItemManager.OldFeather));
            inv.setItem(5, new ItemStack(ItemManager.DinoBone));
            inv.setItem(6, new ItemStack(ItemManager.GoatWheat));
            inv.setItem(7, new ItemStack(ItemManager.PandaBamboo));
            inv.setItem(8, new ItemStack(ItemManager.UncleJoe));
            inv.setItem(9, new ItemStack(ItemManager.ShinyShard));
            inv.setItem(10, new ItemStack(ItemManager.HotPotato));
            inv.setItem(11, new ItemStack(ItemManager.Rose));
            inv.setItem(12, new ItemStack(ItemManager.SecretKey));
            inv.setItem(13, new ItemStack(ItemManager.KBStick));





            inv.setItem(27, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(28, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(29, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(30, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(31, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(32, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(33, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(34, new ItemStack(ItemManager.ComingSoon));
            inv.setItem(35, new ItemStack(ItemManager.ComingSoon));


            inv.setItem(36, new ItemStack(ItemManager.HalloweenPumpkin));
            inv.setItem(37, new ItemStack(ItemManager.PumpkinStem));
            inv.setItem(38, new ItemStack(ItemManager.SpookyWeb));
            inv.setItem(39, new ItemStack(ItemManager.GraveLantern));
            inv.setItem(40, new ItemStack(ItemManager.BrewingPot));
            inv.setItem(41, new ItemStack(ItemManager.SantaSack));
            inv.setItem(42, new ItemStack(ItemManager.ChristmasStar));
            inv.setItem(43, new ItemStack(ItemManager.Stockings));
            inv.setItem(44, new ItemStack(ItemManager.TinyXTree));
            inv.setItem(45, new ItemStack(ItemManager.NaughtyCoal));
            inv.setItem(46, new ItemStack(ItemManager.ChristmasSnow));
            inv.setItem(47, new ItemStack(ItemManager.BirthdayCake));



            p.openInventory(inv);
            return true;
        }
        return false;
    }
}
