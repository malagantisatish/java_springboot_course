
class Computer {

}

class Laptop extends Computer {

}

class A {

    public void show() {
        System.out.println("in A show");
    }

}

class B extends A {

    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {

    public void show() {
        System.out.println("in C show");
    }
}

class D { // this is not extending with A

}

public class Polymorphism {

    public static void main(String[] args) {

        //POLYMORPHISM

        /*
         * POLY----->MANY
         * MORPHISM------>BEHAVIOUR
         */
        /**
         * THERE are 2 types in polymorphism 1. compile time------->early
         * binding; 2.run time--------->late binding
         */
        /**
         * compile time means if we can define our behaviour so behavour is
         * defined at compile time. if behavoiur is defined at run time then it
         * is called run time
         */
        /**
         * overloading---------> if we have two same methods with diff
         * parameters then which need to execute it decide when compiling that
         * is called run time method overriding--------->if we have 2 class such
         * a (super class) b(subclass) b extends with a both these classes are
         * having same method then which method need to excecute will decided at
         * run time
         */
        //   B obj = new B();
        //    A objAwithTyB = new B();// bcz B is child of A
        Computer lap = new Laptop();// here giving computer type laptop bcz laptop is child of computer;

        // so we can use type as parent and object as child
        A obj = new A(); // here we are creating an obj so what happens is it will create a obj with reference number in stack and heap memory with a connection
        obj.show(); // in A show 

        obj = new B(); // here we reassigning the B to obj now in the heap memory it will new refernce id and disconnects old reference id and mwthods
        obj.show(); // in B show

        obj = new C(); //  here again we are reassigning the C to obj same how above happended here also it will happens  
        obj.show(); // in C show

        // this is called as dynamic method dispatch;
        // and this will only apply if class is extending with it parent 
        //ex:
        //     obj = new D(); this will throws an error
    }

}
