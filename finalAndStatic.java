public class finalAndStatic {
    public static class Cricketer{
        static String Country="India"; // diffrent box is generated for static variable. like independent variable
        //final String Country="India"; //final variable cannot be changed
        int runs;
        double average;

    }
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
        //c1.Country="Austrialia"; //final variale cannot be changed
        c1.Country="NZ";
        Cricketer c2= new Cricketer();
        System.out.println(c2.Country);// output NZ because static variable is shared among all objects of class
    }
}
