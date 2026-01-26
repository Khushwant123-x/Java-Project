public class Constructor {
    public static class Car{
        int price;
        String name;
        Car(){ // default Constructor

        }
        Car(int x,String s){  // parameter Constructor
            price=x; 
            name=s;
        }
        void print(){
            System.out.println(price+" "+name);
        }
    }
    public static void main(String[] args) {
        Car c=new Car(120000,"Lord Alto");
        c.print();
    }
    
}
