package bridgelabz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.bridgelabz.InvalidIdException;
import com.bridgelabz.InvalidNameException;
import com.bridgelabz.InvalidPriceException;
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
	  @Test
	    public void creatingItemWithNullIdThrowsException() {
	        assertThrows(InvalidIdException.class, () -> {
	            new Item(null, "TV", 25999.0);
	        });
	    }

	    @Test
	    public void creatingItemWithEmptyIdThrowsException() {
	        assertThrows(InvalidIdException.class, () -> {
	            new Item("   ", "TV", 25999.0);
	        });
	    }

	    @Test
	    public void creatingItemWithNullNameThrowsException() {
	        assertThrows(InvalidNameException.class, () -> {
	            new Item("1", null, 25999.0);
	        });
	    }

	    @Test
	    public void creatingItemWithEmptyNameThrowsException() {
	        assertThrows(InvalidNameException.class, () -> {
	            new Item("1", "   ", 25999.0);
	        });
	    }

	    @Test
	    public void creatingItemWithNegativePriceThrowsException() {
	        assertThrows(InvalidPriceException.class, () -> {
	            new Item("1", "TV", -5000.0);
	        });
	    }

	    @Test
	    public void creatingItemWithZeroPriceThrowsException() {
	        assertThrows(InvalidPriceException.class, () -> {
	            new Item("1", "TV", 0.0);
	        });
	    }
	
	
	
}
