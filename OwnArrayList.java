class ArrayList {
    int[] arr;
    int idx = 0;   // next insertion index
    int size = 0;  // number of elements stored

    ArrayList(int capacity) {
        this.arr = new int[capacity];
    }

    void add(int ele) {
        if (idx == arr.length) {
            // Resize array when full
            int[] arr2 = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = ele;
        size++;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();  // Output: 10 20 30
    }
}
