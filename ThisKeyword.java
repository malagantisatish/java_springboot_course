
class Human {

    private int age; // intance variable 
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

        // this keyword is obj which we created in below statci  
        // this reprents the current object which mean here we are created obj 
       // obj.age = age;   for this thing we need to pass obj 
       // but provides a feature that we no need to send obj we can direclty access that by this keyword
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class ThisKeyword {

    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(12);

        // in the above code we are setting age to 12 
        // so java will send current obj to that method  only like 
        // in setage how it will is obj.age = age
    }

}
