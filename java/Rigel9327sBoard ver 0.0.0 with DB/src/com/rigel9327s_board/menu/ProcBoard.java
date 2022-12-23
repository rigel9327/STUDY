package com.rigel9327s_board.menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProcBoard {
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet result = null;
	public static Scanner sc = new Scanner(System.in);

	public static void dbInit() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Rigel", "root", "rlaehdwns74");
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}

	public static void dbExecuteQuery(String query) {
		try {
			System.out.println(query);
			result = st.executeQuery(query);
			while (result.next()) {
				String no = result.getString("글번호");
				String title = result.getString("글제목");
				String id = result.getString("작성자id");
				String datetime = result.getString("작성시간");
				System.out.println("글번호: " + no + " || 제목: " + title + "  / 작성자: " + id + "  / 작성시간: " + datetime);
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}

	public static boolean existNo(String query) {
		String no = null;
		try {
			System.out.println(query);
			result = st.executeQuery(query);
			result.next();
			no = result.getString("글번호");
		} catch (SQLException e) {
			
		}
		if (no == null) {
			return true;
		} else {
			return false;
		}
	}

	public static void dbExecuteQueryRead(String query) {
		try {
			System.out.println(query);
			System.out.println();
			result = st.executeQuery(query);
			result.next();
			String title = result.getString("글제목");
			String id = result.getString("작성자id");
			String datetime = result.getString("작성시간");
			String content = result.getString("글내용");
			System.out.println("===========================================================================");
			System.out.println("글제목: " + title + "       작성자: " + id + "       작성시간: " + datetime);
			System.out.println("===========================================================================");
			System.out.println();
			System.out.println(content);
			System.out.println("===========================================================================");
			System.out.println();

		} catch (SQLException e) {
			System.out.println("글번호를 제대로 입력해주세요.\n\n");
		}
	}

	public static void dbExecuteUpdate(String query) {
		try {
			int resultCount = st.executeUpdate(query);
			System.out.println("처리된 행 수:" + resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void executeInsert(String query) {
		try {
			st.executeUpdate(query);
			System.out.println("글등록 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
