package BOJ.etc;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * BOJ_3052 나머지
 *
 */
public class Main_3052 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt() % 42);
		}
		System.out.println(set.size());

	}

}
