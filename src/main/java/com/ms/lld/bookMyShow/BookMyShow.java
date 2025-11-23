package com.ms.lld.bookMyShow;

public class BookMyShow {

    public void initialize(){
        createMovies();
        createTheaters();
    }

    public void createMovies(){
        Movie avengers=new Movie(1, "Avengers", 120);
        Movie bahubali=new Movie(2, "Bahubali", 180);

        City banglore= new City(1,"Banglore", "Banglore", "Karnatka");
        City hyderabad= new City(1,"Hyderabad", "Hyderabad", "Telangana");

        MovieController movieController=new MovieController();
        movieController.addMovie(avengers, banglore.name);
        movieController.addMovie(avengers, hyderabad.name);
        movieController.addMovie(avengers, banglore.name);

    }

    public void createTheaters(){
        Movie avengers=new Movie(1, "Avengers", 120);
        Movie bahubali=new Movie(2, "Bahubali", 180);

        City banglore= new City(1,"Banglore", "Banglore", "Karnatka");
        City hyderabad= new City(1,"Hyderabad", "Hyderabad", "Telangana");

        MovieController movieController=new MovieController();
        movieController.addMovie(avengers, banglore.name);
        movieController.addMovie(avengers, hyderabad.name);
        movieController.addMovie(avengers, banglore.name);

    }
}
