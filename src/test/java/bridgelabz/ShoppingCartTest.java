package bridgelabz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Item;
import com.bridgelabz.ShoppingCart;

public class ShoppingCartTest {

	
	@Test
	public void addItemTest() {
		ShoppingCart sc=new ShoppingCart();
		sc.addItem(new Item("1","TV",25999.0));
		sc.addItem(new Item("2","Fridge",20999.0));
		assertTrue(sc.getItems().get(0).getId().equals("1"));
		assertTrue(sc.getItems().get(1).getId().equals("2"));
			
		
	}
	@Test
	public void removeItemTest() {
		ShoppingCart sc=new ShoppingCart();
		sc.addItem(new Item("1","TV",25999.0));		
		sc.removeItem("1");	
		assertTrue(sc.getItems().isEmpty());
			
	}
	
	@Test
	public void viewItemsTest() {
	    ShoppingCart sc = new ShoppingCart();
	    sc.addItem(new Item("1","TV",25999.0));

	    String expected = "[Item [id=1, name=TV, price=25999.0]]";
	    assertEquals(expected, sc.viewItems());   
	}
	
	@Test
	public void totalPriceTest() {
	    ShoppingCart sc = new ShoppingCart();
	    sc.addItem(new Item("1", "TV", 25999.0));
	    sc.addItem(new Item("2", "Fridge", 20999.0));

	    double expected = 25999.0 + 20999.0;
	    assertEquals(expected, sc.calculateTotalPrice()); 
	}


}
