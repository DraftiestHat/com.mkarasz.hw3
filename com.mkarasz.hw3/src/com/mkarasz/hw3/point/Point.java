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
		double xDist = Math.abs(this.getX() - p.getX());
		double yDist = Math.abs(this.getY() - p.getY());
		return Math.sqrt(Math.pow(xDist,2) + Math.pow(yDist, 2));
	}
	
	public static double euclideanDistance(Point p, Point q){
		return q.euclideanDistance(p);
	}
	
	public double manhattanDistance(Point p){
		double xDist = Math.abs(this.getX() - p.getX());
		double yDist = Math.abs(this.getY() - p.getY());
		return xDist + yDist;
	}
	
	public static double manhattanDistance(Point p, Point q){
		return q.manhattanDistance(p);
	}
}
