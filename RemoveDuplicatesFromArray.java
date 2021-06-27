/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nidhi_Practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Home
 */ // areee bna ni abhi tk :(( jaan mko list lete ni aari vo put hey raaam koi list pist ki jarurat ni isme
public class RemoveDuplicatesFromArray {

   //{  1,2,4,4,2,3,5,6} --->>> {1,2,3,4,5,6} remove the duplicates

   static Set<Integer> removeDuplicates(int arr[]) {
      Set<Integer> set = new HashSet<>(); // set has the property that its elements are unique.. class 10/11/12
      // Engineering year 1,2....
      // java , java advance , discrete mathematics ,, maths :)
      for (int i = 0; i < arr.length; i++) {
         set.add(arr[i]);
      } // ni aayaa ???aagya mko j smjh ni aari mrko choti choti baatein click kyu ni hoti ki j hon hai isme ese krskte isey// tmko m kitni baar btaya ki set m unique elements aate h hmesha btaaai hu,, kisi bhi cheej mese duplicates htane hto set ki yaaad aaaani chaeye.. y agr string ka question hota ki remove duplicate characters for strings to esehi krenge //jese ::String s="pprriinnsshhu" -->> prinshu..haann jaan mko aadhi adhi baatein yd rhti lga th collection ka pr y bhulgy ki map ni set use krenge // kher chodo bnaalo ab strings wala function bhi idhr hi 
      return set;
   }

   static Set<Character> removeDup(String str) {
      Set<Character> set = new HashSet<>();
      String res="";      
// +B+Apppppp re tmko itna tym lga length() function kaa tmko din raat practic krni pdegi tbhi aaega nito bittu bhuull jaaao
//      TreeSet<Character> ts = new TreeSet<>(); // set ki saari variety unordered hi h otaaaa..

      for (int i = 0; i < str.length(); i++) {

//         set.add(str.charAt(i));
         if(!set.contains(str.charAt(i))){ // apnne sb kiyaa huyaa h bs thoda sa sochna h tmko hi sochna h y sb.. mko ka h mko hojaati j sb click dimag m main tmko seekhnaaaaa.. m pgl thodi hu jo tmko itne variations krwaee...
          res=res+""+str.charAt(i); // bs y sochnaaa tha 
         }
         set.add(str.charAt(i));
      }
      System.out.println(res);
      return set;
   }

   static String remove_Dp(String s) { // O(n^2) can we do better????? kyaaa?? kyaaa ... btaooo kyaa kre
      String res = "";
      // kese???? 
      for (int i = 0; i < s.length(); i++) {
         int count = 0;
         for (int j = i + 1; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
               count++;
            }

         }
         if (count == 0) {
            res = res + "" + s.charAt(i);
         }
      }
      return res;
   }
//   static String remove_dp_optimized(String s){ // kro
//   // to fir kese krenge ???
//      // kro
//   }

   public static void main(String[] args) {
      int arr[] = {1, 2, 4, 4, 2, 3, 5, 6};
      String str = "pprrriiinnsshhuu"; // strings k case m y ni chlegaaa kyuki order matter krta hnaaa
   //   System.out.println(removeDuplicates(arr).toString());
      System.out.println(removeDup(str)); // set is unordered  haan j phli line hoti th set m
    //  System.out.println(remove_Dp(str));
   }
}
/// achaaa agr delete duplicates bole to baat ek hi h smjh gai na??? remove / delete ek hi hotaa h
// isk bhi kaafi variations bn skte h ki delete/remove kro first repeating character ya delete kro first non repeating characteer smjhi???
// pprrriiinnsshhuu--> isme agr first repeating character delete kiya to kyaa aegaaa??? niiii are haanyrrr ek hi jaega dusra p to bch jaega // y array wala 15 min m aaega ki remove duplicates from the array
// ab kaaaa kreeee???? ab mko esa lgra mjhe 2 number ka sum print krvak dekhna chaeye okaaa krlo fir\
// kro pr kuch krogi tohi aega haaaaaaaaaaaaaaa