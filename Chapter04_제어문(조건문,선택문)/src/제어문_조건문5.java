/*
 *   국어 영어 수학 점수 입력
 *   ----------
 *   평균 출력, 총점 출력, 학점 출력
 *   
 *   100~90 A
 *   80~89 B
 *   70~79 C
 *   60~69 D
 *   이하 F
 */
import java.util.Scanner;
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수입력:");
		int kor=scan.nextInt();
		System.out.print("영어 점수입력:");
		int eng=scan.nextInt();
		System.out.print("수학 점수입력:");
		int math=scan.nextInt();
		
		int sum=kor+eng+math;
		double avg=(sum/3.0);
		System.out.println("평균점수:"+avg);
		System.out.println("총 점수:"+sum);
		
		if(kor>100||eng>100||math>100)
			System.out.println("점수를 올바르게 입력해주세요");
		if(avg<=100)
		{
			if(avg<=100&&avg>=90)
				System.out.println("학점은 A입니다");
			if(avg<=89&&avg>=80)
				System.out.println("학점은 B입니다");
			if(avg<=79&&avg>=70)
				System.out.println("학점은 C입니다");
			if(avg<=69&&avg>=60)
				System.out.println("학점은 D입니다");
			if(avg<=59)
				System.out.println("학점은 F입니다");
		}
			
				
	}

}
