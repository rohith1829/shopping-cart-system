package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	private List<Item> items=new ArrayList<Item>();
	public void addItem(Item i) {
		if(i==null)
			throw new  NullItemException("Can't add null items");
		items.add(i);
	}
	
	
	public void removeItem(String id) {
		Iterator<Item> itr=items.iterator();
		while(itr.hasNext()) {
			if(itr.next().getId().equals(id))
				itr.remove();
		}

	}
	
	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}


	public String viewItems() {
		if(items.isEmpty())
			return "Cart is empty";
		return items.toString();
	}

	public List<Item> getItems() {
		return items;
	}

	 public double calculateTotalPrice() {
	        double total = 0.0;
	        for (Item item : items) {
	            total += item.getPrice();
	        }
	        if (Double.isInfinite(total)) {
	            throw new PriceOverflowException("Total price exceeded maximum limit!");
	        }
	        return total;
	    }

}
