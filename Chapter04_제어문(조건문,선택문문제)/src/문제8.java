// 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
// 90 이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F
// switch case

import java.util.Scanner;
public class 문제8 {

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
				
		
		switch(avg/10)
		{
		case 10,9 -> {
			System.out.println("학점은 A입니다");
		}
		case 8 -> {
			System.out.println("학점은 B입니다");
		}
		case 7 -> {
			System.out.println("학점은 C입니다");
		}
		case 6 -> {
			System.out.println("학점은 D입니다");
		}
		default -> {
			System.out.println("학점은 F입니다");
		}
	}	
	}

}

//	char score='A';
// 실무 => jdk1.8
//	switch(avg/10)
//	{
// -> break를 사용하면 오류 발생
// -> jdk 12 부터
//	case 10,9 ->{
//		score='A';
//	}
//	case 8 ->{
//		score='B';
//	}
//	case 7 ->{
//		score='C';
//	}
//	case 6 ->{
//		score='D';
//	}
//	default ->{
//		score='F';
//	}

//case 10:
//case 9:
//	score='A';
//	break;
//case 8:
//	score='B';
//	break;
//case 7:
//	score='C';
//	break;
//case 6:
//	score='D';
//	break;
//default:
//	score='F';

//System.out.println("학점:"+score);
