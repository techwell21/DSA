/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.StackCode;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shnid
 */
public class MaximumAreaHistogram {
  static int maxAreaHistogram(int[] arr){
    int maxArea=0;
    int[] lb=new int[arr.length]; //NS index on left side
     Stack<Integer> st=new Stack<>();
    st.push(0);
    lb[0]=-1;
    for(int i=0;i<arr.length;i++){
      while(st.size()>0 && arr[i]<arr[st.peek()]){
        st.pop();
      }
      if(st.size()==0){
        lb[i]=-1;
      }else{
        lb[i]=st.peek();
      }
      st.push(i);
    }
    
    int[] rb=new int[arr.length]; //NS index on right side
    st=new Stack<>();
    st.push(arr.length-1);
    rb[arr.length-1]=arr.length;
    for(int i=arr.length-2;i>=0;i--){
      while(st.size()>0 && arr[i]<arr[st.peek()]){
        st.pop();
      }
      if(st.size()==0){
        rb[i]=arr.length;
      }else{
        rb[i]=st.peek();
      }
      st.push(i);
    }
    
    for(int i=0;i<arr.length;i++){
      int wid=rb[i]-lb[i]-1;
      int area=wid*arr[i];
      maxArea=Math.max(area,maxArea);
    }
    return maxArea;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int arr[]=new int[len];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(maxAreaHistogram(arr));
}
}