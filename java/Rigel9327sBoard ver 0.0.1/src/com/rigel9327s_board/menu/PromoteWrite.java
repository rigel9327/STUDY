package com.rigel9327s_board.menu;

import java.util.Scanner;

import com.rigel9327s_board.data.Data;
import com.rigel9327s_board.data.Input;
import com.rigel9327s_board.data.Post;


public class PromoteWrite {
		static void run() {
			String title;
			while(true) {
				title= Input.rl("글제목");
				if(title.length()>0) {
					break;
				}else {
					System.out.printf("제대로 입력해주세요.");
				}
			}
			String content;
			while(true) {
				content=Input.rl("글내용");
				if(content.length()>0) {
					break;
				}else {
					System.out.printf("제대로 입력해주세요.");
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
			

			Post p = new Post(title, content, writer, 0);
			Data.posts.add(p);
			System.out.println("글 작성됨");
			System.out.println();
		}

	}

