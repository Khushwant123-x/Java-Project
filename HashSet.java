public class HashSet{
    public static void main(String[] args){
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("HashSet: " + set);
        set.remove(2);
        System.out.println("HashSet after removing 2: " + set);
        System.out.println("Contains 1: " + set.contains(1));
    }
}
