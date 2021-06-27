/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Home
 */
public class TargetSumPairCount {
   static int targetsum2(int arr[],int sum){
   int i=0;
   int j=arr.length-1;
   String res="";
   Arrays.sort(arr); //nlogn + n--> n(1+logn)--> O(nlogn)
//   String res=null;
   int count=0;
  while(i<j){
     int currentsum=arr[i]+arr[j];
     if(currentsum<sum){
        i++;
     }else{
        if(currentsum==sum){ //{1,2,4,5,6} tllo
           count++;
           res="["+arr[i]+","+arr[j]+"]";
           System.out.println(res);
           i++;j--;
        }else{
           j--;
        }
     }
  }
   
  return count==0?-1:count; 
   }
   
   static List<String> targetsum(int arr[],int sum){
    
   int i=0;
   int j=arr.length-1;
   List<String> lst=new LinkedList<>();
   String res="";
   Arrays.sort(arr); //nlogn + n--> n(1+logn)--> O(n)
//   String res=null;
   int count=0;
   
  while(i<j){
     int currentsum=arr[i]+arr[j];
     if(currentsum<sum){
        i++;
     }else{
        if(currentsum==sum){ //{1,2,4,5,6}
           count++;
          
           res="["+arr[i]+","+arr[j]+"]";
           
     
           lst.add(res);
      
           i++;j--;
        }else{
           j--;
        }
     }
     
  }
   
  return  lst; 
   }
   
   public static void main(String[] args) {
      int arr[]={5,6,3,1,2,1};
    int arr2[]={4,2,1,3,6}; //


// k-->2
   //   System.out.println("Total number of pairs:"+targetsum2(arr, 7));  
      System.out.println("list wala target sum "+targetsum(arr, 8).toString());
     
   }
}
// practice test 45min
// arr={2,3,5,6,23,-1,1,6,-3}; // hint: sort 