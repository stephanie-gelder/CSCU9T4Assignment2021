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

    //set up to GUI
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
        //blankDisplay();

    } //constructor
    
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if(event.getSource()==addRef){
            if (rbBook.isSelected()){
               // message = addBookReference("book");
            }
            if (rbJournal.isSelected()){
                //message = addJournalReference("journal");
            }
            if (rbConference.isSelected()) {
               // message = addConferenceReference("conference");
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
    }
}