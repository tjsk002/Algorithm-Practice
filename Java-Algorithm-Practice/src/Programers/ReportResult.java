package Programers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReportResult {
	public static void main(String[] args) {
		// 신고 결과 카카오 문제
		// 아이디 목록
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		// 신고 당한 사람
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		// 정지된 사람 (2번이상 신고 당하면 정지)
		String[] result = {};
		int k = 0;
		Map<String, HashSet<String>> reportMap = new HashMap<>();
		
		Map<String, Integer> getMailCount = new HashMap<>();
		
		for(String id: id_list) {
			getMailCount.put(id,0);
			System.out.println(id);
			System.out.println(getMailCount);
		}
		if(k >= 2) {
			// 신고를 2번 이상 당했을 경우 정지하게 만들기
		}
	}
}
