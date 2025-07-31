// 계산기 => 종료전까지
import java.util.Scanner;
// while = 1차
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("첫번째 정수 입력:");
			int num1=scan.nextInt();
			
			System.out.print("연산자 입력(+,-,*,/):");
			String op=scan.next();
			
			System.out.println("두번째 정수 입력:");
			int num2=scan.nextInt();
			
			switch(op)
			{
			case "+" ->{
				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			}
			case "-" ->{
				System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			}
			case "*" ->{
				System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			}
			case "/" ->{
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다");
				else
					System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
			default ->{
				System.out.println("올바른 연산자를 입력하세요");
			}
			}
			// -------------------------- 종료 조건 => true
			System.out.print("종료할까요(Y,y)?");
			String s=scan.next();
			char c=s.charAt(0);
			// scanner => char를 받지 못한다
			// String => char로 한개 자른다 => charAt(index No)
			// 문자열의 index번호 0번부터 시작
			// 입력값 => char(X)
			if(c=='y'||c=='Y')
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
