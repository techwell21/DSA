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
public class Fabonicci {
   //First Method
  static int fabo_recursion(int n){ // TimeComplexity ---> exponential O(2^n); space--> O(1) 
      // base condition
   if(n==0 || n==1){
   return n;
   }
   // main logic
   return fabo_recursion(n-2)+fabo_recursion(n-1);
   
   }
  // recursion with optimization is DP
  static long fabo_resursion_dp(int n){ // Top down Dp ..--// TimeComplexity ---> O(n); space--> O(n) 
 
  if(n==0 || n==1){
  return n;
  }
   long t[]=new long[n+2];
  t[0]=0;
  t[1]=1;
  for(int i=2;i<=n;i++){
  t[i]=t[i-1]+t[i-2];
  }
  return t[n];
  }
  static int fabo_space_Optimized(int n){ // TimeComplexity --->  O(n); space--> O(1) 
     if(n==0 || n==1){
  return n;
  }
     int a=0,b=1,c;
     for(int i=2;i<=n;i++){
     c=a+b;
     b=c; // a=b; b=c; // Home Work // are y homework h .... baaki dekho isko chodk ...haan
     c=a;
     }
  return b;
  }
  static int fabo_formula(int n){ // TimeComplexity --->  O(1); space--> O(1) 
     /* Formula ------> f(n)={{[1+root(5)]/2}^n/root(5)}   */
    double first=(1+Math.sqrt(5))/2;
    return  (int)Math.round(Math.pow(first,n)/Math.sqrt(5)); // Cake walk(easy as hell :))
  } // go through it
   public static void main(String[] args) {
//      int i=0;
//      for(i=0;i<11;i++){ // 0--> 29 
//         System.out.println("my i is"+i);
//         System.out.println("-----------");
//         System.out.print(" "+fabo_recursion(i));
//      double first=(1+Math.sqrt(5))/2;
     //return (int)Math.round(Math.pow(first,n)/first.sqrt(5));
//      }
//      System.out.println("----------------");
//      System.out.println("total numbers in a series"+i);
//      System.out.println("---------------------------------");
      System.out.println(Integer.MAX_VALUE);
  //    System.out.println("dp fabo "+fabo_resursion_dp(10));
      System.out.println("fabo with formula "+fabo_formula(10));
      System.out.println("--------------------------------------");
      for(int i=0;i<=20;i++){
         System.out.print(" "+fabo_formula(i)); 
      }
      
   }
}
