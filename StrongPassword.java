package Nidhi_Practice;

public class StrongPassword {

   static int strongPassword(String str) {
      int l = str.length();
      int count=0;
      System.out.println(l);
      for (int i = 0; i < l; i++) {
         String symbols = "!@#$%^&*()-+";
         if (l < 6) {
//            if(Character.isDigit(str.charAt(i)) || (Character.isLowerCase(str.charAt(i))) || (Character.isUpperCase(str.charAt(i))) || (str.charAt(i)=="symbols" ){
//               
//            }else{
//               //return 
//            }
            if (str.contains(symbols)) {
             count++;
            }else if (Character.isDigit(str.charAt(i))){
               count++;
            }else if (Character.isLowerCase(str.charAt(i))){
               count++;
            }else if (Character.isUpperCase(str.charAt(i))){
               count++;
            }else{
               return count;
            }

         } else {
            return 6 - str.length();
         }
      }

      return 0;
   }

   public static void main(String[] args) {
      String str = "Nishu@2125";
      System.out.println(strongPassword(str));
   }
}
