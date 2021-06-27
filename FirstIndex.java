/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//this program will return the index of 
package Nidhi_Practice;
import java.util.*;
// 1,3,2,3,1;



 class FirstIndex {
  static int firstIndex(int[] arr){
    Arrays.sort(arr); // order matters....
    int i,num=0;
    for ( i = 0; i < arr.length-1; i++) {
      if(arr[i] == arr[i+1]){
       num=i;
     
      }
    }
    // 
    return num==0?-1:num;
  }
  public static void main(String[] args) {
    
    //System.out.println(firstIndex(arr));
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[] =new int[a];
    for (int i = 0; i < a; i++) {
     arr[i] = sc.nextInt();
    }
    System.out.println(firstIndex(arr));
  }
 
}