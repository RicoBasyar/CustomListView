package com.pam.customlistview;

public class Movie {
    private String title;
    private String year;


    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getYear(){
        return year;
    }


}
