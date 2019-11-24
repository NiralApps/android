package com.example.farmerapp.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.farmerapp.R;

public class MyAccountFragment  extends Fragment {

    public static Button btnEdit;
    public static EditText userName,userPhoneNumber,userEmailId,userAddress;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);
        btnEdit = view.findViewById(R.id.btnEdit);
        userName = view.findViewById(R.id.userName);
        userPhoneNumber = view.findViewById(R.id.userPhoneNumber);
        userEmailId = view.findViewById(R.id.userEmailId);
        userAddress = view.findViewById(R.id.userAddress);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnEdit.setText("UPDATE");
                userName.setEnabled(true);
                userPhoneNumber.setEnabled(true);
                userEmailId.setEnabled(true);
                userAddress.setEnabled(true);
            }
        });
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Menu 1");
    }
}
