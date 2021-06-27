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
public class NextSmallerOnRight {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int[] arr=new int[len];
    for(int i=0;i<len;i++){
      arr[i]=sc.nextInt();
    }
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<arr.length;i++){
      if(st.empty()){
        st.push(arr[i]);continue;
      }
      while(!st.empty() && st.peek()>arr[i]){
        System.out.println(st.pop()+" ---->  "+arr[i]);
      }
      st.push(arr[i]);
    }
    while(!st.empty()){
      System.out.println(st.pop()+" ----> -1 ");
    }
  }
        
}
