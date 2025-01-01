package romulox.modulox.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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

    // Candy
    public static final Item DOLLAR = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "dollar"), new Item(
            new Item.Settings()
    ));

    // Obsidian Ingot
    public static final Item OBSIDIAN_INGOT = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "obsidian_ingot"), new Item(
            new Item.Settings()
    ));

    // Tin

    // Lead

    // Silver

    // Cobalt

    // Tungsten

    // Platinum

    // Meteorite

    // Crimtane

    // Hellstone

    // Palladium

    // Mythril

    // Orichalcum

    // Adamantite

    // Titanium

    // Chlorophyte

    // Luminite

    // Bloodstone

    // Angelite

    // Demonite

    // Makyr

    // Argent

    // Romulite

    // Super

    // Shadowinium
    /*
     * I want this item to increase the Player movement speed while in hand.
     */
    public static final Item SHADOWINIUM_INGOT = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "shadowinium_ingot"), new Item(
            new Item.Settings()
    ));

    // Register Function
    public static void registerModItems() {
        Modulox.LOGGER.info("Registering mod items for " + Modulox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CANDY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OBSIDIAN_INGOT);
            entries.add(SHADOWINIUM_INGOT);
            entries.add(DOLLAR);
        });
    }
}
