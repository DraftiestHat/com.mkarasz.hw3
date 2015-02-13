/**
 * 
 * @author Matt
 * 
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
		
		
		
	}
	
	/**
	 * Prints the stats of the given Rectangle object.
	 * @param r
	 */
	public static void printStats(Rectangle r){
		Point p = r.getP();
		System.out.printf("The upper left corner of the rectangle is at (%f,%f).", p.getX(), p.getY());
		System.out.println("The rectangle is " + r.getWidth() + " by " + r.getHeight());
		System.out.println("It has area " + r.area() + " and perimeter " + r.perimeter());
		System.out.println("The rectangles diagonal is of length " + r.diagonalLength());
		System.out.println("The rectangles upper left corner is " + r.distanceFromOrigin() + " from the origin.");
	}

}
