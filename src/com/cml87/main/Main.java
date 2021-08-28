package com.cml87.main;

import com.cml87.utils.Myutils;

/*
 * Other thoughts about jas:
 * 1. jar files can be specified in Java class path as to the compiler 'javac' and the launcher 'java'
 *    See Herong, Using JAR files in Java Class Paths
 * 2. .class files inside a jar can be updated or replaced with option --update.
 *    See Herong, Updating Class Files in JAR.
 * 3. We could simulate an executable jat file by making and executable bash script that receive some argumants and
 *    pass them to a jar file it calls inside with java -jar.
 *    See 'How to convert “jar” to Linux executable file?' Stackoverflow
 * 4. We can create a jar to store all class files of a Java module.
 *    See Herong, 'Creating Module JAR File'
 *
 * */


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello jar jar!");
        Myutils.print();

    }

}
