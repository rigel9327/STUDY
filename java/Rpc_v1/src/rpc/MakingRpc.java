package rpc;

import java.util.Scanner;

public class MakingRpc {

	public static void main(String[] args) {
		Scanner rpc = new Scanner(System.in);
		int comRpc = 0;
		String input = "";
		String comRpcResult = "";
		
		RpcContinue:
		while (true) {
			input = rpc.next();
			System.out.println("나의 선택: " + input);
			
			if(!input.equals("바위") && !input.equals("가위") && !input.equals("보") ) {
				System.out.println("가위, 바위, 보만 입력가능합니다. \nx입력시 종료가능");
				continue;
			}
			
			comRpc = (int) (Math.random() * 3);
			
			switch (comRpc) {
			case 0:
				comRpcResult = "바위";
				break;
			case 1:
				comRpcResult = "가위";
				break;
			case 2:
				comRpcResult = "보";
			}
			System.out.println("상대는: " + comRpcResult);

			switch (input) {
			case "바위":
				switch (comRpcResult) {
				case "바위":
					System.out.println("비겼습니다.");
					break;
				case "가위":
					System.out.println("이겼습니다.");
					break;
				case "보":
					System.out.println("졌습니다.");
					break;
				}
				break;
			case "가위":
				switch (comRpcResult) {
				case "바위":
					System.out.println("졌습니다.");
					break;
				case "가위":
					System.out.println("비겼습니다.");
					break;
				case "보":
					System.out.println("이겼습니다.");
					break;
				}
				break;
			case "보":
				switch (comRpcResult) {
				case "바위":
					System.out.println("이겼습니다.");
					break;
				case "가위":
					System.out.println("졌습니다.");
					break;
				case "보":
					System.out.println("비겼습니다.");
					break;
				}
				break;
			case "x":
				System.out.println("경기종료");
				break RpcContinue;
				
			}
		}
		rpc.close();
		
	}
	
}
