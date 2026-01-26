public class firstProgram {
    public static class Student{
        String name;
        int rno;
        double percent;
        void print(){   // Method  inside the class
            System.out.println(name+" "+rno+" "+percent);
        }
    }
    public static void main(String[] args) {
        Student x= new Student();
        x.name="Khushwant";
        x.rno=86;
        x.percent=97.4;
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percent);
        x.print();
        
    }
    
}
