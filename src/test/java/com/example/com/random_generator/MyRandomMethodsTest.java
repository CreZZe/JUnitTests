package com.example.com.random_generator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MyRandomMethodsTest {
	MyRandomMethods methods = new MyRandomMethods();
	
	int rand = 0;
	
	@Test
	public void randomBetween1And10Test() {
		for (int i = 0; i < 1000; i++) {
			rand = methods.randomBetween1And10();
			
			assertTrue((rand > 0) && (rand < 11));
		}
	}
	
	@Test
	public void randomBetween11And20Test() {
		for (int i = 0; i < 1000; i++) {
			rand = methods.randomBetween11And20();
			
			assertTrue((rand > 10) && (rand < 21));
		}
	}
	
	@Test
	public void randomBetween21And30Test() {
		for (int i = 0; i < 1000; i++) {
			rand = methods.randomBetween21And30();
			
			assertTrue((rand > 20) && (rand < 31));
		}
	}
	
	@Test
	public void randomBetween31And40Test() {
		for (int i = 0; i < 1000; i++) {
			rand = methods.randomBetween31And40();
			
			assertTrue((rand > 30) && (rand < 41));
		}
	}
	
	@Test
	public void randomBetween41And50Test() {
		for (int i = 0; i < 1000; i++) {
			rand = methods.randomBetween41And50();
			
			assertTrue((rand > 40) && (rand < 51));
		}
	}
}
