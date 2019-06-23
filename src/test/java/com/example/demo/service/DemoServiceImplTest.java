package com.example.demo.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceImplTest {

	@Autowired
	DemoService demoService;
	@Test
	public void testAddTwoNumber() {
		int result=demoService.addTwoNumber(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void testDevideNumber() {
		int result=demoService.devideNumber(6,2);
		assertEquals(2, result);
	}
	/*@Test
	public void testDevideNumberZIRO() {
		int result=demoService.devideNumber(6,0);
		assertEquals(0, result);
	}*/
	@Test
	public void testDevideNumberNumberException() {
		int result=demoService.devideNumber(10,3);
		assertEquals(3, result);
	}

}
