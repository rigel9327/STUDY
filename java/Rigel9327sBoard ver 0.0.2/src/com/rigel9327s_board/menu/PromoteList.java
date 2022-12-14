package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Data;
import com.rigel9327s_board.data.Post;

public class PromoteList {
	public static void run() {
		
		for(Post p:Data.posts) {
			p.infoForList();
		}
		if(Data.posts.isEmpty()) {
			System.out.println("작성된 글이 없습니다.\n");
		}
	}
}
