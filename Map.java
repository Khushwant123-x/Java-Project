public class Map{
    public static void main(String[] args){
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("HashMap: " + map);
        map.remove("Two");
        System.out.println("HashMap after removing 'Two': " + map);
        System.out.println("Contains 'One': " + map.containsKey("One"));
        for(String key : map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}