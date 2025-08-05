import java.util.Arrays;
/*
 *     87, 93, 57, 40, 99
 *     --  --
 *     87  93
 *     --      --
 *     57      87
 *     --          --
 *     40          57
 *     --               --
 *     40               99 ---- for 1 (1 round)
 *     ----------------------
 *     40  93  87  57  99
 *         --  --
 *         87  93
 *         --      --
 *         57      87
 *         --          --
 *         57          99  ---- for 2 (2 round)
 *     ----------------------
 *     40  57  93  87  99
 *             --  --
 *             87  93
 *             --      --
 *             87      99  ---- for 3 (3 round)
 *     ----------------------
 *     40  57  87  93  99
 *                 --  --
 *                 93  99  ---- for 4 (4 round)
 *     ----------------------
 *     40  57  87  93  99
 *     => 5개 숫자를 4번만
 *     
 *     => 5 - 4
 *     i j
 *     1 4 > 5
 *     2 3 > 5
 *     3 2 > 5
 *     4 1 > 5 ----> i+j=5 => j=5-i
 *     
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[5];
		// 초기값
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 정렬 전:");
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===== 정렬 후:");
//		for(int i=0;i<com.length-1;i++)
//		{
//			for(int j=i;j<com.length;j++)
//			{
//				if(com[i]<com[j]) //   > 오름차순     < 내림차순
//				{
//					int temp=com[i];
//					com[i]=com[j];
//					com[j]=temp;
//				}
//			}
//		}
		Arrays.sort(com);
		for(int i=com.length-1;i>=0;i--)
		{
			System.out.print(com[i]+" ");
		}
	}

}
