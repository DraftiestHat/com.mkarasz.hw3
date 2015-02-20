package windChill;

import static org.junit.Assert.*;

import org.junit.Test;

public class WindChillTest {

	@Test
	public void testGetWindChill() {
		Temperature t = Temperature.fahrenheightInstance(35);
		WindSpeed w = new WindSpeed(10);
		System.out.println("WInd chill is " + WindChill.getWindChill(t, w));
		assertEquals(27.4, WindChill.getWindChill(t, w),0.3);
	}

	@Test
	public void testGetWindChillWatts() {
		Temperature t = Temperature.fahrenheightInstance(35);
		WindSpeed w = new WindSpeed(10);
		assertEquals(987.7, WindChill.getWindChillWatts(t, w), .3);
	}

}
