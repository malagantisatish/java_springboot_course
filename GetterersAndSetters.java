
class Human {

    private int age; // intance variable 
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class GetterersAndSetters {

    public static void main(String[] args) {

        Human obj = new Human();
        obj.setName("satish");
        obj.setAge(22);

        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}
