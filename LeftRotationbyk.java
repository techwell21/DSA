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
// left rotation (2)
     // [1,5,2,6,9] --> [5,2,6,9,1] -->[2,6,9,1,5]
public class LeftRotationbyk {
//   static int[] leftRotate(int arr[]){
//      for (int i = 1; i < arr.length; i++) {
//          for (int j = arr.length ; j <0; j--) {
//            arr[j]=arr[i];
//            
//         }
//      }
//      
//   return arr;
//   }
   static int[] leftRotate(int arr[]){
       // [1,5,2,6,9] --> [9,1,5,2,6] 
      int temp=arr[0];
      int i=0;
      for( i=1;i<arr.length;i++){
      arr[i-1]=arr[i];
      
      }
      System.out.println(i);
      arr[i-1]=temp;
      
      return arr;
   }
   static int[] leftrotatebyk(int arr[],int k){
      for(int i=0;i<k;i++){  // O(n*k)
        leftRotate(arr);
      
      }
   return arr;
   }
   
   
   public static void main(String[] args) {
     int[] arr={1,5,2,6,9};
   //   System.out.println(Arrays.toString(leftRotate(arr)));
      System.out.println(Arrays.toString(leftrotatebyk(arr, 2)));
   }
}
