public class TernaryOperator {
    public static void main(String[] args) {
        // if we use if else condtion
        int n = 4;
        int resultn = 0;

        if (n % 2 == 0) {
            resultn = 10;
        } else {
            resultn = 20;
        }

        System.out.println("if else: " + resultn);

        // by using ternary operator

        int m = 5;
        int resultm = 1;

        resultm = m % 2 == 0 ? 10 : 20;
        System.out.println("ternary operator: " + resultm);

    }

}
