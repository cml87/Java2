package com.cml87.main;

import com.cml87.utils.Myutils;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

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
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){

        // local inner class
        class TimePrinter implements ActionListener{
            int x;
            //the compiler will insert a TalkingClock reference (outer class) and a 'beep' field for all constructors of
            // this inner class
            public TimePrinter(){}

            private TimePrinter(int x){ this.x=x;  }

            public void actionPerformed(ActionEvent event){
                System.out.println("At the tone the time is "+ new Date());

                // access to a private field of the outer class instance that creates this instance,
                // without a getter method !!
                if (TalkingClock.this.beep)
                //if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        }

        //ActionListener listener = this.new TimePrinter();
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();

    }



}