public class switchState {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("monday");
                break; // if we not given break after condition is satisfied it excute the remining condition until unless break is there
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("webnesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("sunday");
                break;
        }

    }

}
