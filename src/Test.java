import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			int[] num = new int[10];					//최초 배열의 크기 선언
			Scanner sc = new Scanner(System.in);		//입력을 받기위한 Scanner
			
			File file = new File("C:\\Users\\ingyu2\\eclipse-workspace\\test_ingyu\\src\\Test.txt"); //출력을 위한 객체 생성과 경로설정 
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
			
			for(int  i = 0 ;i < 5 ; i ++ ){				//이미 존재하는 1,2,3,4,5 값 주입을 위한 반복문
				num[i] = i+1;						
				};
				
			for(int i = 0 ; i < num.length ; i++) {		//10번 반복을 위한 반복문	
				
				System.out.println((i+1)+"번째 반복문");
				System.out.println("값을 입력하세요");
				int count = 0;							//중복 횟수를 세기위한 변수 선언
				for(int j = 5 ;j < 10 ; j++) {			//입력받은 값을 추가하는 반복문
									
					num[j] = sc.nextInt();				//
					
					for(int k = 0; k < j ; k++) {		//중복검사를 위한 반복문
						
						if(num[j] == num[k]) {			//중복 검사를 위한 조건
							j--;						//중복 시 반복문 조건의 값 되돌리기
							
							count++;					//중복횟수를 세기 위한 변수 중복 시 증가
							
							System.out.println("["+num[k]+"]" +" 중복입니다 다시입력해주세요 " + "[" +count + "]" + " 개 중복" );
							
						};
						
					};
				};
				
				bufferedWriter.write(Arrays.toString(num));	//입력을 위한 write 함수	
				bufferedWriter.newLine();					//반복문이 끝날때 마다 줄바꿈 
				
			};
			
			System.out.println("입력 완료");
			bufferedWriter.close();							//10회 반복이 끝나면 종료
			sc.close(); 									//Scanner 종료  	
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
