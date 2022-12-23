package com.rigel9327s_board.main;


import com.rigel9327s_board.disp.Display;
import com.rigel9327s_board.menu.PromoteMenu;

public class Board {

	public void run() {
	
		Display.title();
		Display.menuList();
		PromoteMenu.run();
	}
}
