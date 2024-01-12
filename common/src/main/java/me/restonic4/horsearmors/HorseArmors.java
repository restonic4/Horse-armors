package me.restonic4.horsearmors;

import me.restonic4.horsearmors.item.ItemManager;
import me.restonic4.restapi.item.ItemRegistry;

public class HorseArmors
{
	public static final String MOD_ID = "horse_armors";

	public static void init() {
		ItemRegistry.CreateRegistry(MOD_ID);

		ItemManager.register();
	}
}
