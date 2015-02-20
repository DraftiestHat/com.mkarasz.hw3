package com.mkarasz.hw3.point;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testPoint() {
		Point p = new Point();
		assertNotNull(p);
	}

	@Test
	public void testPointDoubleDouble() {
		Point p = new Point(12.3,12.4);
		assertNotNull(p);
	}

	@Test
	public void testGetX() {
		Point p = new Point();
		assertEquals(0,p.getX(),0);
	}

	@Test
	public void testSetX() {
		Point p = new Point();
		p.setX(13.3);
		assertEquals(13.3,p.getX(),0);
	}

	@Test
	public void testGetY() {
		Point p = new Point();
		assertEquals(0,p.getY(),0);
	}

	@Test
	public void testSetY() {
		Point p = new Point();
		p.setY(22.2);
		assertEquals(22.2,p.getY(),0);
	}

	@Test
	public void testEuclideanDistancePoint() {
		Point p = new Point();
		Point q = new Point(2,2);
		assertEquals(Math.sqrt(8),p.euclideanDistance(q),0.3);
	}

	@Test
	public void testEuclideanDistancePointPoint() {
		Point p = new Point();
		Point q = new Point(2,2);
		assertEquals(Math.sqrt(8),Point.euclideanDistance(p,q),0.3);
	}

	@Test
	public void testManhattanDistancePoint() {
		Point p = new Point();
		Point q = new Point(2,2);
		assertEquals(4,p.manhattanDistance(q),0.3);
	}

	@Test
	public void testManhattanDistancePointPoint() {
		Point p = new Point();
		Point q = new Point(2,2);
		assertEquals(4,Point.manhattanDistance(p, q),0.3);
	}

}
