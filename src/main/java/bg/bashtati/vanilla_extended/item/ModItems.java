package bg.bashtati.vanilla_extended.item;

import bg.bashtati.vanilla_extended.VanillaExtended;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VanillaExtended.MODID);

    public static final RegistryObject<Item> LOCUST = ITEMS.register("locust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
