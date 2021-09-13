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

        TalkingClock.TimePrinter tp;  //the inner class is public, so I can call it here
        tp = clock.new TimePrinter();  //this constructor is public, so I can call it here
        //tp = clock.new TimePrinter(2);// this constructor is private, so I cannot call it here

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
        //ActionListener listener = this.new TimePrinter();
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();


        //this constructor is private, so we can call it only from inside the outer class
        TimePrinter tt = this.new TimePrinter(3);

    }

    // inner class
    public class TimePrinter implements ActionListener{

        int x;

        //the compiler will insert a TalkingClock reference (outer class) as a parameter for this constructor
        public TimePrinter(){

        }

        private TimePrinter(int x){
            this.x=x;
        }

        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone the time is "+ new Date());
            //if (TalkingClock.this.beep)
            if (beep)
                Toolkit.getDefaultToolkit().beep();
        }

    }
}