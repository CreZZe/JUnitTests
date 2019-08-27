package com.example.com.random_generator;

import java.util.Random;

public class MyRandomMethods {
	Random rand = new Random();
	
	public int randomBetween1And10() {
		return rand.nextInt(10) + 1;
	}
	
	public int randomBetween11And20() {
		return rand.nextInt(10) + 11;
	}
	
	public int randomBetween21And30() {
		return rand.nextInt(10) + 21;
	}
	
	public int randomBetween31And40() {
		return rand.nextInt(10) + 31;
	}
	
	public int randomBetween41And50() {
		return rand.nextInt(10) + 41;
	}
}
