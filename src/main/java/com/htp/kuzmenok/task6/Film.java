package com.htp.kuzmenok.task6;

public class Film {
    private String title;
    private int year;

    public Film() { }

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

    class FilmInfo {
        private int runTime;
        private String genre;
        private String director;

        private FilmInfo() {}

        public FilmInfo(String title, int year, int runTime, String genre, String director) {
            Film.this.title = title;
            Film.this.year = year;
            this.runTime = runTime;
            this.genre = genre;
            this.director = director;
        }

        public void showFilmInfo(FilmInfo f) {
            System.out.println("\nTitle: " + title + "\nYear: " + year + "\nrun time: " + runTime + " min" +
                    "\nGenre: " + genre + "\nDirector: " + director);
        }

    }

}
