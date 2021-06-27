/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;
import java.util.Arrays;
public class ArrayReverse {
   // arr{1,2,3,4} sout(1,2,3,4)-->fn-->arr{4,3,2,1} sout(4,3,2,1)
   static int[] arrayRev(int [] arr){
      int j=0;
      int res[]=new int[arr.length];
      for (int i = arr.length-1 ; i >= 0 ; i--) {
        res[j++]=arr[i]; }
      return arr=res;
   }
   public static void main(String[] args) {
      int arr[]={1,2,3,4};
      
      System.out.println(Arrays.toString(arrayRev(arr)));
 
   }
   // String s="Prinshu"
}
