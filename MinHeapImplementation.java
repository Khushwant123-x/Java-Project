public class MinHeapImplementation {
    class MinHeap {
        int[] heap;
        int size;
        int capacity;

        MinHeap(int capacity) {
            this.capacity = capacity;
            heap = new int[capacity];
            size = 0;
        }
        void peek(){
            if(size==0){
                System.out.println("Heap is empty");
                return;
            }
            System.out.println("Root element: " + heap[0]);
        }
        void add(int value) {
            if (size == capacity) {
                System.out.println("Heap is full");
                return;
            }
            heap[size] = value;
            size++;
            heapifyUp(size - 1);
        }

        void heapifyUp(int index) {
            int parent = (index - 1) / 2;
            if (index > 0 && heap[index] < heap[parent]) {
                int temp = heap[index];
                heap[index] = heap[parent];
                heap[parent] = temp;
                heapifyUp(parent);
            }
        }

        void remove() {
            if (size == 0) {
                System.out.println("Heap is empty");
                return;
            }
            heap[0] = heap[size - 1];
            size--;
            heapifyDown(0);
        }

        void heapifyDown(int index) {
            int smallest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }
            if (smallest != index) {
                int temp = heap[index];
                heap[index] = heap[smallest];
                heap[smallest] = temp;
                heapifyDown(smallest);
            }
        }

        void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeapImplementation.MinHeap minHeap = new MinHeapImplementation().new MinHeap(5);
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.printHeap(); // check heap structure
        minHeap.remove();
        minHeap.printHeap(); // after removing root
        minHeap.peek(); // check new root
        System.out.println("Size: " + minHeap.size); // check size
    }
}
