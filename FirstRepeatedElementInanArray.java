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
public class FirstRepeatedElementInanArray {

   static int firstRepeatedElement(int arr[]) {
//      int count=0;
//      for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;i++){
//            if (arr[i]==arr[j]){
//             return arr[i];
//            }
//         }
//      }
 int i = arr[0];
  int       j = arr[i + 1];
      while (j < arr.length) {
        
         if (i == j) {

            return i;
         } else {
            i--;
         }
      }
      return arr[i];
   }

   public static void main(String[] args) {
      int arr[] = {1,   6, 1};
      System.out.println(firstRepeatedElement(arr));
   }
}
// {1,3,6,3,1}
