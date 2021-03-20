package com.stir.cscu9t4assignment2021;

public class RefBookChapter extends Ref{
    private String book;
    private String editor;

    public RefBookChapter(String title, String book, String authors, String doi,
                          String publisherName, String editor, int pubYear)
    {
        super(title, authors, doi, publisherName, pubYear);
        book = book;
        editor = editor;
    }//constructor

    public RefBookChapter(String title, String book, String authors, String doi,
                          String publisherName, String editor, int pubYear, int day, int month, int year)
    {
        super(title, authors, doi, publisherName, pubYear);
        book = book;
        editor = editor;
        //day =
        //month =
        //year =
    }//constructor

    public String getBook(){
        return book;
    }
    public void setBook(String newBook){
        this.book = newBook;
    }

    public String getEditor(){
        return editor;
    }
    public void setEditor(String newEditor){
        this.editor = newEditor;
    }
    //@Override
//    public String getCitation() {
//        return super.getCitation();
//    }
}
