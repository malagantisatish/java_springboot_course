
class A {

    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("show in A");
    }
}

class B extends A {

    @Override // this is annotation which helps to figure out weather we are giving method name properly or not
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("show in B");
    }
}

public class Annotations {

    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }

}
