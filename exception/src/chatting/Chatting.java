package chatting;

import java.util.Scanner;

public class Chatting {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		System.out.println("상대방에게 보내는 메세지: ");
		message = sc.nextLine();
		if(message.contains("바보")) {
			try {
				throw new BadWordException("비속어 사용하지 마라 친구야!");
			} catch (BadWordException e) {
				sc.close();
				System.out.println("너는 지금부터 채팅쓰지마라!");
				e.printStackTrace();
			}
		}else {
			System.out.println(message);
		}
		
		System.out.println(message.contains("바보"));
		
		
	}
}
