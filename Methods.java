package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Khushwant Singh";

        // Create An Array
        System.out.println(Arrays.toString(name.toCharArray())); // [K, h, u, s, h, w, a, n, t,  , S, i, n, g, h]
        
        // All character to Lower case
        System.out.println(name.toLowerCase());

        System.out.println(Arrays.toString(name.split(" "))); //   [Khushwant, Singh]

        System.out.println("Khushwant".strip());  //Khushwant
    }
    
}
