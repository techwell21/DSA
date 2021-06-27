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
public class LeadersInA_Array {
   //[2,6,2,1,3,2,4]
   // soout(arr[i])
   static void Leaders(int arr[]){ // O(n^2) Space-->O(1)
      
      for(int i=0;i<arr.length;i++){
     
        for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          break;
        }
        else{
        if(j==arr.length-1){
           System.out.println(arr[i]);
        }
        }
        
        }
       
      }
      System.out.println(arr[arr.length-1]);
   }
   static void LeaderOptimized(int arr[]){ // T-->O(n) S--> O(1)
   int L=arr[arr.length-1];
      System.out.println(L);
      for(int i=arr.length-2;i>=0;i--){
      if(arr[i]>L){
         L=arr[i];
         System.out.println(L);
      }
      
      }
   
   }
   public static void main(String[] args) {
      int[] arr={2,6,40,1,3,8,4};
      Leaders(arr);
      System.out.println("--------------------------------------");
      LeaderOptimized(arr);
   }
}
// {2,3,1,5}
// {2,3,1,1,1,2,5}
// arrays or string unlimited questions