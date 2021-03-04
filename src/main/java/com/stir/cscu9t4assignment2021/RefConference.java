package com.stir.cscu9t4assignment2021;

public class RefConference extends Ref{
    private String venue;
    private String location;

    public RefConference(String title, String venue, String authors, String doi,
                         String publisherName, String location, int pubYear)
    {
        super(title, authors, doi, publisherName, pubYear);
        venue = venue;
        location = location;
    }//constructor

    public RefConference(String title, String venue, String authors, String doi,
                         String publisherName, String location, int pubYear, int day, int month, int year)
    {
        super(title, authors, doi, publisherName, pubYear);
        venue = venue;
        location = location;
        //day =
        //month =
        //year =
    }//constructor

    @Override
    public String getCitation() {
        return super.getCitation();
    }
}
