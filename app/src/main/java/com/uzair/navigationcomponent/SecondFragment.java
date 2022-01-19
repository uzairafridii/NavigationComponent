package com.uzair.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    View mView;
    TextView nameTextView;

    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_second, container, false);

        nameTextView = mView.findViewById(R.id.name);

        Bundle bundle = getArguments();
        nameTextView.setText( bundle.getString("fName") +" "+bundle.getString("lName"));


        return mView;
    }
}