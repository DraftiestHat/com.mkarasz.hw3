/**
 * Gives temperature
 */
package windChill;

public class Temperature {
	private double kelvin = 0;
	private double fahrentheit = 0;
	private double celsius = 0;
	
	enum Type {
		FAHRENHEIGHT, CELSIUS, KELVIN
	}
	
	/**
	 * @param value
	 * @param type
	 */
	private Temperature(double value, Type type){
		changeTemps(value, type);
	}
	
	/**
	 * @param value
	 * @return
	 */
	public static Temperature celsiusInstance(double value){
		return new Temperature(value, Type.CELSIUS);
	}
	
	/**
	 * @param value
	 * @return
	 */
	public static Temperature fahrenheightInstance(double value){
		return new Temperature(value, Type.FAHRENHEIGHT);
	}
	
	private void changeTemps(double value, Type type){
		switch(type){
		case FAHRENHEIGHT:
			this.fahrentheit = value;
			this.celsius = fahrToCels(this.fahrentheit);
			this.kelvin = fahrToKelv(this.fahrentheit);
			break;
		case CELSIUS:
			this.celsius = value;
			this.fahrentheit = celsToFahr(this.celsius);
			this.kelvin = celsToKelv(this.celsius);
			break;
		case KELVIN:
			this.kelvin = value;
			this.fahrentheit = kelvToFahr(this.kelvin);
			this.celsius = kelvToCels(this.kelvin);
		}
	}
	
	private double fahrToCels(double value){
		return (5 * (value - 32)) / 9;
	}
	
	private double celsToFahr(double value){
		return ((9 * value) / 5) + 32;
	}
	
	private double celsToKelv(double value){
		return value + 273.15;
	}
	
	private double fahrToKelv(double value){
		double cels = fahrToCels(value);
		return celsToKelv(cels);
	}
	
	private double kelvToCels(double value){
		return value - 273.15;
	}
	
	private double kelvToFahr(double value){
		double cels = kelvToCels(value);
		return celsToFahr(cels);
	}

	/**
	 * @return the temperature in kelvin
	 */
	public double getKelvin() {
		return kelvin;
	}

	/**
	 * @param kelvin the kelvin to set
	 */
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}

	/**
	 * @return the temperature in fahrentheit
	 */
	public double getFahrentheit() {
		return fahrentheit;
	}

	/**
	 * @param fahrentheit the fahrentheit to set
	 */
	public void setFahrentheit(double fahrentheit) {
		this.fahrentheit = fahrentheit;
	}

	/**
	 * @return the temperature in celsius
	 */
	public double getCelsius() {
		return celsius;
	}

	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	
}
