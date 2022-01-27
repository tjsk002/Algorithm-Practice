package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside2 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      Integer arr2[] = {2,3,4,5,6,6,4};
      Integer arr3[] = new Integer[n];
      int arr4[] = new int[n];
      
      for (int i = 0; i < n; i++) {
         arr4[i] = Integer.parseInt(br.readLine());
      }
      
      Arrays.sort(arr3, Collections.reverseOrder());
      System.out.println(Arrays.toString(arr3));
      
      Arrays.sort(arr2, Collections.reverseOrder());
      System.out.println(Arrays.toString(arr2));
      
   }
}