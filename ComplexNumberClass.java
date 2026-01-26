public class ComplexNumberClass {
    public static class Complex{
        int x;
        int y;
        Complex(int x,int y){
            this.x=x;
            this.y=y;
        }
        Complex(){

        }
        void print(){
           if(y>=0) System.out.println(x+" + "+y+"i");
           else System.out.println(x+" - "+(-y)+"i");
        }
        void add(Complex z){
            this.x=this.x+z.x;
            this.y=this.y+z.y;
        }
        void multiply(Complex z){
            this.x=this.x*z.x-this.y*z.y;
            this.y=this.y*z.x+this.x*z.y;
        }
    }
    public static void main(String[] args) {
        Complex c1=new Complex(3,4);
        Complex c2=new Complex(4,-4);
        c1.print();c2.print();
        c1.add(c2);
        c1.print();
        c2.multiply(c1);
        c2.print();
    }
}
