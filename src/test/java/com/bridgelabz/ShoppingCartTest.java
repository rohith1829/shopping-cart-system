package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ShoppingCartTest {
	private ShoppingCart sc;
	
	@BeforeEach
	public void createCart() {
		sc=new ShoppingCart();
	}
	
	@Test
	public void addItemTest() {
		sc.addItem(new Item("1","TV",25999.0));
		sc.addItem(new Item("2","Fridge",20999.0));
		assertTrue(sc.getItems().get(0).getId().equals("1"));
		assertTrue(sc.getItems().get(1).getId().equals("2"));
			
		
	}
	@Test
	public void addingNullItem() {
		assertThrows(NullItemException.class, ()->{sc.addItem(null);});
	}
	@Test
	public void priceOverFlow() {
		sc.addItem(new Item("1","TV",Double.MAX_VALUE));
		sc.addItem(new Item("1","TV",Double.MAX_VALUE));
		assertThrows(PriceOverflowException.class, ()->{sc.calculateTotalPrice();});
	}
	@Test
	public void duplicateValuesTest() {
		sc.addItem(new Item("1","TV",25999.0));
		sc.addItem(new Item("1","TV",25999.0));
		assertTrue(sc.getItems().get(0).getId().equals("1"));
		assertTrue(sc.getItems().get(1).getId().equals("1"));
	}
	@Test
	public void removeItemTest() {
		sc.addItem(new Item("1","TV",25999.0));		
		sc.removeItem("1");	
		assertTrue(sc.getItems().isEmpty());
			
	}
	
	@Test
	public void removeItemNotPresent() {
		sc.removeItem("1");	
		assertTrue(sc.getItems().isEmpty());
		
	}
	
	@Test
	public void calculateWhenCartIsEmpty() {
		assertEquals(0, sc.calculateTotalPrice());
		
	}
	@Test
	public void viewItemsTest() {
	    sc.addItem(new Item("1","TV",25999.0));

	    String expected = "[Item [id=1, name=TV, price=25999.0]]";
	    assertEquals(expected, sc.viewItems());   
	}
	
	@Test
	public void viewItemsWhenEmptyTest() {
		
		String expected = "Cart is empty";
		assertEquals(expected, sc.viewItems());   
	}
	@Test
	public void itemWithNegativePrice() {
	    
		assertThrows(InvalidPriceException.class, () -> {
            sc.addItem(new Item("1", "TV", -25999.0) ) ;
        });	}
	
	@Test
	public void totalPriceTest() {
	    sc.addItem(new Item("1", "TV", 25999.0));
	    sc.addItem(new Item("2", "Fridge", 20999.0));

	    double expected = 25999.0 + 20999.0;
	    assertEquals(expected, sc.calculateTotalPrice()); 
	}


}
