package romulox.modulox.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import romulox.modulox.Modulox;

public class ModBlocks {

    // Shadowinium Block
    public static final Block SHADOWINIUM_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "shadowinium_block"),
            new Block(AbstractBlock.Settings.create().requiresTool().strength(2f).sounds(BlockSoundGroup.HEAVY_CORE)));
    public static final Item SHADOWINIUM_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "shadowinium_block"),
            new BlockItem(SHADOWINIUM_BLOCK, new Item.Settings()));

    // Shadowinium Ore

    // Blockjack
    public static final Block BLOCKJACK = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "blockjack"),
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Item BLOCKJACK_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "blockjack"),
            new BlockItem(BLOCKJACK, new Item.Settings()));

    public static void registerModBlocks() {
        Modulox.LOGGER.info("Registering Mod Blocks for" + Modulox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(SHADOWINIUM_BLOCK);
            entries.add(BLOCKJACK);
        });
    }
}
