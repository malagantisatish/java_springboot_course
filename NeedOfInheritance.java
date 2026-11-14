
class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

}

class AdvancedCalculator extends Calculator {

    // in this we are Calculator is a parent and advancedCalculator is child 
    //so advancedcalculator is a calculator 
    public int remainder(int n1, int n2) {
        return n1 % n2;
    }

}

public class NeedOfInheritance {

    public static void main(String[] args) {

        // inheritance is a part of Oops concept
        /**
         * WE USE IS WHICH MEANS
         *
         * a laptop is a computer mean laptop has feature like computer; a
         * fortuner is a car mean a fortuner has feature like car;
         *
         * like that which inherit from it;
         *
         * for example we are having a class called calculator which has
         * add,sub,mutli,div method
         *
         * no our requirement is to creat a advanced calculator rather add extra
         * methods to calculator method we we will create new advanced
         * calculator which contains all advanced basic calculation method but
         * we no need to methods for basic bcz we are already calculator which
         * contains all basic calculation methods so we can inherit that class
         * in our advanced class
         *
         *
         *
         */
        // WHAT IS INHERITANCE
        ScientificCalculator obj = new ScientificCalculator();

        // this is called multilevel inheritance  which means if we are having multiple layers then it called as multilevel inheritance
        int r1 = obj.add(1, 2);
        int r3 = obj.sub(6, 7);
        int r2 = obj.divide(5, 6);
        int r4 = obj.multiply(6, 7);
        double r5 = obj.power(6, 7);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }

}
