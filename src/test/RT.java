package test;

import static org.junit.Assert.*;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RT {
	DDD d = new DDD();
	
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

	@Test
	@After
	public void test2(){
		Assert.assertEquals(TestMain.substr("Richard", 0, 3),"Rich");
		//d.cancel();
	}
	
	@Test
	@Before
	public void test3(){

		Assert.assertEquals(d.sox(5),25 );
		Assert.assertEquals(TestMain.substr("Richard", 0, 3),"Rich");
		//d.run();
	}
}
