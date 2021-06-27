/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

/**
 *
 * @author shnid
 */
public class LongestSubArray {
  static int longestArray(int[] a){
    int count=1;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if(a[j]==a[j++]-1 || a[j]==a[j++]+1){
          count++;
        }
      }
    }
   return count; 
  }
  public static void main(String[] args) {
    int[] a={0,1,2,1,2,3};
    System.out.println(longestArray(a));
  }
}
