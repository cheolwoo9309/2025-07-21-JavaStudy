/*
 *    용어(프로그램)
 *    1. 변수
 *       하나의 값을 메모리 저장해서 재사용
 *       ------- 변경해서 사용이 가능
 *    2. 상수
 *       하나의 값을 메모리 저장해서 사용
 *       ------- 변경할 수 없다
 *       final => 값을 고정
 *       예) for ==> 10
 *    3. 초기화
 *       변수를 선언한 경우에 처음 저장하는 값
 *       int a=10;
 *    4. 자료형 (데이터형)
 *       컴퓨터에 자체 처리 => 메모리 크기
 *       => 정수 / 실수 / 문자 / 논리
 *       => 자동처리가 안되는 경우 (사용자 정의 데이터형)
 *                           ---------------
 *                           class / interface / enum
 *    5. 연산자 : 연산을 사용하기 위한 기호 (+, -, ...)
 *    6. 피연산자 : 연산에 필요한 데이터
 *    7. 제어문 : 실행시에 흐름을 개발자가 원하는 방향으로 바꿀 수 있게 만드는 것
 *              상황에 따라 변경 : 조건문, 선택문
 *              프로그램 실행중에 계속 반복 수행 : 반복문 (for, while)
 *              => 프로그램 종료 : break, continue => 프로그램 제어
 *       => for : 반복 횟수가 지정
 *                => 화면 출력 / 목록
 *       => while : 무한 루프 => 반복 횟수 지정이 없는 경우
 *                  선조건 : 한번도 수행을 못할 수 있다
 *                => 데이터베이스 / 네트워크
 *                => 무조건 => 종료 조건을 설정
 *       => do~while : 후조건 : 무조건 한번이상 수행
 *       => break, continue => 바로 밑에 소스 코딩이 불가능
 *       
 *    for : 반복횟수 
 *          => 2차 for : 알고리즘 (정렬 / 등수 구하기 / 구구단 / ...)
 *          int a=10, b=20, c=30, d=40, e=50
 *          ----------------
 *           10 20 30 40 50
 *          ----------------
 *          => 중요
 *             => 여러개를 => 한개의 변수명으로 처리
 *          int a1~a10000;
 *          int[] arr=new int[10000]
 *          => 클래스 ==> 50개
 *             한개의 이름으로 제어가능 => 인터페이스
 *          
 *          명령문 묶어서 처리 => 메소드
 *          ---------------------
 *          
 *     => 반복문 (for)
 *        for(초기값(시작);조건(끝);증감)
 *        {
 *        	  실행문장
 *        }
 *        
 *        => 알파벳 => 연산처리 => 자동으로 정수 변환
 *           char c='A'  c<='Z' //*** 어제 틀린거 잘 기억하기
 *           => 실수는 사용하지 않는다
 *        => 종료하지 않는 프로그램 : 무한루프 : for(;;)
 *        
 *        웹 : 출력 = for
 *            ---------- 
 *            
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++)
//		{
//			if(i==2)
//				break; // if(i==2) 블록안에 넣을 경우 바로 밑에 소스 코딩 불가능
//			System.out.println("aaa");
//		}
		
		//1. 1~10
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
			System.out.print(c+" ");
		}
		System.out.println();
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		String s="Hello Java";
		//        0123456789
		// => 인덱스번호 => 0번부터
		// length() => 문자의 갯수
		// 마지막 문자 번호 => length()-1
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		String html="<li class=\"common_sp_list_li\">\r\n"
				+ "                <div class=\"common_sp_thumb\">\r\n"
				+ "                    <a href=\"/recipe/6876841\" class=\"common_sp_link\">\r\n"
				+ "                                                    <span class=\"common_vod_label\"><img src=\"https://recipe1.ezmember.co.kr/img/icon_vod.png\"></span>\r\n"
				+ "                                                <img src=\"https://recipe1.ezmember.co.kr/cache/recipe/2017/09/21/a631104256c12301d91224912af387601_m.png\">\r\n"
				+ "                    </a>\r\n"
				+ "                </div>\r\n"
				+ "                <div class=\"common_sp_caption\">\r\n"
				+ "                                        <div class=\"common_sp_caption_tit line2\">환상의 커플 마늘과 치즈! 찰떡궁합으로 ㅇㅈㅇㅈ?? 마늘빵치즈토스트</div>\r\n"
				+ "                    <div class=\"common_sp_caption_rv_name\" style=\"display: inline-block; vertical-align: bottom;\">\r\n"
				+ "                        <a href=\"/profile/recipe.html?uid=gdubu33\"><img src=\"https://recipe1.ezmember.co.kr/cache/rpf/2016/01/29/900013400086b533aef0411aeb3ee7d71.png\">만개의레시피</a>\r\n"
				+ "                    </div>\r\n"
				+ "                    <div class=\"common_sp_caption_rv\">\r\n"
				+ "                                                    <span class=\"common_sp_caption_rv_star\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"></span>\r\n"
				+ "                            <span class=\"common_sp_caption_rv_ea\">(6)</span>\r\n"
				+ "                                                <span class=\"common_sp_caption_buyer\" style=\"vertical-align: middle;\">조회수 5.4만</span>\r\n"
				+ "                    </div>\r\n"
				+ "                </div>\r\n"
				+ "            </li>";
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(html);//out.println() -> 브라우저 출력
		}
		
				
	}

}
