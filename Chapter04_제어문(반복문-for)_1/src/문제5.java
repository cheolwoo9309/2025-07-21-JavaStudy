// B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용) - 애매한 정답
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=1;a<=14;a+=2)
		{
			System.out.print((char)(a+65));
		}
		/*  풀이
		 *  for(char c='B';c<='N';c+=2)
		 *  //{
		 *  //if(c>'B'&&c<='N')
		 *  // System.out.print(",");
		 *  	System.out.print(c+" ");
		 *  //}
		 */
	}

}
