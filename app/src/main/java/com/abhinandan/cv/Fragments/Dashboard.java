package com.abhinandan.cv.Fragments;


import android.content.res.Resources;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.abhinandan.cv.R;

public class Dashboard extends Fragment {

    private GridLayout gridLayout;
    private Integer width,length,constant,h;
    private CardView i2,i3,i1,i4,i5,i6,i7,i8,i9;
    View view;

    public Dashboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        gridLayout = view.findViewById(R.id.GridLayout);
        i1 = view.findViewById(R.id.i1);
        i2 = view.findViewById(R.id.i2);
        i3 = view.findViewById(R.id.i3);
        i4 = view.findViewById(R.id.i4);
        i5 = view.findViewById(R.id.i5);
        i6 = view.findViewById(R.id.i6);
        i7 = view.findViewById(R.id.i7);
        i8 = view.findViewById(R.id.i8);
        i9 = view.findViewById(R.id.i9);

        width = Resources.getSystem().getDisplayMetrics().widthPixels;
        length = Resources.getSystem().getDisplayMetrics().heightPixels;

        Toast.makeText(getContext(), "Width = "+ width + " Height = "+length, Toast.LENGTH_SHORT).show();


        constant = (width-280)/3;
        Toast.makeText(getContext(), ""+constant, Toast.LENGTH_SHORT).show();

        i1.requestLayout();
        i1.getLayoutParams().width = constant;
        i1.getLayoutParams().height = constant;

        i2.requestLayout();
        i2.getLayoutParams().width = constant;
        i2.getLayoutParams().height = constant;

        i3.requestLayout();
        i3.getLayoutParams().width = constant;
        i3.getLayoutParams().height = constant;

        i4.requestLayout();
        i4.getLayoutParams().width = constant;
        i4.getLayoutParams().height = constant;

        i5.requestLayout();
        i5.getLayoutParams().width = constant;
        i5.getLayoutParams().height = constant;

        i6.requestLayout();
        i6.getLayoutParams().width = constant;
        i6.getLayoutParams().height = constant;

        i7.requestLayout();
        i7.getLayoutParams().width = constant;
        i7.getLayoutParams().height = constant;

        i8.requestLayout();
        i8.getLayoutParams().width = constant;
        i8.getLayoutParams().height = constant;

        i9.requestLayout();
        i9.getLayoutParams().width = constant;
        i9.getLayoutParams().height = constant;

        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(3);
        return view;
    }



}
