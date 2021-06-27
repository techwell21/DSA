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
public class prime {
   static boolean prime1(int n){
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
      //2,3,5,7,11,13,17,19,23
      int pcount=0;
      int k=1;
      for(int i=2;i<1000000;i++){
         if(prime1(i)){
            System.out.println((k++)+" th p_number is "+i);
            pcount++;
         }
         if(pcount==n){
            return i;
         }
      }
      
      return n<0?-1:1;
   }
   public static void main(String[] args) {
    
      System.out.println(prime2(1000));
   }
}
