/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.StackCode;
import java.util.*;

/**
 *
 * @author shnid
 */
public class NextSmallerInLeft {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int[] arr=new int[len];
    for(int i=0;i<len;i++){
      arr[i]=sc.nextInt();
    }
    int[] res=new int[arr.length];
   Stack<Integer> st=new Stack<>();
   for(int j=0;j<arr.length;j++){
     
     while(st.size()>0 && st.peek()>=arr[j]){ 
       st.pop();
   }
     if(st.size()==0) res[j]=-1;
     else{
       res[j]=st.peek();
     }
     st.push(arr[j]);
  }
   for(int k=0;k<arr.length;k++){
     System.out.println(res[k]);
             
   }
       
}
}