package com.cml87.main;

import com.cml87.utils.Myutils;

/*
 *
 * A manifest in a jar is a file named META-INF/MANIFEST.MF. It contains attributes about the jar file and its contents.
 * Attributes will be a list of name-value pairs in the format "name: value\n".
 *
 * The list is divided into a main section for package-level attributes, and multiple subsections, for entry-level
 * attributes (?). Each attribute must be ended with a new line character.
 *
 * The main section may contain only the package level attributes like: Manifest-Version, Created-By, Main-Class,
 * Class-Path etc.
 *
 * Subsections are optional. They are preceded with a blank line and start with attribute "Name".
 *
 * There are two ways to create a manifest file:
 * 1. Automatically create the manifest file but pass attributes to it from a text file.
 *
 *  $ jar cvf main.jar --manifest=fileWithAttributes.txt -C /home/camilo/my_java_projects/Java2/out/production/Java2/ ./com
 *  $ jar cvfm main.jar fileWithAttributes.txt -C /home/camilo/my_java_projects/Java2/out/production/Java2/ ./com
 *   //cvf -> --create --verbose --file
 *   // --manifest=fileWithAttributes.txt  -> -m fileWithAttributes.txt  or m
 *  The file fileWithAttributes.txt will contain two line. The first will be Main-Class: com.cml87.main.Main. The second
 *  line will be empty. Ie. we are specifying where is the class containing the main() method.
 *  Now, instead of running the file with
 *
 *  $ java -cp main.jar com.cml87.main.Main  //specify the class path of the main class
 *
 *  we can just do
 *
 *  $ java -jar main.jar  // the location of the main class is in the manifest file
 *
 *  2. Explicitly specify the manifest file to use. Eg. I have created the file META-INF/MANIFEST.MF with content
 *
 *    Manifest-Version: 1.0\n
 *    Main-Class: com.cml87.main.Main\n
 *    Created-By: The Avengers in Infinity War\n
 *
 *  Then I tell jar to use it for the manifest file with (I specify only the location of META-INF/ directory):
 *
 *  $ jar cvfM main.jar META-INF/ -C /home/camilo/my_java_projects/Java2/out/production/Java2/ ./com
 *
 *  // --no-manifest -> M
 *
 *  I also tried
 *
 *  $ jar cvf main.jar --no-manifest META-INF/ -C /home/camilo/my_java_projects/Java2/out/production/Java2/ ./com
 *
 *  which should be the same, but it didn't work.
 *
 *
 *
 *
 *

 * 2.
 *
 * */


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello jar jar!");
        Myutils.print();

    }

}
