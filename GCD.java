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
public class GCD {

   static int gcd(int m, int n) {
      while (m != n) {
         if (m > n) {
            m = m - n;
         } else {
            n = n - m;
         }
         
      }
      return n;
   }

   public static void main(String[] args) {
      int x = 2;
      int y = 12;
      System.out.println(gcd(x, y));
   }
}
