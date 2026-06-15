package BITWISE;

public class RightMostbit {
    public static void main(String[] args) {
        int n = 64;
        System.out.println("Rightmost set bit value: " + Position(n));
    }
     static int Position(int n) {
    return (int)(Math.log(n & -n) / Math.log(2)) + 1;
}
   
    
}