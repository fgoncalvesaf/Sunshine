package com.example.goncalves.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayList<String> fakeData;

    //Adapts the array to be shown on screen
    ArrayAdapter<String> adapter;

    public MainActivityFragment() {
        fakeData = new ArrayList<String>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //rootView from hierarchy of xml files.
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        fakeData.add("Today - Sunny - 88/66");
        fakeData.add("Tomorrow - Cloud - 88/66");
        fakeData.add("Mon - Windy - 88/66");
        fakeData.add("Tue - Sunny - 88/66");
        fakeData.add("Wed - Sunny - 88/66");

        //params:
        //activity used
        //id of the layout
        //id of the component
        //array
        adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                fakeData);

        //access to the component in xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        //set the adapter for communication
        listView.setAdapter(adapter);

        //old return
        //return inflater.inflate(R.layout.fragment_main, container, false);

        //new return
        return rootView;

    }
}
