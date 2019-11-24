package com.example.farmerapp;

public class CategoryLists {
    private int id;
    private String title;
    private String desc;
    private int image;
    public CategoryLists(int id, String title, String desc, int image) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.image = image;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() { return desc; }
    public int getImage() {
        return image;
    }
}
