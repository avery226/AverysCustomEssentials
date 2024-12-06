package com.abby226.abbyscustomitems.events;


import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BellRinger implements Listener {

    @EventHandler
    public static void onLeftClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.Bell.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 1.0F, 1.0F);
                    player.sendMessage("§aYou shall hear thou bell ring!");
                }



            }
        }
    }
}