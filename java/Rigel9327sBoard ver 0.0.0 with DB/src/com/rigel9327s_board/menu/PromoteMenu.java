package com.rigel9327s_board.menu;

import java.util.Scanner;

import com.rigel9327s_board.disp.Display;

public class PromoteMenu {
	public static void run() {
		loopMenu: while (true) {
			Display.menuList();
			System.out.println("이용할 메뉴를 선택해주세요.(1~6)");
			Scanner scanner = new Scanner(System.in);
			String inputData = scanner.nextLine();

			switch (inputData) {
			case "1":
				PromoteList.run();
				break;
			case "2":
				PromoteRead.run();
				break;
			case "3":
				PromoteWrite.run();
				break;
			case "4":
				PromoteReWrite.run();
				break;
			case "5":
				PromoteDelete.run();
				break;
			case "6":
				System.out.println("게시판을 닫습니다.");
				break loopMenu;
			default:
				System.out.println("메뉴 중에서 선택해주세요.");

			}
		}
	}
}
