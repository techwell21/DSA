/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.StackCode;
import java.io.*;
import java.util.*;
/**
 *
 * @author shnid
 */
public class CelebrityProblem {
  public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
}


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
          st.push(i);
        }
        while(st.size()>=2){
          int i=st.pop();
          int j=st.pop();
          if(arr[i][j]==1){
            st.push(j);
          }else{
            st.push(i);
          }
        }
        int potential=st.peek();
        for(int i=0;i<arr.length;i++){
          if(i!=potential){
            if(arr[i][potential] != 1 || arr[potential][i] == 1){
              return -1;
            }
          }
        }
        return potential;
    }
}
