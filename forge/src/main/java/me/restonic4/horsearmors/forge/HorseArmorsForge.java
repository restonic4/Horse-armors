package me.restonic4.horsearmors.forge;

import dev.architectury.platform.forge.EventBuses;
import me.restonic4.horsearmors.HorseArmors;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HorseArmors.MOD_ID)
public class HorseArmorsForge {
    public HorseArmorsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(HorseArmors.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        HorseArmors.init();
    }
}