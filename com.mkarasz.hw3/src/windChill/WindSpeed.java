/**
 * @author Matt
 *
 */
package windChill;


public class WindSpeed {
	double mph;
	
	/**
	 * @param mph constructor for WindSpeed class using American units.
	 */
	public WindSpeed(double mph){
		this.mph = mph;
	}
	
	/**
	 * @return the speed in meters per second
	 */
	public double toMetersPerSecond(){
		return this.mph * 0.44704;
	}
	
	/** 
	 * @return String the speed in mph
	 */
	public String toString(){
		return new String("" + this.mph);
	}

	/**
	 * @return
	 */
	public double getMph() {
		return mph;
	}

	/**
	 * @param mph
	 */
	public void setMph(double mph) {
		this.mph = mph;
	}
	
}
