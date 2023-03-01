package com.example.person.task2;

public class Square implements Shapes {
    @Override
    public void rotate() {
        System.out.println("The circle square");
    }

    @Override
    public void rotate(String color) {
        System.out.printf("The %s circle square", color);
    }

    @Override
    public void rotate(int count) {
        System.out.printf("\nThe %d circle square", count);
    }
}
