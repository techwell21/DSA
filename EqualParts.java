/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

/**
 *
 * @author Home
 */
public class EqualParts {
   static int division_point(int arr[]){
      int sum=0,currentsum=0;
      // {5,1,5}
      for(int i=0;i<arr.length;i++){ //time complexity --> O(n) Space Complexity --> O(1)
      sum+=arr[i];
      }
      // 11
      for(int i=0;i<arr.length;i++){
      
         sum=sum-arr[i]; // 6-1=5
         if(sum==currentsum){
         return i;
         }
         currentsum=currentsum+arr[i]; // 5
         
      }
      
      
      
   return -1;
   }
   public static void main(String[] args) {
      int arr[]={5,1,5};
      int arr2[]={2,3,3,5,6,2,1};
      System.out.println(division_point(arr2));
   }
}
