package com.shiva.firstclass;

public class ShivaAge {
	int age = 20;

	public int increaseAge() {
		age = age + 5;
		return age;

	}

	public static void main(String[] args) {
		ShivaAge object = new ShivaAge();
		int age = object.increaseAge();
		System.out.println(age);
		int ageTwo = object.increaseAge();
		System.out.println(ageTwo);
		int ageThree = object.increaseAge();
		System.out.println(ageThree);

	}
}
