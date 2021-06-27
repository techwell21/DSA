/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Home
 */

//{   }
public class TargetSumUsingSet {
   // arr ---> [3,5,8,9,1]
   static int targetsum(int arr[],int sum){
   Set<Integer> set=new HashSet<>();  // {}--> set {3,5,2,9}
   int count=0;
   for(int i=0;i<arr.length;i++){
   // 10  -3 =7
   // 10 -5 =5
      // 10-8=2
      //10-9=1
      // 10-1=9
      if(set.contains(sum-arr[i])){
         count++;
         System.out.println("{"+(sum-arr[i])+":"+arr[i]+"}");
      }
      else{
      set.add(arr[i]);
      
      }
   }
    //  System.out.println("contains "+count);
   return count==0?-1:count;
   }
   public static void main(String[] args) {
     int arr[]={3,5,8,9,15,7};// k--2
      System.out.println("TSUM through SET -->"+targetsum(arr, 10));
      
      
      // [4,8,7,6,2,1] O(n^2)
      // L-8,7,2,6,1 O(n) S--O(1)
      
      
   }
}
