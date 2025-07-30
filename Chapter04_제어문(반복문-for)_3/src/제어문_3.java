// 10번 => 가위바위보 5승 1무 4패
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		
		for(int i=1;i<=10;i++)
		{
			//1. computer => 난수
			int com=(int)(Math.random()*3);
			// 가위(0),바위(1),보(2)
			//2. 사용자 입력
			System.out.print("뭐를 내시겠습니까?(가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			// 오류처리 => continue
			if(user<0||user>2)
			{
				System.err.println("정해진 값으로만 입력하시오");
				i--;
				continue; // i++
			}
			int res=user-com;
			if(res==1||res==-2)
			{
				System.out.println("you win");
				win++;
			}
			else if(res==-1||res==2)
			{
				System.out.println("you lose");
				lose++;
			}
			else
			{
				System.out.println("draw");
				same++;
			}
			//3. 승 / 무 / 패
			
			
		}
		System.out.println("===== 결과값 =====");
		System.out.printf("%d승 %d무 %d패\n",win,same,lose);
		
		// 모든 프로그램 => 가정
		// 게임 => 숫자로 가정
	}

}
