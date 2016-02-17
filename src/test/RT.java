package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RT {

	@Test
	public void test() {
		Assert.assertEquals(TestMain.substr("Richard", 0, 4),"Richa");
		Assert.assertEquals(TestMain.substr("Richard", 2, 4),"cha");
	}
	
	@Test
	@Before
	public void test1(){
		Assert.assertEquals(TestMain.substr("Richard", 2, 3),"ch");
	}

}
