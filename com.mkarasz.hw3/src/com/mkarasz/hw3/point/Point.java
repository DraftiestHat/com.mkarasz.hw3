package com.mkarasz.hw3.point;

public class Point {
	double x;
	double y;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
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

	public double euclideanDistance(Point p){
		
		return 0;
	}
	
	public static double euclideanDistance(Point p, Point q){
		
		return 0;
	}
	
	public double manhattanDistance(Point p){
		
		return 0;
	}
	
	public static double manhattanDistance(Point p, Point q){
	
		return 0;
	}
}
