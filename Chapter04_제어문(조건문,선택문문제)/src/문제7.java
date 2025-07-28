// 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
// 90 이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F
// 다중조건문
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 영어 수학점수 입력(xx xx xx):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		int avg=total/3;
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		
		
		if(avg>=60)
		{
			if(avg>=90)
			System.out.println("학점은 A입니다");
		else if(avg>=80)
			System.out.println("학점은 B입니다");
		else if(avg>=70)
			System.out.println("학점은 C입니다");
		else if(avg>=60)
			System.out.println("학점은 D입니다");
		}
		else
			System.out.println("학점은 F입니다");
		
	}

}

// 		char score='A';
//		if(avg>=90)
//			score='A';
//		else if(avg>=80)
//			score='B';
//		else if(avg>=70)
//			score='C';
//		else if(avg>=60)
//			score='D';
//		else
//			score='F';
//		System.out.println("학점:"+score);
