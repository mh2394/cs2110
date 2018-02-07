import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class PhDTest {

	@Test
	public void testConstructor1() {
		PhD feb94= new PhD("feb94", 2, 1994);
		PhD jun95= new PhD("jun95", 6, 1995);
		PhD jun96= new PhD("jun96", 6, 1996, feb94, jun95);
		PhD jan95= new PhD("jan95", 1, 1995, feb94);
		PhD dec94= new PhD("dec94", 12, 1994, jun95, jun96);

		 
		 
		assertEquals("feb94", feb94.name());
		assertEquals(2, feb94.month());
		assertEquals(1994, feb94.year());
	}

}
