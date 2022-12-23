package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Input;

public class PromoteDelete {
	public static void run() {
		PromoteList.run();
		ProcBoard.dbInit();
		while (true) {
			String cmd = Input.rl("삭제할 글의 번호를 입력해주세요.");	
			if(ProcBoard.existNo("select `글번호` from `게시판` where `글번호`=" + cmd + ";")) {
				System.out.println("글이 존재하지 않습니다.");
			} else {
				ProcBoard.dbExecuteUpdate("delete from `게시판` where `글번호`=" + cmd + ";");
				System.out.println("삭제되었습니다.\n");
			}
			
		}

	}

}
