
class Human {

    private int age; // default value will be 0
    private String name; // default value will be null

    // if we declare a variable using private then we can't access it direclty;
    // but we can access them indirecly using methods;
    public void setAge(int a) {// for setting dyanmic value of age and name
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        // encapsulation is a part of oops concept.
        // encapsulation is nothing but which bundles the related data in an object 
        //example we are having a Human class
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("satish");
        System.out.println(obj.getName() + " " + obj.getAge());

    }

}
