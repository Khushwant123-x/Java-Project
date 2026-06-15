package BITWISE;

public class EvenOrOdd {
    public static void main(String[] args) {
        int a=100;
        Check(a);

    }
    static void Check(int a){
        if((a&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
    }
    
}
}