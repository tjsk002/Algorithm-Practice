package Programers;

import java.util.ArrayList;
import java.util.List;

public class HolleHello {
	
	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o';
	}
	
	public static String reverseVowels(String s) {
        final int length = s.length();
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < length; ++i) {
        	final char c = s.charAt(i);
        	if (isVowel(c))
        		vowels.add(c);
        }
        
        //Collections.reverse(vowels);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; ++i) {
        	final char c = s.charAt(i);
        	if (isVowel(c)) {
        		// 모음이라면
        		sb.append(vowels.get(vowels.size() - 1));
        		vowels.remove(vowels.size() - 1);
        	} else {
        		sb.append(s.charAt(i));
        	}
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
//		 hello -> holle
		
		String s = "hello";
		String s1 = "kongstudios";
		
		System.out.println(reverseVowels(s));
		System.out.println(reverseVowels(s1));
	}
}
