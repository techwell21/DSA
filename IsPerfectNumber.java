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
public class IsPerfectNumber {
   static boolean isPerfect(int n){
      int sum=0,num=n;
      for(int i=1;i<=n/2;i++){
         if(n%i==0 ){
           sum=sum+ i;
         }
      }
    return  sum==n?true:false;
   }
   public static void main(String[] args) {
      int n=496;
      System.out.println(isPerfect(n));
   }
}
