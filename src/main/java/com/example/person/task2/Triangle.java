package com.example.person.task2;

public class Triangle implements Shapes {

    @Override
    public void rotate() {
        System.out.println("The rotates triangle");
    }

    @Override
    public void rotate(String color) {
        System.out.printf("The %s rotates triangle%n", color);
    }

    @Override
    public void rotate(int count) {
        System.out.printf("\nThe %d rotates triangle", count);
    }
}
