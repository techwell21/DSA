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
public class FirstNonRepeating {

   static char solution(String str) {
      //prip
      for (int i = 0; i < str.length(); i++) {
         int count = 0;
         for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
               count = count + 1;
               break;
            }
         }
         if (count == 0  || str.length()==1) {
            return str.charAt(i);
         }

      }
      return 'X';
   }

   public static void main(String[] args) {
      String str = "prinsphu";
      String str1 = "nidhi";
      String str2 = "goswami";
      String str3 = "nayan";
      String a = "aaab";
      System.out.println(solution(a));
   }
}
