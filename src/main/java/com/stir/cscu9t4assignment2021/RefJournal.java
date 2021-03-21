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
    public void setJournal(String newJournal){
        this.journalTitle = newJournal;
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int newVolume){
        this.volume = newVolume;
    }

    public int getIssue(){
        return issue;
    }
    public void setIssue(int newIssue){
        this.issue = newIssue;
    }
//    @Override
//    public String getCitation() {
//        return super.getCitation();
//    }
}
