package com.stir.cscu9t4assignment2021;

public class RefJournal extends Ref{
    private String journalTitle;
    private int volume;
    private int issue;

    public RefJournal(String title, String journalTitle, String authors, String doi,
                      String publisher, int pubYear, int volume, int issue)
    {
        super(title, authors, doi, publisher, pubYear);
        journalTitle = journalTitle;
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
        //day =
        //month =
        //year =
    }//constructor

    public String getJournal(){
        return journalTitle;
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
