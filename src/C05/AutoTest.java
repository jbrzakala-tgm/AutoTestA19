package C05;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

public class AutoTest {

	@Test
	public void autoTest(){
		Auto auto = new Auto("Auto",Color.RED,105);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void autoTest2(){
		Auto auto = new Auto("Auto",null,105);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void autoTest21(){
		Auto auto = new Auto("Auto",Color.GREEN,-193);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void autoTest22(){
		Auto auto = new Auto(" ",null,105);
	}
	
	@Test
	public void autoTest3(){
		new Auto();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setTest(){
		Auto auto  = new Auto();
		auto.setType("");
		auto.getType();
	}
	
	@Test(expected=AssertionError.class)
	public void getTest(){
		Auto auto = new Auto();
		assertEquals(auto.getFarbe(),Color.BLUE);
	}
	
	@Test
	public void toStringTest(){
		Auto auto = new Auto("Lamborghini",Color.YELLOW,300);
		if (!(auto.toString().matches(".*"+"gelb"+".*"))){
			fail("Die Farbe ist nicht gleich!");
		}
		
	}
}