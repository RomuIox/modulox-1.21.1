package romulox.modulox;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import romulox.modulox.block.ModBlocks;
import romulox.modulox.component.ModDataComponentTypes;
import romulox.modulox.item.CandyItem;
import romulox.modulox.item.KnifeItem;
import romulox.modulox.item.ModItems;
import romulox.modulox.itemgroup.ModItemGroups;
import romulox.modulox.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import romulox.modulox.util.ModTags;

public class Modulox implements ModInitializer {
	public static final String MOD_ID = "modulox";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static boolean alreadyChecked = false;
	public static boolean knifeAlreadyChecked = false;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello world!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems(); // Registers the modded items class so modded items are created
		ModBlocks.registerModBlocks(); // Registers the modded blocks class so modded items are created
		ModSounds.registerSounds(); // Registers the modded sounds class so modded sounds are created
		ModTags.registerModTags();
		ModDataComponentTypes.registerDataComponentTypes();

		// Event Handler checks every tick upon joining world
		ClientTickEvents.START_WORLD_TICK.register(client -> {
			CandyItem.onPlayerTick(alreadyChecked); // Check if player is holding Candy
			KnifeItem.whileInHand(knifeAlreadyChecked);
		});
	}
}