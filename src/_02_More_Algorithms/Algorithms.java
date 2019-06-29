package _02_More_Algorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		int a = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)== true) {
				a++;
			}
		}
		return a;
	}
	public static double findTallest(List<Double> peeps) {
		double a = -1;
		for(int i = 0; i < peeps.size()-1; i++) {
			if(peeps.get(i) < peeps.get(i+1)) {
				a = peeps.get(i+1);
			}
		}	
		return a;
	}
	public static String findLongestWord(List<String> words) {
		String b = words.get(0);
		for(int i = 0; i < words.size()-1; i++) {
			if(words.get(i+1).length() > b.length()) {
				b = words.get(i+1);
				System.out.println(words.get(i+1) + " " + words.get(i+1).length());
			}
		}	
		return b;
	}
	public static boolean containsSOS(List<String> message) {
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).contains(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results) {
 Collections.sort(results);
		return results;
	}
	public static List<String> sortDNA(List<String> sequences){
		boolean aa = true;
		while(aa) {
			aa = false;
		for(int i = 0; i < sequences.size()-1; i++) {
			if(sequences.get(i+1).length() < sequences.get(i).length()){
				String a = sequences.get(i+1);
				sequences.get(i+1).equals(sequences.get(i));
				sequences.get(i).equals(a);
				aa = true;
			}
		}
		}

		return sequences;
	}
	}

