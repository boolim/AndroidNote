package com.example.boolim.helloandroid.MainScreen;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.boolim.helloandroid.MainActivity;
import com.example.boolim.helloandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoteViewFragment extends Fragment {


    public NoteViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentLayout = inflater.inflate(R.layout.fragment_note_view, container, false);

        TextView title = (TextView) fragmentLayout.findViewById(R.id.viewNoteTitle);
        TextView icon = (TextView) fragmentLayout.findViewById(R.id.viewNoteIcon);
        TextView body = (TextView) fragmentLayout.findViewById(R.id.viewNoteBody);

        Intent intent = getActivity().getIntent();

        title.setText(intent.getExtras().getString(MainActivity.NOTE_TITLE_EXTRA));
        icon.setText(intent.getExtras().getString(MainActivity.NOTE_CATEGORY_EXTRA));
        body.setText(intent.getExtras().getString(MainActivity.NOTE_MESSAGE_EXTRA));

        // Inflate the layout for this fragment
        return fragmentLayout;
    }

}
