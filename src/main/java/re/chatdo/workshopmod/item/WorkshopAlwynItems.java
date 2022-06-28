package re.chatdo.workshopmod.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import re.chatdo.workshopmod.WorkshopAlwynMod;
import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = WorkshopAlwynMod.MODID, value = Side.CLIENT)
public class WorkshopAlwynItems {
    public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
    public static final Item NEW_ITEM = new BasicItem("alwyn");

    public static void setItemName(Item item, String name) {
        item.setRegistryName(WorkshopAlwynMod.MODID, name).setUnlocalizedName(WorkshopAlwynMod.MODID + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    protected static void registerItemModels(ModelRegistryEvent e) {
        ITEMS.forEach(item -> registerModel(item, 0)); //A simple forEach to call the method below
    }

    @SideOnly(Side.CLIENT)
    protected static void registerModel(Item item, int metadata ) {
        ModelLoader.setCustomModelResourceLocation (item, metadata,
                new ModelResourceLocation(item.getRegistryName(), " inventory "));
    }

}
