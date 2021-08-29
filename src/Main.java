/*
 *
 * The following program attempts to store an unsigned integer number gotten from the command line, in a byte, ie. in
 * only 8 bits. For this, the number must be in the range [0, 255].
 *
 * In Java there is no unsigned byte. A byte is a signed type in Java ranged [-128, 127]. However we can write code to
 * parse it as an unsigned number ranged [0, 255]. See – https://mkyong.com/java/java-convert-bytes-to-unsigned-bytes/.
 *
 * This program returns to the caller environment two different exit codes (two numbers) that can be interpreted by the
 * former. We return these numbers using method System.exit(). The caller will be the following script run from bash.
 *
 *
 * #!/bin/bash
 *
 * ERROR(){
 * 	eccho ERROR - Value of out range of a byte [0 to 255]
 * }
 *
 * OK(){
 * 	echo OK - Conversion allowed
 * }
 *
 * END(){
 * 	echo TERMINATION CODE [$1]
 * }
 *
 * java -cp /home/camilo/my_java_projects/Java2/out/production/Java2 Main  ##call the Java program 'Main'
 *
 * ## internal variable. Catches the termination code of the last executed program.
 * ## bash interprets termination codes only between 0 and 255. Above will be module 256 reduced.
 * EC=$?
 *
 * if [ $EC -eq 0 ]; then OK; fi
 * if [ $EC -eq 119 ]; then ERROR; fi
 * END $EC

 *
 * */

import java.util.Scanner;

class OverflowException extends ArithmeticException{}

public class Main {

    public static void main(String[] args) {

        final int ERROR_SUCCESS = 0x0;
        final int ERROR_ARITHMETIC_OVERFLOW=0x77;  //119

        int nr;

        System.out.println("Enter a positive number that can be stored in a byte [0, 255]: ");
        try {
            nr = new Scanner(System.in).nextInt();
            if (nr<0 || nr>255)
                throw new OverflowException();

            //TODO some useful stuffs

        } catch (OverflowException oe){
            System.exit(ERROR_ARITHMETIC_OVERFLOW);
        }

        System.exit(ERROR_SUCCESS);


    }

}
