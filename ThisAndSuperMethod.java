
class A extends Object { // parent | super class

    // every class in  java will extends with Object even if not mention it will be there
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int b) {
        super();
        System.out.println("in A");
    }

}

class B extends A { // child | sub class

    public B() {
        //every contructor will have super method even if we not mentioned
        super(); // super means call the super class contructor 
        System.out.println("in B");
    }

    public B(int a) {
        //every contructor will have super method even if we not mentioned
        this(); // this will call b without parameter contructor 
        // super(a); // if we are passing prop to this super method then it will execute the 
        System.out.println("in int B");
    }
}

public class ThisAndSuperMethod {

    public static void main(String[] args) {

        B obj = new B();

        // here we will get both in A and in B 
    }

}
