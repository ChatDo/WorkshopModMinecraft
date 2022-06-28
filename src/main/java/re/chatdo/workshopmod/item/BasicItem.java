package re.chatdo.workshopmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import re.chatdo.workshopmod.WorkshopAlwynMod;

public class BasicItem extends Item {

    public BasicItem(String name) {
        WorkshopAlwynItems.setItemName(this, name);
        setCreativeTab(WorkshopAlwynMod.CREATIVE_TABS);
    }

}
