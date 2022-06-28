package re.chatdo.workshopmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = WorkshopAlwynMod.MODID, name = WorkshopAlwynMod.NAME, version = WorkshopAlwynMod.VERSION)
public class WorkshopAlwynMod
{
    public static final String MODID = "workshopalwyn";
    public static final String NAME = "Mod Workshop Alwyn";
    public static final String VERSION = "1.0";
    public static final CreativeTabs CREATIVE_TABS = new WorkshopAlwynCreativeTab();
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
