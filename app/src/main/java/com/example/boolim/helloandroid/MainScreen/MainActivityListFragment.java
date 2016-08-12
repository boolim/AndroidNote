package com.example.boolim.helloandroid.MainScreen;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.boolim.helloandroid.MainActivity;
import com.example.boolim.helloandroid.NoteDetailActivity;
import com.example.boolim.helloandroid.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {

    private ArrayList<Note> notes;
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

        notes = new ArrayList<Note>();
        notes.add(new Note("Win","Yeah Win", Note.Category.FINANCE));
        notes.add(new Note("Linux","Created by Linus", Note.Category.FINANCE));
        notes.add(new Note("OS2","Yeah OS2", Note.Category.PERSONAL));
        notes.add(new Note("Win1","Yeah Win1", Note.Category.QUOTE));
        notes.add(new Note("Win2","Yeah Win2", Note.Category.TECHNICAL));
        notes.add(new Note("Win3","Yeah Win3", Note.Category.FINANCE));
        notes.add(new Note("Win4","Yeah Win4", Note.Category.PERSONAL));

        NoteAdapter adapter = new NoteAdapter(getActivity(), notes);

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        launchNoteDetailActivity(position);
    }

    private void launchNoteDetailActivity(int position){
        Note note = (Note) getListAdapter().getItem(position);

        Intent intent = new Intent(getActivity(), NoteDetailActivity.class);
        intent.putExtra(MainActivity.NOTE_ID_EXTRA, note.getId());
        intent.putExtra(MainActivity.NOTE_TITLE_EXTRA, note.getTitle());
        intent.putExtra(MainActivity.NOTE_MESSAGE_EXTRA, note.getMessage());
        intent.putExtra(MainActivity.NOTE_CATEGORY_EXTRA, note.getBigTitle());

        startActivity(intent);
    }
}
