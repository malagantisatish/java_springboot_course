
final class Calc { // if we have given final keyword to this class then no other class can inherit this class

    public void show() {
        System.out.println("calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class NormalCal {

    public final void show() {
        System.out.println("calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvanceCalc extends NormalCal {
    // here NormalCal is not a final class so we can inherit and override those methods to avoid that we use final keyword for methods
    // if in this class if they try to method it will not work;

}

public class FinalKeyWord {

    public static void main(String[] args) {

        // final key word can be used in variable,method,class
        int num = 8;
        num = 9;
        // so here we can change the value by reassigning;
        // so declare a constant value here we use final key word

        final int numFinal = 10; // final variable

        //numFinal = 12; this will throws an error
        Calc obj = new Calc();
        obj.show();
        obj.add(1, 2);

    }

}
