/*
 * The main() method is the entry point of a Java program.
 * The name of a Java program is the name of the class  containing the main() method. The main() method is called
 * automatically by the JVM when the program is run with the java runner command "java".
 *
 * In Java the main() method must always returns 'void'. In other programming languages, such as C and C#, it may return
 * (to the execution environment) an int, eg. 0 to indicate success, or something distinct than 0 (usually 1 or -1) to
 * indicate failure.
 *
 * To communicate success or failure to the execution environment, Java uses 'status code' using the static method
 * exit() of class java,lang.System, module java.base.
 *

 * Command-line supplied arguments will be passes to the main() method through its String[] argument, usually called
 * 'args'. The name of the unique parameter in the main() method can be anything, but its type must be String[].
 *
 * Here we have a simple program that just prints the command line arguments passed. The program will be just
 * one .class file (Main.class), obtained after compiling the main class of the program. The main class of the program
 * is the one containing the main() method. We called this class 'Main' here, but it can have any name of course.
 * We can run this program with:
 *
 * $java Main one two three
 *
 *  This invokes the main() method in class Main and pass it the arguments [0]: 'one', [1]: 'two', [2]: 'three'
 *
 * Note than in Java, different to C/C++ the firs argument passed to the main() method is not program name, but the
 * first argument passed in the command line.
 *
 *
 * */

public class Main {

    public static void main(String[] args) {

        System.out.println("The command line arguments are: ");
        for (int i=0; i < args.length; i++ ){
            System.out.println(args[i]);
        }

    }

}
