public class ThisKeyword {
    public static class Car{
        int price;// 0  used to point this price
        String name;// null
        Car(int price,String name){
            this.price=price;// this keyword use to point first price in the class
            this.name=name;
        }
        Car(String s,int p){
            price=p;
            name=s;
        }
        void print(){
            int price=12;
            System.out.println(this.price+" "+name);
        }
    }
    public static void main(String[] args) {
        Car c1=new Car(120000,"ket sonet");
        c1.print();
        Car c2=new Car("lord Alto",230000);
        c2.print();
    }
    
}
