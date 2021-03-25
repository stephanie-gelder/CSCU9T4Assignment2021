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
    private JLabel labDOI = new JLabel("DOI:");
    private JLabel labPublisher = new JLabel("Publisher:");
    private JLabel labPubYear = new JLabel("Year Published:");
    //creating the additional labels for BOOK references
    private JLabel labBookT = new JLabel("Book Title:");
    private JLabel labEditor = new JLabel("Editor");
    //creating the additional labels for JOURNAL references
    private JLabel labJournalT = new JLabel("Journal Title:");
    private JLabel labIssue = new JLabel("Issue Number:");
    private JLabel labVol = new JLabel("Volume Number:");
    //creating the additional labels for CONFERENCE references
    private JLabel labVenue = new JLabel("Venue:");
    private JLabel labLocation = new JLabel("Location");

    //creating text fields for the generic labels
    private JTextField title = new JTextField(20);
    private JTextField authors = new JTextField(30);
    private JTextField doi = new JTextField(10);
    private JTextField publisher = new JTextField(20);
    private JTextField pubYear = new JTextField(10);
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

        add(labRefInfo);
        add(labRefType);
        //adding the radio buttons to the button group
        bg.add(rbBook);
        bg.add(rbConference);
        bg.add(rbJournal);
        //adding the radio buttons and their action listeners
        add(rbBook);
        rbBook.addActionListener(this);
        add(rbConference);
        rbConference.addActionListener(this);
        add(rbJournal);
        rbJournal.addActionListener(this);

        //adding labels and text fields to GUI
        add(labTitle);
        add(title);
        title.setEditable(true);
        add(labAuthors);
        add(authors);
        authors.setEditable(true);
        add(labDOI);
        add(doi);
        doi.setEditable(true);
        add(labPublisher);
        add(publisher);
        publisher.setEditable(true);
        add(labPubYear);
        add(pubYear);
        pubYear.setEditable(true);

        add(labBookT);
        add(bookTitle);
        bookTitle.setEditable(true);
        add(labEditor);
        add(editor);
        editor.setEditable(true);

        add(labJournalT);
        add(journalTitle);
        journalTitle.setEditable(true);
        add(labIssue);
        add(issue);
        issue.setEditable(true);
        add(labVol);
        add(volume);
        volume.setEditable(true);

        add(labVenue);
        add(venue);
        venue.setEditable(true);
        add(labLocation);
        add(location);
        location.setEditable(true);

        add(addRef);
        addRef.addActionListener(this);

        add(outputArea);
        outputArea.setEditable(false);
        setSize(800, 500);
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
               labTitle.setEnabled(false);
               title.setEnabled(false);
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
            }
        }
        if (event.getSource() == rbJournal){
            if(rbJournal.isSelected()){
                labTitle.setEnabled(false);
                title.setEnabled(false);
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
            }
        }
        if(event.getSource() == rbConference){
            if (rbConference.isSelected()){
                labTitle.setEnabled(false);
                title.setEnabled(false);
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
            }
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
            String bt = bookTitle.getText();
            String e = editor.getText();
            r = new RefBookChapter(t, bt, a, d, p, e, py);
        }
        else if(what.equals("journal")){
            String jt = journalTitle.getText();
            int i = Integer.parseInt(issue.getText());
            int v = Integer.parseInt(volume.getText());
            r = new RefJournal(t, jt, a, d, p, py, v, i);
        }
        else if(what.equals("conference")){
            String v = venue.getText();
            String l = location.getText();
            r = new RefConference(t, v, a, d, p, l, py);
        }
        else {
            r = new Ref(t, a, d, p, py);
        }
        bibliography.addCite(r);
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
        publisher.setText("");
        pubYear.setText("");
    } //blankDisplay
}