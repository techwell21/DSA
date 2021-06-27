/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Home
 */
// Find the pair whose product is maximum
// {2,3,10,5}
// pair with max sum is {10,5}--> 50
public class MaxProductPair {
   static int maxProduct(int[] arr){ // O(n^2), space--> O(1)
      //int [] product ;
     int max=Integer.MIN_VALUE; // we take the minimum value possible as we want to find the maximum value
   //  {3,7,4,1,6,-1}
     // in first iteration 3*7=21.. 21 > Integer.MIN_VALUE(-2147483648)  so update max to 21;
      for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j<arr.length;j++){
        if(arr[i]*arr[j]>max){
        max=arr[i]*arr[j];
        }
         }
      }
     
     return max;
   }
   static int maxProduct_optimized(int arr[]){ // bnaaaoo
// glt h kese?????? ab dekho
     // {3,-7,4,1,-6,-1}
      // sorted array -->{-7,-6,-1,1,3,4} // kewal isko dekho gud :) krooo
      // dimag lgaaaooooo isme kuch kro sorting approach m
      Arrays.sort(arr);
   // dono ko gor s dekho
      // chlo sochliya bahut tym hogya is question m wese bhi
      // phli 2 
      // and akhri 2 , kewal y dohi daaweddaaar h max product laani ki hnaa?? or koi laaksta h????
    return Math.max(arr[0]*arr[1],arr[arr.length-1]*arr[arr.length-2]); // jobhi max hoga wo dedo
   }
   
    static int minProduct(int[] arr){
      //int [] product ;
     int min=Integer.MAX_VALUE; // we take the max value possible as we want to find the minimum value
   //  {3,7,4,1,6,3}
     // in first iteration 3*7=21.. 21 > Integer.Max_VALUE(2147483648)  so update min to 21;
      for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j<arr.length;j++){
        if(arr[i]*arr[j]<min){
        min=arr[i]*arr[j];
        }
         }
      }
     
     return min;
   }
    static int maxElement(int arr[]){ 
       // niiiIIIAiririiaiyiiiiiiiiiiiiiiiiii kitni baar smjhaauuuuuuuuuu
       // sort mtlb nlogn
       // max element to O(n) m aaajaega
       int i=0;
       int max=arr[i]; // thk h gud :) // even p factorial and odd p fobo/prime bnaaooo bngyaaa tha.. are mne to sb hi bnaya  h tmne bnaya kch ??
       while(i<arr.length){
          if(arr[i]>max){
             max=arr[i];
          }
          i++;
       }
       return max;
    }
    // O(n^2) s nlogn lee aaee or better krskte h kya????
    // haaa krskte h O(n) acha h nlogn sto hnaa??
    //Note : General complexities in decreasing order O(2^n)>O(n^3)>O(n^2)>O(nlogn)>O(n)>O(1){constant}
    // m y ni bolra ki kewal yahi complexities hoti h for eg. (n^2logn) bhi kuch hoti jii haaaan
   // O(n) m bahut dimag lgega :) thk h to rhne do: kyuki O(nlogn) chl jaega pure tc pass hojaenge
    // O(n) to f2f m puchte h
   public static void main(String[] args) {
      int [] arr={-2,-4,-6,-1,-5,11,-8,8,6}; // thk h  max product will be -7*-6=42 // or chlalo 2-3 test case mnn ki santusti k liye ... are ni bendi   mtlb taaki yaad rhe isliye
      System.out.println("Max product in an array "+maxProduct(arr)); // 7*6 =42
      System.out.println("---------------------");
       System.out.println("Min product in an array "+minProduct(arr)); //-1*7 =-7
        System.out.println("---------------------");
       System.out.println("Max product in an array "+maxProduct_optimized(arr)); // sorting approach is giving 12 wtf is this ?????? why???? boolo
       System.out.println("maximum element in array is: "+maxElement(arr));
   }
}
//Aaaaj bhi kachu ni bna tmse :) bendi max element nikaalk btao array ka isime