/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.lolnet.BukkitPluginTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


/**
 *
 * @author James
 */
public class BukkitPluginTemplate extends JavaPlugin {
    
    private static Logger log;
    
    @Override
    public void onEnable() {
        log = Bukkit.getLogger();
        getServer().getPluginManager().registerEvents(new MyListener(this), this);
        String version = Bukkit.getServer().getPluginManager().getPlugin(this.getName()).getDescription().getVersion();
        log.log(Level.INFO, this.getName() + " : Version {0} enabled", version);
    }
    
    @Override
    public void onDisable() {
        log.log(Level.INFO, "{0}: disabled", this.getName());
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        String commandName = command.getName().toLowerCase();
        if (commandName.equalsIgnoreCase("BukkitPluginTemplateCommand")) {
            if (sender.hasPermission("BukkitPluginTemplate.use")) {
                if (sender instanceof Player)
                {
                   sender.sendMessage(ChatColor.GREEN + "Hello Player"); 
                }
                else
                {
                    sender.sendMessage(ChatColor.GREEN + "Hello Console/ Commandblock/ Not a player"); 
                }
                
            }
            return true;
        }
        
        return false;
    }
    
}
