package me.noob.minecraft.wooden_armor.Wooden_Stuffs;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.UUID;

public class Chestplate_oak {

    public static ItemStack wooden_chestplate;

    public static void init() {
        createChestplate();
    }
    public static void createChestplate(){
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE , 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden Chestplate");
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 1,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, speed);
        AttributeModifier heal = new AttributeModifier(UUID.randomUUID(), "generic.armor", 4,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, heal);
        item.setItemMeta(meta);

        wooden_chestplate = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("wooden_chestplate"), item);
        sr.shape("N N",
                "NNN",
                "NNN");
        sr.setIngredient('N', Material.OAK_LOG);
        Bukkit.getServer().addRecipe(sr);

    }
}


