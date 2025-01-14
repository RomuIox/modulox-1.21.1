package romulox.modulox.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import romulox.modulox.block.ModBlocks;
import romulox.modulox.util.ModTags;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    NETHERRACK(BlockTags.INCORRECT_FOR_STONE_TOOL, 98, 4.0F, 1.0F, 5, () -> Ingredient.ofItems(Items.NETHERRACK.asItem())),
    COPPER(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 8.0F, 1.0F, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BLOODSTONE(ModTags.Blocks.INCORRECT_FOR_BLOODSTONE_TOOL, 3004, 12.0F, 7.0F, 20, () -> Ingredient.ofItems(ModBlocks.BLOODSTONE.asItem()));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
