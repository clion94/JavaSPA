/*
Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.
For example, for the input [1, 2, 3, 10], you should return 7.

Input:  arr[] = {1, 10, 3, 11, 6, 15};
Output: 2

Input:  arr[] = {1, 1, 1, 1};
Output: 5

Input:  arr[] = {1, 1, 3, 4};
Output: 10

Input:  arr[] = {1, 2, 5, 10, 20, 40};
Output: 4

Input:  arr[] = {1, 2, 3, 4, 5, 6};
Output: 22

 */


class Scratch {
    public static void main(String[] args) {
        int[] givenArray = {1, 10, 3, 11, 6, 15};
        System.out.println(findSmallestSum(givenArray));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int[] givenArray1 = {1, 1, 1, 1};
        System.out.println(findSmallestSum(givenArray1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int[] givenArray2 = {1, 1, 3, 4};
        System.out.println(findSmallestSum(givenArray2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int[] givenArray3 ={1, 2, 5, 10, 20, 40};
        System.out.println(findSmallestSum(givenArray3));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int[] givenArray4 = {1, 2, 3, 4, 5, 6};
        System.out.println(findSmallestSum(givenArray4));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public static int findSmallestSum(int[] arr) {
        int res = 1;
        for (int i : arr) {
            System.out.println("is " + i + " > " + res);
            if (i > res) {
                System.out.println("Current element " + i + " greater than result; Lets break and return result: " + res);
                return res;
            } else {
                System.out.println("Current element  " + i + "  not greater than current result: " + res + " += " + i);
                res += i;
                System.out.println("currentResult = " + res);
            }
        }
        return res;
    }
}
