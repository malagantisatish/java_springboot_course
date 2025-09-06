
class Calculator {

    int a; // variables in a class

    public int add(int n1, int n2) { // methods in a class
        int result = n1 + n2;
        return result;
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator cal = new Calculator(); // it will occupay some space

        //here Calculator is a type and cal is a variable,
        //and we are creating a object instance here to access properties and method
        // then in right side by using key new we will create an object
        int result = cal.add(num1, num2);

        //here we are passing the value to add method
        System.out.println("result " + result);
    }
}
