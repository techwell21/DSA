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
public class NextGreaterElementOnRight {
  static int[] greaterElement(int[] arr){
    int[] nge=new int[arr.length];
    Stack<Integer> st=new Stack<>();
    st.push(arr[arr.length-1]);
    nge[arr.length-1]=-1;
    for(int i=arr.length-2;i>=0;i--){
      while(st.size()>0 && arr[i]>=st.peek()){
        st.pop();
      }
      if(st.size()==0){
        nge[i]=-1;
      }else{
        nge[i]=st.peek();
      }
      st.push(arr[i]);
    }
    return nge;
  }
  static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int arr[]=new int[len];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
   int[] nge=greaterElement(arr);
   display(nge);
  }
          
          
}
