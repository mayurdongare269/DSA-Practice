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
    }

    public static void main(String[] args) {
        
    }
}
