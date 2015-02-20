package windChill;

import static org.junit.Assert.*;

import org.junit.Test;

public class WindSpeedTest {

	@Test
	public void testWindSpeed() {
		WindSpeed w = new WindSpeed(20);
		assertNotNull(w);
	}

	@Test
	public void testToMetersPerSecond() {
		WindSpeed w = new WindSpeed(30);
		assertEquals(13.4112,w.toMetersPerSecond(),.2);
	}

	@Test
	public void testGetMph() {
		WindSpeed w = new WindSpeed(20);
		assertEquals(20, w.getMph(), 0);
	}

	@Test
	public void testSetMph() {
		WindSpeed w = new WindSpeed(0);
		w.setMph(30);
		assertEquals(30, 30, 0);
	}

}
