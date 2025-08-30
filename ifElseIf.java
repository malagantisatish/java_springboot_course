public class ifElseIf {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 6;
        if (x > y && x > z) {
            System.out.println("x greater then y and z");
        } else if (y > x && y > z) {
            System.out.println("y is greater then x and  z");
        } else if (z > x && x > y) {
            System.out.println("z greater than x and y");
        }

    }

}
