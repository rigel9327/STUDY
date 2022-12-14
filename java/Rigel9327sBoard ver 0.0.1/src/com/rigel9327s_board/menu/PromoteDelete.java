package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Data;
import com.rigel9327s_board.data.Input;
import com.rigel9327s_board.data.Post;

public class PromoteDelete {
	public static void run() {
		for (Post p : Data.posts) {
			p.infoForList();
		}
		if (Data.posts.isEmpty()) {
			System.out.println("삭제할 글이 없습니다.\n");
		} else {
			String cmd = Input.rl("삭제할 글의 번호를 입력해주세요.");
			for (int i = 0; i < Data.posts.size(); i++) {
				if (cmd.equals(Data.posts.get(i).instanceNo + "")) {
					Data.posts.remove(i);
				}
			}
		}
	}
}
