package com.example.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/*
 * Top Fragment contains a TextView and and an ImageView of San Francisco
 */
public class TopFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        ImageView image = (ImageView) view.findViewById(R.id.myImage);
        TextView text = (TextView) view.findViewById(R.id.textview1);
        image.setImageResource(R.drawable.sanfrancisco);
        text.setText("Where would you like to go?");
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
