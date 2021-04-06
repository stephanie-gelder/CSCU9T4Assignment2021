package com.stir.cscu9t4assignment2021;

import java.util.Calendar;

public class RefConference extends Ref{
    private String venue;
    private String location;

    public RefConference(String title, String venue, String authors, String doi,
                         String publisher, String location, int pubYear)
    {
        super(title, authors, doi, publisher, pubYear);
        venue = venue;
        location = location;
    }//constructor

    public RefConference(String title, String venue, String authors, String doi,
                         String publisher, String location, int pubYear, int day, int month, int year)
    {
        super(title, authors, doi, publisher, pubYear);
        venue = venue;
        location = location;
        Calendar inst = Calendar.getInstance();
        inst.set(year,month-1,day);
    }//constructor


    public String getVenue(){
        return venue;
    }

    public String getLocation(){
        return location;
    }

    @Override
    public String getCitation() {
        String result = getTitle()+ "by " + getAuthors()+ " published in "
                + getPubYear()+ " by " + getPublisher()+ "DOI number of: "
                + getDoi()+ " - reference added on " + getDateAdded()+
                " conference venue " + getVenue() + " at location " + getLocation();
        return result;
    }
}
