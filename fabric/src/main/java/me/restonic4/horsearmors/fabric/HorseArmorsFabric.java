package me.restonic4.horsearmors.fabric;

import me.restonic4.horsearmors.HorseArmors;
import net.fabricmc.api.ModInitializer;

public class HorseArmorsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HorseArmors.init();
    }
}