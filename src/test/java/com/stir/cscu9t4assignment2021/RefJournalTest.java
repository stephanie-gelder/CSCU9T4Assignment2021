/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4assignment2021;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author saemundur
 */
public class RefJournalTest {
    
    public RefJournalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getJournal method, of class RefJournal.
     */
    @Test
    public void testGetJournal() {
        System.out.println("getJournal");
        String title = "Title-G-1";
        String journal = "journal-x";
        String authors = "Kevin Bacon";
        String doi = "580/491";
        String publisher = "IEEE";
        int pubyear = 2007;
        int volume = 5;
        int issue  = 5;
        RefJournal instance = new RefJournal(title, journal, authors, doi, publisher, pubyear, volume, issue);
        String expResult = "journal-x";
        String result = instance.getJournal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class RefJournal.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        String title = "Title-G-1";
        String journal = "journal-x";
        String authors = "Kevin Bacon";
        String doi = "580/491";
        String publisher = "IEEE";
        int pubyear = 2007;
        int volume = 5;
        int issue  = 5;
        RefJournal instance = new RefJournal(title, journal, authors, doi, publisher, pubyear, volume, issue);
        String expResult = "5";
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getJournal method, of class RefJournal.
     */
    @Test
    public void testGetIssue() {
        System.out.println("getIssue");
        String title = "Title-G-1";
        String journal = "journal-x";
        String authors = "Kevin Bacon";
        String doi = "580/491";
        String publisher = "IEEE";
        int pubyear = 2007;
        int volume = 5;
        int issue  = 5;
        RefJournal instance = new RefJournal(title, journal, authors, doi, publisher, pubyear, volume, issue);
        String expResult = "5";
        int result = instance.getIssue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCitation method, of class RefJournal.
     */
    @Test
    public void testGetCitation() {
        System.out.println("getCitation");
        String title = "Title-G-1";
        String journal = "journal-x";
        String authors = "Kevin Bacon";
        String doi = "580/491";
        String publisher = "IEEE";
        int pubyear = 2007;
        int volume = 5;
        int issue  = 5;
        int day = 13;
        int month = 2;
        int year = 2021;
        RefJournal instance = new RefJournal(title, journal, authors, doi,
                                            publisher, pubyear, volume,
                                            issue, day, month, year);
        String expResult = "Kevin Bacon (2007)," +" Title-G-1, in journal-x, IEEE ,"
                +" vol: 5, issue: 5, doi: 580/491" +" date added: 13/2/2021\n";
        String result = instance.getCitation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
