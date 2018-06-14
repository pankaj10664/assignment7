import java.util.*;
abstract class Animals
{ 	
	String colour;
	String breed;
	abstract void eat();
	void speak()
	{ 
	System.out.println("inside a method of animal class");
	}
}

abstract class Cat extends Animals
{	
	int age; 
	void finch()
	{
	System.out.println(" every cat is a finch");
	}
}

class Dog extends Cat
{	void eat()
	{
	System.out.println(" dog eats meat");
	}	
}
class Abst
{
	public static void main(String [] args)
	{
		Cat obj=new Dog();
		obj.eat();
		obj.finch();
		obj.speak();
	}
}
