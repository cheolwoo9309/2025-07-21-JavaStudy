/*
 *  다음 결과를 출력하는 프로그램
 *  
 *  ABCDE
 *  ABCDE
 *  ABCDE
 *  ABCDE
 *  ABCDE
 *  
 */
public class 문제17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(char c='A';c<='E';c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
