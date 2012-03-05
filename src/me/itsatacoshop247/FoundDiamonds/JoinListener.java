/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.itsatacoshop247.FoundDiamonds;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author seed419
 */
public class JoinListener implements Listener {
    
    
    private FoundDiamonds fd;
    private YAMLHandler config;
    
    
    public JoinListener(FoundDiamonds fd, YAMLHandler config) {
        this.fd = fd;
        this.config = config;
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (fd.getConfig().getBoolean(config.getDiamondAdmin())) {
            if (fd.hasPerms(event.getPlayer())) {
                fd.getAdminMessageMap().put(event.getPlayer(), true);
            }
        }
    }
    
}
