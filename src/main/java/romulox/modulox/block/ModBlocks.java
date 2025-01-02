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
import romulox.modulox.util.ModTags;

public class ModBlocks {

    // Shadowinium Block
    public static final Block SHADOWINIUM_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "shadowinium_block"),
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3f).sounds(BlockSoundGroup.HEAVY_CORE)));
    public static final Item SHADOWINIUM_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "shadowinium_block"),
            new BlockItem(SHADOWINIUM_BLOCK, new Item.Settings()));

    // Shadowinium Ore
    public static final Block SHADOWINIUM_ORE = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "shadowinium_ore"),
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Item SHADOWINIUM_ORE_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "shadowinium_ore"),
            new BlockItem(SHADOWINIUM_ORE, new Item.Settings()));

    // Blockjack
    public static final Block BLOCKJACK = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "blockjack"),
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));
    public static final Item BLOCKJACK_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "blockjack"),
            new BlockItem(BLOCKJACK, new Item.Settings()));

    // Bloodstone
    public static final Block BLOODSTONE = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "bloodstone"),
            new Block(AbstractBlock.Settings.create().requiresTool().strength(5f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Item BLOODSTONE_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "bloodstone"),
            new BlockItem(BLOODSTONE, new Item.Settings()));

    public static final Block PAINTABLE_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Modulox.MOD_ID, "paintable_block"),
            new PaintableBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)));
    public static final Item PAINTABLE_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of(Modulox.MOD_ID, "paintable_block"),
            new BlockItem(PAINTABLE_BLOCK, new Item.Settings()));

    public static void registerModBlocks() {
        Modulox.LOGGER.info("Registering Mod Blocks for" + Modulox.MOD_ID);
    }
}
