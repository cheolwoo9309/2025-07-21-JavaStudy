/*
 *   for : 반복문 => 가장 많이 사용되는 반복문
 *     => 향상된 for : for-each구문 (웹에서 주로 사용)
 *     => 배열/컬렉션 
 *     
 *   형식)
 *        for(초기값;조건식;증감식)
 *        {
 *        	  반복 수행문장 ==> 같은 형식 출력이 있는 경우
 *        }
 *        
 *        1. 초기값 : 시작점 => int i=1
 *        					char c='A'
 *           => 배열 / 컬렉션 => 0부터 시작
 *        2. 조건식 : 끝점 : i<=10 i<=100
 *        3. 증감식 : ++, --, +=, -=
 *                  false면 종료
 *        동작         |
 *               ①--->②<----④
 *        for(①초기값;②조건식;④증감식)
 *        {          |       ↑
 *                   |       |
 *                   |true면 수행 
 *        	  ③반복수행문장
 *        }
 *        ① -> ② -> ③ -> ④
 *             -----------
 *             ② -> ③ -> ④
 *             ② -> ③ -> ④
 *             ② -> ③ -> ④
 *             ② -> ③ -> ④
 *             ** ②이 false면 종료
 *   
 *   반복문의 사용처
 *   1. 모든 목록 (상품, 맛집, 노래 ...)
 *   2. 서버 구동 => 무한루프
 *   3. 게임 => 총알, 비행기 자동
 *   4. 무한 스크롤
 *   5. 페이징
 *   => 제어 => if => break, continue  
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] names={"엘링 홀란드","제레미 도쿠","필 포든","베르나르두 실바","그바르디올"};
//		for(int i=0;i<names.length;i++)
//		{
//			System.out.println(names[i]);
//		}
//		System.out.println("=====");
//		// => 웹에서 목록 출력 => for
//		for(String name:names)
//		{
//			System.out.println(name);
//		}
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c);
		}
		System.out.println();
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c);
		}
	}

}
