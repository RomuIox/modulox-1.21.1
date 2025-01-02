package romulox.modulox.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import romulox.modulox.Modulox;
import romulox.modulox.item.ModItems;

import java.util.Optional;

public class ModItemGroups {
    public static final ItemGroup MODULOX_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Modulox.MOD_ID, "modulox_items_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COIN))
                    .displayName(Text.translatable("itemgroup.modulox.modulox_items"))
                    .entries((displayContext, entries) -> {
                        Registries.ITEM.getIds()
                                .stream()
                                .filter(key -> key.getNamespace().equals(Modulox.MOD_ID))
                                .map(Registries.ITEM::getOrEmpty)
                                .map(Optional::orElseThrow)
                                .forEach(entries::add);
                    })
            .build()
    );

    public static void registerItemGroups() {
        Modulox.LOGGER.info("Registering Mod Item Groups for" + Modulox.MOD_ID);
    }
}
