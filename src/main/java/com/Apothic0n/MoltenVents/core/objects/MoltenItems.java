package com.Apothic0n.MoltenVents.core.objects;

import com.Apothic0n.MoltenVents.MoltenVents;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class MoltenItems extends Items {
    private MoltenItems() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoltenVents.MODID);

    //Block Items
    public static final RegistryObject<Item> MOLTEN_ASURINE_ITEM = ITEMS.register("molten_asurine", () ->
            new BlockItem(MoltenBlocks.MOLTEN_ASURINE.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_VERIDIUM_ITEM = ITEMS.register("molten_veridium", () ->
            new BlockItem(MoltenBlocks.MOLTEN_VERIDIUM.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_CRIMSITE_ITEM = ITEMS.register("molten_crimsite", () ->
            new BlockItem(MoltenBlocks.MOLTEN_CRIMSITE.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_OCHRUM_ITEM = ITEMS.register("molten_ochrum", () ->
            new BlockItem(MoltenBlocks.MOLTEN_OCHRUM.get(),
                    new Item.Properties()));


    public static final RegistryObject<Item> DORMANT_ASURINE_ITEM = ITEMS.register("dormant_asurine", () ->
            new BlockItem(MoltenBlocks.DORMANT_ASURINE.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> DORMANT_VERIDIUM_ITEM = ITEMS.register("dormant_veridium", () ->
            new BlockItem(MoltenBlocks.DORMANT_VERIDIUM.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> DORMANT_CRIMSITE_ITEM = ITEMS.register("dormant_crimsite", () ->
            new BlockItem(MoltenBlocks.DORMANT_CRIMSITE.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> DORMANT_OCHRUM_ITEM = ITEMS.register("dormant_ochrum", () ->
            new BlockItem(MoltenBlocks.DORMANT_OCHRUM.get(),
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
