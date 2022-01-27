package Programers;

import java.util.Arrays;

public class StrangeTextMake2 {
   public static void main(String[] args) {
      // 이상한 문자 만들기
      String s = "try hello world";
      String s1 = "try hello  world";
      String answer = "";
      // TrY HeLlO WoRlD
      String[] str = s1.split("");
      System.out.println(Arrays.toString(str));
//      [t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
      
      int idx = 0;
      for (String res : str) {
    	 System.out.println(res);
         idx = res.contains(" ") ? 0 : idx+1;
         // res " " 가 맞으면 0 아니라면 1
//         System.out.print(idx);
         // 1110111110011111
         answer += idx%2 == 0 ? res.toLowerCase() : res.toUpperCase(); 
         
      }
      System.out.println(answer);
   }
      
}