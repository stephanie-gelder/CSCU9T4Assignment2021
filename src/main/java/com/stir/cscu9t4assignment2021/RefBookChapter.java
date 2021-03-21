package com.stir.cscu9t4assignment2021;

public class RefBookChapter extends Ref{
    private String bookTitle;
    private String editor;

    public RefBookChapter(String title, String bookTitle, String authors, String doi,
                          String publisher, String editor, int pubYear)
    {
        super(title,  authors, doi, publisher, pubYear);
        bookTitle = bookTitle;
        editor = editor;
    }//constructor

    public RefBookChapter(String title, String book, String authors, String doi,
                          String publisher, String editor, int pubYear, int day, int month, int year)
    {
        super(title, authors, doi, publisher, pubYear);
        book = book;
        editor = editor;
        //day =
        //month =
        //year =
    }//constructor

    public String getBook(){
        return bookTitle;
    }
    public void setBook(String newBook){
        this.bookTitle = newBook;
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
