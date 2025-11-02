public class Solution1 {
    public static void main(String[] args) {
        int x=1;
        int ans;
        if(x==0 || x==1 || x==2){
            ans=0;
        }
        ans=SquareRoot(x);
     System.out.print(ans);
    }
    static int SquareRoot(int x){
        float sr;
        int i;
                for(i=1;i<=x;i++){
                    sr=x/(i*i);
                    if(sr<1){
                    i=i-1;
                    break;
            }
        }
    
        return i;

    }
}