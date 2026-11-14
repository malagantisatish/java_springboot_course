
class A {

    public void show() {
        System.out.println("Class A show method");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        A objA = new A() {
            public void show() { // anonymous class
                System.out.println("in new show");
            }
        };
        objA.show();

    }

}
