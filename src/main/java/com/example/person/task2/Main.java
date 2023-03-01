package com.example.person.task2;

public class Main {

    public static void main(String[] args) {

        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        circle.rotate();
        circle.rotate("green");
        circle.rotate(10);
    }
}
