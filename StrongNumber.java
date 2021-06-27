package Nidhi_Practice;

public class StrongNumber {

  static boolean strong(int n) { // O(n^2)
   int sum = 0;
    int num = n;
    while (n != 0) {  
      int rem = n % 10;
       int fact = 1;
      for (int i = rem; i >= 1; i--) { 
        fact = fact * i; 
      }
      sum = sum + fact;// sum=120
      n = n / 10;
    }
    if (num == sum) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int n = 145; // 1!+4!+5!=145
    System.out.println(strong(n));
  }

}
