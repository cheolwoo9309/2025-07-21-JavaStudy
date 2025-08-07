import java.util.Scanner;
public class 메소드_1_변환 {
	// 1. 3자리 난수 발생
	static int[] rand()
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			for(int j=0;j<i;j++)
			{
				// j는 이미 저장
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
		return com;
	}
	// 사용자 입력
	static int[] userInput()
	{
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			// 사용자 입력
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			// 오류 처리 => 입력이 잘못된 경우
			/*
			 *   1. 세자리 정수가 아닌경우
			 *   2. 중복된 수 입력된 경우
			 *   3. 0을 입력하는 경우
			 */
			if(input<100||input>999)
			{
				System.err.println("정확한 값을 입력하세요");
				// 다시 처음부터 실행 => while의 조건식 이동
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.err.println("중복된 정수를 입력할 수 없습니다");
				continue;
			}
			
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.err.println("0은 사용할 수 없습니다");
				continue;
			}
			break;
		}
		return user;
	}
	// 비교
	static int compare(int[] com,int[] user)
	{
		int s=0,b=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)	
						s++;
					else
						b++;
				}
			}
		}
		// 힌트
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
		return s;
	}
	// 종료 여부
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	// 조립 시작
	static void process()
	{
		// 난수 값
		int[] com=rand();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int[] user=userInput();
			int s=compare(com, user);
			if(isEnd(s))
			{
				System.out.println("축하합니다");
				System.out.print("게임을 다시 시작 하시겠습니까?(Y/y):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y')
				{
					System.out.println("새게임을 시작합니다");
					process();
				}
				else
				{
					System.out.println("Game Over!!");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
