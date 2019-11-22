package com.example.farmerapp.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.farmerapp.CategoriesList;
import com.example.farmerapp.CategoryAdapter;
import com.example.farmerapp.NotificationAdapter;
import com.example.farmerapp.NotificationList;
import com.example.farmerapp.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {
    public static RecyclerView recyclerView;
    //a list to store all the categories
    public List<NotificationList> notificationList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        final Context context = getContext();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        //initializing the productlist
        notificationList = new ArrayList<>();
        //adding some items to our list
        notificationList.add(
                new NotificationList(
                        1,
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        "Available",
                        "Delivered",
                        "$1.07",
                        R.drawable.bg));
        notificationList.add(
                new NotificationList(
                        1,
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        "Available",
                        "Delivered",
                        "$1.07",
                        R.drawable.bg));
        notificationList.add(
                new NotificationList(
                        1,
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        "Available",
                        "Delivered",
                        "$1.07",
                        R.drawable.bg));
        notificationList.add(
                new NotificationList(
                        1,
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        "Available",
                        "Delivered",
                        "$1.07",
                        R.drawable.bg));
        notificationList.add(
                new NotificationList(
                        1,
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        "Available",
                        "Delivered",
                        "$1.07",
                        R.drawable.bg));
        notificationList.add(
                new NotificationList(
                        1,
                        "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).",
                        "Available",
                        "Delivered",
                        "$1.07",
                        R.drawable.bg));
        //creating recyclerview adapter
        NotificationAdapter adapter = new NotificationAdapter(context, notificationList);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Menu 1");
    }
}