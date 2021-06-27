// algo -->> pop then answer gain then push
// variation of next greater element in left
package DataStructure.StackCode;
import java.util.*;

/**
 *
 * @author shnid
 */
public class StockSpan {
  static int[] solve(int[] arr){
    int[] res=new int[arr.length];
    Stack<Integer> st=new Stack<>();
    st.push(0);
    res[0]=1;
    for(int i=1;i<arr.length;i++){
      while(st.size()>0  && arr[st.peek()]<arr[i]){
        st.pop();
      }
      if(st.size()==0) res[i]=i+1;
      else{
        res[i]= i-st.peek();
      }
      st.push(i);
    }
    return res;
  } 
  static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int len=sc.nextInt();
     int[] arr=new int[len];
     for(int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt();
     }
    int span[]= solve(arr);
    display(span);
  }
}
