/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Home
 */
public class RepeatedElementMinIndex {

   static int solution(int arr[]) {//O(n^ sqaure)
      for (int i = 0; i < arr.length; i++) {
         int count = 1;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
               count++;
            }
         }
         if (count > 1) {
            return i;
         }
      }
  

      
      
      return -1;
   }
   static int solution2(int arr[]){
   
       int min=Integer.MAX_VALUE;
      Map<Integer, Integer> mp = new HashMap<>(); //  O(n) S-->O(n)
      for (int i = 0; i < arr.length; i++) {
        
         if (mp.get(arr[i]) == null) {
            mp.put(arr[i], i);
         } else {
            
         //   System.out.println(mp.toString());
            if(mp.get(arr[i])<min){
            min=mp.get(arr[i]);
            }

         }

      }
//      System.out.println(mp.toString());

      return min==Integer.MAX_VALUE?-1:min;  
   }

   public static void main(String[] args) {
      int arr[] = {7,3,1,6,8,2,5,8};
     
      
      System.out.println(solution(arr));
      System.out.println("---------------------------------------------");
      System.out.println(solution2(arr));
   }
}
