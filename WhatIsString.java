
public class WhatIsString {

    public static void main(String[] args) {

        // if we want to store charecter we String
        String name = "satish";  // while assigning value we use double quotes for string
        // if we use char we need to use single quote rather than double

        // String in java is not a premitive type its a class
        // when we are using the class we should define like below
        String fname = new String(); // this is the correct way declare a string object

        // if we print fname this will print empty line bcz it not having any data 
        String sname = new String("malaganti");
        System.out.println(sname); // malaganti

        System.out.println(sname.hashCode()); // we will get some numbers

    }
}
