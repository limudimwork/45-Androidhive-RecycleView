package com.ahsan.a45_androidhive_recycleview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder>{

    private List<Movie> moviesList;

    //MoviesAdapter when called will use moviesList
    public MoviesAdapter (List<Movie> moviesList){
        this.moviesList = moviesList;
    }

    //Defining nested class MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre;

        //Constructor of our class
        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.year);
            genre = (TextView) view.findViewById(R.id.genre);

        }
    }

    
    //Here we inflate the layout we created for a single item
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}
