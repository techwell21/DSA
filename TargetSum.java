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
public class TargetSum {
   static boolean targetsum(int arr[],int sum){
   
      for(int i=0;i<arr.length;i++){// -->n
      
      for(int j=i+1;j<arr.length;j++){ //{1,3,5,4,6,8} // -->n
      if(arr[i]+arr[j]==sum ){
      return true;
      }
      
      }
      
      }
   return false;
   }  // T-->O(n^2) S-->O(1)
   
  static boolean targetsum2(int arr[],int sum){ // second approach O(n)  S-->O(1)
    // {1,3,4,5,6,8}
     int i=0;
     int j=arr.length-1;
     Arrays.sort(arr);// -->//nlogn 
     String res="";
     while(i<j){
     int currentsum=arr[i]+arr[j];// [0,5]
     if(currentsum<sum){
     i++;
     }
     else{
     if(currentsum==sum){
       res="["+i+","+j+"]";
        System.out.println(res);
     return true;
     }
     else{
     j--;
     }
     
     }
     }
     return false;
  }
   
   
   public static void main(String[] args) {
      int arr[]={1,3,5,4,6,8};
 //     System.out.println("target sum is present/not res O(n^2)-->"+targetsum(arr, 99));
    //  System.out.println("target sum2 is present/not res O(n)-->"+targetsum2(arr, 9));
      System.out.println(targetsum2(arr, 9));
   }
}
