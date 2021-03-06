package com.syntax.class24;

public class Notes {
	
	
	/*
	 * Overriding:
What is Overriding:
overriding  is a feature that allows a subclass or child class
to provide a specific implementation of a method that is already
provided by one of its super-classes or parent classes
for example

Class ParentClass{

void print(){
System.out.println("hey i am a parent class")
}
double performCalculations(double a,double b){
return a+b;
}
}

Class ChildClass extends ParentClass{

void print(){
System.out.println("hey i am a ChildClass")
}
}

Class MainClass{
public static void main(String[] args){

ChildClass childClass=new ChildClass();
childChild.print(); //hey i am a ChildClass


}
}

Rules for overriding:
1)
There should a inheritance relationship between the class in which we are overriding the methods
2)we can not override private methods,constructors and initializer blocks why because they don't participate
in inheritance
3)
We can not decrease the visibility of our methods for example if something is public in our parent class
we can't make it default/protected or private but we can increase the visibility
like if something is protected/default we can make it public.
why: Because it breaks our inheritance contract like if we have something as public and if we try to
make it private. it will not be available to our child classes
4) we can not change the return type of the method being overridden. because
it will effect the polymorphism

polymorphism allows us to play with all of the subclasses within a
few lines (loops for example)  that requires all the overridden methods
in the derived classes to return the same type. Otherwise we have to
make exceptions for all the overridden methods in derived classes.
That kind of defeats the purpose OOP. Then there would be no use to
create objects. we can basically go back to procedural programming and
keep writing separate methods for everything we created.  is that correct ?

5)To override a method the name of the method in your child class must be same as the method in your parent
class that you are trying to override why? Because this is one of the features through which your java will
identify which method to override
6)To override a method the signature of the method should be same
	 * 
	 * 
	 * */

}
