package romulox.modulox.util;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import romulox.modulox.Modulox;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_COPPER_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Modulox.MOD_ID, "needs_copper_tool"));
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Modulox.MOD_ID, "incorrect_for_copper_tool"));

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(Modulox.MOD_ID, "needs_netherite_tool"));

        public static final TagKey<Block> NEEDS_BLOODSTONE_TOOL = createTag("needs_bloodstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLOODSTONE_TOOL = createTag("incorrect_for_bloodstone_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Modulox.MOD_ID, name));
        }
    }

    public static class Items {

    }

    public static void registerModTags() {
        Modulox.LOGGER.info("Registering Mod Tags for" + Modulox.MOD_ID);
    };
}
