/*
Problem: Second Largest Number in Array
Given an array of integers, find the second largest element.

Example:
Input: [10, 5, 8, 20, 15]
Output: 15
*/

public class SecondLargest {

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            } else if(num > second && num != largest){
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 8, 20, 15};
        System.out.println("Second largest number is: " + secondLargest(arr));
    }
}
