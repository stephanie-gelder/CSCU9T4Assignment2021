package com.stir.cscu9t4assignment2021;

import java.util.Calendar;

public class RefBookChapter extends Ref{
    private String bookTitle;
    private String editor;

    public RefBookChapter(String t, String b, String authors, String doi,
                          String p, String e, int pY)
    {
        super(t,  authors, doi, p, pY);
        bookTitle = b;
        editor = e;
    }//constructor

    public RefBookChapter(String t, String b, String authors, String doi,
                          String p, String e, int pY, int d, int m, int y)
    {
        super(t, authors, doi, p, pY);
        bookTitle = b;
        editor = e;
        Calendar inst = Calendar.getInstance();
        inst.set(y,m-1,d);
    }//constructor

    public String getBook(){
        return bookTitle;
    }

    public String getEditor(){
        return editor;
    }

    @Override
    public String getCitation() {
        String result = getAuthors() + "(" + getPubYear() + "), " + getTitle()+
                ", in " + getBook()+ ", " + getPublisher() + ", ed: " + getEditor()+
                ", doi: " + getDoi()+ " - date added: " + getDateAdded();
        return result;
    }
}
