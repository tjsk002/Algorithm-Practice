package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class WordSort {
	public static void main(String[] args) throws IOException {
		// ���� �ܾ� ���� ����
		/*
		 * ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�. 1. ���̰� ª���ͺ��� 2.
		 * ���̰� ������ ���� ������ ���ڿ� ���̴� 50�� ���� �ʴ´�
		 */
		final int wordN = 50; // ���ڿ� ���̴� 50�� ���� �ʴ´�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		// HashSet -> �ߺ� ����

		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		System.out.println(set);
		// boolean equals() ���ڿ� ������ ������ ��
		ArrayList<String> list = new ArrayList<String>(set);

		// Comparator Ŭ������ ���Ͽ� custom ����
		// ���̿� ���� ���� �����ϰ�, ���̰� ������ ���� ��
		
		Collections.sort(list, new Comparator<String>() {
			public int compare(String v1, String v2) {
				//return v1.length() - v2.length(); // ��������
				if(v1.length() > v2.length()) {
					return 1;
				}else if(v1.length() < v2.length()) {
					return -1;
				}else {
					return v1.compareTo(v2);
				}
			}
		});
		
		for(String s : list) {
			System.out.println("s = " + s);
		}
	}
}