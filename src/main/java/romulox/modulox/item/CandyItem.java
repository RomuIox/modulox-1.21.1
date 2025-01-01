package romulox.modulox.item;

import net.minecraft.item.Item;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.World;
import romulox.modulox.Modulox;
import romulox.modulox.sound.ModSounds;

public class CandyItem extends Item {
    public CandyItem(Settings settings) {
        super(settings);
    }

    public static void onPlayerTick(boolean alreadyChecked) {
        MinecraftClient client = MinecraftClient.getInstance();
        ItemStack heldItem = client.player.getMainHandStack();

        if (heldItem.getItem() == ModItems.CANDY.asItem()) {
            World world = client.player.getWorld();

            if (!alreadyChecked) {
                world.playSound(client.player, client.player.getBlockPos(), ModSounds.I_WANT_CANDY, SoundCategory.MUSIC, 1f, 1f);
                //System.out.println("Candy");
                alreadyChecked = true;
            }
        } else {
            client.getSoundManager().stopSounds(ModSounds.I_WANT_CANDY.getId(), SoundCategory.MUSIC);
            alreadyChecked = false;
        }

        Modulox.alreadyChecked = alreadyChecked;
    }
}
