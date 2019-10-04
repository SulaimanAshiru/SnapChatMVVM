package com.example.snapchatmvvm.model.view.MainActivity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snapchatmvvm.R;
import com.example.snapchatmvvm.model.view.adapter.SnapChatAdapter;
import com.example.snapchatmvvm.model.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mainActivityViewModel;
    private RecyclerView rv_snap_stories;
    private SnapChatAdapter snapChatAdapter;

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_snap_stories = findViewById(R.id.rv_snap_stories);

        rv_snap_stories.setLayoutManager(new LinearLayoutManager(this));
        rv_snap_stories.setHasFixedSize(true);
        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        snapChatAdapter = new SnapChatAdapter(mainActivityViewModel.getData());
        rv_snap_stories.setAdapter(snapChatAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rv_snap_stories.setLayoutManager(layoutManager);


    }
}
