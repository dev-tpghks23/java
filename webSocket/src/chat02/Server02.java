package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) throws IOException{
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader bufferdReader = null;
		BufferedWriter bufferdWriter = null;
		Scanner sc = null;
	
//		서버 소켓 생성
		try {
			serverSocket = new ServerSocket(7777);
			
			System.out.println("연결 대기중...");
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 되었습니다.");
			
//		네트워크 입출력 스트림
			bufferdReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferdWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			sc = new Scanner(System.in);
			
			while(true) {
//				클라이언트로부터 데이터 수신 (클라이언트 -> 서버)
				String inputMessage = bufferdReader.readLine();
				System.out.println("클라이언트 메세지 :" + inputMessage);
			
				System.out.println("클라이언트에게 보낼 메세지를 작성하세요.");
				String outputMessage = sc.nextLine();
				bufferdWriter.write(outputMessage + "\n");
				bufferdWriter.flush();
				
				System.out.println("서버 메세지 :" + outputMessage);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {
					sc.close();
				}
				
				if(bufferdReader != null) {
					bufferdReader.close();
				}
				
				if(bufferdWriter != null) {
					bufferdWriter.close();
				}
				
				if(socket != null) {
					socket.close();
				}
				
				if(serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}













