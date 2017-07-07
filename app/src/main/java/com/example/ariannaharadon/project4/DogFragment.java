package com.example.ariannaharadon.project4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Locale;

/**
 * Created by ariannaharadon on 2/24/17.
 */

public class DogFragment extends Fragment {
    public static final String ARG_DOG_NUMBER = "dog_number";

    public DogFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dog, container, false);
        int i = getArguments().getInt(ARG_DOG_NUMBER);
        String dog = getResources().getStringArray(R.array.dogs_array)[i];

        int imageId = getResources().getIdentifier(dog.toLowerCase(Locale.getDefault()),
                "drawable", getActivity().getPackageName());
        ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
        getActivity().setTitle(dog);
        return rootView;
    }
}