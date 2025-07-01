import java.util.*;

// using Boyer–Moore Voting Algorithm

public class _2_MajorityElement {
    public int majorityElemen(final int[] A) {
        // Your code here
        int count = 0;
        int candidate = 0;

        for(int num : A) {
            if(count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        _2_MajorityElement obj = new _2_MajorityElement();

        int[] num1 = {3, 2, 3};
        int[] num2 = {2,2,1,1,1,2,2};

        System.out.println("Majority elm: " + obj.majorityElemen(num1));
        System.out.println("Maj elm : " + obj.majorityElemen(num2));
    }
}

/* 
Problem: Majority Element
 Given an integer array of size n, return the element that appears more than  n/2  times.
 You may assume that the majority element always exists in the array.
 Example:
 Input: [3, 2, 3]
 Output: 3
 Method Signature:
 public class Solution {
    public int majorityElement(final int[] A) {
        // Your code here
    }
 }
 Expected Time Complexity: O(n)
 Hint: Use Moore's Voting Algorithm */