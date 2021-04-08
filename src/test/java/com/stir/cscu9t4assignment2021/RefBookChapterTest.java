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
public class RefBookChapterTest {
    
    public RefBookChapterTest() {
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
     * Test of 
     */
    
    /**
     * Test of getBook method, of class RefBookChapter.
     * Also tests the constructor without date added
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        String title = "TITLE-D-0";
        String book = "book-a";
        String authors = "Jason Adair";
        String doi = "202/1031";
        String publisher = "ACM";
        String editor = "Mina Mouse";
        int pubyear = 2006;
        RefBookChapter instance = new RefBookChapter(title,book,authors,doi,
                                                    publisher,editor,pubyear);
        String expResult = "book-a";
        String result = instance.getBook();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEditor method, of class RefBookChapter.
     * Also tests the constructor without date added
     */
    @Test
    public void testGetEditor() {
        System.out.println("getEditor");
        String title = "TITLE-D-0";
        String book = "book-a";
        String authors = "Jason Adair";
        String doi = "202/1031";
        String publisher = "ACM";
        String editor = "Mina Mouse";
        int pubyear = 2006;
        RefBookChapter instance = new RefBookChapter(title,book,authors,doi,
                                                    publisher,editor,pubyear);
        String expResult = "Mina Mouse";
        String result = instance.getEditor();
        assertEquals(expResult, result);
    }
    /**
     * Test of getCitation method, of class RefBookChapter.
     * Also tests the constructor without date added
     */
    @Test
    public void testGetCitation() {
        System.out.println("getCitation");
        String title = "TITLE-D-0";
        String book = "book-a";
        String authors = "Jason Adair";
        String doi = "202/1031";
        String publisher = "ACM";
        String editor = "Mina Mouse";
        int pubyear = 2006;
        int day = 8;
        int month = 5;
        int year = 2021;
        RefBookChapter instance = new RefBookChapter(title,book,authors,doi,
                                                     publisher,editor,pubyear,
                                                     day,month,year
                                                    );
        String expResult = "Jason Adair (2006)," +" TITLE-D-0, in book-a, ACM ,"
                            +" ed: Mina Mouse, doi:202/1031" +" date added: 8/5/2021\n";
        String result = instance.getCitation();
        assertEquals(expResult, result);
    }
    
}
