
// System.out.println("hello world") it will not run due to not having main method

/*JVM 
 * in our system we are jvm installed without jvm we can't run java code 
 * jvm will execute the code which is top of os and os is top if hardware
 * jvm only understand byte code that why we need a compiler called javac 
 * java--->compiler(javac)---->byte code-------->jvm------>os(windows)---->hardware
 * jvm will execute from first file which should contains main method called public static void main

 */

class Hello { // file name
    public static void main(String a[]) {
        System.out.println("hello world");
    }
}

/*
 * for executing the file you can run
 * 1. javac filename ex: javac Hello.java
 * 2. java classname ex:java Hello
 */

/*
 * after executing this code it will create a file with
 * same name with the extension of .class
 */

/** JAVA RUNTIME ENVIRONMENT (JRE) */

/* JAVA VIRTUAL MACHINE (JVM) */

/**
 * JVM is a part of JRE for running java we JRE which
 * contains JVM.
 */

/** JAVA is a WORA means write once run anywhere */
