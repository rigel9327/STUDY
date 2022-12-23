package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Input;

public class PromoteReWrite {
	public static void run() {
		ProcBoard.dbInit();
		PromoteList.run();
		loopRewrite: while (true) {
			while (true) {
				String postNo;
				postNo = Input.rl("수정할 글의 번호를 입력해주세요(메뉴로 돌아가기: e)");
				if (postNo.equals("e")) {
					break loopRewrite;
				} else {
					if (ProcBoard.existNo("select `글번호` from `게시판` where `글번호`=" + postNo + ";")) {
						System.out.println("글이 존재하지 않습니다.");
						break;
					} else {

						System.out.println(postNo + "번 글을 수정합니다.");

						String edTitle;
						while (true) {
							edTitle = Input.rl("수정할 글의 제목을 입력해주세요.");
							if (edTitle.length() >= 0) {
								break;
							} else {
								System.out.printf("제대로 입력해주세요.");
							}
						}
						String edId;
						while (true) {
							edId = Input.rl("수정할 글의 작성자명을 입력해주세요.");
							if (edId.length() >= 0) {
								break;
							} else {
								System.out.printf("제대로 입력해주세요.");
							}
						}
						String edContent;
						while (true) {
							edContent = Input.rl("수정할 글의 내용을 입력해주세요.");
							if (edContent.length() >= 0) {
								break;
							} else {
								System.out.printf("제대로 입력해주세요.");
							}
						}
						ProcBoard.dbExecuteUpdate("update `게시판` set `글제목`='" + edTitle + "', `작성자id`='" + edId
								+ "', `작성시간`=now(), `글내용`='" + edContent + "' where `글번호`=" + postNo);
						break;
					}
				}
			}
		}
	}
}