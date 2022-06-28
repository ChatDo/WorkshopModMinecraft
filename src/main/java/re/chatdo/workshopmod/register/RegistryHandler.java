package re.chatdo.workshopmod.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import re.chatdo.workshopmod.WorkshopAlwynMod;
import re.chatdo.workshopmod.item.WorkshopAlwynItems;

@Mod.EventBusSubscriber(modid = WorkshopAlwynMod.MODID)
public class RegistryHandler {


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item: WorkshopAlwynItems.ITEMS ) {
            event.getRegistry().register(item);
        }
    }

    public static void registerBlock(RegistryEvent.Register<Block> event) {
//        for (Block block: ModidItems.BLOCKS ) {
//            event.getRegistry().register(block);
//        }
    }



}
