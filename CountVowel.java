public class CountVowel {
    public static void main(String[] args) {
        String s="ksufikansdghshpdofdiinvcvbkjncus8ocnsdcwasaoiiiiiiiiiiiiiiiiuiauda";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                count++;
}

        }
        System.out.println(count);
    }
    
}
