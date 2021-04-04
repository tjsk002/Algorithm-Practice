package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

/*
 * 문자열의 s의 길이는 1이상 100이하이며, 알파벳 소문자로만 이루어져 있다
 * 여러번 나타나는 같은 부분 문자열은 하나로 세면 된다
 * 
 * 좋은 부분 문자열이란 어떤 문자열의 s부분 문자열이면서 같은 알파벳이
 * 두번이상 나타나지 않는 문자열을 말한다.
 * 예를 들어 주어진 문자열이 "abac"일 때, 부분 문자열 "a", "ab", bac" 등은
 * 원래 문자열 "abac"의 부분 문자열이면서 문자열 내에 같은 알파벳이 두번 이상 나타나지
 * 않으므로 좋은 부분 문자열이 아니다. 문자열 s가 주어질때 좋은 부분 문자열의 개수를 
 * return 하도록 담아줘라
 * 
 * 예)
 * s		result
 * "abac"	 7
 * "abcd"	10
 * "zxzxz"	4
 * 
 */

/*
 * 1. 문자열 쪼개는 함수
 * 2. 좋은지 안좋은지 판별하는 함수
 */


/*
 * result = 정답
 * s = 입력문자열
 * start, length = 시작, 길이
 * ---
 * tmp = 자른 문자열 잡는 string
 * ---
 * IsGood = 좋은 문자열 구분함수
 */

public class hashSet {
	
	static HashSet<String> result = new HashSet<String>();

	public boolean add(String e) {
		return false;
	}

	// public void 함수면(파라미터){
	// }
	// 함수선언

	public void sclice_string(String str, Integer start, Integer length) {
		// string 입력받을 문자열, 시작값, 길이값
		// ex) abcd
		
		String tmp = str.substring(start, length);
		
		if(IsGood(tmp)) {
			//정답 추가하는 배열
			result.add(tmp);
		}
	}

	// public boolean add() = 좋은 문자열
	public Boolean IsGood(String tmp) {
		
		//tmp가 만약에 좋은 문자열이라면 true
		HashSet<String> goodArr = new HashSet<String>();
		//tmp를 담을 배열
		String tmp1[] = tmp.split("");
		// tmp1 = [a,b,c]
		// goodArr. 없으면 넣고 있으면 return false
		
		for (int i = 0; i < tmp1.length(); i++) {
			
		}
		return true;
		
	}

	public static void main(String[] args) {

		String s = "zxzxz";

		
		// slice를 사용하려면 substring(,)으로 문자열 끊기

		// hashset : 중복제거
	
	}

}
