package com.kubeforce.watsonimacs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.function.Consumer;


public class InventoryConsumer implements Consumer<Map<String,String>> {
    public static final Logger LOGGER = LoggerFactory.getLogger(InventoryConsumer.class);

    @Autowired
    private InventoryRepository InventoryRepository;

    @Override
    public void accept (Map<String, String> map)
    {
        LOGGER.info("Creating the inventory", map);
        Inventory inventory = new Inventory (map.get("name"), Integer.parseInt(map.get(
                "inventoryid")), map.get("description"), map.get("quantity"));
        InventoryRepository.save(inventory);
    }

}
