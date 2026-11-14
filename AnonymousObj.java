
class Home {

    public Home() {
        System.out.println("contructor");
    }

    public String add() {

        return "add";

    }
}

public class AnonymousObj {

    public static void main(String[] args) {

        Home obj = new Home();
        String item = obj.add();

        new Home();// this is called anonymous object bcz we can't reuse this object bcz we are not storing it in a any variable;


        /*
         * object refernce will create when we write  new Home() and not this entire line Home obj = new Home();
         * 
         * this new Home() will create an object refernce in heap memory not in statck 
         * 
         * 
         */
    }
}
