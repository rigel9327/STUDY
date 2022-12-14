package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Data;
import com.rigel9327s_board.data.Input;
import com.rigel9327s_board.data.Post;

public class PromoteReWrite {
	public static void run() {
		for (Post p : Data.posts) {
			p.infoForList();
		}
		if (Data.posts.isEmpty()) {
			System.out.println("수정할 글이 없습니다.\n");
		} else {
			String cmd = Input.rl("수정할 글의 번호를 입력해주세요.");
			for (int i = 0; i < Data.posts.size(); i++) {
				if (cmd.equals(Data.posts.get(i).instanceNo + "")) {
					while(true) {
						String title= Input.rl("글제목");
						Data.posts.get(i).setTitle(title);
						if(title.length()>0) {
							break;
						}else {
							System.out.printf("제대로 입력해주세요.");
						}
					}
				
					while(true) {
						String content=Input.rl("글내용");
						Data.posts.get(i).setContent(content);
						if(content.length()>0) {
							break;
						}else {
							System.out.printf("제대로 입력해주세요.");
						}
					}
					
					while(true) {
						String writer = Input.rl("작성자");
						Data.posts.get(i).setWriter(writer);
						if(writer.length()>0) {
							break;
						}else {
							System.out.printf("제대로 입력해주세요.");
						}
					}
				}
			}
		}
	}
}