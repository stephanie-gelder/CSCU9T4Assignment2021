package com.stir.cscu9t4assignment2021;

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
        //day =
        //month =
        //year =
    }//constructor


    public String getVenue(){
        return venue;
    }
    public void setVenue(String newVenue){
        this.venue = newVenue;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String newLocation){
        this.location = newLocation;
    }
//    @Override
//    public String getCitation() {
//        return super.getCitation();
//    }
}
