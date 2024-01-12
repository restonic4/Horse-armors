package me.restonic4.horsearmors.item;

import me.restonic4.restapi.holder.RestItem;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.util.CustomItemProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.HorseArmorItem;

import static me.restonic4.horsearmors.HorseArmors.MOD_ID;

public class ItemManager {
    public static final RestItem copper_armor = ItemRegistry.CreateCustom(
            MOD_ID,
            "copper_horse_armor",
            () -> new HorseArmorItem(3, "copper", new CustomItemProperties().stacksTo(1).tab(CreativeModeTabs.COMBAT).build())
    );

    public static final RestItem amethyst_armor = ItemRegistry.CreateCustom(
            MOD_ID,
            "amethyst_horse_armor",
            () -> new HorseArmorItem(9, "amethyst", new CustomItemProperties().stacksTo(1).tab(CreativeModeTabs.COMBAT).build())
    );

    public static final RestItem netherite_armor = ItemRegistry.CreateCustom(
            MOD_ID,
            "netherite_horse_armor",
            () -> new HorseArmorItem(16, "netherite", new CustomItemProperties().stacksTo(1).tab(CreativeModeTabs.COMBAT).fireResistant().build())
    );

    public static void register() {
        ItemRegistry.Register(MOD_ID);
    }
}
