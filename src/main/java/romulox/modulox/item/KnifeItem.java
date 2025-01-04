package romulox.modulox.item;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import romulox.modulox.Modulox;

public class KnifeItem extends Item {

    public KnifeItem(Settings settings) {
        super(settings);
    }

    public static void whileInHand(boolean alreadyChecked) {
        PlayerEntity player = MinecraftClient.getInstance().player;
        if (player.getMainHandStack().getItem().asItem() == ModItems.KNIFE.asItem()) {
            if (!alreadyChecked) {
                player.setMovementSpeed(100);
                Modulox.knifeAlreadyChecked = true;
            }

        } else {
            Modulox.knifeAlreadyChecked = false;
        }
    }

}
