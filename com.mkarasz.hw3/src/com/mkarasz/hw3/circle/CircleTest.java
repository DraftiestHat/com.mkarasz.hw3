package com.mkarasz.hw3.circle;

import com.mkarasz.hw3.point.Point;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println("Non-initialized-circle stats:");
		printStats(c);		
		c.draw();
		System.out.println();
		
		c = new Circle(5.1);
		
		System.out.println("Only-radius-initialized-circle stats:");
		printStats(c);
		c.draw();
		System.out.println();
		
		Point p = new Point(6.1,7.8);
		c = new Circle(p, 5.5);
		System.out.println("Point-initialized-circle stats:");
		printStats(c);
		c.draw();
		System.out.println();
		
		c = new Circle(10, 10, 7);
		System.out.println("Everything-initialized-circle stats:");
		printStats(c);
		c.draw();
		c = null;

	} 
	
	/**
	 * Prints out stats from the circle given.
	 * @param r
	 */
	
	public static void printStats(Circle r) {
		Point origin = new Point();
		Point p = r.getP();
		System.out.printf("The circle is at (%f,%f) with a radius of %f.\n", p.getX(), p.getY(), r.getRadius());
		System.out.println("The perimeter is " + r.perimeter());
		System.out.println("The area is " + r.area());
		System.out.println("The distance the circle is from the origin is " + r.distanceFromOrigin());
		System.out.println("The Manhattan distance from the origin is " + p.manhattanDistance(origin));
	}
}
