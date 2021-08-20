package com.cml87.main;

/*
 * See Java Tools Tutorials - Herong's Tutorial Examples
 * See jar --help
 *
 * JAR - Java Archive File Format
 * Java applications can be stored in jar files (Java archive). It can bundle many .class files, images, sounds.
 *
 * It is a ZIP file.
 *
 * Can have attributes stored in the manifest file .../META-INF/MANIFEST.INF.
 *
 * A jar file can be used in classpath for javac and java commands, if we can to include its classes.
 *
 * It can be executable if 'Main-Class' is provided in its manifest.
 *
 *  It can be a module JAR, if module-info.class is provided in its root directory (?)
 *
 *  We can pass options to the jar command through a file using '@' eg:
 *  jar --create --file my.jar @classes.list
 *
 *  We can compile the class and add it to a jar with. The manifest file (META-INF/MANIFEST.MF) will be added
 *  automatically.
 *  $ javac Main.java  // creates a .class in the current dir
 *  $ jar --create --verbose --file main.jar Main.class  // creates the jar with our class
 *
 *  In short format the above jar command can be written as
 *  $ jar cvf main.jar Main.class
 *  $ jar -c -v -f main.jar Main.class
 *  $ jar -cvf main.jar Main.class
 *
 *  We can list a jar content with:
 *  $jar --list -v -f main.jar // or tvf
 *
 *  To extract the files in a jar: jar --extract --verbose --file <jar_file>  // or xvf
 * */


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello jar !");

    }

}
