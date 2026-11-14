
abstract class A {

    public abstract void show();// by using abstract keyword we are just declaring a function not defining it 
    // if any class inherit this class they should define this funtion compulsarly
}

public class AbstractAndAnonymousInnerClass {

    public static void main(String[] args) {

        A objA = new A() {
            public void show() {
                System.out.println("show method from abstract anonymous innner class");
            }

            public void config() {
                System.out.println("anonymous inner class");
            }
        };

        objA.show();
        // objA.config();

    }

}
