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
public class Sum {
   static int sum(int a,int b){
      return a+b;
   }
   static boolean isKeyword(String s){// break, case, continue, default, defer else, for, func, goto, if, return, struct
      if(s.equals("break") || s=="case" || s=="continue"|| s=="default"|| s=="defer"|| s=="else"|| s=="for"|| s=="func"|| s=="goto"|| s=="if"|| s=="return"|| s=="struct" || s=="type"){
         return true;
      
   }
      return false;
   }
   // == is bad approach always use .equals() for value based comparison baarbaad ho tm
   static boolean prime(int n){
      if(n==2){
         return true;
      } // sum bola h 
      if(n%2==0){
         return false;
      }
      for(int i=3;i<=Math.sqrt(n);i=i+2){ // ji haan /// chlo koi ni sum kro
         if(n%i==0){
            return false;
         }
      }
      return true;
   }
   static int  primenum(int k,int j){
      int sum=0;
      for(int i=k;i<=j;i++){
         if(prime(i)){
            System.out.println(i);
        sum=sum+i;
         }
      }
      return sum;
   }
   static boolean isArmStrong(int n){
     int k=n; int num=0;
     while(n!=0){
        int rem=n%10;
        n=n/10;
        num=num+(rem*rem*rem);
     }
   if(k==num){
      return true;
   }else{
      return false;
   }
   }
   static void armStrongRange(int p,int n){
      for(int i=p;i<=n;i++){
         if(isArmStrong(i)){
            System.out.println(i);
         }
      }
   }
   static int fab(int n){
      if(n==0 || n==1){
         return n;
      }
      return fab(n-1)+fab(n-2);
      
   }
   static void fabnum(int n,int k){
      for(int i=n;i<=k;i++){
         System.out.println(fab(i));
      }
   }
   public static void main(String[] args) {
//      int a=9;int b=3;
//      String str="type";
////      
//     System.out.println(prime(19));
//      System.out.println(primenum(1, 20)); // 1 and 9 are not prime
//      System.out.println( isArmStrong(153));
    //  armStrongRange(1, 200);
      System.out.println(fab(5));
      fabnum(7,60);
      // tm kaa krrii????
   }
}
