
package Nidhi_Practice;
import java.util.*;
public class Even_Fabo_odd_Prime {
   static int fab(int n){
      //base condition
      if(n==0 || n==1){
         return n;
      }
      //main logic
    return fab(n-1)+fab(n-2);
   
      
     
   }
   static boolean Prime(int n){ // T--> O(n) S--> O(1);
     // root(10) 
      int factors=0;
      if(n==2){  // 2 is smallest prime number
      return true;
      }
      if(n%2==0){  // multiples of 2  // nice solution :)
      return false;
      }
      for(int i=3;i<=Math.sqrt(n);i=i+2){
      if(n%i==0){
         // n/2
         //       10 10/2--> 5
         // 15 --> 3 3 -->4<---7
    return false;
      }
      }
      
      return true;
      
   }
   static int NthPrime(int n){
      int pcount=0,num=0;
   for(int i=2;i<=1000;i++){
      if(Prime(i)){ // if(true/false) --> java /// if(0/1)--> C/Cpp (for knowledge purpose :))
       //  System.out.print(" "+i);
         pcount++; // 1 
      }
      if(pcount==n){
      return i;
      }
   }
   
   return num!=0?num:-1;
   }
   // find the nth term in the series : even fabo, odd prime
   
   
   
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      // 0,2,1,3,1,5,2,7,3,11,5,13,8,17,13,19,21,23........
//      System.out.println("Enter the number of series you want to print:----->");
//     int n=sc.nextInt();
//     if(n%2==0){
//        System.out.print(" "+fab(n/2));
//     }else{
//        System.out.println(" "+NthPrime(n/2));
//     }
    //  System.out.println(fab(1));
      int prime=1;
      int fabo=0;
     for(int i=1;i<=20;i++){
        if(i%2 == 0){
           System.out.print("    "+fab(fabo)); 
            fabo++;           
// 0,1,1,2
        }else{
           System.out.print("    "+NthPrime(prime));
            prime++;          // 2,3,5,7
        }
     }
     
   }
}
