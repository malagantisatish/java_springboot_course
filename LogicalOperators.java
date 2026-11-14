public class LogicalOperators {
    public static void main(String[] args) {
        // for logical operator we will use AND , OR NOT OPERATORS
        /*
         * for AND ------> & (Ampersand)
         * for OR--------> | (pipe or vertical bar)
         * for NOT--------> ! (exclamation mark)
         */
        // EXAMPLE

        int x = 5;
        int a = 10;

        boolean andResult = x < 4 & a > 9; // if both are true--->true else false
        boolean orResult = x < 4 | a > 9; // if any one of them are true the result will we true or else false
        boolean not_result = !(andResult); // it will reverse boolean value

        // SHORT CIRCUIT (&&,||)

        boolean sc_and = x > 4 && a > 9; // if we use AND operator  if first condition is false it won't go for second one
        boolean sc_or = x < 4 || a > 9; // if we use OR operator if first one is true then it won't go for second one

    }

}
