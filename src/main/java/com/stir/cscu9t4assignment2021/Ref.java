package com.stir.cscu9t4assignment2021;

import java.util.Calendar;
import java.util.Date;

public class Ref {
    private String title;
    private String[] authors;
    private String doi;
    private String publisher;
    private int pubYear;
    private Calendar dateAdded;

    public Ref(String t, String authors, String d, String p, int pY){
        title = t;
        authors = authors;
        pubYear = pY;
        publisher = p;
        doi = d;
    }//constructor

    public Ref(String t, String authors, String doi, String p,
               int pY, int d, int m, int y)
    {
        title = t;
        authors = authors;
        pubYear = pY;
        publisher = p;
        doi = doi;
        Calendar inst = Calendar.getInstance();
        inst.set(y,m-1,d);
        dateAdded = inst;
    }//constructor

    public String getTitle(){
        return title;
    } //getter method to return the title of the reference

    public String getAuthors(){
        String result = String.join(", ", authors);//joins array elements into a single string
        return result;
    } //getter method to return the authors of a reference

    public String getPubYear(){
        String pubYearStr = Integer.toString(pubYear);//converts the pubYear as an integer to a string
        return pubYearStr;
    } //getter method to return the publishing year of a reference

    public String getPublisher(){
        return publisher;
    } //getter method to return the publisher of a reference

    public String getDoi(){
        return doi;
    } //getter method to return a references DOI number

    public String getDateAdded(){
        return dateAdded.toString();//returns the date as a string
    } //getter method to return the date a reference was added to the bibliography

    public String getCitation(){
        String result = getTitle()+ "by " + getAuthors()+ " published in "
                + getPubYear()+ " by " + getPublisher()+ "DOI number of: "
                + getDoi()+ " - reference added on " + getDateAdded();
        return result;
    }//getCitation method generic for all non-specified reference entries

}
