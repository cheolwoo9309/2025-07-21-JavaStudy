// 서울 여행
import java.io.*;
import java.util.*;
/*
 *   1|
 *   도봉산|
 *   하늘을 깎아세운 만길 봉우리도봉(道峰)산은 이름 그대로 봉우리가 길인 산|
 *   132-010 서울특별시 도봉구 도봉동 경기 의정부시, 양주시 장흥면 일대
 *   
 */
public class 배열응용_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//1. 데이터를 저장 => 메모리 (배열)
		Scanner scan=new Scanner(System.in);
		System.out.print("명소(1),자연(2):");
		int type=scan.nextInt();
		
		String filename="";
		int rows=0;
		if(type==1)
		{
			filename="c:\\javaDev\\seoul_location.txt";
			rows=273;
		}
		else
		{
			filename="c:\\javaDev\\seoul_nature.txt";
			rows=110;
		}
		
		// 저장
		String[] numbers=new String[rows];
		String[] names=new String[rows];
		String[] contents=new String[rows];
		String[] address=new String[rows];
		
		FileReader fr=new FileReader(filename);
		StringBuffer sb=new StringBuffer();
		int i=0;
		while((i=fr.read())!=-1)
		{
			sb.append((char)i);
		}
		fr.close();
		
		String seoul=sb.toString();
		
		//System.out.println(seoul);
		i=0;
		String[] seoul_temp=seoul.split("\n"); // 한줄씩 자르기
		for(String s:seoul_temp)
		{
			String[] datas=s.split("\\|"); // | 기준 자르기
			numbers[i]=datas[0];
			names[i]=datas[1];
			contents[i]=datas[2];
			address[i]=datas[3];
			
			i++;
		}
		
		// 출력
		for(String ss:names)
		{
			System.out.println(ss);
		}
		
	}

}
