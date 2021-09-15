package com.cml87.main;

import com.cml87.utils.Myutils;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

       //keep the program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }

}

/*
A clock that prints the time at regular intervals
 */

// Outer class
class TalkingClock {


    //when this method is called, the compiler will automatically call the constructor of the inner class passing the
    //method arguments to set the corresponding fields, also created automatically by the compiler.
    public void start(int interval, boolean beep){

        // local anonymous inner class
        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.out.println("At the tone the time is "+ new Date());
                // access to a private field of the outer class instance that creates this instance,
                // without a getter method !!
                //if (TalkingClock.this.beep)
                if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(interval, listener);
        t.start();

    }



}