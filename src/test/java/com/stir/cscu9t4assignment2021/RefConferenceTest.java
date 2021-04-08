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
public class RefConferenceTest {
    
    public RefConferenceTest() {
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
     * Test of getVenue method, of class RefConference.
     */
    @Test
    public void testGetVenue() {
        System.out.println("getVenue");
        String title = "Title-C-1";
        String venue = "Conference-2";
        String authors = "Kevin Bacon";
        String doi = "611/1124";
        String publisher = "Springer";
        String location  = "Location-R";
        int pubyear = 2019;
        RefConference instance = new RefConference(title, venue, authors, doi,
                                                    publisher, location, pubyear);
        String expResult = "Conference-2";
        String result = instance.getVenue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class RefConference.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        String title = "Title-C-1";
        String venue = "Conference-2";
        String authors = "Kevin Bacon";
        String doi = "611/1124";
        String publisher = "Springer";
        String location = "Location-R";
        int pubyear = 2019;
        RefConference instance = new RefConference(title, venue, authors, doi,
                                                    publisher, location, pubyear);
        String expResult = "Location-R";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }
    /**
     * Test of getCitation method, of class RefConference.
     */
    @Test
    public void testGetCitation() {
        System.out.println("getCitation");
        String title = "Title-C-1";
        String venue = "Conference-2";
        String authors = "Kevin Bacon";
        String doi = "611/1124";
        String publisher = "Springer";
        String location  = "Location-R";
        int pubyear = 2019;
        int day = 23;
        int month = 11;
        int year = 2021;
        RefConference instance = new RefConference(title, venue, authors, doi,
                                                   publisher, location, pubyear,
                                                  day, month, year);
        String expResult = "Kevin Bacon (2007)," +" Title-C-1 from Conference-2, Springer ,"
                + "loc: Location-R, doi: 611/1124" + " date added: 23/11/2021\n";
        String result = instance.getCitation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
