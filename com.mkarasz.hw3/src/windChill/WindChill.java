package windChill;

/**
 * @author Matt
 *
 */
public class WindChill {
	/**
	 * @param t
	 * @param w
	 */
	public static double getWindChill(Temperature t, WindSpeed w){
		return 35.74 + 0.6215 * t.getFahrentheit() - 35.75 * Math.pow(w.getMph(), 0.16) + 0.4275 * t.getFahrentheit() * (Math.pow(w.getMph(), 0.16));
	}
	
	/**
	 * @param t
	 * @param w
	 */
	public static double getWindChillWatts(Temperature t, WindSpeed w){
		double interim = 12.1452 + (11.6222 * Math.sqrt(w.toMetersPerSecond())) - (1.16222 * w.toMetersPerSecond());
		return interim * (33 - t.getCelsius());
	}
}
