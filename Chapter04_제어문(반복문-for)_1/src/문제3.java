// 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용) - 정답
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a=2;a<=100;a+=2)
		{
			sum+=a;
		}
		System.out.println("총 합계:"+sum);
	}

}
