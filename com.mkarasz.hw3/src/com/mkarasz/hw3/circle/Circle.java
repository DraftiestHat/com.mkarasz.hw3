/**
 * Need to implement with Point class. Unused at this point.
 */
package com.mkarasz.hw3.circle;

import com.mkarasz.hw3.point.Point;





public class Circle {
	
	/**
	 * This holds information about a circle - Center point coordinates, radius, and functions for it.
	 */
	//private static final long serialVersionUID = 1L;
	Point p = new Point(1,1);
	double radius;
	
	/**
	 * Simplist circle. 
	 */
	public Circle(){
		this.radius = 1;
	}
	
	/**
	 * A circle that the radius sets all info. 
	 */
	public Circle(double radius){
		this.p.setX(radius);
		this.p.setY(radius);
		this.radius = radius;
	}
	
	/**
	 * A circle that the radius sets all info. 
	 */
	public Circle(Point p,double radius){
		this.p = p;
		this.radius = radius;
	}
	
	/**
	 * Most complicated circle - set all factors. 
	 */
	public Circle(double x, double y, double radius){
		p.setX(x);
		p.setY(y);
		this.radius = radius;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area(){
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter(){
		return 2 * Math.PI * this.radius;
	}
	
	public double distanceFromOrigin(){
		Point q = new Point();
		return q.euclideanDistance(this.p);
	}
	
	/**
	 * This is shittily done. If it were ints, I would have been fine. I also don't have time to implement it well. 
	 **/
	public void draw(){		
		
		for (int i = 0; i <= 2 * p.getX(); i++){
	        for (int j = 0; j <= 2 * p.getY(); j++){
	            double inX = (p.getY() - i);
	            double inY = (p.getX() - j);

	            if (Math.abs(Math.pow(inX, 2) + Math.pow(inY, 2) - Math.pow(this.radius, 2)) < 5){ //print as long as we're within a certain distance. 
	                System.out.print("X");
	            }
	            else{ //put in a space. Gives the circle an outline.
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
		
		
	}
	
	/*public void draw(){
		JFrame f = new JFrame();
		f.setBounds(300,300,300,300);
		f.getContentPane().add(this);
		f.setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Ellipse2D.Double(this.x, this.y, this.radius * 2, this.radius * 2));
	}*/
	
}
