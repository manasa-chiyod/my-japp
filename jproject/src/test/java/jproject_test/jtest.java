package jproject_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jproject_java.japp;

public class jtest {
	@Test
	public void testlogin1()
	{
		japp a=new japp();
		Assert.assertEquals(0,a.userlogin("abc","abc123"));
	}
 @Test
 	public void testlogin2()
	{
		japp a=new japp();
		Assert.assertEquals(1,a.userlogin("abc","abc@123"));
	}
}
