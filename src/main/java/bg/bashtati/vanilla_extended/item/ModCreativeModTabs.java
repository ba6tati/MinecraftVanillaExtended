package bg.bashtati.vanilla_extended.item;

import bg.bashtati.vanilla_extended.VanillaExtended;
import bg.bashtati.vanilla_extended.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VanillaExtended.MODID);

    public static final RegistryObject<CreativeModeTab> VANILLA_EXTENDED_TAB = CREATIVE_MODE_TABS.register("vanilla_extended_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LOCUST.get()))
                    .title(Component.translatable("creativetab.vanilla_extended_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LOCUST.get());
                        pOutput.accept(ModItems.RAW_BRONZE.get());
                        pOutput.accept(ModItems.BRONZE_INGOT.get());

                        pOutput.accept(ModBlocks.LOCUST_BLOCK.get());
                        pOutput.accept(ModBlocks.BRONZE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
