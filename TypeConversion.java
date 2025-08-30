public class TypeConversion {
    public static void main(String[] args) {
        /* TYPE COVERSION AND CASTING */

        /*
         * if i declared a variable on type and trying assign another type it ,this will
         * show an error
         */
        // if i have b with data type byte and a with data type int if i am trying
        // assign a to b it shows an error but you can assign b to a

        int a = 256;
        byte b = 127;
        a = b; // this work ,this is called implicitly conversion
        // b = a; this will not work due to int is bigger than byte

        // but we can assign a value to b by casting

        b = (byte) a; // doing this exteranlly called casting,this also called explicitly conversion.

        // CONVERTING FLOAT TO AN INT

        float f = 5.6f; // default data type is double if want float we need to give f like this at end
                        // of the value

        int x = (int) f; // x = 5, bcz it will remove digits after .

        byte maxByte = 127; // max byte value is +127
        int intA = b;

        // what if we assign int variable value to byte variable value which is more
        // than byte range

        int maxA = 257;
        byte k = (byte) maxA;

        System.out.println("k : " + k); // k : 1, 127%126

        // TYPE PROMOTIONS

        byte ta = 10;
        byte tb = 30;
        int tresult = ta * tb; // here both values are byte but it will not show error it wil promote the
                               // variable when it crossing limit

        System.out.println("tresult : " + tresult);

    }

}
