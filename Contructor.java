
class Human {

    private int age; // intance variable 
    private String name;

    public Human() { // contructor // default contructor 
        // contructor name should be same as class name
        // whenever we created new object with that will call this contructor 
        // a contructor is also like a method but we won't return anything from this contructor 
        // when we need to connect database to this java code we will contructor 
        System.out.println("contructor ");

        age = 12;
        name = "malaganti satish varma";

    }

    public Human(int age, String name) { // parameterized contructor 
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Contructor {

    public static void main(String[] args) {
        Human obj = new Human(); // contrutor
        // this created in heap memory
        Human obj1 = new Human(); // contructor 

        // so i have created 2 object with human so 
        // contructor method will 2 times
        System.out.println(obj.getName() + " : " + obj.getAge());  // if we dont assign value it will have default values

        // default and parameterized contructor 
        Human parameterizedObj = new Human(12, "satish");
    }

}
