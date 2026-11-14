
@FunctionalInterface // annotations will raise an error if user is trying declare more methods
interface A { //we call this a SAM(single abstract method) or functional interface

    void show(int i);
}

// class B implements A {
//     public void show() {
//         System.out.println("in show");
//     }
// }
@FunctionalInterface
interface B {

    void calc(int i, int j);
}

public class FuntionalInterface {

    // functional is a interface which only have one method
    public static void main(String[] args) {
        A obj = new A() { //
            public void show(int i) {
                System.out.println("in show" + i);
            }
        };

        obj.show(5);

        // LAMBDA EXPRESSION
        A b = (int i) -> System.out.println("lambda expression" + i);
        b.show(9);

        // multiple lambda expresion
        B cal = (int i, int j) -> System.out.println(i + j);

        cal.calc(5, 6);

    }

}
