/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.math.BigInteger;

/**
 *
 * @author Home
 */
public class Even_Factorial_odd_prime {
   static long factorial(int n){
      long fact=1;
     
     
      for(int i=1;i<=n;i++){
         fact=fact*i;
      }
      return fact;
   }
   static boolean prime(int n){
      if(n==2){
         return true;
      }
      if(n%2==0){
         return false;
      }
      for(int i=3;i<Math.sqrt(n);i=i+2){
         if(n%i==0){
            return false;
         }
      }
      return true;
   }
   static int prime2(int n){
      int pcount=0;
   
      for(int i=2;i<10000;i++){
         if(prime(i)){
            pcount++;
         }
         if(pcount == n){
            return i;
         }
      
   }
      return 0;
   }
   public static void main(String[] args) {
      int fac=1,prime=1;
      int n=11;
      int num=362880;
      for(int i=1;i<30;i++){
         if(i%2==0){
            System.out.print(" "+factorial(fac));
            
          
            fac++;
         }else{
            // n=5
            System.out.print(" "+prime2(prime));
            
            prime++; // kroo
         }
      }
      System.out.println("-------------------------------");
      if(n%2==0){
         System.out.println(factorial(n/2));;
      }
      else{
         System.out.println(prime2((n/2)+1));
      }
            System.out.println("-------------------------------");

      if(num%2==0){
         for(int i=1;i<1000;i++){
          
            if(factorial(i)==num){
               System.out.println(num+" is "+(i*2)+"th of the given series");
            }
         }
      }
      else{
      // home work(for num%2!=0 i.e prime)
      }
     
      
   }
   // 7/2 +1 : 4 
   // 4/2 =2
}
