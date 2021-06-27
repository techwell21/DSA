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
public class CamelCase {
   static int camelCase(String str){
    int count=1;
    char ch = 0;
      for(int i=0;i<str.length()-1;i++){
        if(Character.isUpperCase(str.charAt(i))){
           count++;}
      }
      return count;
   }
   public static void main(String[] args) {
      String str="saveChangesInTheEditor";
      System.out.println(camelCase(str));
   }
}
