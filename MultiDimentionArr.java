
public class MultiDimentionArr {

    public static void main(String[] args) {

        // assuming that we are having a n1,n2,n3 of array variables
        int n1[] = {1, 2, 3, 4};
        int n2[] = {4, 5, 6, 7};
        int n3[] = {8, 9, 10, 11};

        // there is an big array which holds the all these arrays in it
        int nums[][] = {n1, n2, n3}; // this is called multidimention array

        // just we need to define double square brackets which says that it multi-dimention array
        //   0   1   2    3 index
        // 0    1   2    3   4
        // 1    4   5    6   7
        // 2    8   9   10   11
        //index
        // if we to acces  1 its index is (0,0);
        // CREATING A MULTI DIMENTIONAL ARRAY 
        int multiArray[][] = new int[3][4];

        //for adding values to dyanmic array
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (int) (Math.random() * 10);
            }
        }

        //for printing each item from multiarray
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop 
        for (int i[] : multiArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

}
