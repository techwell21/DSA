/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Home
 */
public class CountPairsForGivenMultiplication {

   static String targetMultiply(int arr[], int target) { //first approach (Brute Force / Naive Approach)
      //{1,2,4,8,3,5}
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] * arr[j] == target) {
               count++;
                 System.out.println("[" +arr[i] + " : " + arr[j] + "]");
            }
         }
      }
       return count == 0 ? "No Pair" : "Pair count is "+count;
   }
//   static boolean targetMultiply2(int arr[],int target){ //second approach
//      int i=0;
//      int j=arr.length-1;
//     int  currentMultiply = 1;
//     Arrays.sort(arr);
//      while(i<j){
//     currentMultiply = arr[i]*arr[j];
//      if(currentMultiply<target){
//            i++;
//         }else
//            if(currentMultiply==target){
//               return true;}else{
//               j--;
//            }
//      }
//      return false;
//   }

   static String Multiply2(int arr[], int target) {
      HashSet<Integer> hs = new HashSet<>(); // hs->{1,2,3}
      int count = 0;
  // {1,2,3,4} t-->6
      for (int i = 0; i < arr.length; i++) {
         if (hs.contains(target / arr[i]) && target % arr[i] == 0) {
            count++;
            System.out.println("[" + target / arr[i] + " : " + arr[i] + "]");

         }
         hs.add(arr[i]);

      }
      return count == 0 ? "No Pair" : "Pair count is "+count;
   }

   public static void main(String[] args) {
      int arr[] = {1,2,3,4};
      // {  -5,-3,-1,2,-4 }
      System.out.println(targetMultiply(arr, 6));
      System.out.println("-----------------------------");
      System.out.println(targetMultiply(arr, 6));

   }
}
// kro
