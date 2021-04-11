/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4assignment2021;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 *
 * @author Stephanie
 *
 * Creating all elements to be displayed in the GUI window
 */
public class RefSystemGUI extends JFrame implements ActionListener {

    private JLabel labRefInfo = new JLabel("REFERENCE INFORMATION");
    private JLabel labRefType = new JLabel("Type of Reference:");
    //creating radio buttons to distinguish between the types of references entered
    private JRadioButton rbBook = new JRadioButton("Book");
    private JRadioButton rbJournal = new JRadioButton("Journal");
    private JRadioButton rbConference = new JRadioButton("Conference");
    private ButtonGroup bg = new ButtonGroup();
    //creating the generic labels for references
    private JLabel labTitle = new JLabel("Title:");
    private JLabel labAuthors = new JLabel("Authors:");
    private JLabel labPubYear = new JLabel("Year Published:");
    private JLabel labPublisher = new JLabel("Publisher:");
    private JLabel labDOI = new JLabel("DOI:");
    private JLabel labDateAdded = new JLabel("Date Added:");
    //creating the additional labels for BOOK references
    private JLabel labBookT = new JLabel("Book Title:");
    private JLabel labEditor = new JLabel("Editor:");
    //creating the additional labels for JOURNAL references
    private JLabel labJournalT = new JLabel("Journal Title:");
    private JLabel labIssue = new JLabel("Issue Number:");
    private JLabel labVol = new JLabel("Volume Number:");
    //creating the additional labels for CONFERENCE references
    private JLabel labVenue = new JLabel("Venue:");
    private JLabel labLocation = new JLabel("Location:");

    //creating text fields for the generic labels
    private JTextField title = new JTextField(20);
    private JTextField authors = new JTextField(30);
    private JTextField pubYear = new JTextField(10);
    private JTextField publisher = new JTextField(20);
    private JTextField doi = new JTextField(10);
    private JTextField dateAdded = new JTextField(10);

    //creating the text fields for the BOOK specific labels
    private JTextField bookTitle = new JTextField(20);
    private JTextField editor = new JTextField(20);
    //creating the text fields for JOURNAL specific labels
    private JTextField journalTitle = new JTextField(20);
    private JTextField issue = new JTextField(4);
    private JTextField volume = new JTextField(4);
    //creating the text fields for CONFERENCE specific references
    private JTextField venue = new JTextField(20);
    private JTextField location = new JTextField(20);

    //creating the add reference button
    private JButton addRef = new JButton("Add Reference");

    //creating the elements for the user to import references from a csv file
    private JLabel labImpRef = new JLabel("Enter name of csv file to import:");
    private JTextField impRefField = new JTextField(30);
    private JButton importRef = new JButton("Import References");

    //creating the buttons, text fields and labels for search fields
    //creating elements to search JOURNAL citations
    private JLabel labJSearch = new JLabel("Journal Title to search for:");
    private JTextField jSearchField = new JTextField(20);
    private JButton jSearch = new JButton("Search Journals");
    //creating the button to search PUBLISHER citations
    private JLabel labPSearch = new JLabel("Publisher to search for:");
    private JTextField pSearchField = new JTextField(20);
    private JButton pSearch = new JButton("Search for Publisher");
    //creating button to search CONFERENCE VENUE citations
    private JLabel labCVenSearch = new JLabel("Conference Venue to search for:");
    private JTextField cVenSearchField = new JTextField(20);
    private JButton cVenSearch = new JButton("Search for Conference Venue");

    //creating the buttons to enable the user to export each set of search results or all citations to a .txt file
    private JButton expJournal = new JButton("Export Journal Search Results");
    private JButton expPublisher = new JButton("Export Publisher Search Results");
    private JButton expVenue = new JButton("Export Venue Search Results");
    private JButton expAll = new JButton("Export All Citations");

    private RefCollection bibliography = new RefCollection();

    private JTextArea outputArea = new JTextArea(20, 50);

    public static void main(String[] args) {
        RefSystemGUI applic = new RefSystemGUI();
    } //main

