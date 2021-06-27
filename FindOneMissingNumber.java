/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

/**
 *
 * @author Home
 */  // 1 to N
// [ 1,2,3,5,6,7]
public class FindOneMissingNumber {
 static int missingNum(int arr[]){
    int sum=0;
    int n=arr.length+1;
    n=n*(n+1)/2;
    //System.out.println(n);
    
    for(int i=0;i<=arr.length-1;i++){
     
       sum+=arr[i];
        
       
    }

    
 return n-sum;
 }
 // map("1",true)
 //
   public static void main(String[] args) {
      int arr[]={0,1,2}; // sum --> 28-24=4
      // An=a+(n-1)d  --> Sn=a+l
      System.out.println(missingNum(arr));
   }
   
   // n(n+1)/2;
   // 1,2,3,4,5--------n
   
}
