package com.kubeforce.watsonimacs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;


@Component
public class InventorySupplier implements Supplier
{
    public static final Logger LOGGER = LoggerFactory.getLogger(InventorySupplier.class);

    @Autowired
    private InventoryRepository InventoryRepository;

    @Override
    public Inventory get ()
    {
        List <Inventory>inventories = InventoryRepository.findAll();
        LOGGER.info("Getting the computer of our choice - ", inventories);
        return inventories.get(0);
    }
}

