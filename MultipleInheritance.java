
class A {

}

class B extends A {

}

class C extends B {

    // class c can't inherit a and b at a time
    // like class c extends a,b this will not work 
    // if we try to make both a and b as parent if both having same method then ambiguilty will happen which mean class c will get confuse to choose which method i,e java don't support multiple inheritance 
    // java only support multilevel inheritance 
}

public class MultipleInheritance {

    public static void main(String[] args) {

        //lets say there are 3 class A, B, C
    }

}
