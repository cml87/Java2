package com.cml87.main;

import com.cml87.utils.Myutils;

/*
 * We create a jar file for a multi-package java application with option -C
 *
 * $ jar --create --verbose --file main.jar -C /home/camilo/my_java_projects/Java2/out/production/Java2/ ./com
 * $ jar cvf main.jar -C /home/camilo/my_java_projects/Java2/out/production/Java2/ ./com
 * where
 *
 * /home/camilo/my_java_projects/Java2/out/production/Java2/ -> tells jar to change the working dir to here
 * ./com  -> archive the entire subdirectory tree of ./com, which is the base package of our application. In this tree
 * we should have the compiled .class files of or application, inside the corresponding package directories.
 *
 * The manifest file will be created automatically. Its content can be seen with
 *
 * $ jar tvf main.jar // --list --verbose --file
 *
 *  The generated jar file will be saved in the current dir. Extracting the jar file with
 *
 * $ jar xvf main.jar // --extract --verbose --file
 *
 * We can go and examine the META-INF/MANIFEST.MF and see that it doesn't contain a Main-Class entry. Therefore, to
 * run this jar as an application (run its main() method) we need to tell jar which class contains the main() method.
 * We use option cp:
 *
 * $  java -cp main.jar com.cml87.main.Main
 *
 * Next we'll see how to specify custom entries to the manifest file, or how to pass a complete manifest file to the jar
 *  command.
 *
 *
 * */


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello jar jar!");
        Myutils.print();

    }

}
