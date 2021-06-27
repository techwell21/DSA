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
public class DigitSum {

   static int DigitSum(int n) {
      int sum = 0;
      while (n > 0) {
         int r = n % 10;
         sum = sum + r;
         n = n / 10;
      }

      if (sum < 10) {

         return sum;
      } else {
      return   DigitSum(sum);
      }
      
   }

   public static void main(String[] args) {
      System.out.println(DigitSum(9875));
   }
}
