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
public class Conversion {

   // Binary-->,Octal-->  Decimal
   // 101-->5
   static int Binary_Decimal(String bnum) {
      int dnum = 0;
      int k = 0;
      for (int i = bnum.length() - 1; i >= 0; i--) {
         dnum = dnum + (int) Math.pow(2, k) * Integer.parseInt(Character.toString(bnum.charAt(i)));
// If Octal replace '2' with '8'. 
         k++;
    
      }

      return dnum;
   }
// 

   public static void main(String[] args) {
        System.out.println(Binary_Decimal("1100"));
      String value = "2";
      System.out.println(Integer.parseInt("1100", 2)); //for hexadecimal
      String binary = Integer.toBinaryString(5);
    String hex=  Integer.toHexString(16);
      System.out.println(binary);
      System.out.println(hex);
   }
}
