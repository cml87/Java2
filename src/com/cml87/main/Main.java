package com.cml87.main;

import com.cml87.utils.Myutils;

class FileManager {

    public FileManager(){
        System.out.println("FileManager constructor invoked ...");
    }

    protected void finalize() {
        System.out.println("FileManager finalizer invoked ...");
    }

}



public class Main {

    public static void main(String[] args) {

        FileManager fm = new FileManager();

        fm = null; // now the memory previously allocated with new will be eligible for garbage-collection

        // totalMemory(): returns the amount of memory currently allocated, plus the available memory to allocate more
        // objects in the future, always in bytes
        // freeMemory(): returns only the memory available, to be allocated for new objects in the future, in bytes.
        System.out.printf("Memory occupied in the heap, in bytes: %d%n",
                Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

        // kindly ask the JVM  to start-up garbage collector operations ??
        // kindly ask because we cannot explicitly call the garbage collector actually. It seems we can only hint the
        // JVM to do it
        Runtime.getRuntime().gc();

        System.out.println("- a -");

        // kindly ask the JVM to call the finalizers of the objects eligible for garbage-collection ??
        Runtime.getRuntime().runFinalization();

        System.out.println("- b -");

        System.out.printf("Memory occupied in the heap, in bytes: %d%n",
                Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());


    }

}
