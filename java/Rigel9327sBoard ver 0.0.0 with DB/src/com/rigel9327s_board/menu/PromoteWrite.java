package com.rigel9327s_board.menu;

import com.rigel9327s_board.data.Input;

public class PromoteWrite {
		static void run() {
			ProcBoard.dbInit();
			System.out.println("새글을 작성합니다.\n");
			String title;
			while(true) {
				title= Input.rl("글제목");
				if(title.length()>0) {
					break;
				}else {
					title="";
				}
			}
			String content;
			while(true) {
				content=Input.rl("글내용");
				if(content.length()>0) {
					break;
				}else {
					content="";
				}
			}
			String writer;
			while(true) {
				writer=Input.r("작성자");
				
				if(writer.length()>0) {
					break;
				}else {
					System.out.printf("제대로 입력해주세요.");
				}
			}
			ProcBoard.executeInsert("insert into `게시판` (`글제목`,`작성자id`,`작성시간`,`글내용`,`조회수`) values ('"+title+"','"+writer+"',now(),'"+content+"',0)");
			System.out.println("글 작성됨");
			System.out.println();
		}

	}

