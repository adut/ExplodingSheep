package com.github.adut.ExplodingSheep;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class ExplodingSheep extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		getLogger().info("Exploding Sheep enabled");
		getServer().getPluginManager().registerEvents(new ShearListener(), this);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Exploding Sheep disabled");
	}
	
	
	/*
	 * On command check for the following
	 * @see org.bukkit.plugin.java.JavaPlugin#onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[])
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("xsh")){ // If the player typed /basic then do the following...
			if (sender instanceof Player) {
				// Player player = (Player) sender;
				// do some stuff
			} else {
		         sender.sendMessage("You must be a player!");
		         return false;
			}
			// doSomething
			return false;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the a value of false will be returned.
		return false; 
	}
	
	
}
