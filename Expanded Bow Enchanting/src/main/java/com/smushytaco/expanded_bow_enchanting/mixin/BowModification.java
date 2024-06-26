package com.smushytaco.expanded_bow_enchanting.mixin;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.smushytaco.expanded_bow_enchanting.ExpandedBowEnchanting;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.LuckEnchantment;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Enchantment.class)
public abstract class BowModification {
    @ModifyReturnValue(method = "isAcceptableItem", at = @At("RETURN"))
    @SuppressWarnings("ConstantConditions")
    public boolean isAcceptableItem(boolean original, ItemStack stack) {
        return ((Enchantment) (Object) this) instanceof LuckEnchantment ? ExpandedBowEnchanting.INSTANCE.getConfig().getCanUseLootingOnBow() && stack.getItem() instanceof BowItem || original : original;
    }
}