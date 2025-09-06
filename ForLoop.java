public class ForLoop {
    public static void main(String[] args) {

        for(int i=0;i<4;i++){ // incrementing i from 0 to 4
           System.out.println("Incrementing "+i);
        }

        System.out.println("");

        for (int i=4;i>=1;i--){ // decrementing
            System.out.println("Decrementing "+i);
        }

        // need to a days in a week(7) as well as hours(24) in a day

        for(int i= 0;i<7;i++){ // days in a week

            System.out.println("day -->"+i);

            for (int j=0;j<9;j++){  // hours in a day
                System.out.println("hours------>"+j);
            }

        }

        // what if we are calculating a number while printing by string in it

        System.out.println("hello "+10+1);// hello 101 

        // because if we try to do like above example it will concat the values rather than calculating

        // to perform a mathematical operation while printing you need to do like below

        System.out.println("mathamatics "  + (10+1)); // mathamatics 11



    }
}
