package com.addyaddy.matrixacademystudent.main.me;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.addyaddy.matrixacademystudent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HallOfFameFragment extends Fragment {


    public HallOfFameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hall_of_fame, container, false);
    }

}
