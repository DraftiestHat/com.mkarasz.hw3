package windChill;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void testCelsiusInstance() {
		Temperature t = Temperature.celsiusInstance(14);
		assertNotNull("New celsiusInstance failed.",t);
	}

	@Test
	public void testFahrenheightInstance() {
		Temperature t = Temperature.fahrenheightInstance(60);
		assertNotNull("New fahrenheightInstance failed.",t);
	}

	@Test
	public void testGetKelvin() {
		Temperature t = Temperature.celsiusInstance(16);
		assertEquals(289.15, t.getKelvin(), 0);
	}

	@Test
	public void testSetKelvin() {
		Temperature t = Temperature.celsiusInstance(0);
		t.setKelvin(289.15);
		assertEquals(16,t.getCelsius(),0);
	}

	@Test
	public void testGetFahrentheit() {
		Temperature t = Temperature.fahrenheightInstance(60.8);
		assertEquals(16, t.getCelsius(), 0);
	}

	@Test
	public void testSetFahrentheit() {
		Temperature t = Temperature.fahrenheightInstance(0);
		t.setFahrentheit(60.8);
		assertEquals(16,t.getCelsius(),0);
	}

	@Test
	public void testGetCelsius() {
		Temperature t = Temperature.celsiusInstance(16);
		assertEquals(16,t.getCelsius(),0);
	}

	@Test
	public void testSetCelsius() {
		Temperature t = Temperature.celsiusInstance(0);
		t.setCelsius(16);
		assertEquals(60.8,t.getFahrentheit(),0);
	}

}
