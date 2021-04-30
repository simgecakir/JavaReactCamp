package com.company;

public class Category {

    static int nextId = 1;
    private int id;
    String categoryName;

    public Category(String categoryName){
        this.categoryName = categoryName;
        this.id = nextId;
        nextId++;
    }
}
