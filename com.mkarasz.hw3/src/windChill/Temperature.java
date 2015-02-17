/**
 * Gives temperature
 */
package windChill;

public class Temperature {
	private double kelvin = 0;
	private double fahrentheit = 0;
	private double celsius = 0;
	
	private int tempType = 0; //0 for fahrenheit, 1 for celsius, 2 for kelvin
	
	enum Type {
		FAHRENHEIGHT, CELSIUS, KELVIN
	}
	
	/**
	 * Changes a temperature into the 2 others
	 * @param value
	 * @param type
	 */
	private Temperature(double value, Type type){
		switch(type){
		case FAHRENHEIGHT:
			setTempType(0);
			break;
		case CELSIUS:
			setTempType(1);
			break;
		case KELVIN:
			setTempType(2);
			break;
		}
		changeTemps(value, type);
	}
	
	/**
	 * Creates new temperature object of type celsius.
	 * @param value the temperature
	 * @return the temperature object
	 */
	public static Temperature celsiusInstance(double value){
		return new Temperature(value, Type.CELSIUS);
	}
	
	/**
	 * Creates a new temperature object of type celsius.
	 * @param value the temperature
	 * @return the temperature object
	 */
	public static Temperature fahrenheightInstance(double value){
		return new Temperature(value, Type.FAHRENHEIGHT);
	}
	
	/**
	 * Returns the original temperature the 
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		switch(tempType){
		case 0://fahrenheit
			return new String("" + fahrentheit + "F");
		case 1: //celsius
			return new String("" + celsius + "C");
		case 2: //kelvin
			return new String("" + kelvin + "K");
		default:
			System.out.println("Something went terribly wrong.");
		}
		
		return new String("");
	}
	
	/**
	 * Changes all of the values depending on the number entered and the type
	 * @param value the temperature
	 * @param type the different types of temperature
	 */
	private void changeTemps(double value, Type type){
		switch(type){
		case FAHRENHEIGHT:
			setTempType(0);
			this.fahrentheit = value;
			this.celsius = fahrToCels(this.fahrentheit);
			this.kelvin = fahrToKelv(this.fahrentheit);
			break;
		case CELSIUS:
			setTempType(1);
			this.celsius = value;
			this.fahrentheit = celsToFahr(this.celsius);
			this.kelvin = celsToKelv(this.celsius);
			break;
		case KELVIN:
			setTempType(2);
			this.kelvin = value;
			this.fahrentheit = kelvToFahr(this.kelvin);
			this.celsius = kelvToCels(this.kelvin);
		}
	}
	
	/**
	 * Converts fahrenheit to celsius
	 * @param value
	 * @return double
	 */
	private double fahrToCels(double value){
		return (5 * (value - 32)) / 9;
	}
	
	/**
	 * Converts celsius to fahrenheit
	 * @param value
	 * @return
	 */
	private double celsToFahr(double value){
		return ((9 * value) / 5) + 32;
	}
	
	/**
	 * Converts celsius to kelvin
	 * @param value
	 * @return
	 */
	private double celsToKelv(double value){
		return value + 273.15;
	}
	
	/**
	 * Converts fahrenheit to kelvin
	 * @param value
	 * @return
	 */
	private double fahrToKelv(double value){
		double cels = fahrToCels(value);
		return celsToKelv(cels);
	}
	
	/**
	 * Converts kelvin to celsius
	 * @param value
	 * @return
	 */
	private double kelvToCels(double value){
		return value - 273.15;
	}
	
	/**
	 * Converts kelvin to fahrenheit 
	 * @param value
	 * @return
	 */
	private double kelvToFahr(double value){
		double cels = kelvToCels(value);
		return celsToFahr(cels);
	}

	/**
	 * Returns the temperature in kelvin.
	 * @return the temperature in kelvin
	 */
	public double getKelvin() {
		return kelvin;
	}

	/**
	 * Sets the temperature in kelvin and then changes the rest.
	 * @param kelvin the kelvin to set
	 */
	public void setKelvin(double kelvin) {
		this.changeTemps(kelvin, Type.KELVIN);
	}

	/**
	 * Returns the temperature in fahrentheit
	 * @return the temperature in fahrentheit
	 */
	public double getFahrentheit() {
		return fahrentheit;
	}

	/**
	 * Sets the temperature in fahrenheit and then changes the rest.
	 * @param fahrentheit the fahrentheit to set
	 */
	public void setFahrentheit(double fahrentheit) {
		this.changeTemps(fahrentheit, Type.FAHRENHEIGHT);
	}

	/**
	 * Returns the temperature in celsius
	 * @return the temperature in celsius
	 */
	public double getCelsius() {
		return celsius;
	}

	/**
	 * Sets the temperature in celsius and then changes the rest.
	 * @param celsius the celsius to set
	 */
	public void setCelsius(double celsius) {
		this.changeTemps(celsius, Type.CELSIUS);
	}

	/**
	 * @return tempType the type of temperature the user entered
	 */
	@SuppressWarnings("unused")
	private int getTempType() {
		return tempType;
	}

	/**
	 * Sets the original type of temperature the user entered.
	 * @param tempType
	 */
	private void setTempType(int tempType) {
		this.tempType = tempType;
	}	
}
