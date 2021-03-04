package com.stir.cscu9t4assignment2021;

import java.util.Calendar;
import java.util.Date;

public class Ref {
    private String title;
    private String[] authors;
    private int pubYear;
    private String publisherName;
    private String doi;
    private Date dateAdded;

    public Ref(String title, String authors, String doi, String publisherName, int pubYear){
        title = title;
        authors = authors;
        pubYear = pubYear;
        publisherName = publisherName;
        doi = doi;
    }
    public Ref(String title, String authors, String doi, String publisherName,
               int pubYear, int day, int month, int year)
    {
        title = title;
        authors = authors;
        pubYear = pubYear;
        publisherName = publisherName;
        doi = doi;
        //dateAdded = d,m,y;
    }//constructor

//    public String getAuthors(){
//        return authors;
//    }
//    public String getPubYear(){
//        return pubYear;
//    }
//    public String getDateAdded(){
//        return dateAdded;
//    }
//    public String getCitation(){
//
//    }
    public String getCitation(){

    }
}
