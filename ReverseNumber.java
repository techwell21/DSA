/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.Stack;

/**
 *
 * @author Home
 */
public class ReverseNumber {

   static int rev(int n) {
      int newnumber = n;
      int reverse = 0;
      while (n != 0) {
         int rem = n % 10; //rem--->3
         n = n / 10;// n-->12
         reverse = reverse * 10 + rem;
      }

      if (reverse == newnumber) {
         System.out.println("palindrome number");
      } else {
         System.out.println("Not palindrome");
      }
      return reverse;
   }

   static String str_rev(String str) {
      String s = "";

      for (int i = str.length() - 1; i >= 0; i--) {

         s = s + Character.toString(str.charAt(i));
      }
      Stack<Character> stack=new Stack<>();
      for (int i = 0; i < str.length(); i++) {
         stack.push(s.charAt(i));
      }
      int size=stack.size();
      for (int i = 0; i < size; i++) {
         System.out.print(stack.pop());
      }
      System.out.println("");
      return str = s;
   }

   static boolean Ispal(String s) {// --> O(n/2) -->O(n)  
      int i = 0;
      int j = s.length() - 1;
      while (i < j) {   // n i t i n , p r i n s h u
         if (s.charAt(i) != s.charAt(j)) {
            return false;
         }
         i++;
         j--;
      }
      return true;
   }

   static boolean Ispal2(String s) { // --> O(n)
      if (str_rev(s).equals(s)) { // KMP algorith O(n)
         return true;
      }
      return false;

   }

   public static void main(String[] args) {
      int n = 121;
      System.out.println(rev(n));
      String str = "prinshu";
      String str2 = "nayan";
      String str3 = "nitin";
      System.out.println(str_rev(str));
      System.out.println("--------------------");
    //  System.out.println(Ispal(str));
     // System.out.println("--------------------Break---- line----");
    //  System.out.println(Ispal2(str3));
   }
}
// Homework....
// 1. Remove vowels from A string
// 2. Replace vowels with $ and consonants with *
// 3. make vowels uppercase and consolnants to lower case;
// 4.. make lowercase char to uppercase and uppercase to lower case :eg:--> AbcD--> aBCd
// try them ni aaega to we will discuss this tommorrow