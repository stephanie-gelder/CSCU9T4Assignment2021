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

    public String getJournal(){
        return journal;
    }
    public void setJournal(String newJournal){
        this.journal = newJournal;
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
