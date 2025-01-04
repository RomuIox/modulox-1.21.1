package romulox.modulox.item;

import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import romulox.modulox.Modulox;

public class ModItems {
    // Candy
    public static final Item CANDY = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "candy"), new CandyItem(
            new Item.Settings()
                    .food(new FoodComponent.Builder().alwaysEdible().nutrition(1).snack().build())
    ));

    // Dollar
    public static final Item DOLLAR = basicItem("dollar");

    // Coin
    public static final Item COIN = basicItem("coin");

    // PaintBrush
    public static final Item PAINTBRUSH = complexItem("paintbrush", new PaintBrushItem(new Item.Settings()));

    // CS:GO Knife
    public static final Item KNIFE = complexItem("knife", new KnifeItem(new Item.Settings()));

    // <CONCEPT ITEM> Tinker Table
    public static final Item TINKER_TABLE_CONCEPT_ITEM = basicItem("tinker_table_concept_item");

    // <CONCEPT ITEM> Shaper
    public static final Item SHAPER_CONCEPT_ITEM = basicItem("shaper_concept_item");

    // Pickaxe Head
    public static final Item PICKAXE_HEAD = basicItem("pickaxe_head");

    // Binding
    public static final Item BINDING = basicItem("binding");

    // Handle
    public static final Item HANDLE = basicItem("handle");

    // Pickaxe Item
    public static final Item PICKAXE_ITEM = basicItem("pickaxe_item");

    // Ingot Container
    public static final Item INGOT_CONTAINER = basicItem("ingot_container");

    // Powder Container
    public static final Item POWDER_CONTAINER = basicItem("powder_container");

    // Obsidian Ingot
    public static final Item OBSIDIAN_INGOT = basicItem("obsidian_ingot");

    // Copper Equipment
    public static final Item COPPER_SWORD = swordItem(ModToolMaterials.COPPER);
    public static final Item COPPER_PICKAXE = pickaxeItem(ModToolMaterials.COPPER);
    public static final Item COPPER_AXE = axeItem(ModToolMaterials.COPPER);
    public static final Item COPPER_SHOVEL = shovelItem(ModToolMaterials.COPPER);
    public static final Item COPPER_HOE = hoeItem(ModToolMaterials.COPPER);

    // Bloodstone
    public static final Item BLOODSTONE_POWDER = basicItem("bloodstone_powder");
    public static final Item BLOODSTONE_POWDER_CONTAINER = basicItem("bloodstone_powder_container");
    public static final Item MOLTEN_BLODOSTONE = basicItem("molten_bloodstone");
    public static final Item BLOODSTONE_INGOT = basicItem("bloodstone_ingot");

    public static final Item BLOODSTONE_SWORD = swordItem(ModToolMaterials.BLOODSTONE);
    public static final Item BLOODSTONE_PICKAXE = pickaxeItem(ModToolMaterials.BLOODSTONE);
    public static final Item BLOODSTONE_AXE = axeItem(ModToolMaterials.BLOODSTONE);
    public static final Item CBLOODSTONE_SHOVEL = shovelItem(ModToolMaterials.BLOODSTONE);
    public static final Item BLOODSTONE_HOE = hoeItem(ModToolMaterials.BLOODSTONE);

    public static Item BLOODSTONE_HELMET = basicHelmetItem("bloodstone_helmet",
            ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, 40);
    public static Item BLOODSTONE_CHESTPLATE = basicChestplateItem("bloodstone_chestplate",
            ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, 40);
    public static Item BLOODSTONE_LEGGINGS = basicLeggingsItem("bloodstone_leggings",
            ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, 40);
    public static Item BLOODSTONE_BOOTS = basicBootsItem("bloodstone_boots",
            ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, 40);
    //

    /* Shadowinium Ingot
     * I want this item to increase the Player movement speed while in hand.
     */
    public static final Item SHADOWINIUM_INGOT = basicItem("shadowinium_ingot");

    // Basic Item Helper Method
    private static Item basicItem(String name) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, name), new Item(new Item.Settings()));
    }

    // Complex Item Helper Method
    private static Item complexItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, name), item);
    }

    // Sword Item Helper Method
    private static Item swordItem(ModToolMaterials material) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, material.name().toLowerCase()+"_sword"), new SwordItem(material,
                new Item.Settings()
                        .attributeModifiers(SwordItem.createAttributeModifiers(material, 3, -2.4f)))
        );
    }

    // Pickaxe Item Helper Method
    private static Item pickaxeItem(ModToolMaterials material) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, material.name().toLowerCase()+"_pickaxe"), new PickaxeItem(material,
                new Item.Settings()
                        .attributeModifiers(PickaxeItem.createAttributeModifiers(material, 1, -2.8f)))
        );
    }

    // Axe Item Helper Method
    private static Item axeItem(ModToolMaterials material) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, material.name().toLowerCase()+"_axe"), new AxeItem(material,
                new Item.Settings()
                        .attributeModifiers(AxeItem.createAttributeModifiers(material, 6f, -3.2f)))
        );
    }

    // Shovel Item Helper Method
    private static Item shovelItem(ModToolMaterials material) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, material.name().toLowerCase()+"_shovel"), new ShovelItem(material,
                new Item.Settings()
                        .attributeModifiers(ShovelItem.createAttributeModifiers(material, 1.5f, -3.0f)))
        );
    }

    // Hoe Item Helper Method
    private static Item hoeItem(ModToolMaterials material) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, material.name().toLowerCase()+"_hoe"), new HoeItem(material,
                new Item.Settings()
                        .attributeModifiers(HoeItem.createAttributeModifiers(material, 0, -3f)))
        );
    }

    // Basic Helmet Helper Method
    public static Item basicHelmetItem(String name, RegistryEntry<ArmorMaterial> material, int multiplier) {
        return complexItem(name, new ArmorItem(material, ArmorItem.Type.HELMET,
                new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(multiplier))));
    }

    // Basic Chestplate Helper Method
    public static Item basicChestplateItem(String name, RegistryEntry<ArmorMaterial> material, int multiplier) {
        return complexItem(name, new ArmorItem(material, ArmorItem.Type.CHESTPLATE,
                new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(multiplier))));
    }

    // Basic Leggings Helper Method
    public static Item basicLeggingsItem(String name, RegistryEntry<ArmorMaterial> material, int multiplier) {
        return complexItem(name, new ArmorItem(material, ArmorItem.Type.LEGGINGS,
                new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(multiplier))));
    }

    // Basic Boots Helper Method
    public static Item basicBootsItem(String name, RegistryEntry<ArmorMaterial> material, int multiplier) {
        return complexItem(name, new ArmorItem(material, ArmorItem.Type.BOOTS,
                new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(multiplier))));
    }

    // Register Function
    public static void registerModItems() {
        Modulox.LOGGER.info("Registering mod items for " + Modulox.MOD_ID);
    }
}
