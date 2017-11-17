package com.example.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kdb on 11/6/2017.
 */

public class ActivityFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ImageView image = (ImageView) view.findViewById(R.id.myImage);
        TextView text = (TextView) view.findViewById(R.id.textview1);
        image.setImageResource(R.drawable.dog);
        text.setText("Have a good trip");
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
