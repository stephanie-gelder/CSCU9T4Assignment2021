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
 * @author saemundur
 */
public class RefSystemGUI extends JFrame implements ActionListener {
    //create components of GUI
    //private ...
    //private JButton addR = new JButton("Add New Reference");
    private RefCollection bibliography = new RefCollection();
    
    public static void main(String[] args) {
        RefSystemGUI applic = new RefSystemGUI();
    }
    public RefSystemGUI() {
        super("Bibliography");
        setLayout(new FlowLayout());
        //add components of GUI
        //add(addR);
    }
    
    public void actionPerformed(ActionEvent event) {
    }
}