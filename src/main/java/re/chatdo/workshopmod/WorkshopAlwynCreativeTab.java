package re.chatdo.workshopmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import re.chatdo.workshopmod.item.WorkshopAlwynItems;

public class WorkshopAlwynCreativeTab extends CreativeTabs {

    public WorkshopAlwynCreativeTab() {
        super(WorkshopAlwynMod.MODID + "_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(WorkshopAlwynItems.NEW_ITEM);
    }
}
