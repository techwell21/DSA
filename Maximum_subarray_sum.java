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
public class Maximum_subarray_sum {

   static int maxSubArray(int arr[]) {
      int current_sum = arr[0];
      int max_sum_so_far = arr[0];
      for (int i = 0; i < arr.length; i++) {
        current_sum=Math.max(current_sum+arr[i],arr[i]);
        max_sum_so_far=Math.max(current_sum,max_sum_so_far);
      }

      return max_sum_so_far;
   }

   public static void main(String[] args) {
      int arr[] = {1,-3,1,-5,8,-1};
      System.out.println(maxSubArray(arr));
   }
}
//{-2,-3,-1,1,-4}
//{5,1,5}--> 11-5=6
