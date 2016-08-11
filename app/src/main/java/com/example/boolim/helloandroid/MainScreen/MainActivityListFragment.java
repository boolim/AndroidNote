package com.example.boolim.helloandroid.MainScreen;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.boolim.helloandroid.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {


    public MainActivityListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(
                             Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /*String[] list = new String[]{"Linux","Windows","OS/2","OSX","iOS"
                ,"Ubuntu","Windows","FirefoxOS","Android"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1
        , list);

        setListAdapter(adapter);*/

        ArrayList<Note> notes = new ArrayList<Note>();
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
        notes.add(new Note("Linux","Created by Linus", Note.Category.FINANCE));
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
    }
}
