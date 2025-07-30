/*
 *   이차 for문 => 형식 => 동작 순서
 *   ---------
 *   
 *   형식)
 *             1    2 | false => 종료
 *        for(초기값;조건식;증감식)    |
 *        {         |            |
 *                  | true       |
 *                  |      false--
 *                3    4     5----
 *           for(초기값;조건식;증감식) |
 *           {         |         |
 *                     | true    |
 *               실행문장 5----------
 *           }
 *        }
 *        
 *        for(int i=1;i<=5;i++)
 *        {
 *        	 for(int j=1;j<=5;j++)
 *        	 {
 *        		 실행문장 => 25번
 *           }
 *        }
 *        
 *        i=1 ===> j=1,j=2,j=3,j=4,j=5
 *        i=2 ===> j=1,j=2,j=3,j=4,j=5
 *        i=3 ===> j=1,j=2,j=3,j=4,j=5
 *        i=4 ===> j=1,j=2,j=3,j=4,j=5
 *        i=5 ===> j=1,j=2,j=3,j=4,j=5
 *        i=6 ===> 종료
 *        
 *        1차 for => 즐수 / 지금 설명대로면 세로
 *        2차 for => 실제 내용 출력 / 가로
 *        
 *        구구단 // 줄수 1~9, 단수 2~9 
 *        .......
 *        2*1=2 3*1=3 ... 9*1=9
 *        ..
 *        ..
 *        2*9=18 3*9=27 ... 9*9=81
 *                
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============================ 구구단 ============================");
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
