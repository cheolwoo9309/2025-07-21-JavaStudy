import java.util.Scanner;
public class 두더지게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 점수를 저장
		int score=0;
		// 10 round
		final int ROUNDS=10;
		
		System.out.println("❤️❤️❤️❤️❤️ 두더지 게임을 시작 ❤️❤️❤️❤️❤️");
		System.out.println("1~9사이의 정수를 입력해서 두더지 잡기");
		System.out.println("게임은 "+ROUNDS+"라운드입니다");
		
		for(int i=1;i<=ROUNDS;i++)
		{
			int mole=(int)(Math.random()*9)+1; //1~9
			System.out.println("Round "+i+":두더지 두두등장");
			System.out.println("두더지를 찾아 없애세요(1~9):");
			int user=scan.nextInt();
			if(mole==user)
			{
				System.out.println("😎 두더지를 생포하였습니다");
				score+=10;
			}
			else
			{
				System.err.println("💀 두더지를 놓쳤습니다 두더지는 "+mole+"번에 있습니다");
				score-=10;
			}
			System.out.println("현재 스코어:"+score+"점 입니다");
		}
		// 게임 종료
		System.out.println("★Game Over★ 총 점수: "+score+"점 입니다");
		
	}

}
