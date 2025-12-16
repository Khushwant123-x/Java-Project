package String;

import javax.sound.sampled.SourceDataLine;

public class Comparison {
    public static void main(String[] args) {
        String a = "Khushwant";
        String b = "Khushwant";
        System.out.println(a==b);
        // how to create different object of Same Value
        String c=new String("Khushwant");
        String d=new String("Khushwant");
        System.out.println(c==d);

    }
}