    /**
     * Method to add all elements to the GUI
     */
    public RefSystemGUI() {
        super("Bibliography");
        setLayout(new FlowLayout());
        //setLayout(new GridBagLayout());

        add(labRefInfo);
        add(labRefType);
        //adding the radio buttons to the button group
        bg.add(rbBook);
        bg.add(rbJournal);
        bg.add(rbConference);
        //adding the radio buttons and their action listeners
        add(rbBook);
        rbBook.addActionListener(this);
        add(rbJournal);
        rbJournal.addActionListener(this);
        add(rbConference);
        rbConference.addActionListener(this);

        //adding labels and text fields to GUI
        add(labTitle);
        add(title);
        title.setEditable(true);
        add(labAuthors);
        add(authors);
        authors.setEditable(true);
        add(labPubYear);
        add(pubYear);
        pubYear.setEditable(true);
        add(labPublisher);
        add(publisher);
        publisher.setEditable(true);
        add(labDOI);
        add(doi);
        doi.setEditable(true);
        add(labDateAdded);
        add(dateAdded);
        dateAdded.setEditable(true);

        add(labBookT);
        add(bookTitle);
        bookTitle.setEditable(true);
        add(labEditor);
        add(editor);
        editor.setEditable(true);

        add(labJournalT);
        add(journalTitle);
        journalTitle.setEditable(true);
        add(labVol);
        add(volume);
        volume.setEditable(true);
        add(labIssue);
        add(issue);
        issue.setEditable(true);

        add(labVenue);
        add(venue);
        venue.setEditable(true);
        add(labLocation);
        add(location);
        location.setEditable(true);

        //adding the add reference button to GUI
        add(addRef);
        addRef.addActionListener(this);

        //adding the journal search label, text field and button to GUI
        add(labJSearch);
        add(jSearchField);
        jSearchField.setEditable(true);
        add(jSearch);
        jSearch.addActionListener(this);

        //adding the publisher search label, text field and button to GUI
        add(labPSearch);
        add(pSearchField);
        pSearchField.setEditable(true);
        add(pSearch);
        pSearch.addActionListener(this);

        //adding the venue search label, text field and button to GUI
        add(labCVenSearch);
        add(cVenSearchField);
        cVenSearchField.setEditable(true);
        add(cVenSearch);
        cVenSearch.addActionListener(this);

        //adding the import references elements to GUI
            ////NOT SHOWING UP IN GUI WINDOW
        add(labImpRef);
        add(impRefField);
        impRefField.setEditable(true);
        add(importRef);
        importRef.addActionListener(this);

        //Adding the export buttons to the GUI
            ////NOT SHOWING UP IN GUI WINDOW
        add(expJournal);
        expJournal.addActionListener(this);
        add(expPublisher);
        expPublisher.addActionListener(this);
        add(expVenue);
        expVenue.addActionListener(this);
        add(expAll);
        expAll.addActionListener(this);

        add(outputArea);
        outputArea.setEditable(false);
        setSize(850, 700);
        setVisible(true);
        blankDisplay();

    } //constructor

    /**
     * actionPerformed method 'attaches' actions to each 'action event' triggered by the user in the GUI
     * @param event
     */
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if(event.getSource()==addRef){
            if (rbBook.isSelected()){
                message = addCite("book");
            }
            if (rbJournal.isSelected()){
                message = addCite("journal");
            }
            if (rbConference.isSelected()) {
                message = addCite("conference");
            }
        }

        if (event.getSource() == rbBook){
            if(rbBook.isSelected()){
                labIssue.setEnabled(false);
                issue.setEnabled(false);
                labVol.setEnabled(false);
                volume.setEnabled(false);
                labJournalT.setEnabled(false);
                journalTitle.setEnabled(false);
                labVenue.setEnabled(false);
                venue.setEnabled(false);
                labLocation.setEnabled(false);
                location.setEnabled(false);
                labBookT.setEnabled(true);
                bookTitle.setEnabled(true);
                labEditor.setEnabled(true);
                editor.setEnabled(true);
                labDateAdded.setEnabled(false);
                dateAdded.setEnabled(false);
            }
        }
        if (event.getSource() == rbJournal){
            if(rbJournal.isSelected()){
                labVenue.setEnabled(false);
                venue.setEnabled(false);
                labLocation.setEnabled(false);
                location.setEnabled(false);
                labBookT.setEnabled(false);
                bookTitle.setEnabled(false);
                labEditor.setEnabled(false);
                editor.setEnabled(false);
                labIssue.setEnabled(true);
                issue.setEnabled(true);
                labVol.setEnabled(true);
                volume.setEnabled(true);
                labJournalT.setEnabled(true);
                journalTitle.setEnabled(true);
                labDateAdded.setEnabled(false);
                dateAdded.setEnabled(false);
            }
        }
        if(event.getSource() == rbConference){
            if (rbConference.isSelected()){
                labBookT.setEnabled(false);
                bookTitle.setEnabled(false);
                labEditor.setEnabled(false);
                editor.setEnabled(false);
                labIssue.setEnabled(false);
                issue.setEnabled(false);
                labVol.setEnabled(false);
                volume.setEnabled(false);
                labJournalT.setEnabled(false);
                journalTitle.setEnabled(false);
                labVenue.setEnabled(true);
                venue.setEnabled(true);
                labLocation.setEnabled(true);
                location.setEnabled(true);
                labDateAdded.setEnabled(false);
                dateAdded.setEnabled(false);
            }
        }

