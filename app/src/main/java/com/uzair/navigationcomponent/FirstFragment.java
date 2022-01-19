package com.uzair.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class FirstFragment extends Fragment {

    View mView;
    EditText fName, lName;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_first, container, false);

        fName = mView.findViewById(R.id.firstName);
        lName = mView.findViewById(R.id.lastName);

        mView.findViewById(R.id.btnLogin)
                .setOnClickListener(v -> {

                    String firstName = fName.getText().toString().trim();
                    String lastName = lName.getText().toString().trim();
                    Bundle bundle = new Bundle();
                    bundle.putString("fName", firstName);
                    bundle.putString("lName", lastName);

                    Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_secondFragment, bundle);

                });

        return mView;
    }
}