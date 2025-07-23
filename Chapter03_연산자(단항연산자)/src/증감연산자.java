// 81page
/*
 *   증감연산자 => 제어문(반복문)
 *   				    |
 *                     게임 => 총알 발사
 *                     비행기 => 자동이동
 *     ++ : 1증가
 *     -- : 1감소
 *     
 *   1) 전치 연산자
 *      ++a : 1증가
 *      -- 먼저 증가하고 다른 연산 수행
 *   2) 후치 연산자
 *      a++ : 1증가
 *       -- 다른 연산 먼저 수행 후 나중에 증가
 *       
 *   ex)
 *       int a=10;
 *       int b=++a;
 *             -- 먼저 증가   
 *           ---- 나중에 수행
 *                 
 *       a=11, b=11
 *       
 *       int a=10;
 *       int b=a++;
 *           --- 먼저 수행
 *              -- 나중에 증가
 *       a=11, b=10
 *       
 *       int a=10;
 *       int b=++a + ++a;
 *             --    -- 먼저 증가 => 11 + 12
 *           ---------- 나중에 수행 => 23
 *       a=12, b=23
 *    
 *       int a=10;
 *       int b=a++ + a++;
 *              10    11 => 21
 *       
 *       int a=10;
 *       int b=++a + a++
 *              11    11 => 22
 *              
 *       int a=10;
 *       int b=++a + a++ + ++a + a++
 *              11    11    13    13 => a=14, 48
 *              
 *       int a=10;
 *       int b=a++ + a++ + ++a + a++
 *              10    11    13    13 => a=14, 47
 *              
 *       ----------------------------------------
 *       int a=10;
 *       int b=a++ + --a + a-- + a++
 *              10    10    10     9 => a=10, 39
 *       
 *       int a=10;
 *       int b=a-- + a-- + --a + --a;
 *              10     9     7     6 => a=6, 32
 */
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		// ++ => a=a+1
		// b=a
		// 전치 => 증가하고 증가된 값을 대입
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a++;
		// b=a ==> b=10
		// a=a+1 => a=10+1
		// 후치 => 대입을 하고 나중에 증가
		// a++ a++ a++ a++ a++ => ++a
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=++a + ++a;
		// 11    12 + => 23
		System.out.println("a"+a+",b="+b);
		
		a=10;
		b=a++ + a++;
		// 10    11 => 21
		System.out.println("a"+a+",b="+b);
		
		a=10;
		b=--a; // a=9, b=9
		System.out.println("a"+a+",b="+b);
		
		a=10;
		b=a--; // a=9, b=10
		System.out.println("a"+a+",b="+b);
		
		a=10;
		a++;
		a--;
		--a;
		++a;
		a++;
		// a=11
		System.out.println(a);
		
		// a=10; => 초기값 다시 세팅 / 세팅 안하면 위에서 이어짐
		a++;
		a++;
		a--;
		System.out.println("a="+a);
		/*
		 *   double d=123456.78;
		 *   int i=123456;
		 *   int a=(int)((d-i)*100)  
		 */
		double d=123456.78;
		int i=123456;
		int a1=(int)((d-i)*100);
		System.out.println(a1); // 77
		
		double d1=123456.78f;
		int i1=123456;
		int a2=(int)((d1-i1)*100);
		System.out.println(a2); // 78
		
		// char는 연산이 수행되는 자동으로 int로 변경
		char c='A';// 65 + 1 => 66 ('B')
		char c1=c++;
		System.out.println(c);
		System.out.println(c1);
	}
	/*
	 *   ++, -- => 무조건 1개증가/1개감소 (정수형, 문자만 가능)
	 *   int a=10;
	 *   int b = a++;
	 *       ----- 선대입
	 *    1) b에 a값 대입
	 *    2) a에 1을 증가
	 *    
	 *   int a=10;
	 *   int b = ++a;
	 *       ------ 선증가
	 *    1) a에 1을 증가
	 *    2) b에 증가된 a값 대입
	 */

}
