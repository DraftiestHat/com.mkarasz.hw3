/**
 * Tests rectangle class. Prints stats and draws the rectangle.
 * @author Matt
 * @TODO - Implement user input functions. Too lazy to do that now.
 */
package com.mkarasz.hw3.rectangle;

import com.mkarasz.hw3.rectangle.Rectangle;
import com.mkarasz.hw3.point.Point;


public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Point p = new Point();
		
		
		System.out.println("Non-initialized-Rectangle stats:");
		printStats(r);
		r.draw();
		System.out.println();
		
		r = new Rectangle(20,16);
		System.out.println("Width and Height-initialized-Rectangle stats:");
		printStats(r);
		r.draw();
		System.out.println();
		
		p = new Point(6.1,4.3);
		r = new Rectangle(p,20,16);
		System.out.println("Point-initialized-Rectangle stats:");
		printStats(r);
		r.draw();
		System.out.println();
		
		r = new Rectangle(8.1, 9.2, 2.6, 3.0);
		System.out.println("Everything-initialized-Rectangle stats:");
		printStats(r);
		r.draw();
		
		r = null;
		p = null;
		
	}
	
	/**
	 * Prints the stats of the given Rectangle object.
	 * @param r
	 */
	public static void printStats(Rectangle r){
		Point origin = new Point();
		Point p = r.getP();
		System.out.println("The upper left corner of the rectangle is at " + p.toString() + ".");
		System.out.println("The rectangle is " + r.getWidth() + " by " + r.getHeight());
		System.out.println("It has area " + r.area() + " and perimeter " + r.perimeter());
		System.out.println("The rectangles diagonal is of length " + r.diagonalLength());
		System.out.println("The rectangles upper left corner is " + r.distanceFromOrigin() + " from the origin.");
		System.out.println("The Manhattan distance from the origin is " + p.manhattanDistance(origin));
		origin = new Point (6, 6);
		System.out.println("The straight distance from the top left corner of the rectangle at " + p.toString() + "  to " + origin.toString() + " is " + Point.euclideanDistance(p, origin));
		System.out.println("The manhattan distance from the top left corner of the rectangle at " + p.toString() + " to " + origin.toString() + " is " + Point.manhattanDistance(p, origin)); 
	}

}
