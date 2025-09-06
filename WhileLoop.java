public class WhileLoop {
    public static void main(String[] args) {
        // WHILE LOOP

        // if we want to run a block until a conditon is true
        // if condtion is false then it should stop iteration
        // for such kind of thing we use while loop

        int i = 0;
        while (i < 5) { // condtion
            System.out.println("Hi " + i);
            int j = 1;
            while(j<=3){
                System.out.println("Hello "+ j);
              j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

    }

}
