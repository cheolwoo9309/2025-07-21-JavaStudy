package com.sist.util;
import java.util.*;
public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
			"100|hong|남자|대기실",
			"200|자바방|5|공개",
			"210|자바방|hong",
			"300|hong|shim|Hi~~",
			"400|hong"
		};
		
		for(String msg:data) {
			StringTokenizer st=new StringTokenizer(msg,"|");
			int protocol=Integer.parseInt(st.nextToken());
			
			switch(protocol) {
				case 100:{
					String id=st.nextToken();
					String sex=st.nextToken();
					String loc=st.nextToken();
					System.out.println(id+"님이 "+loc+"에 입장하셨습니다");
				}
				break;
				
				case 200:{
					String roomName=st.nextToken();
					String people=st.nextToken();
					String state=st.nextToken();
					System.out.println(roomName+"의 정원은 "+people+"명이고 "+state+"방 입니다");
				}
				break;
				
				case 210:{
					String loc=st.nextToken();
					String id=st.nextToken();
					System.out.println(id+"님이 "+loc+"에 입장하셨습니다");
				}
				break;
				
				case 300:{
					String id1=st.nextToken();
					String id2=st.nextToken();
					String msgg=st.nextToken();
					System.out.println(id1+"님이 "+id2+"님에게 "+msgg+"라고 메시지를 보냈습니다");
				}
			}
		}
	}

}
