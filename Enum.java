
enum Status { // here it is a class
    Running, Failed, Pending, Success; // all these are objects
}

// we can't extend enum class like other interface and classes
public class Enum {

    public static void main(String[] args) {
        Status[] status = Status.values();

        System.out.println(status.getClass().getSuperclass());
        for (Status s : status) {
            System.out.println(s + " : " + s.ordinal()); // ordinal will use for getting index 

            switch (s) {
                case Running:
                    System.out.println("all good");
                    break;
                case Pending:
                    System.out.println("loading...");
                    break;
                case Success:
                    System.out.println("success");
                    break;
                default:
                    System.out.println("rejected");
                    break;

            }

        }

    }

}
