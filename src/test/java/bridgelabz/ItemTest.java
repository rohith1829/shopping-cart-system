package bridgelabz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Item;

public class ItemTest {

	@Test
	public void creatingAnItemWithValidDetails(){
		Item i=new Item("1","TV",25999.0);
		assertEquals("1", i.getId());
		assertEquals("TV", i.getName());
		assertEquals(25999.0, i.getPrice());

	}
	
	@Test
	public void getItemDetails() {
		Item i=new Item("1","TV",25999.0);
		assertEquals("Id:1,Item:TV,Price:25999.0", i.getItemdetails());
	}
	
}
