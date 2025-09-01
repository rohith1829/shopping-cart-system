package com.bridgelabz;

public class Item {
private String id;
private String name;
private double price;
public Item(String id, String name, double price) {
	super();
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
public String getItemdetails() {
	return "Id:"+this.id+",Item:"+this.name+",Price:"+this.price;
}
@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
}



}
