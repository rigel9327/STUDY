package com.rigel9327s_board.data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Input {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static public String r() {
		return sc.next();
	}
	static public String r(String comment) {
		System.out.printf(comment + ":");
		return sc.next();
	}
	static public String rl(String comment) {
		System.out.printf(comment + ":");
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
