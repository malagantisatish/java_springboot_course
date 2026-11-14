public class ArthmaticOperations {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        // arthematic operation between both values
        int sub = num1 - num2; // 2
        int sum = num1 + num2; // 12
        int remainder = num1 % num2; // 2 // use modules operator for remainder
        int divide = num1 / num2;// 1 // we will get qufitent
        int multiply = num1 * num2;// 35

        System.out.println("sum :" + sum);
        System.out.println("sub :" + sub);
        System.out.println("remainder :" + remainder);
        System.out.println("divide :" + divide);
        System.out.println("multiply :" + multiply);

        // arthematic operation self variable
        num1 += 8;// adding 8 to num1
        num1 -= 8;// removing 8 to num1
        num1 *= 8;// mutiplying 8 to num1
        num1 /= 8; // diving with 8
        num1 %= 8; // remainder (modulus)

        // POST INCREMENT AND DECREMENT

        num1++; // increment
        num1--; // decrement

        // PRE INCREMENT AND DECREMENT
        ++num1;
        --num1;

        // DIFFERENCE BETWEEN PRE AND POST
        /*
         * pre increment or decrement result we can assign to a variable and it will
         * return result
         * ex:result = ++num1;--------->if num1=8 -->result will be 9
         * post inscrement or decrement even if assign post increment or decrement it
         * will not result it return initial value
         * ex: result = num1++;-------->if num1 = 8 --------->result will be 8
         */

        // REASON FOR ABOVE ISSUE
        /*
         * while we are using post intially it will fetch the value of num1 then it will
         * increment value i,e we will get old value
         * 
         * while we are using pre increment or decrement it will initally increment the
         * value
         * then it will fetch and assign the result
         */

    }

}
