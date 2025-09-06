
class Calculator {

    public int add(int n1, int n2, int n3) { // adding 3 values
        return n1 + n2 + n3;
    }

    // if want to calculate only 2 values i have 2 options one is i need to create new method with different name
    //else i need to create a new method with the same name which accepts the 2 values
    public int add(int n1, int n2) { // for add 3 values
        return n1 + n2;
    }

    public double add(double n1, int n2) { // adding double and int values and returns double
        return n1 + n2;
    }

    // this is called method overloading....
    // ** and imp thing is that if we are creating a new method with same name same types
    // it will raise an error if return value is different

    /*
     * public doble add(int n1,int n2){
     * return n1+n2
     * }
     */
    // the above code will raise an error 
}

public class MethodOverLoading {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int r1 = cal.add(3, 4, 5);

        System.out.println("r1 " + r1);

    }

}
