package com.example.fragmentdemo;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Bottom Fragment contains a ListView of locations and a TextView to display choice
 */
public class BottomFragment extends ListFragment implements
        AdapterView.OnItemClickListener {

    TextView text;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.locations, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        text = (TextView) view.findViewById(R.id.tvPicked);
        text.setText("");
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        //Toast.makeText(getActivity(), "You clicked item at position " + position, Toast.LENGTH_SHORT).show();
        final String item = (String) parent.getItemAtPosition(position);
        Toast.makeText(getActivity(), "You clicked " + item, Toast.LENGTH_SHORT).show();
        if (item == getString(R.string.BadChoiceLocation)) {
            text.setText("You picked " + item + ". Bad choice!");
        } else {
            text.setText("You picked " + item + ". Good choice!");
        }
    }
}

