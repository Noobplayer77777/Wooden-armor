package me.noob.minecraft.wooden_armor.Wooden_Stuffs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class Helmet_oak {
    public static ItemStack wooden_helmet;

    public static void init() {
        createHelmet();
    }
    public static void createHelmet(){
        ItemStack item = new ItemStack(Material.LEATHER_HELMET , 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden Hat");
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 1,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, speed);
        AttributeModifier heal = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, heal);
        item.setItemMeta(meta);

        wooden_helmet = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("wooden_helmet"), item);
        sr.shape("NNN",
                "N N",
                "   ");
        sr.setIngredient('N', Material.OAK_LOG);
        Bukkit.getServer().addRecipe(sr);

    }
}

