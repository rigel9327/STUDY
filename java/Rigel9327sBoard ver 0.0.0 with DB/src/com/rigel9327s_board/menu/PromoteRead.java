package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Input;
import com.rigel9327s_board.disp.Display;

public class PromoteRead {

	public static void run() {
		ProcBoard.dbInit();
		loopRead: while (true) {
			loopList: while (true) {
				PromoteList.run();
				String cmd = Input.r("읽을 글 번호(메뉴로 돌아가기: 'e'입력)\n");
				if (cmd.equals("e")) {
					break loopRead;
				}
				ProcBoard.dbExecuteQueryRead("select * from `게시판` where `글번호` =" + cmd);
				while (true) {
					String list = Input.r("글목록으로: 아무키나 입력)\n");
					if (!list.equals(null)) {
						break loopList;

					}
				}
			}

		}
	}
}
