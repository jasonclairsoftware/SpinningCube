package dev.jcclair.test;

import static org.junit.jupiter.api.Assertions.*;
import dev.jcclair.models.Point;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void creationTest() {
		Point point = new Point(1, 2 ,3);
		assertEquals("X: 1.0 Y: 2.0 Z: 3.0", point.toString(), "toString() should return predicted result.");
	}
	
	@Test
	void getXYZTest() {
		Point point = new Point(1,2,3);
		assertEquals((double)1, point.getX(), "Should be 1.0");
		assertEquals((double)2, point.getY(), "Should be 2.0");
		assertEquals((double)3, point.getZ(), "Should be 3.0");
		
		double[] container = point.getPoints();
		assertEquals(container[0], point.getX(), "Should be 1.0");
		assertEquals(container[1], point.getY(), "Should be 2.0");
		assertEquals(container[2], point.getZ(), "Should be 3.0");
	}
	
	@Test
	void setPointsTest() {
		Point point = new Point(0,0,0);
		
		point.setPoints(1, 2, 3);
		assertArrayEquals(new double[] {1.0, 2.0, 3.0}, point.getPoints(), "Should be X: 1.0, Y: 2.0, Z: 3.0");
		
		point.setX(4.4);
		point.setY(5.5);
		point.setZ(6.6);
		assertArrayEquals(new double[] {4.4,5.5,6.6}, point.getPoints(), "Should be X: 4.4, Y: 5.5, Z: 6.6");
	}

}
