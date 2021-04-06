package com.stir.cscu9t4assignment2021;

import java.util.Calendar;

public class RefJournal extends Ref{
    private String journal;
    private int volume;
    private int issue;

    public RefJournal(String title, String journal, String authors, String doi,
                      String publisher, int pubYear, int volume, int issue)
    {
        super(title, authors, doi, publisher, pubYear);
        journal = journal;
        volume = volume;
        issue = issue;
    }//constructor

    public RefJournal(String title, String journal, String authors, String doi,
                      String publisher, int pubYear, int volume, int issue, int day, int month, int year)
    {
        super(title, authors, doi, publisher, pubYear);
        journal = journal;
        volume = volume;
        issue = issue;
        Calendar inst = Calendar.getInstance();
        inst.set(year,month-1,day);
    }//constructor

    public String getJournal(){
        return journal;
    }

    public int getVolume(){
        return volume;
    }

    public int getIssue(){
        return issue;
    }

    @Override
    public String getCitation() {
        String result = getTitle()+ "by " + getAuthors()+ " published in "
            + getPubYear()+ " by " + getPublisher()+ "DOI number of: "
            + getDoi()+ " - reference added on " + getDateAdded()
            + " journal: " + getJournal() + " volume " + getVolume()
            + "issue " + getIssue();
        return result;
    }
}
