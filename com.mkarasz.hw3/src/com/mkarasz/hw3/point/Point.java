/**
 * 
 */
package com.mkarasz.hw3.point;

public class Point {
	double x;
	double y;
	
	/**
	 * Makes a new point centered at the origin.
	 */
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Makes a new point centered at where the user specifies.
	 * @param x
	 * @param y
	 */
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Returns the current points x-coordinate	
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets the current points x-coordinate
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Returns the current points y-coordinate
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * Sets the current points y-coordinate
	 * @param y
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Returns the distance, as a double, between the given point, p, and the parameter point.
	 * @param p
	 * @return
	 */
	public double euclideanDistance(Point p){
		double xDist = Math.abs(this.getX() - p.getX());
		double yDist = Math.abs(this.getY() - p.getY());
		return Math.sqrt(Math.pow(xDist,2) + Math.pow(yDist, 2));
	}
	
	/**
	 * Returns the distance between the given points, p and q.
	 * @param p
	 * @param q
	 * @return
	 */
	public static double euclideanDistance(Point p, Point q){
		return q.euclideanDistance(p);
	}
	
	/**
	 * Returns the distance along the x- and y-axes between the given point and point p.
	 * @param p
	 * @return
	 */
	public double manhattanDistance(Point p){
		double xDist = Math.abs(this.getX() - p.getX());
		double yDist = Math.abs(this.getY() - p.getY());
		return xDist + yDist;
	}
	
	/**
	 * Returns the distance along the x- and y-axes between points p and q.
	 * @param p
	 * @param q
	 * @return
	 */
	public static double manhattanDistance(Point p, Point q){
		return q.manhattanDistance(p);
	}
	
	/**
	 * Returns a string of the coordinates of the given point, formated correctly.
	 * @return
	 */
	public String toString(){
		String s = new String("(" + this.getX() + ", " + this.getY() + ")");
		return s;
	}
}
