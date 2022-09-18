package com.kubeforce.watsonimacs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "inventory")
public class Inventory {


        @Id
        @GeneratedValue(generator = "UUID")
        private Long id;

        private String name;

        private int inventoryid;

        private String description;

        private String quantity;

    public Inventory(String name, int invid, String description, String quantity)
    {
        this.name = name;
        this.inventoryid = invid;
        this.description = description;
        this.quantity = quantity;
    }

    public Inventory() {

    }


    public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public int getEmployeeIdentifier ()
        {
            return inventoryid;
        }

        public void setCustomerIdentifier (int invid)
        {
            this.inventoryid = invid;
        }

        public String getEmail ()
        {
            return description;
        }

        public void setEmail (String email)
        {
            this.description = description;
        }

        public String getSalary ()
        {
            return quantity;
        }

        public void setSalary (String salary)
        {
            this.quantity = quantity;
        }

        public Long getId ()
        {
            return id;
        }

        public void setId (Long id)
        {
            this.id = id;
        }
}
