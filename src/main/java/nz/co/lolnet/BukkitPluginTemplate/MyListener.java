/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.lolnet.BukkitPluginTemplate;

import org.bukkit.event.Listener;

/**
 *
 * @author James
 */
class MyListener implements Listener {

    BukkitPluginTemplate plugin;

    public MyListener(BukkitPluginTemplate aThis) {
        plugin = aThis;
    }
}
