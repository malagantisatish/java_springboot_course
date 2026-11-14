
public class StringBufferAndBuilder {

    public static void main(String[] args) {

        // string buffer
        StringBuffer sb = new StringBuffer("satish"); // by default without string its capacity --->16

        //  System.out.println("capacity: " + sb.capacity()); ---> capacity is 22--->16+6
        sb.append(" varma"); // for adding string at end

        sb.deleteCharAt(1); // for deleting string item at specific index 

        // adding string at specific index
        sb.insert(0, "malaganti "); // malaganti satish varma 

        sb.substring(1, 10); // it will extract the string from start to end index's and end index is not included

        sb.setLength(20);// this will set a length of a string variable's 

        // difference between string buffer and string builder is that string buffer is tread safe and string buffer is not a tread safe
    }

}
