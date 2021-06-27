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
import java.util.*;
public class KthElmentFrequency {
   static int freq(int arr[],int k){
      List<Integer> lst=new ArrayList<>();
      for(int i:arr){
      lst.add(i);
      }
      
     // System.out.println(Collections.frequency(lst,k));
   int freq=Collections.frequency(lst,k);
  
   
   
   
   return freq==0?-1:freq;
   }
   public static void main(String[] args) {
      int arr[]={2,2,3,3,3,3,1,2,7};
      System.out.println(freq(arr, 8));
   }
}
