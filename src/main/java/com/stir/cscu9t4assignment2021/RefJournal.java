package com.stir.cscu9t4assignment2021;

import java.util.Calendar;

public class RefJournal extends Ref{
    private String journal;
    private int volume;
    private int issue;

    public RefJournal(String t, String j, String authors, String doi,
                      String p, int py, int v, int i)
    {
        super(t, authors, doi, p, py);
        journal = j;
        volume = v;
        issue = i;
    }//constructor

    public RefJournal(String t, String j, String authors, String doi,
                      String p, int pY, int v, int i, int d, int m, int y)
    {
        super(t, authors, doi, p, pY);
        journal = j;
        volume = v;
        issue = i;
        Calendar inst = Calendar.getInstance();
        inst.set(y,m-1,d);
    }//constructor

    public String getJournal(){
        return journal;
    } //getter method to return the journal title

    public int getVolume(){
        return volume;
    } //getter method to return the journal volume

    public int getIssue(){
        return issue;
    } //getter method to return the journal's issue number

    @Override
    public String getCitation() {
        String result = getAuthors() + "(" + getPubYear()
                + "), " + getTitle()+
                ", in " + getJournal()+ ", "
                + getPublisher() + ", vol: "
                + getVolume()+ ", issue: " + getIssue() +
                ", doi: " + getDoi()
                + " - date added: " + getDateAdded();
        return result;
    }//overridden getCitation method from superclass to include new attributes in the subclass
}
