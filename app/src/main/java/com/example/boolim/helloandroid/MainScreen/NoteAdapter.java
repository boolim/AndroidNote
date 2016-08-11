package com.example.boolim.helloandroid.MainScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.boolim.helloandroid.R;


import java.util.ArrayList;

/**
 * Created by boolim on 11/08/16.
 */
public class NoteAdapter extends ArrayAdapter<Note> {

    public NoteAdapter(Context context, ArrayList<Note> notes) {
        super(context, 0, notes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Note note = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
        }

        TextView noteTitle = (TextView) convertView.findViewById(R.id.noteTitle);
        TextView noteBody = (TextView) convertView.findViewById(R.id.noteBody);
        TextView noteBig = (TextView) convertView.findViewById(R.id.noteBig);

        noteTitle.setText(note.getTitle());
        noteBody.setText(note.getMessage());
        noteBig.setText(note.getBigTitle());

        return convertView;
    }
}
