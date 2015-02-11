/**
 * First implementation of rectangle. Not using point yet - that's for the future.
 */
package com.mkarasz.hw3.rectangle;
import com.mkarasz.hw3.point.Point;




public class Rectangle {
	
	//private static final long serialVersionUID = 1L;
	double width;
	double height;
	double x;
	double y;
	
	/**
	 * Simplist rectangle
	 */
	public Rectangle(){
		this.width = 1;
		this.height = 1;
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * All you want is a certain size, don't care where it is.
	 * @param width - width of the rectangle
	 * @param height - height of the rectangle
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.x = 0;
		this.y = 0;
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
		this.x = x;
		this.y = y;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double area(){
		return width * height;
	}
	
	public double perimeter(){
		return 2 * width + 2 * height;
	}
	
	public double diagonalLength(){
		return Math.sqrt(this.width * this.width + this.height * this.height);
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public void draw(){
		
		int i = 0;
		
		for(i = 0; i < this.y; i++){
			System.out.println();
		}
		
		for(int j = 0; j < this.height; j++){		
			for(i = 0; i < this.x + this.width; i++){
				if(i < this.x){
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

