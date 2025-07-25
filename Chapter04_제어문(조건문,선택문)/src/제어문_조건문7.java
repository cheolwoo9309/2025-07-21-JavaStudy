/*
 *   점수를 입력 => 0~100사이
 *   = 60이상이면 합격
 *   = 60미만이면 불합격
 */
import java.util.Scanner;
public class 제어문_조건문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100):");
		int score=scan.nextInt();
		
		if(score>100||score<0)
			System.out.println("똑바로 입력하세요");
		if(score<=100&&score>=0)
		{
			if(score>=60)
				System.out.println("합격");
			if(score<60)
				System.out.println("불합격");
		}
	}

}
