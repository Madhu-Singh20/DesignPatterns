package com.ms.designPatterns.structural.composite.fileSystem;

public class Main {

    public static void main(String[] args){
        Directory movies=new Directory("Movies");
        File border=new File("Border");
        Directory comedy=new Directory("Comedy Movies");
        File hulchul=new File("Hulchul");
        File khattaMeetha=new File("Khatta Meetha");

        movies.add(border);
        movies.add(comedy);
        comedy.add(hulchul);
        comedy.add(khattaMeetha);

        movies.ls();

    }

}
