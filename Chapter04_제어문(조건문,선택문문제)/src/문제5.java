// 사용자로부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램을 작성
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int a=scan.nextInt();
		
		System.out.println("===== 결과 =====");
		
		if(a>-1)
		{
			System.out.println(a+"는(은) 양수입니다");
			System.out.println("절대값:"+a);
		}
		else
		{
			System.out.println(a+"는(은) 음수입니다");
			System.out.println("절대값:"+(-a));
		}
		
	}

}
// 절대값 => System.out.println("절대값:"+Math.abs(num));