package com.axis.creational;

public class FactoryPattern {

public static void main(String[] args) {
	System.out.println("Factory Pattern");
	
	ShapeFactory shapeFactory=new ShapeFactory();
	Shape shape =shapeFactory.getShape("Circle");
	shape.draw();
}
	
}
