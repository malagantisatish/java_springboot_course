
@FunctionalInterface
interface A { // func interface --->means which contains only single method

    void show();
}

@FunctionalInterface
interface B { //  this func is also func interface which accepts the parameters

    void show(int i);
}

@FunctionalInterface
interface Areturn {

    int add(int i, int j);
}

public class LamdaExpression {

    public static void main(String[] args) {
        // this below is called lamda expression with 0 parameters
        A obj = () -> System.out.println("hello word");
        obj.show();

        // this below is called lamda expression which accpets parameter
        B objB = (int i) -> System.out.println(i);
        objB.show(5);

        // by using this lamda expression the file size
        // LAMDA EXPRESSION WITH RETURN VALUE
        // if multiple statements are inludes then only curly brackets or else we can directly return the value
        Areturn objreturn = (int i, int j) -> i + j;

        int result = objreturn.add(4, 5);
        System.out.println(result);

    }
}
