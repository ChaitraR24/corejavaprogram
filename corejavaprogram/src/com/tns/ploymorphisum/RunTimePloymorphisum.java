package com.tns.ploymorphisum;

class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("meows");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("dog barks");
	}
}

public class RunTimePloymorphisum {
public static void main(String[] args) {
	Animal animal = new Cat();
	animal.sound();
	animal = new Dog();
	animal.sound();
}
}
