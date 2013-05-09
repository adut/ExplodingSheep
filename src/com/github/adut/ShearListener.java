package com.github.adut;


import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearListener implements Listener {
	
	

	

	@EventHandler
	public void onShear(PlayerShearEntityEvent event) {
		Entity sheared = event.getEntity();
		if (sheared instanceof Sheep)
		{
			/* If the sheep isn't already sheared check wool color */
			if(!((Sheep) sheared).isSheared()) {
				Location sheepLoc = sheared.getLocation();
				sheared.getWorld().createExplosion(sheepLoc,1);
			}
		}
		
	}

}
