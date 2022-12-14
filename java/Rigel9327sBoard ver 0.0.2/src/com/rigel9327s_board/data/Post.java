package com.rigel9327s_board.data;

import java.time.LocalDate;

public class Post {
	static public int no = 0;
	public int instanceNo = 0;
	public String title;
	public String content;
	public String writer;
	public int views;
	public String date;
	public Post(String title, String content, String writer, int views) {
		no = no + 1;		
		instanceNo = no;	
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.views = views;
		LocalDate now = LocalDate.now();
		date = now.toString();
	}
	public void infoForList() {
		System.out.printf("||  ");
		System.out.printf("No:"+instanceNo);
		System.out.printf("  ||  ");
		System.out.printf("title:"+title);
		System.out.printf("  ||  ");
		System.out.printf("writer:"+writer);
		System.out.printf("  ||  ");
		System.out.printf("views:"+views);
		System.out.printf("  ||  ");
		System.out.printf("date:"+date);
		System.out.println("  ||");
	}
	public void infoForRead() {
		System.out.printf("||  ");
		System.out.printf("title:" + title);
		System.out.printf("  ||  ");
		System.out.printf("writer:" + writer);
		System.out.printf("  ||  ");
		System.out.printf("views:" + views);
		System.out.printf("  ||  ");
		System.out.printf("date:" + date);
		System.out.println("  ||");
		System.out.println("=============================  내용  =============================\n"  + content);
	}
	public void setTitle(String title) {
		  this.title = title;
		 }
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
