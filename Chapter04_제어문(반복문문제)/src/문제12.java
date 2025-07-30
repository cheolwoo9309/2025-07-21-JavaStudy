/*
 *  10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
 */
import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0;
		int a5=0;
		Scanner scan=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
			System.out.print("정수입력:");
			int num=scan.nextInt();
			
			if(num%3==0)
				a3++;
			if(num%5==0)
				a5++;
		}
		System.out.println("3의 배수의 갯수:"+a3);
		System.out.println("5의 배수의 갯수:"+a5);
	}

}
