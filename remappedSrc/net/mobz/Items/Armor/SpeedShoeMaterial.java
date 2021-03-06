package net.mobz.Items.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.mobz.Inits.Iteminit;

public class SpeedShoeMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] { 11, 12, 13, 10 };
    private static final int[] PROTECTION_AMOUNTS = new int[] { 1, 2, 3, 1 };

    @Override
    public int getDurability(EquipmentSlot equipmentSlot) {
        return BASE_DURABILITY[equipmentSlot.getEntitySlotId()] * 25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot) {
        return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Iteminit.BEARLEATHER);
    }

    @Override
    public String getName() {
        return "speed";
    }

    @Override
    public float getToughness() {
        return 0;
    }

}