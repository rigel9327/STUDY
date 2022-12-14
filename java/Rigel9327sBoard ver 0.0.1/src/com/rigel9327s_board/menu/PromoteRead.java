package com.rigel9327s_board.menu;

import java.util.Scanner;

import com.rigel9327s_board.data.Data;
import com.rigel9327s_board.data.Input;
import com.rigel9327s_board.data.Post;

public class PromoteRead {
	public static void run() {

		for (Post p : Data.posts) {
			p.infoForList();
		}
		if (Data.posts.isEmpty()) {
			System.out.println("작성된 글이 없습니다.\n");
		} else {

			String cmd = Input.r("읽을 글 번호\n");
			for (Post p : Data.posts) {
				if (cmd.equals(p.instanceNo + "")) {
					p.infoForRead();
				}
			}
		}
	}
}