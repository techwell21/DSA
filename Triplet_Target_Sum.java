/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.Arrays;

/**
 *
 * @author Home
 */
public class Triplet_Target_Sum {
   // [2,5,2,4,7,6,4] targetsum-->13
   // [2,0,4,4,5,6,7]

   static int TripletSum(int arr[], int sum) { // TimeComplexity--> O(n^2) space complexity--> O(1)
      Arrays.sort(arr); // nlogn+nsquare --> n^2 TC
      int count = 0;
      String res = "";
      for (int i = 0; i < arr.length; i++) {
         int start = i + 1;
         int end = arr.length - 1;
         while (start < end) {

            int currentsum = arr[i] + arr[start] + arr[end];
            if (currentsum < sum) {
               start++;
            } else {
               if (currentsum == sum) {
                  res = "{" + arr[i] + " : " + arr[start] + " : " + arr[end] + "}";
                  System.out.println(res);
                  start++;
                  end--;
                  count++;
               } else {
                  end--;
               }
            }
         }
      }
      return count == 0 ? -1 : count;
   }

   public static void main(String[] args) {
      int arr[] = {2, 5, 0, 4, 7, 6, 4};
      System.out.println(TripletSum(arr, 13));
   }
}
