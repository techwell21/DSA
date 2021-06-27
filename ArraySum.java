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
public class ArraySum {
   static int arr[]={1,5,2,4,6}; // 99 O(n^2) 
   static int sum(int arr[]){
   int sum=0;
   for(int i=0;i<arr.length;i++){
   
   sum=sum+arr[i];
   }
   
   return sum;
   }
   static int search(int element){
   int count=0;
   for(int i:arr){
      count++; // 1,2,3,4
   if(i==element){ // i--> arr[i]  i--?????  
   return count++;
   }
   }
  
   return -1;
   }
   static int evenSum(int arr[]){
   int evensum=0;
   
   for(int i=0;i<arr.length;i++){
   if(arr[i]%2==0){
   evensum+=arr[i];  // sum=sum+arr[i];  {2,5,6,1}  --> 0+2.. sum =2+6=8 ans
   }
   
   }
   
   
   return evensum;
   }
   // odd sum HW
   static int oddSum(int arr[]){
      int oddsum=0;
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2 != 0){
           oddsum+=arr[i];
        } 
      }
      return oddsum;
   }
   static int firstEven(int arr[]){
      int even=0,count=0;
      for (int j = 0; j < arr.length; j++) {
    
         if(arr[j]%2==0){
            return j ;
         }
      }
      return -1;
   }
 static long fact(int n){ /*   5*fact(4)     */
  if(n==0)
     return 1;
  
  return n*fact(n-1);
  }
 static long fabo(int n){
 if(n==0 || n==1) 
    return 1;
 return fabo(n-1)+fabo(n-2); 
 }
 // 120 --> 21
   
   public static void main(String[] args) {
      
      System.out.println(sum(arr));
      System.out.println("index of 4 is "+search(10));
      System.out.println("even sum of our array is "+evenSum(arr));
      System.out.println("odd sum is "+oddSum(arr));
      System.out.println("first even element "+firstEven(arr));
      // target sum
      System.out.println(fact(40));
      System.out.println();
    
   }
}
