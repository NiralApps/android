package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CategoryListViewActivity extends AppCompatActivity {
    //a list to store all the products
    public List<CategoryLists> categoryList;
    //the recyclerview
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_view);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //initializing the productlist
        categoryList = new ArrayList<>();
        //adding some items to our list
        categoryList.add(
                new CategoryLists(
                        1,
                        "Wheat",
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        R.drawable.bg));
        categoryList.add(
                new CategoryLists(
                        1,
                        "Wheat",
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        R.drawable.bg));
        categoryList.add(
                new CategoryLists(
                        1,
                        "Wheat",
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        R.drawable.bg));
        categoryList.add(
                new CategoryLists(
                        1,
                        "Wheat",
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        R.drawable.bg));
        categoryList.add(
                new CategoryLists(
                        1,
                        "Wheat",
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        R.drawable.bg));
        categoryList.add(
                new CategoryLists(
                        1,
                        "Wheat",
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        R.drawable.bg));
        //creating recyclerview adapter
        CategoryListAdapter adapter = new CategoryListAdapter(CategoryListViewActivity.this, categoryList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
