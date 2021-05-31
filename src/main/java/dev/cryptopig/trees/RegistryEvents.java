package dev.cryptopig.trees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

// contained class (this is subscribing to the MOD
// Event bus for receiving Registry Events)
@Mod.EventBusSubscriber(modid = TreesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    private static final Logger log = LogManager.getLogger();

    private static ResourceLocation REGISTRY_NAME = new ResourceLocation(TreesMod.MODID, "smartlog");

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        // register a new block here
        Block block = new Log(Block.Properties.create(Material.WOOD));
        block.setRegistryName(REGISTRY_NAME);
        event.getRegistry().register(block);
        log.info("OINK Registering Block {}", block);
    }

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        Block block = new Log(Block.Properties.create(Material.WOOD));
        Item.Properties props = new Item.Properties();
        Item item = new BlockItem(block, props);
        item.setRegistryName(REGISTRY_NAME);
        event.getRegistry().register(item);
        log.info("OINK Registering item {}", item);
    }

    /**
     * This method will be called by Forge when a config changes.
     */
    @SubscribeEvent
    public static void onModConfigEvent(final ModConfig.ModConfigEvent event) {
        final ModConfig config = event.getConfig();
        // Rebake the configs when they change
        log.debug("config change event{}", config);
    }
}