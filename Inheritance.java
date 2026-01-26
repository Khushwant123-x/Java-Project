class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int horsePower;
}                                                    // one parent multiple child Inheritance in java
class Aircraft extends PowerVehicle{
    int wings;
    {

}
public class Inheritance {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        PowerVehicle pv1=new PowerVehicle();
        pv1.wheels=4;
        Aircraft a1=new Aircraft();
    }
    
}
