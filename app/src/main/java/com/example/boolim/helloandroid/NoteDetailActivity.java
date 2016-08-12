package com.example.boolim.helloandroid;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.boolim.helloandroid.MainScreen.NoteViewFragment;

public class NoteDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);

        createAndAddFragment();
    }

    private void createAndAddFragment() {
        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        setTitle(R.string.noteDetail);
        NoteViewFragment nvf = new NoteViewFragment();
        ft.add(R.id.note_container, nvf, "NOTE_VIEW_FRAGMENT");

        ft.commit();
    }
}
