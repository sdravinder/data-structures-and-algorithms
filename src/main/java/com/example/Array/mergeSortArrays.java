 /*
    Merge two sorted lists (in-place)
    You are given two sorted linked lists. You have to merge them to produce a combined
    sorted linked list. You need to return the head of the final linked list.

    Note:
    The given linked lists may or may not be null.
    For example:
    If the first list is: 1 -> 4 -> 5 -> NULL and the second list is: 2 -> 3 -> 5 -> NULL The final list would
    be: 1 -> 2 -> 3 -> 4 -> 5 -> 5 -> NULL
    Input Format:
    The first line of input contains an integer 'T' representing the number of test cases or
    queries to be processed. Then the test case follows. The first line of each test case
    contains the elements of the first linked list separated by a single space and terminated
    by -1. Hence, -1 would never be a list element. The second line of each test case contains
    the elements of the second linked list separated by a single space and terminated by -1.

    Output Format:
    For each test case, print the final linked list. The elements of the linked list must be
    separated by a single space and terminated by -1. Print output of each test case in a
     separate line.

    Note:
    You are not required to print the expected output, it has already been taken care of.
    Just implement the function.

   Constraints:
    1 <= T <= 10 1 <= L <= 10^5 1 ≤ data ≤ 10^6 and data != -1 Where L is the number of nodes in either of the two Linked List. Time Limit: 1 sec

   Follow-up:
   Try to solve this problem in linear time complexity and constant space complexity.
   */
 package com.example.Array;

 public class mergeSortArrays {

     public static void main(String[] args) {
//         int[] arr1 = new int[5];
//         int[] arr2 = new int[5];
//         Scanner sc=new Scanner(System.in);
//
//         System.out.println("Enter the elements of the array 1: ");
//         for(int i=0; i<n; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         System.out.println("Enter the elements of the array 2: ");
//         for(int i=0; i<n; i++){
//             arr2[i]=sc.nextInt();
//             }
         int [] arr1 = {2, 5, 7, 8, 10};
         int [] arr2 = {1, 4, 8, 11, 15};
         int [] arr3 = mergeArrays(arr1, arr2);

         for(int i =0;i<arr3.length;i++){
             System.out.print(" " + arr3[i]);
         }

     }

     public static int[] mergeArrays(int[] arr_1, int[] arr_2) {
         int[] sortedMergeArray = new int[arr_1.length + arr_2.length];
         int i = 0 , j = 0, k = 0;

         while (i < arr_1.length || j < arr_2.length) {
             if (i < arr_1.length && (j >= arr_2.length || arr_1[i] <= arr_2[j])) {
                 sortedMergeArray[k++] = arr_1[i++];
             } else if (j < arr_2.length) {
                 sortedMergeArray[k++] = arr_2[j++];
             }
         }
         return sortedMergeArray;
     }


         /*
         while (i < arr_1.length) {
             sortedMergeArray[k] = arr_1[i];
             i++;
             k++;
         }

         while (j < arr_2.length) {
             sortedMergeArray[k] = arr_2[j];
             j++;
             k++;
         }
        */


}
