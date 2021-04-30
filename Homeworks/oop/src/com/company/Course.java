package com.company;

public class Course {

    private static int nextId = 1;

    protected int id;
    String courseName;
    String instructer;
    String price;

    public Course(String courseName, String instructer, String price) {

        this.id = nextId;
        this.courseName = courseName;
        this.instructer = instructer;
        this.price = price;

        nextId++;
    }
}






