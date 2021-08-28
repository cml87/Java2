package com.cml87.main;

import com.cml87.utils.Myutils;

/*
 * With the IDE Intellij, it is possible to get the jar file of our project automatically when we build it,
 * including a manifest file. Do:
 * 1. File/Project Structure/Project Settings/Artifacts/+/JAR/From modules with dependencies ...
 * 2. Specify the package qualified class containing the main() method, so Intellij can include it in the
 *    manifest file eg:
 *    com.cml87.main.Main
 * 3. select "extract to the target JAR". Let META-INF/MANIFEST.MF in src/
 *
 * IntelliJ will then automatically create a .../src/META-INF/MANIFEST.MF manifest file. Note that src/ is the directory
 * containing the base package of our project. With a project build now Intellij will create the project jar at
 * .../out/artifacts/ProjectName_jar/ProjectName.jar file.
 *
 * Note that /out is at the same level as src/.
 *
 * We run the jar now with
 * $java -jar /home/xxx/my_java_projects/Java2/out/artifacts/Java2_jar/Java2.jar
 *
 *
 * Real world Java applications will have multiple jar files that will depend on each other.
 *
 * */


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello jar jar!");
        Myutils.print();

    }

}
