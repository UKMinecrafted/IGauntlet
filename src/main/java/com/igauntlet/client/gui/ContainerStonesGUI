package lucraft.mods.lucraftcore.infinity.container;

import lucraft.mods.lucraftcore.infinity.EnumInfinityStone;
import lucraft.mods.lucraftcore.infinity.items.InventoryInfinityGauntlet;
import lucraft.mods.lucraftcore.infinity.items.ItemInfinityStone;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerInfinityGauntlet extends Container {

    public ContainerInfinityGauntlet(EntityPlayer player, ItemStack stack) {
        InventoryInfinityGauntlet inv = new InventoryInfinityGauntlet(stack);
        this.addSlotToContainer(new SlotInfinityStone(inv, player, EnumInfinityStone.SOUL, 0, 38, 28));
        this.addSlotToContainer(new SlotInfinityStone(inv, player, EnumInfinityStone.REALITY, 1, 59, 28));
        this.addSlotToContainer(new SlotInfinityStone(inv, player, EnumInfinityStone.SPACE, 2, 80, 28));
        this.addSlotToContainer(new SlotInfinityStone(inv, player, EnumInfinityStone.POWER, 3, 101, 28));
        this.addSlotToContainer(new SlotInfinityStone(inv, player, EnumInfinityStone.MIND, 4, 69, 58));
        this.addSlotToContainer(new SlotInfinityStone(inv, player, EnumInfinityStone.TIME, 5, 129, 38));

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 129 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            this.addSlotToContainer(new Slot(player.inventory, k, 8 + k * 18, 187) {
                @Override
                public boolean canTakeStack(EntityPlayer playerIn) {
                    return this.getStack() != player.getHeldItemMainhand();
                }
            });
        }

    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index >= 0 && index <= 5) {
                if (!this.mergeItemStack(itemstack1, 6, 42, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            } else {
                if (itemstack1.getItem() instanceof ItemInfinityStone && !((ItemInfinityStone) itemstack1.getItem()).isContainer() && ((ItemInfinityStone) itemstack1.getItem()).getType() == EnumInfinityStone.SOUL) {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (itemstack1.getItem() instanceof ItemInfinityStone && !((ItemInfinityStone) itemstack1.getItem()).isContainer() && ((ItemInfinityStone) itemstack1.getItem()).getType() == EnumInfinityStone.REALITY) {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (itemstack1.getItem() instanceof ItemInfinityStone && !((ItemInfinityStone) itemstack1.getItem()).isContainer() && ((ItemInfinityStone) itemstack1.getItem()).getType() == EnumInfinityStone.SPACE) {
                    if (!this.mergeItemStack(itemstack1, 2, 3, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (itemstack1.getItem() instanceof ItemInfinityStone && !((ItemInfinityStone) itemstack1.getItem()).isContainer() && ((ItemInfinityStone) itemstack1.getItem()).getType() == EnumInfinityStone.POWER) {
                    if (!this.mergeItemStack(itemstack1, 3, 4, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (itemstack1.getItem() instanceof ItemInfinityStone && !((ItemInfinityStone) itemstack1.getItem()).isContainer() && ((ItemInfinityStone) itemstack1.getItem()).getType() == EnumInfinityStone.MIND) {
                    if (!this.mergeItemStack(itemstack1, 4, 5, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (itemstack1.getItem() instanceof ItemInfinityStone && !((ItemInfinityStone) itemstack1.getItem()).isContainer() && ((ItemInfinityStone) itemstack1.getItem()).getType() == EnumInfinityStone.TIME) {
                    if (!this.mergeItemStack(itemstack1, 5, 6, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index >= 33 && index < 42) {
                    if (!this.mergeItemStack(itemstack1, 6, 33, false))
                        return ItemStack.EMPTY;
                } else if (!this.mergeItemStack(itemstack1, 33, 42, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }
}
