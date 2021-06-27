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
public class FindMultipleMissingandDuplicate {
   static void findmissingandDuplicate(int arr[]){
   Map<Integer,Boolean> mp=new HashMap<>();
   for(int i:arr){
   if(mp.get(i)==null){
   mp.put(i,true);
   }
   else{
      System.out.println("Duplicate number "+i);
   }
   }
   for(int i=1;i<=arr.length;i++){
   if(mp.get(i)==null){
      System.out.println("Missing number is "+i);
   }
   
   }
   }
   public static void main(String[] args) {
      int arr[]={1,6,3,2,5,7,3,4,9,9};
      
      findmissingandDuplicate(arr);
   }
}
