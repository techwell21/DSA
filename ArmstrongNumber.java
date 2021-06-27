/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

public class ArmstrongNumber {

  

   static boolean isArmStrong(int num) {
      int sum = 0;
      int temp=num;
      while (num != 0) {
         int rem = num % 10;
         sum = sum + rem * rem * rem;
         num = num / 10;

      }
      return sum==temp?true:false;
   }

   public static void main(String[] args) {
      int num = 153; // 1^3+5^3+3^3=153
      System.out.println(isArmStrong(2));
      
   }
}
