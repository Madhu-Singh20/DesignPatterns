package com.ms.lld.bookMyShow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MovieController {

    Map<String,Movie> cityMovieMap=new HashMap<>();
    Set<Movie> allMovies;

    public void addMovie(Movie movie, String city){
        cityMovieMap.put(city,movie);
        allMovies.add(movie);
    }
}
