
public class WrapperClasses {

    public static void main(String[] args) {
        int num = 9;
        //Integer num1 = new Integer(9); // in future this integer may removes i,e this showing warning;

        // AUTO BOXING :- hee we are send premitive value
        /**
         * AUTO BOXING :- auto boxing is nothing but if we store primitive tyoe
         * in the object automatically
         */

        /*
          * AUTO UNBOXING:-
         */
        Integer num2 = num;

        int num3 = num2.intValue();
        System.out.println("num3");

    }

}
