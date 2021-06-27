
package Nidhi_Practice;

import java.util.Arrays;

public class RightRotationByK {
  // [1,2,3,4,8] ---> [8,1,2,3,4]
  static int [] rightRotation(int arr[]){
    int temp=arr[arr.length-1];
  
      for (int i = arr.length-2; i >= 0; i--) {
         
       
       
      arr[i+1]=arr[i];
    
    }
      
      arr[0] = temp;   
    return arr;
  }
    static int[] rightRotationByK(int arr[],int k){
      for(int i=0;i<k;i++){  // O(n*k)
        rightRotation(arr);
      
      }
   return arr;
   }
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int k=3;
    //System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(rightRotationByK(arr,k)));
  }
}
