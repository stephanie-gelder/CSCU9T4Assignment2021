/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4assignment2021;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
// Only used if you want to use reflection to test private features
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

/**
 *
 * @author saemundur
 */
public class RefSystemGUITest {
    
    public RefSystemGUITest() {
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
     * Test of main method, of class RefSystemGUI.
     * Just tests if the GUI initiates without explicit fail
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RefSystemGUI.main(args);
    }

    /**
     * Test of actionPerformed method, of class RefSystemGUI.
     * You might want to add an action and a few more test cases with 
     * different actions
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        RefSystemGUI instance = new RefSystemGUI();
        instance.actionPerformed(event);
    }

    /**
     * Test of addCite methods, of class RefSystemGUI
     *
     */
    @Test
    public void testAddCite(){
        System.out.println("addCite");
        RefSystemGUI instance = new RefSystemGUI();
    }

    /**
     * Test of blankDisplay method, of class RefSystemGUI.
     * It just executes the method to see if it doesn't throw an exception
     */
    @Test
    public void testBlankDisplay() {
        System.out.println("blankDisplay");
        RefSystemGUI instance = new RefSystemGUI();
        instance.blankDisplay();
    }

    /**
     * Test to see if all display requirements have been met
     */
    @Test
    public void testButtonsPresentInGUI() throws IllegalAccessException, IllegalArgumentException{
        System.out.println("Check if you have added the buttons");
        RefSystemGUI instance = new RefSystemGUI();
        Class<?> instanceClass = instance.getClass();
        String[] expectedFields = {"addRef","jSearch", "pSearch", "cVenSearch"};
        Field fields[] = instanceClass.getDeclaredFields();
        int found = 0;
        for (Field field : fields) {
            if (Arrays.asList(expectedFields).contains(field.getName())){
                found += 1;
                field.setAccessible(true);
                assertTrue(field.get(instance) instanceof JButton);
            }
        }
        assertEquals(found,expectedFields.length,"Have you added all required buttons?");
    }
}
