package romulox.modulox.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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

    // Obsidian Ingot
    public static final Item OBSIDIAN_INGOT = basicItem("obsidian_ingot");

    // Copper Equipment
    public static final Item COPPER_SWORD = swordItem(ModToolMaterials.COPPER);
    public static final Item COPPER_PICKAXE = pickaxeItem(ModToolMaterials.COPPER);
    public static final Item COPPER_AXE = axeItem(ModToolMaterials.COPPER);
    public static final Item COPPER_SHOVEL = shovelItem(ModToolMaterials.COPPER);
    public static final Item COPPER_HOE = hoeItem(ModToolMaterials.COPPER);

    // Bloodstone Equipment
    public static final Item BLOODSTONE_SWORD = swordItem(ModToolMaterials.BLOODSTONE);
    public static final Item BLOODSTONE_PICKAXE = pickaxeItem(ModToolMaterials.BLOODSTONE);
    public static final Item BLOODSTONE_AXE = axeItem(ModToolMaterials.BLOODSTONE);
    public static final Item CBLOODSTONE_SHOVEL = shovelItem(ModToolMaterials.BLOODSTONE);
    public static final Item BLOODSTONE_HOE = hoeItem(ModToolMaterials.BLOODSTONE);

    /* Shadowinium Ingot
     * I want this item to increase the Player movement speed while in hand.
     */
    public static final Item SHADOWINIUM_INGOT = basicItem("shadowinium_ingot");

    // Basic Item Helper Method
    private static Item basicItem(String name) {
        return Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, name), new Item(new Item.Settings()));
    }

    // Basic Item Helper Method
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

    // Axe Item Helper Method
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

    // Register Function
    public static void registerModItems() {
        Modulox.LOGGER.info("Registering mod items for " + Modulox.MOD_ID);
    }
}
