public class DataType {
    public static void main(String a[]) {

        // ***--DATA TYPES--***
        /*
         * premitive types
         * integer -->-2,-1,0,1,2
         * float--------> point values ex:5.5 6.3
         * character----->string
         * boolean ---->true or false
         */

        /*
         * interger
         * 1. byte------------>1byte------>(-2^7) to (2^7-1)
         * 2. short,--------->2 byte ---->(-2^15) to (2^15-1)
         * 3. int,----------->4byte---->(-2^31) to (2^31-1)
         * 4. long------------>8byte---->(-2^63) to (2^63-1)
         */

        /**
         * float
         * 1. double--------->8 bytes default value
         * 2. float---------->4 bytes
         */

        /*
         * DOUBLE
         * default data type is double reason it that double can hold more values after
         * point
         */

        /**
         * FLOAT
         * 
         * float marks = 6.5;
         * 
         * if we give data types as float it will raise an error due to default data
         * type is doubl
         * to avoid that we need give f after the value like below.
         * float marks = 6.5f;
         * 
         */

        /**
         * CHARACTER
         * it has 2 bytes and it can any type of character
         * for assigning char we will use single quote(' ') (double qoute(" ") for
         * string)
         */

        // example for float
        float marks = 6.5f; // for float assigning by default is double
        char c = 'k'; /*
                       * for char assigning, and we should not pull double qoute's it will raise an
                       * error
                       */
        boolean isvalid = false; // for boolean assigning

        /** INTEGER */

        int intType = 9;
        byte byteType = 127;
        short shortType = 558;
        long longType = 5554l; // while assigning long data type we give "l (L)" at last to say that that
                               // variable is lone

    }
}
