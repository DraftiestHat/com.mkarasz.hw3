/**
 * First implementation of rectangle. Not using point yet - that's for the future.
 */
package com.mkarasz.hw3.rectangle;
import com.mkarasz.hw3.point.Point;




public class Rectangle {
	
	//private static final long serialVersionUID = 1L;
	double width;
	double height;
	Point p = new Point();
	
	/**
	 * Simplest rectangle
	 */
	public Rectangle(){
		this.width = 1;
		this.height = 1;
	}
	
	/**
	 * All you want is a certain size, don't care where it is.
	 * @param width - width of the rectangle
	 * @param height - height of the rectangle
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * 
	 * @param p
	 * @param width
	 * @param height
	 */
	public Rectangle(Point p, double width, double height){
		this.width = width;
		this.height = height;
		this.p = p;
	}
	
	/**
	 * 
	 * @param width - width of rectangle
	 * @param height - height of rectangle
	 * @param x - upper left x-coordinate of rectangle
	 * @param y - upper left y-coordinate of rectangle
	 */
	public Rectangle(double width, double height, double x, double y){
		this.width = width;
		this.height = height;
		p.setX(x);
		p.setY(y);
	}
	
	/**
	 * Gets the width of the current rectangle
	 * @return width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 *  sets the width of the current rectangle
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Gets the height of the current rectangle
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * sets the width of the current rectangle
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Gets the top left point of the current rectangle
	 * @return  p
	 */
	public Point getP() {
		return p;
	}

	/**
	 * Sets the top left point of the current rectangle
	 * @param p
	 */
	public void setP(Point p) {
		this.p = p;
	}

	/**
	 * returns the area of the rectangle
	 * @return double
	 */
	public double area(){
		return width * height;
	}
	
	/**
	 * returns the perimiter of the rectangle
	 * @return
	 */
	public double perimeter(){
		return 2 * width + 2 * height;
	}
	
	/**
	 * returns the length of the diagonal of the rectangle
	 * @return
	 */
	public double diagonalLength(){
		return Math.sqrt(this.width * this.width + this.height * this.height);
	}
	
	/**
	 * returns the distance from the origin of the upper left hand corner of the rectangle
	 * @return
	 */
	public double distanceFromOrigin(){
		Point a = new Point();
		return a.euclideanDistance(this.p);
	}
	
	/**
	 * Draws the given rectangle in the command line using asterisks
	 */
	public void draw(){
		
		int i = 0;
		
		for(i = 0; i < this.p.getY(); i++){
			System.out.println();
		}
		
		for(int j = 0; j < this.height; j++){		
			for(i = 0; i < this.p.getX() + this.width; i++){
				if(i < this.p.getX()){
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	/*public void draw(){
		JFrame f = new JFrame();
		f.setBounds(300,300,300,300);
		f.getContentPane().add(this); //why the hell this worked still amazes me, even though I understand the theory.
		f.setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Rectangle2D.Double(this.x, this.y, this.width, this.height));
	}*/
	
}

