package com.rigel9327s_board.disp;

public class Display {
	public static final String VERSION = "ver 0.0.1";
	public static final String TITLE = "Rigel9327's Board (" + VERSION + ") ";
	
	public static void title() {
		System.out.println("|====================================================================================|");
		System.out.println("||==================================================================================||");
		System.out.println("||                          "         + TITLE +          "                          ||" );
		System.out.println("||==================================================================================||");
		System.out.println("|====================================================================================|");
	}
	public static void menuList() {
		System.out.println("|====================================================================================|");
		System.out.println("||  1. List  ||  2. Read  ||  3. Write  ||  4. ReWrite  ||  5. Delete  ||  6. Exit  ||");
		System.out.println("|====================================================================================|");
	}
	
}
