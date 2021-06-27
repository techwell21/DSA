//print all fabonicci even numbers upto n.
package Nidhi_Practice;

public class FabEven {

   static int fabo_recursion(int n) { // TimeComplexity ---> exponential O(2^n); space--> O(1) 
      // base condition
      if (n == 0 || n == 1) {
         return n;
      }
      // main logic
      return fabo_recursion(n - 2) + fabo_recursion(n - 1);

   }
   static int fabo_formula(int n){ // TimeComplexity --->  O(1); space--> O(1) 
     /* Formula ------> f(n)={{[1+root(5)]/2}^n/root(5)}   */
    double first=(1+Math.sqrt(5))/2;
    return  (int)Math.round(Math.pow(first,n)/Math.sqrt(5)); // Cake walk(easy as hell :))
  }

   public static void main(String[] args) {

      for (int i = 0; i <= 50; i++) {
         int fab = fabo_formula(i);//fabo_formula(i) == first fabonicii number
         if (fab % 2 == 0) {
            System.out.println(""+fab);
         }
      }
   }

}
