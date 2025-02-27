package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		fileWriter, fileReader
//		음식 5개를 출력
//		"스테이크", "돈까스", "피자", "스파게티", "햄버거"
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt", true));
//		bufferedWriter.write("스테이크" + "\n");
//		bufferedWriter.write("돈까스" + "\n");
//		bufferedWriter.write("피자" + "\n");
//		bufferedWriter.write("스파게티" + "\n");
//		bufferedWriter.write("햄버거" + "\n");
//		bufferedWriter.close();
		
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("./food.txt"));
//		String line = null;
//		String temp = "";
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
		
//		값 수정
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("스파게티")) {
//				temp += "냉모밀\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		bufferedReader.close();
//		System.out.println(temp);
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt"));
//		bufferedWriter.write(temp);
//		
//		bufferedWriter.close();
		
//		김치찜 삭제		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("./food.txt"));
//		String line = null;
//		String temp = "";
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("김치찜")) {
//				continue;
//			}
//			temp += line + "\n";
//		}
//
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//		bufferedWriter.write(temp);
//		bufferedWriter.close();
		
//		음식을 4개 출력
//		stream문법
//		"한우", "갈비살", "삼겹살", "항정살"
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food2.txt"));
//		String[] foods = {"한우", "갈비살", "삼겹살", "항정살"};
//		Arrays.asList(foods).stream().forEach(food -> {
//			try {
//				bufferedWriter.write(food + "\n");
////				bufferedWriter.newLine(); 비추!
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//		bufferedWriter.close();
//		
		
//		4의 배수 구구단 만들기!
//		4 x 1 = 4
//		4 x 2 = 8 
//		...
//		4 x 9 = 36까지
//		stream 문법으로 gugu.txt를 만들어서 출력하기!
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("gugu.txt"));
		IntStream.rangeClosed(1, 9).forEach((n)->{
			try {
				bufferedWriter.write("4" + "\tx\t" + n + "\t=\t" + String.valueOf(n * 4) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		bufferedWriter.close();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("gugu.txt"));
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		
	}
}














