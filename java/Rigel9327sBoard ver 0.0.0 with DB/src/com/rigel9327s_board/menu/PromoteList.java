package com.rigel9327s_board.menu;

import com.rigel9327s_board.disp.Display;

public class PromoteList {

	static void run() {
		ProcBoard.dbInit();
		Display.List();
		ProcBoard.dbExecuteQuery("select * from `게시판`");
		System.out.println();
	}
}