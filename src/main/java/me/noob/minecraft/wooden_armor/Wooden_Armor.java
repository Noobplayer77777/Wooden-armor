package me.noob.minecraft.wooden_armor;

import me.noob.minecraft.wooden_armor.Wooden_Stuffs.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Wooden_Armor extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("=======>Wooden Armor<=======");
        Chestplate_oak.init();
        Leggings_oak.init();
        Helmet_oak.init();
        Boots_oak.init();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
