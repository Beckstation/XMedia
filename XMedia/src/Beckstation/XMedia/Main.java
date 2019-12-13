package Beckstation.XMedia;

import org.bukkit.plugin.java.JavaPlugin;

import Beckstation.XMedia.Commands.Discord;
import Beckstation.XMedia.Commands.Instagram;
import Beckstation.XMedia.Commands.Reload;
import Beckstation.XMedia.Commands.Twitter;
import Beckstation.XMedia.Commands.Website;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		registerCmds();
		
	}
	
	@Override
	public void onDisable() {
	
	}
	
	public void registerCmds() {
		this.getCommand("xmedia").setExecutor(new Reload(this));
		this.getCommand("twitter").setExecutor(new Twitter(this));
		this.getCommand("instagram").setExecutor(new Instagram(this));
		this.getCommand("discord").setExecutor(new Discord(this));
		this.getCommand("website").setExecutor(new Website(this));
	}

}
