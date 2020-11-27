package com.syntax.class29;


	
	interface Shape
    {
        void calculateArea();
        void calculatePerimeter();
    }

    abstract class Circle implements Shape {

        public String radius;

        Circle (double diameter) {
            this.diameter = diameter;
        }

        public static final double PI = Math.PI;

        public double diameter;

        public double area () {
            double radius = diameter / 2.0;
            return PI * radius * radius;
        }

        public abstract void show();

        abstract void show1();

        @Override
        public void calculateArea() {
        }
        @Override
        public void calculatePerimeter() {

        }
    }
    class Square extends Circle {

        public String length;
        public String width;

        Square (double side) {
            super (side);
        }

        @Override
        public void show() {
            System.out.println("A circle with diameter "+ this.diameter + " and radius " + this.radius);
        }

        @Override
        public void show1() {
            System.out.println("A square with edge length " + this.length + " and width " + this.width);
        }
    }


