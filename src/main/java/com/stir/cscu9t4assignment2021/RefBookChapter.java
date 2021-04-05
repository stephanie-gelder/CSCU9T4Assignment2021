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

    public String getEditor(){
        return editor;
    }

    @Override
    public String getCitation() {
        String result = getTitle()+ "by " + getAuthors()+ " published in "
                + getPubYear()+ " by " + getPublisher()+ "DOI number of: "
                + getDoi()+ " - reference added on " + getDateAdded()
                + " book title: " + getBook() + " edited by: " + getEditor();
        return result;
    }
}
