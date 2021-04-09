package com.stir.cscu9t4assignment2021;

import java.util.Calendar;

public class RefConference extends Ref{
    private String venue;
    private String location;

    public RefConference(String t, String v, String authors, String doi,
                         String p, String l, int pY)
    {
        super(t, authors, doi, p, pY);
        venue = v;
        location = l;
    }//constructor

    public RefConference(String t, String v, String authors, String doi,
                         String p, String l, int pY, int d, int m, int y)
    {
        super(t, authors, doi, p, pY);
        venue = v;
        location = l;
        Calendar inst = Calendar.getInstance();
        inst.set(y,m-1,d);
    }//constructor


    public String getVenue(){
        return venue;
    }

    public String getLocation(){
        return location;
    }

    @Override
    public String getCitation() {
        String result = getAuthors() + "(" + getPubYear() + "), " + getTitle()+
                ", from " + getVenue()+ ", " + getPublisher() + ", loc: " + getLocation()+
                ", doi: " + getDoi()+ " - date added: " + getDateAdded();
        return result;
    }//overridden getCitation method from superclass to include new attributes in the subclass
}
