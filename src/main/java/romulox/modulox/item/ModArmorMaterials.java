package romulox.modulox.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import romulox.modulox.Modulox;
import romulox.modulox.block.ModBlocks;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> COPPER_ARMOR_MATERIAL = registerArmorMaterial("copper",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 4);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 4);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.COPPER_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Modulox.MOD_ID, "copper"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> BLOODSTONE_ARMOR_MATERIAL = registerArmorMaterial("bloodstone",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 15);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModBlocks.BLOODSTONE.asItem()),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Modulox.MOD_ID, "bloodstone"))), 5, 0.3f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Modulox.MOD_ID, name), material.get());
    }
}
