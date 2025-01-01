package romulox.modulox.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import romulox.modulox.Modulox;

public class ModSounds {

    public static final SoundEvent I_WANT_CANDY = Registry.register(Registries.SOUND_EVENT, Identifier.of(Modulox.MOD_ID, "i_want_candy"), SoundEvent.of(Identifier.of(Modulox.MOD_ID, "i_want_candy")));

    public static void registerSounds() {
        Modulox.LOGGER.info("Registering mod sounds for " + Modulox.MOD_ID);
    }
}