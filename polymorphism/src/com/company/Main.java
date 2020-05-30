package com.company;



 class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

     public String getName() {
         return name;
     }

     public String plot(){
        return "no plot";
    }
}


 class FirstFilm extends Movie {
    public FirstFilm() {
        super("film1");
    }

     @Override
     public String plot() {
         return " it is film nr 1";
     }
 }

 class SecondFilm extends Movie{
     public SecondFilm() {
         super("film2");
     }
     @Override
     public String plot() {
         return " it is film nr 2";
     }
 }


 class ThirdFilm extends Movie {
     public ThirdFilm() {
         super("film3");
     }

     @Override
     public String plot() {
         return " it is film nr 3";
     }
 }

class DontRemember extends Movie {
    public DontRemember() {
        super("unable to remember");
    }

}

public class Main {

    public static void main(String[] args) {

        //movie();
        int i=0;
        while (i < 90) {
            Movie movie = movie();
            System.out.println(movie.getName());
            System.out.println(movie.plot());
            i++;
        }
    }


    public static Movie movie(){
        int random= (int)(Math.random() * 4) + 1;
        System.out.println("Random number is: " + random );
        switch (random){
            case 1:
                return new FirstFilm();
            case 2:
                return new SecondFilm();
            case 3:
                return new ThirdFilm();
            case 4:
                return new DontRemember();
//            default:
//                return null;
        }
        return null;
    }
}

