package BITWISE.MathForDsa;

public class PrimeNumbers {
    public static void main(String[] args) {
        int a = 97;
        if (Prime(a)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    static boolean Prime(int a) {
        if (a <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}