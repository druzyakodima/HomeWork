package com.example.person.task2;

public class Circle implements Shapes {
    @Override
    public void rotate() {
        System.out.println("The circle rotates");
    }

    public void rotate(String color) {
        System.out.printf("The %s circle rotates", color);
    }

    @Override
    public void rotate(int count) {
        System.out.printf("\nThe %d circle rotates", count);
    }
}
