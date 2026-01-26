class Student{
    String name;
    private int rno;   // Encopsulation
    double cgpa;
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getrno(){ //getter
        return rno;
    }
    void setrno(int x){ //setter
        rno=x;

    }

}
public class PrivateKeyword {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="khushwant";
        s.cgpa=9.6;
        s.print();
       s.setrno(86);
       System.out.println(s.getrno());
       s.print();
    }
    
}
