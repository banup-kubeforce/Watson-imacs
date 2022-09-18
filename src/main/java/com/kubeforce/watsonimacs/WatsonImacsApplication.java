package com.kubeforce.watsonimacs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WatsonImacsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatsonImacsApplication.class, args);
    }

    @Bean
    public InventoryFunction inventoryFunction() {
        return new InventoryFunction();
    }

    @Bean
    public InventoryConsumer employeeConsumer() {
        return new InventoryConsumer();
    }

    @Bean
    public InventorySupplier exampleSupplier() {
        return new InventorySupplier();
    }
}
