package com.bridgelabz;

public class Item {
    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price) {
       

        
        if (id == null || id.trim().isEmpty()) {
            throw new InvalidIdException("Item ID cannot be null or empty");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Item name cannot be null or empty");
        }
        if (price <= 0) {
            throw new InvalidPriceException("Item price must be greater than 0");
        }

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemdetails() {
        return "Id:" + this.id + ",Item:" + this.name + ",Price:" + this.price;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
