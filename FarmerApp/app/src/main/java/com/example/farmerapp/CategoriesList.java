package com.example.farmerapp;

public class CategoriesList {

    private int id;
    private String title;
    public CategoriesList(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
}
