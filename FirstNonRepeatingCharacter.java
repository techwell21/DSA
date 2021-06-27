/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Home
 */
// Q1. Find first non repeating character..
// Q2. Find the freq of each char in a string..
// String s="poppy";
// String s1="prinshu";
public class FirstNonRepeatingCharacter {

   static String first(String s) { // O(n^2) O(1);

      for (int i = 0; i < s.length(); i++) {
         boolean res = false;
         for (int j = 0; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j) && i != j) {
               res = true;
            }
         }
         if (!res) {
            return "" + s.charAt(i);
         }
      }
      return "No non-repeating Char";
   }

   static String first_optimized(String s) { //--> O(n), Space --> O(n)
      HashMap<Character, Integer> hs = new HashMap<>();
     
     // s="prinshup";
      // {p:1,r:1,i:1,n:1,s:1,h:1,u:1}
   
      for (int i = 0; i < s.length(); i++) {
         if (hs.containsKey(s.charAt(i))==false) {
            
            hs.put(s.charAt(i), 1);
         } else {
            int freq = hs.get(s.charAt(i));
            freq = freq + 1;
            hs.replace(s.charAt(i), freq); //update O(1) // arrraaaam kro fil dddaaaaooo ache s
         }
   
      }
      System.out.println(hs.toString()); 
      for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(hs.get(c)==1){
      return ""+c;
      }
      }
      
      return "No non-repeating Char";
   }

   public static void main(String[] args) {
      String x = "prinshup";
      String y = "aaa";

  //    System.out.println("First non repeating char in " + x + "--> " + first(y));
      System.out.println(""+first_optimized(x));
   }
}
// "prinpshu"
// 
