package Beckstation.XMedia.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

import Beckstation.XMedia.Main;

public class Reload implements CommandExecutor{
	
	
	static Main plugin;
	public Reload(Main main) {
		plugin = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {

		if (label.equalsIgnoreCase("xmedia")) {
			
		    if (cmd.getName().equalsIgnoreCase("xmedia")) {
		        if (args[0].equalsIgnoreCase("reload")) {
		        	plugin.reloadConfig();
		        }
		    }
		    
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lXMedia Reloaded Succesfully"));
				return true;
			}
		}
		
		return false;
    }

}