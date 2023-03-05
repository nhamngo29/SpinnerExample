package com.example.a2001207130_nguyennhamngo_lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL));
        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new
                LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
// mLayoutManager=new GridLayoutManager(this, 2);
// recyclerView.setLayoutManager(gLayoutManager);
//mLayoutManager = new

//recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }
    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action &Adventure", "2015");
        movie = new Movie("Inside Out", "Animation, Kids & Family","2015");
        movieList.add(movie);
        movie = new Movie("Star Wars: Episode VII - The Force Awakens","Action", "2015");
        movieList.add(movie);
        movie = new Movie("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);
        movie = new Movie("The Martian", "Science Fiction & Fantasy","2015");
        movieList.add(movie);
        movie = new Movie("Mission: Impossible Rogue Nation", "Action",
                "2015");
        movieList.add(movie);
        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
        mAdapter.notifyDataSetChanged();
    }
}