package com.abby226.abbyscustomitems.events;


import com.abby226.abbyscustomitems.items.ItemManager;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RelicMusic implements Listener {

    @EventHandler
    public static void onLeftClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.Relic.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.getWorld().playSound(player.getLocation(), Sound.MUSIC_DISC_RELIC, 1.0F, 1.0F);
                    player.sendMessage("§bEnjoy the music!");
                }



            }
        }
    }
}