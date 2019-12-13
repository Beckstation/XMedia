package Beckstation.XMedia.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

import Beckstation.XMedia.Main;

public class Website implements CommandExecutor{
	
	
	static Main plugin;
	public Website(Main main) {
		plugin = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {

		if (label.equalsIgnoreCase("website")) {
			
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("messages.website")));
				return true;
				
			} else {
				sender.sendMessage(ChatColor.DARK_RED + "Only Players can use this command!");
				return true;
			}
		}
		
		return false;
    }

}