package com.htp.kuzmenok.task6;

public class FilmMaker {
    public static void main(String[] args) {
        Film.FilmInfo[] kinopoisk = new Film.FilmInfo[5];
        kinopoisk[0] = new Film().new FilmInfo("Good Year", 2006, 117, "Comedy", "Ridley Scott");
        kinopoisk[1] = new Film().new FilmInfo("The Bourne Identyty", 2002, 119, "Action", "Doug Liman");
        kinopoisk[2] = new Film().new FilmInfo("Snowden", 2016, 134, "Drama", "Oliver Stone");
        kinopoisk[3] = new Film().new FilmInfo("Inception", 2010, 148, "Action", "Christopher Nolan");
        kinopoisk[4] = new Film().new FilmInfo("Gladiator", 2000, 155, "Action", "Ridley Scott");

        for(int i = 0; i < kinopoisk.length; i++) {
            kinopoisk[i].showFilmInfo(kinopoisk[i]);
        }
    }

}
