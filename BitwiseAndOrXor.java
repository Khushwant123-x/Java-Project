class BitwiseAndOrXor{
    public static void main(String[] args) {
        System.out.println(51&42);
        System.out.println(51|42);
        System.out.println(51^42);
        int a=5;
        System.out.println(~a); // 1 s complement of a
        System.out.println(~a+1); // 2 s complement of a
        System.out.println(-a); // 2 s complement of a
        System.out.println(-a-1); //  1 s complement of a
    }
}