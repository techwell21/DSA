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
public class PrimeNumber {
 
   static boolean Prime(int n){ // T--> O(n) S--> O(1);
     // root(10) 
      int factors=0;
      if(n==2){  // 2 is smallest prime number
      return true;
      }
      if(n%2==0){  // multiples of 2  // nice solution :)
      return false;
      }
      for(int i=3;i<=Math.sqrt(n);i=i+2){
      if(n%i==0){
         // n/2
         //       10 10/2--> 5
         // 15 --> 3 3 -->4<---7
    return false;
      }
      }
      
      return true;
      
   }
   static int NthPrime(int n){
      int pcount=0,num=0;
   for(int i=2;i<=1000;i++){
      if(Prime(i)){ // if(true/false) --> java /// if(0/1)--> C/Cpp (for knowledge purpose :))
       //  System.out.print(" "+i);
         pcount++; // 1 
      }
      if(pcount==n){
      return i;
      }
   }
   
   return num!=0?num:-1;
   }
   
   public static void main(String[] args) {
    //  System.out.println(Integer.MAX_VALUE);
     // System.out.println(Prime(21));
//      System.out.println("-----------------");
//      
//      System.out.println(" "+NthPrime(50));
//      
//      
//      for(int i=1;i<=50;i++){
//      
//         System.out.println(NthPrime(i));
      System.out.println(NthPrime(12));
      }
   }

