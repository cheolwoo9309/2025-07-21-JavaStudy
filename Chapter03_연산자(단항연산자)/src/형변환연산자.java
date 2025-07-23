/*
 *    (type)
 *    
 *    (char)65 => 'A'
 *    (int)10.5 => 10
 *    
 *    (double)10 => 10.0
 *    
 *    큰 데이터형을 작은 데이터형으로 변경할때 많이 사용
 *    ---------  ---------- DownCasting
 *    
 *    => 연산자
 *       (int)(10.5+10.5)
 *            ------------ 최우선 순위
 *               | => 10.5+10.5 => 21.0 => 21
 *       (int)10.5+10.5
 *       --------- 우선 순위
 *          | => 10+10.5 => 20.5
 *       (int)10.5+(int)10.5
 *       --------- --------- 각 우선순위
 *          | => 10   | => 10 => 10+10 => 20
 *                +
 *    => 형변환 : 객체 지향에서 많이 나온다 (클래스)
 *     
 *       
 */
// 초기값 => 임의의 지정, 입력값, 난수
public class 형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand=(int)(Math.random()*100)+1;
		// 임의의 수 추출 => 0.0~0.99 사이
		System.out.println(rand);
		
		char rand1=(char)((Math.random()*26)+65);
		//                      1+65 => 66   -- 알파벳 시작 번호
		System.out.println(rand1);
	}

}
