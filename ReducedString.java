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
public class ReducedString {
   static String redString(String str){
      //aaabccddd → abccddd → abddd → abd
      // hint : use substring method
      int count=str.length()-1;
      for(int i=0;i<str.length();i++){
         if(str.charAt(i)==str.charAt(i+1)){
       str=  str.substring(i+2 ,count);
          str=str.substring(i+2);
         }
      }
      return str;
   }
   public static void main(String[] args) {
      String str;
      str = "aaabccddd";
      System.out.println(redString(str));
   }
}
