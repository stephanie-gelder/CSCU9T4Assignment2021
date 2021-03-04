package com.stir.cscu9t4assignment2021;

public class RefJournal extends Ref{
    private String journal;
    private int volume;
    private int issue;

    public RefJournal(String title, String journal, String authors, String doi,
                      String publisherName, int pubYear, int volume, int issue)
    {
        super(title, authors, doi, publisherName, pubYear);
        journal = journal;
        volume = volume;
        issue = issue;
    }//constructor

    public RefJournal(String title, String journal, String authors, String doi,
                      String publisherName, int pubYear, int volume, int issue, int day, int month, int year)
    {
        super(title, authors, doi, publisherName, pubYear);
        journal = journal;
        volume = volume;
        issue = issue;
        //day =
        //month =
        //year =
    }//constructor

    @Override
    public String getCitation() {
        return super.getCitation();
    }
}
