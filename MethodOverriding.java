
class A {

    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in a config");
    }
}

class B extends A {

    public void show() {
        System.out.println("in B show"); // sub class if we declare a method with same name method which exits in super class then it will preference to it own method by overriding the it super class method
    }

}

class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdCalc extends Calc {

    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

class MethodOverriding {

    public static void main(String[] args) {

        B objB = new B();

        objB.show();
        objB.config();

        AdCalc cal = new AdCalc();
        cal.add(1, 2);

    }

}
