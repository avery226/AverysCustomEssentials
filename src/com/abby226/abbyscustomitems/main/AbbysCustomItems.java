package com.abby226.abbyscustomitems.main;

import com.abby226.abbyscustomitems.events.*;
import com.abby226.abbyscustomitems.gui.ACIOPArmorGUI;
import com.abby226.abbyscustomitems.gui.ACIRegularGUI;
import com.abby226.abbyscustomitems.gui.ACITrinketGUI;
import com.abby226.abbyscustomitems.gui.BeaconKit;
import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;





public class AbbysCustomItems extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "ABBYS CUSTOM ITEMS PLUGIN SUCCESSFULLY ENABLED");
        ItemManager.init();
        getCommand("collectibles").setExecutor(new ACIRegularGUI());
        getCommand("aciTrinketGUI").setExecutor(new ACITrinketGUI());
        getCommand("OPArmor").setExecutor(new ACIOPArmorGUI());
        getCommand("BeaconKit").setExecutor(new BeaconKit());




        getServer().getPluginManager().registerEvents(new ExplodingEmerald(), this);
        getServer().getPluginManager().registerEvents(new BellRinger(), this);
        getServer().getPluginManager().registerEvents(new ExplodingStar(), this);
        getServer().getPluginManager().registerEvents(new OthersideMusic(), this);
        getServer().getPluginManager().registerEvents(new PigStepMusic(), this);
        getServer().getPluginManager().registerEvents(new RelicMusic(), this);


        }


        @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("Plugin disabled!");
    }
}


