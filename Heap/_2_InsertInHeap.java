import java.util.PriorityQueue;
import java.util.*;

public class _2_InsertInHeap { // here in one code all funcions

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            arr.add(data); // add at last O(1)

            int x = arr.size() - 1; // x is chils indx
            int par = (x - 1)/2;// par is for parent index

            while(arr.get(x) < arr.get(par)) { //O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() { // delete in heap
            int data = arr.get(0);

            //step1 - swap first and last index
            int temp = arr.get(0);
            arr.set(0, arr.size() - 1);
            arr.set(arr.size() - 1, temp);

            //step2 - remove last
            arr.remove(arr.size() - 1);

            //step3 - heapify
            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }




    }

    public static void main(String[] args) {
        
    }
}
