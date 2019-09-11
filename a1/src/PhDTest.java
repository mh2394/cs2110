import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhDTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void testConstructor1() {
		PhD feb77= new PhD("feb77", 2, 1977);
		PhD jun77= new PhD("jun77", 6, 1977);
		assertEquals("feb77", feb77.name());
		assertEquals(2, feb77.month());
		assertEquals(1977, feb77.year());
		assertEquals(1, feb77.month());
		assertEquals(1977, feb77.year());
		assertEquals(3, feb77.month());
		assertEquals(1977, feb77.year());
		assertEquals(jun77, feb77.advisor1());
		assertEquals(jun77, feb77.advisor2());
		assertEquals(1, feb77.numAdvisees());
	}

}
