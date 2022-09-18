package com.kubeforce.watsonimacs;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.function.Function;

public class InventoryFunction implements Function<Long,Inventory>  {
    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Inventory apply (Long s)
    {
        Optional<Inventory> inventoryOptional = inventoryRepository.findById(s);
        if (inventoryOptional.isPresent()) {
            return inventoryOptional.get();
        }
        return null;
    }
}
