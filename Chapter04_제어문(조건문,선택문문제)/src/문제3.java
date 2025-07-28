// 1학년부터 4학년까지 중간고사 시험을 보았다.
// 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다
// 이를 판단하는 프로그램을 작성해보자
// 점수가 0미만 100초과이면 경고문구 출력!
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("학년 입력(1~4):");
		int grade=scan.nextInt();
		System.out.print("중간고사 점수 입력(0~100):");
		int score=scan.nextInt();
		
		System.out.println("===== 합격여부 =====");
		
		if(score<0||score>100)
		{
			System.err.println("잘못된 점수 입력입니다!!");
		}
		else
		{
			if(grade==4)
			{
				if(score>=70)
					System.out.println("합격");
				else
					System.out.println("불합격");
			}
			else
			{
				if(score>=60)
					System.out.println("합격");
				else
					System.out.println("불합격");
			}
		}
	}

}

// 		if~else => 삼항연산자를 이용해서 처리
//			System.out.println((grade!=4&&score>=60)
//					||(grade==4&&score>=70)?"합격":"불합격");