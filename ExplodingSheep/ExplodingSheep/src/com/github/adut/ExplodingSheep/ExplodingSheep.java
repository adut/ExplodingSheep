package com.github.adut.ExplodingSheep;

import org.bukkit.plugin.java.JavaPlugin;

public class ExplodingSheep extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("Exploding Sheep Plugin enabled");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Exploding Sheep Plugin disabled");
	}
}
