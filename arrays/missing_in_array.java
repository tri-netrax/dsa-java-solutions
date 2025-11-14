/*
Problem: Missing Number in Array
Given an array containing n distinct numbers taken from 0,1,2,...,n, 
find the one that is missing from the array.

Example:
Input: nums = [3,0,1]
Output: 2
*/


public class Missing {
    public static int missingNum(int arr[], int n){
        int total = n*(n+1)/2;
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args){
        int[] arr = {3, 0, 1};
        System.out.println("Missing number is: " + missingNum(arr, 4));
    }
}
