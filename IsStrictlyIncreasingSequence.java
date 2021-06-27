//
package Nidhi_Practice;

public class IsStrictlyIncreasingSequence {

   static boolean isStrictly(int arr[]) {
       boolean result=true;
       
       for(int i=0;i<arr.length-1;i++){
       
       if(arr[i]>=arr[i+1]){
       result=false;
       break;
       }
       }
       
       return result;
   }

   public static void main(String[] args) {
      int arr[] = {0,1,4, 5, 6};
      System.out.println(isStrictly(arr));
 
   }

}