        if(event.getSource()==jSearch){
            message = searchCitations("journal");
        }
        if(event.getSource()==pSearch){
            message = searchCitations("publisher");
        }
        if(event.getSource()==cVenSearch){
            message = searchCitations("confVen");
        }

        if(event.getSource()==importRef){
            message = importReferences("fileName");
        }

        if(event.getSource()==expJournal){
            message = exportCitations("journal");
        }
        if(event.getSource()==expPublisher){
            message = exportCitations("publisher");
        }
        if(event.getSource()==expVenue){
            message = exportCitations("confVen");
        }
        if(event.getSource()==expAll){
            message = exportCitations("all");
        }
        outputArea.setText(message);
        blankDisplay();
    }//actionPerformed

    /**
     * Method to add a citation to the bibliography according to the type of reference chosen by the user
     * @param what
     * @return
     */
    public String addCite(String what){
        String message = "Citation added\n";
        System.out.println("Adding "+what+" citation to the system");
        String t = title.getText();
        String a = authors.getText();
        String d = doi.getText();
        String p = publisher.getText();
        int py = Integer.parseInt(pubYear.getText());
        Ref r;

        if(what.equals("book")) {
            String b = bookTitle.getText();
            String e = editor.getText();
            r = new RefBookChapter(t, b, a, d, p, e, py);
            bibliography.addCite(r);
        }
        else if(what.equals("journal")){
            String jt = journalTitle.getText();
            int i = Integer.parseInt(issue.getText());
            int v = Integer.parseInt(volume.getText());
            r = new RefJournal(t, jt, a, d, p, py, v, i);
            bibliography.addCite(r);
        }
        else if(what.equals("conference")){
            String v = venue.getText();
            String l = location.getText();
            r = new RefConference(t, v, a, d, p, l, py);
            bibliography.addCite(r);
        }
        else {
            r = new Ref(t, a, d, p, py);
            bibliography.addCite(r);
        }
        //bibliography.addCite(r);
        return message;
    }

    /**
     * Method to search the citations based on the input from the user
     * @param what
     * @return
     */
    public String searchCitations(String what){
        String message = "Searching Citations\n";
        System.out.println("Searching for citations from " + what);

        if(what.equals("journal")){
            String j = journalTitle.getText();
            outputArea.setText("Searching for citations from the specified journal...");
            bibliography.lookUpByJournal(j);
        }
        else if(what.equals("publisher")){
            String p = publisher.getText();
            outputArea.setText("Searching for citations from the specified publisher...");
            bibliography.lookUpByPublisher(p);
        }
        else if(what.equals("confVen")){
            String v = venue.getText();
            outputArea.setText("Searching for citations from the specified conference venue...");
            bibliography.lookUpByVenue(v);
        }
        else{
            message = "No citations found matching the search criteria";
        }
        return message;
    }

    /**
     * Method to import references from a csv file
     */
    public String importReferences(String fileName){
        String message = "Importing References\n";
        System.out.println("Importing references from " + fileName);
        String fN = impRefField.getText();
        outputArea.setText("Importing references from csv file");
        bibliography.importMany(fN);
        return message;
    }

    /**
     * Method to export the citations depending on which button the user presses
     * @param what
     * @return
     */
    public String exportCitations(String what){
        String message = "Exporting Citations to a .txt file\n";
        System.out.println("Exporting citations from " + what + "search");

        if(what.equals("journal")){
            outputArea.setText("Exporting citations from the Journal search");
            bibliography.exportJSearch();
        }
        else if(what.equals("publisher")){
            outputArea.setText("Exporting citations from the publisher search");
            bibliography.exportPSearch();
        }
        else if(what.equals("confVen")){
            outputArea.setText("Exporting citations from the conference venue search");
            bibliography.exportCVenSearch();
        }
        else if(what.equals("all")){
            outputArea.setText("Exporting all citations");
            bibliography.exportAll();
        }
        else{
            message = "No citations found to be exported";
        }
        return message;
    }
    /**
     * Method to 'reset' the GUI display to be blank once a reference has been added to the bibliography
     */
    public void blankDisplay(){
        title.setText("");
        bookTitle.setText("");
        editor.setText("");
        issue.setText("");
        venue.setText("");
        volume.setText("");
        journalTitle.setText("");
        location.setText("");
        authors.setText("");
        doi.setText("");
        dateAdded.setText("");
        publisher.setText("");
        pubYear.setText("");
        jSearchField.setText("");
        pSearchField.setText("");
        cVenSearchField.setText("");
    } //blankDisplay
}