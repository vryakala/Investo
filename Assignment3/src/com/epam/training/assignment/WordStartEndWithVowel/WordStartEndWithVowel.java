package com.epam.training.assignment.WordStartEndWithVowel;

public class WordStartEndWithVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			String s = "This is a ample entence";
			s = s + " ";
			int l = s.length();
			int pos = 0;
			char ch1, ch2, ch3;
			String w;

			for (int i = 0; i < l; i++) {
				ch1 = s.charAt(i);
				if (ch1 == ' ') {
					w = s.substring(pos, i); // extracting words one by one
					ch2 = w.charAt(0);
					ch3 = w.charAt(w.length() - 1);
					if (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U' || ch2 == 'a' || ch2 == 'e'
							|| ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
						if (ch3 == 'A' || ch3 == 'E' || ch3 == 'I' || ch3 == 'O' || ch3 == 'U' || ch2 == 'a'
								|| ch2 == 'e' || ch3 == 'i' || ch3 == 'o' || ch3 == 'u') {
							System.out.println(w);
						}
					}

					pos = i + 1;
				}
			}
		}
	}
}
