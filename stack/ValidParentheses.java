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
public class ValidParentheses {
  static boolean checkParentheses(String str){
    Stack<Character> st=new Stack<>();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='(' || ch=='{' || ch=='['){
        st.push(ch);
      }else if(ch==')'){
        if(st.size() ==0){
          return false;
        }else if(st.peek() != '('){
          return false;
        }else{
          st.pop();
        }
      }else if(ch=='}'){
        if(st.size() ==0){
          return false;
        }else if(st.peek() != '{'){
          return false;
        }else{
          st.pop();
        }
      }else if(ch==']'){
        if(st.size() ==0){
          return false;
        }else if(st.peek() != '['){
          return false;
        }else{
          st.pop();
        }
      }
    }
    if(st.size()==0){
      return true;
    }else{
      return false;
    }
  } 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(checkParentheses(str));
  }
}
