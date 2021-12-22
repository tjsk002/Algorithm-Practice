package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;

public class WordStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		String in = br.readLine();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < in.length(); i++) {
			Character word = Character.toString(in.charAt(i)).toUpperCase().charAt(0);

			if (map.get(word) == null) {
				map.put(word, 1);
			} else {
				int num = (int) map.get(word);
				map.put(word, num + 1);
			}
		}

		Integer maxValue = Collections.max(map.values());

		int count = 0;

		for (Character key : map.keySet()) {
			Integer value = map.get(key);
			if (value.equals(maxValue)) {
				sb.append(key);
				count++;
			}
		}

		if (1 < count) {
			bw.write("?");
		} else {
			bw.write(sb.toString());
		}

		br.close();
		bw.flush();
		bw.close();

	}
}
