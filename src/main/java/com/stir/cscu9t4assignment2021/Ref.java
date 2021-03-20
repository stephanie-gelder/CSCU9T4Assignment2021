package com.stir.cscu9t4assignment2021;

import java.util.Calendar;
import java.util.Date;

public class Ref {
    private String title;
    private String[] authors;
    private String doi;
    private String publisher;
    private int pubYear;
    private Date dateAdded;

    public Ref(String title, String authors, String doi, String publisher, int pubYear){
        title = title;
        authors = authors;
        pubYear = pubYear;
        publisher = publisher;
        doi = doi;
    }
    public Ref(String title, String authors, String doi, String publisher,
               int pubYear, int day, int month, int year)
    {
        title = title;
        authors = authors;
        pubYear = pubYear;
        publisher = publisher;
        doi = doi;
        //dateAdded = day,month,year;
    }//constructor

//    public String getAuthors(){
//        return authors;
//    }
    public void setAuthors(String[] newAuthor){
        this.authors = newAuthor;
    }
//    public String getPubYear(){
//        return pubYear;
//    }
    public void setPubYear(int newPubYear){
        this.pubYear = newPubYear;
    }
//    public String getDateAdded(){
//        return dateAdded;
//    }
    public void setDateAdded(Date newDate){
        this.dateAdded = newDate;
    }
//    public String getCitation(){
//        return citation;
//    }
//    public void setCitation(String newCitation){
//        this.citation = newCitation;
//    }
}
