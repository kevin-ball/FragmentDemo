package com.example.fragmentdemo;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;



/**
 * Created by kdb on 11/6/2017.
 */

public class LocationFragment extends ListFragment implements
        AdapterView.OnItemClickListener {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.location, android.R.layout.simple_list_item_1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        Toast.makeText(getActivity(), "You clicked item at position " + position, Toast.LENGTH_SHORT).show();
    }
}

