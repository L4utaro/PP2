package test;

import static org.junit.Assert.*;


import org.junit.Test;
import enums.Orientation;
import object.Coordinate;
import object.Size;
import object.Tank;

public class TestTank {

	
	/**moverse*/
	@Test
	public void testMoversePorIzquierda() {
		Orientation orientation = Orientation.LEFT;
		Coordinate coordinate = new Coordinate(400, 400);
		Size size = new Size(40, 40);
		Tank tank = new Tank(orientation, coordinate, size);
		
		Orientation orientation2 = Orientation.LEFT;
		Coordinate coordinate2 = new Coordinate(398, 400);
		Size size2 = new Size(40, 40);
		Tank expected = new Tank(orientation2, coordinate2, size2);
		
		tank.moverse();
		double x = tank.getCoordinate().getX();
		System.out.println(expected.getCoordinate().getX());
		System.out.println(tank.getCoordinate().getX());
		//assertEquals(expected.getCoordinate().getX(), tank.getCoordinate().getX());
		assertNotEquals(398.0,x);
	}
	
	//girar
	//getangulo
	

}
