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

//    public Ref(String t, String authors, String doi, String p,
//               int pY, int d, int m, int y)
//    {
//        title = t;
//        authors = authors;
//        pubYear = pY;
//        publisher = p;
//        DOI = doi;
//        Calendar inst = Calendar.getInstance();
//        inst.set(y,m-1,d);
//        dateAdded = inst;
//    }//constructor

    public String getTitle(){
        return title;
    }

    public String getAuthors(){
        String result = String.join(", ", authors);
        return result;
    }

    public String getPubYear(){
        String pubYearStr = Integer.toString(pubYear);
        return pubYearStr;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getDoi(){
        return doi;
    }

    public String getDateAdded(){
        return dateAdded.toString();
    }

    public String getCitation(){
        String result = getTitle()+ "by " + getAuthors()+ " published in "
                + getPubYear()+ " by " + getPublisher()+ "DOI number of: "
                + getDoi()+ " - reference added on " + getDateAdded();
        return result;
    }

}
