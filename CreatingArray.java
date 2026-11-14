
public class CreatingArray {

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5};

        //for changing specific item
        num[3] = 6;

        // if we want dynamic arrya
        int dyanmicArr[] = new int[4];

        dyanmicArr[0] = 3;
        dyanmicArr[1] = 4;
        dyanmicArr[2] = 5;
        dyanmicArr[3] = 6;

        System.out.println(num[3]);// accessing an specific item from an array

        System.out.println("printing dyanmic arr");

        for (int i = 0; i < dyanmicArr.length; i++) {
            System.out.println("dynamic " + dyanmicArr[i]);
        }

    }
}
