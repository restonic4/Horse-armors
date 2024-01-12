package me.restonic4.horsearmors.quilt;

import me.restonic4.horsearmors.HorseArmors;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class HorseArmorsQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        HorseArmors.init();
    }
}